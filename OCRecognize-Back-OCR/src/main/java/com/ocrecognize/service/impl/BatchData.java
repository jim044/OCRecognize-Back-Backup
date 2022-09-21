package com.ocrecognize.service.impl;

import com.ocrecognize.config.OCRProperties;
import com.ocrecognize.dao.FournisseurDao;
import com.ocrecognize.mapper.FournisseurMapper;
import com.ocrecognize.model.dto.CompanyDto;
import com.ocrecognize.model.dto.FournisseurDto;
import com.ocrecognize.model.pojo.ResponseOCRSpaceByUrl;
import com.ocrecognize.service.IBatchData;
import com.ocrecognize.utils.DownloadUtils;
import com.ocrecognize.utils.ZipUtils;
import liquibase.util.csv.opencsv.CSVReader;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;
import org.springframework.web.client.RestTemplate;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class BatchData implements IBatchData {

    @Autowired
    private FournisseurMapper fournisseurMapper;

    @Autowired
    private FournisseurDao fournisseurDao;

    @Autowired
    private OCRProperties ocrProperties;

    @Autowired
    @Qualifier("ClientAuthentificationRestemplate")
    private RestTemplate restTemplate;

    @Override
    //@Scheduled(cron = "15 * * * * ?")
    public void downloadStockEtablissement() {
        DownloadUtils.downloadFileByURL(ocrProperties.getUrlStockEtablissement(), ocrProperties.getDestinationStockEtablissement() + "\\" + ocrProperties.getFileStockEtablissement());
        ZipUtils.unzipFolder(ocrProperties.getDestinationStockEtablissement() + "\\" + ocrProperties.getFileStockEtablissement(), ocrProperties.getDestinationStockEtablissement());
    }

    @Override
    //@Scheduled(cron = "* */60 * * * ?")
    public void insertNewDataForFournisseur() {
        FournisseurDto fournisseurDto = new FournisseurDto();
        try(CSVReader reader = new CSVReader(new FileReader(ResourceUtils.getFile(ocrProperties.getStockEtablissement())), ',', '\'', 1))
        {
            String[] nextLine;
            fournisseurDao.deleteAll();
            while ((nextLine = reader.readNext()) != null)
            {
                fournisseurDto = fournisseurMapper.convertStringCollectionToFournisseurDto(nextLine);
                if(fournisseurDto.getEnseigne1Etablissement().length() < 249){
                    fournisseurDto = fournisseurDao.saveAndUpdateFournisseur(fournisseurDto);
                }
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Scheduled(cron = "*/30 * * * * ?")
    private void searchCompany(){

        CompanyDto companyDtoResult = restTemplate.getForObject("https://recherche-entreprises.api.gouv.fr/search?q=RBC&page=1&per_page=2", CompanyDto.class);

    }

    public void authenticationBatch(){
        GrantedAuthority grantedAuthority = new SimpleGrantedAuthority("administrateur");
        List<GrantedAuthority> userRoles = new ArrayList<>();
        userRoles.add(grantedAuthority);
        Authentication auth = new UsernamePasswordAuthenticationToken("batch", "batch", userRoles);
        SecurityContextHolder.getContext().setAuthentication(auth);
    }

}
