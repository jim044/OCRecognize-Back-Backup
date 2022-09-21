package com.ocrecognize.mapper;

import com.ocrecognize.model.dto.ResultsDto;
import com.ocrecognize.model.entity.CompanyEntity;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-09-21T16:25:54-0400",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 16.0.2 (Oracle Corporation)"
)
@Component
public class CompanyMapperImpl implements CompanyMapper {

    @Autowired
    private SiegeMapper siegeMapper;
    @Autowired
    private DirigeantMapper dirigeantMapper;

    @Override
    public ResultsDto companyEntityToCompanyDto(CompanyEntity companyEntity) {
        if ( companyEntity == null ) {
            return null;
        }

        ResultsDto resultsDto = new ResultsDto();

        resultsDto.setSiren( companyEntity.getSiren() );
        resultsDto.setSiege( siegeMapper.siegeEntityToSiegeDto( companyEntity.getSiege() ) );
        resultsDto.setDate_creation( companyEntity.getDate_creation() );
        resultsDto.setTranche_effectif_salarie( companyEntity.getTranche_effectif_salarie() );
        resultsDto.setDate_mise_a_jour( companyEntity.getDate_mise_a_jour() );
        resultsDto.setCategorie_entreprise( companyEntity.getCategorie_entreprise() );
        resultsDto.setEtat_administratif( companyEntity.getEtat_administratif() );
        resultsDto.setNom_raison_sociale( companyEntity.getNom_raison_sociale() );
        resultsDto.setNature_juridique( companyEntity.getNature_juridique() );
        resultsDto.setActivite_principale( companyEntity.getActivite_principale() );
        resultsDto.setSection_activite_principale( companyEntity.getSection_activite_principale() );
        resultsDto.setEconomie_sociale_solidaire( companyEntity.getEconomie_sociale_solidaire() );
        resultsDto.setNom_complet( companyEntity.getNom_complet() );
        resultsDto.setNombre_etablissements( companyEntity.getNombre_etablissements() );
        resultsDto.setNombre_etablissements_ouverts( companyEntity.getNombre_etablissements_ouverts() );
        resultsDto.setIs_entrepreneur_individuel( companyEntity.getIs_entrepreneur_individuel() );
        resultsDto.setDirigeants( dirigeantMapper.dirigeantsEntitesToDirigeantsDtos( companyEntity.getDirigeants() ) );

        return resultsDto;
    }

    @Override
    public CompanyEntity companyDtoToCompanyEntity(ResultsDto companyDto) {
        if ( companyDto == null ) {
            return null;
        }

        CompanyEntity companyEntity = new CompanyEntity();

        companyEntity.setSiren( companyDto.getSiren() );
        companyEntity.setSiege( siegeMapper.siegeDtoToSiegeEntity( companyDto.getSiege() ) );
        companyEntity.setDate_creation( companyDto.getDate_creation() );
        companyEntity.setTranche_effectif_salarie( companyDto.getTranche_effectif_salarie() );
        companyEntity.setDate_mise_a_jour( companyDto.getDate_mise_a_jour() );
        companyEntity.setCategorie_entreprise( companyDto.getCategorie_entreprise() );
        companyEntity.setEtat_administratif( companyDto.getEtat_administratif() );
        companyEntity.setNom_raison_sociale( companyDto.getNom_raison_sociale() );
        companyEntity.setNature_juridique( companyDto.getNature_juridique() );
        companyEntity.setActivite_principale( companyDto.getActivite_principale() );
        companyEntity.setSection_activite_principale( companyDto.getSection_activite_principale() );
        companyEntity.setEconomie_sociale_solidaire( companyDto.getEconomie_sociale_solidaire() );
        companyEntity.setNom_complet( companyDto.getNom_complet() );
        companyEntity.setNombre_etablissements( companyDto.getNombre_etablissements() );
        companyEntity.setNombre_etablissements_ouverts( companyDto.getNombre_etablissements_ouverts() );
        companyEntity.setIs_entrepreneur_individuel( companyDto.getIs_entrepreneur_individuel() );
        companyEntity.setDirigeants( dirigeantMapper.dirigeantsDtosToDirigeantsEntities( companyDto.getDirigeants() ) );

        return companyEntity;
    }

    @Override
    public List<ResultsDto> companysEntitesToCompanysDtos(List<CompanyEntity> companysEntities) {
        if ( companysEntities == null ) {
            return null;
        }

        List<ResultsDto> list = new ArrayList<ResultsDto>( companysEntities.size() );
        for ( CompanyEntity companyEntity : companysEntities ) {
            list.add( companyEntityToCompanyDto( companyEntity ) );
        }

        return list;
    }

    @Override
    public List<CompanyEntity> companysDtosToCompanysEntities(List<ResultsDto> companysDtos) {
        if ( companysDtos == null ) {
            return null;
        }

        List<CompanyEntity> list = new ArrayList<CompanyEntity>( companysDtos.size() );
        for ( ResultsDto resultsDto : companysDtos ) {
            list.add( companyDtoToCompanyEntity( resultsDto ) );
        }

        return list;
    }
}
