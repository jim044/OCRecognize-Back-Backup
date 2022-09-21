package com.ocrecognize.mapper;

import com.ocrecognize.model.dto.DirigeantsDto;
import com.ocrecognize.model.entity.DirigeantsEntity;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-09-21T16:25:54-0400",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 16.0.2 (Oracle Corporation)"
)
@Component
public class DirigeantMapperImpl implements DirigeantMapper {

    @Override
    public DirigeantsDto dirigeantsEntityToDirigeantDto(DirigeantsEntity dirigeantsEntity) {
        if ( dirigeantsEntity == null ) {
            return null;
        }

        DirigeantsDto dirigeantsDto = new DirigeantsDto();

        dirigeantsDto.setNom( dirigeantsEntity.getNom() );
        dirigeantsDto.setPrenoms( dirigeantsEntity.getPrenoms() );
        dirigeantsDto.setAnnee_de_naissance( dirigeantsEntity.getAnnee_de_naissance() );
        dirigeantsDto.setQualite( dirigeantsEntity.getQualite() );

        return dirigeantsDto;
    }

    @Override
    public DirigeantsEntity dirigeantsDtoToDirigeantEntity(DirigeantsDto dirigeantsDto) {
        if ( dirigeantsDto == null ) {
            return null;
        }

        DirigeantsEntity dirigeantsEntity = new DirigeantsEntity();

        dirigeantsEntity.setNom( dirigeantsDto.getNom() );
        dirigeantsEntity.setPrenoms( dirigeantsDto.getPrenoms() );
        dirigeantsEntity.setAnnee_de_naissance( dirigeantsDto.getAnnee_de_naissance() );
        dirigeantsEntity.setQualite( dirigeantsDto.getQualite() );

        return dirigeantsEntity;
    }

    @Override
    public List<DirigeantsDto> dirigeantsEntitesToDirigeantsDtos(List<DirigeantsEntity> dirigeantsEntities) {
        if ( dirigeantsEntities == null ) {
            return null;
        }

        List<DirigeantsDto> list = new ArrayList<DirigeantsDto>( dirigeantsEntities.size() );
        for ( DirigeantsEntity dirigeantsEntity : dirigeantsEntities ) {
            list.add( dirigeantsEntityToDirigeantDto( dirigeantsEntity ) );
        }

        return list;
    }

    @Override
    public List<DirigeantsEntity> dirigeantsDtosToDirigeantsEntities(List<DirigeantsDto> dirigeantsDtos) {
        if ( dirigeantsDtos == null ) {
            return null;
        }

        List<DirigeantsEntity> list = new ArrayList<DirigeantsEntity>( dirigeantsDtos.size() );
        for ( DirigeantsDto dirigeantsDto : dirigeantsDtos ) {
            list.add( dirigeantsDtoToDirigeantEntity( dirigeantsDto ) );
        }

        return list;
    }
}
