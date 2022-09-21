package com.ocrecognize.mapper;

import com.ocrecognize.model.dto.SiegeDto;
import com.ocrecognize.model.entity.SiegeEntity;
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
public class SiegeMapperImpl implements SiegeMapper {

    @Override
    public SiegeDto siegeEntityToSiegeDto(SiegeEntity siegeEntity) {
        if ( siegeEntity == null ) {
            return null;
        }

        SiegeDto siegeDto = new SiegeDto();

        siegeDto.setSiret( siegeEntity.getSiret() );
        siegeDto.setDate_creation( siegeEntity.getDate_creation() );
        siegeDto.setTranche_effectif_salarie( siegeEntity.getTranche_effectif_salarie() );
        siegeDto.setDate_debut_activite( siegeEntity.getDate_debut_activite() );
        siegeDto.setEtat_administratif( siegeEntity.getEtat_administratif() );
        siegeDto.setActivite_principale( siegeEntity.getActivite_principale() );
        siegeDto.setComplement_adresse( siegeEntity.getComplement_adresse() );
        siegeDto.setNumero_voie( siegeEntity.getNumero_voie() );
        siegeDto.setIndice_repetition( siegeEntity.getIndice_repetition() );
        siegeDto.setType_voie( siegeEntity.getType_voie() );
        siegeDto.setLibelle_voie( siegeEntity.getLibelle_voie() );
        siegeDto.setDistribution_speciale( siegeEntity.getDistribution_speciale() );
        siegeDto.setCedex( siegeEntity.getCedex() );
        siegeDto.setLibelle_cedex( siegeEntity.getLibelle_cedex() );
        siegeDto.setCommune( siegeEntity.getCommune() );
        siegeDto.setLibelle_commune( siegeEntity.getLibelle_commune() );
        siegeDto.setCode_pays_etranger( siegeEntity.getCode_pays_etranger() );
        siegeDto.setLibelle_commune_etranger( siegeEntity.getLibelle_commune_etranger() );
        siegeDto.setLibelle_pays_etranger( siegeEntity.getLibelle_pays_etranger() );
        siegeDto.setAdresse_complete( siegeEntity.getAdresse_complete() );
        siegeDto.setAdresse_complete_secondaire( siegeEntity.getAdresse_complete_secondaire() );
        siegeDto.setCode_postal( siegeEntity.getCode_postal() );
        siegeDto.setDepartement( siegeEntity.getDepartement() );
        siegeDto.setGeo_id( siegeEntity.getGeo_id() );
        siegeDto.setLongitude( siegeEntity.getLongitude() );
        siegeDto.setLatitude( siegeEntity.getLatitude() );
        siegeDto.setActivite_principale_registre_metier( siegeEntity.getActivite_principale_registre_metier() );

        return siegeDto;
    }

    @Override
    public SiegeEntity siegeDtoToSiegeEntity(SiegeDto siegeDto) {
        if ( siegeDto == null ) {
            return null;
        }

        SiegeEntity siegeEntity = new SiegeEntity();

        siegeEntity.setSiret( siegeDto.getSiret() );
        siegeEntity.setDate_creation( siegeDto.getDate_creation() );
        siegeEntity.setTranche_effectif_salarie( siegeDto.getTranche_effectif_salarie() );
        siegeEntity.setDate_debut_activite( siegeDto.getDate_debut_activite() );
        siegeEntity.setEtat_administratif( siegeDto.getEtat_administratif() );
        siegeEntity.setActivite_principale( siegeDto.getActivite_principale() );
        siegeEntity.setComplement_adresse( siegeDto.getComplement_adresse() );
        siegeEntity.setNumero_voie( siegeDto.getNumero_voie() );
        siegeEntity.setIndice_repetition( siegeDto.getIndice_repetition() );
        siegeEntity.setType_voie( siegeDto.getType_voie() );
        siegeEntity.setLibelle_voie( siegeDto.getLibelle_voie() );
        siegeEntity.setDistribution_speciale( siegeDto.getDistribution_speciale() );
        siegeEntity.setCedex( siegeDto.getCedex() );
        siegeEntity.setLibelle_cedex( siegeDto.getLibelle_cedex() );
        siegeEntity.setCommune( siegeDto.getCommune() );
        siegeEntity.setLibelle_commune( siegeDto.getLibelle_commune() );
        siegeEntity.setCode_pays_etranger( siegeDto.getCode_pays_etranger() );
        siegeEntity.setLibelle_commune_etranger( siegeDto.getLibelle_commune_etranger() );
        siegeEntity.setLibelle_pays_etranger( siegeDto.getLibelle_pays_etranger() );
        siegeEntity.setAdresse_complete( siegeDto.getAdresse_complete() );
        siegeEntity.setAdresse_complete_secondaire( siegeDto.getAdresse_complete_secondaire() );
        siegeEntity.setCode_postal( siegeDto.getCode_postal() );
        siegeEntity.setDepartement( siegeDto.getDepartement() );
        siegeEntity.setGeo_id( siegeDto.getGeo_id() );
        siegeEntity.setLongitude( siegeDto.getLongitude() );
        siegeEntity.setLatitude( siegeDto.getLatitude() );
        siegeEntity.setActivite_principale_registre_metier( siegeDto.getActivite_principale_registre_metier() );

        return siegeEntity;
    }

    @Override
    public List<SiegeDto> siegesEntitesToSiegesDtos(List<SiegeEntity> siegesEntities) {
        if ( siegesEntities == null ) {
            return null;
        }

        List<SiegeDto> list = new ArrayList<SiegeDto>( siegesEntities.size() );
        for ( SiegeEntity siegeEntity : siegesEntities ) {
            list.add( siegeEntityToSiegeDto( siegeEntity ) );
        }

        return list;
    }

    @Override
    public List<SiegeEntity> siegesDtosToSiegesEntities(List<SiegeDto> siegesDtos) {
        if ( siegesDtos == null ) {
            return null;
        }

        List<SiegeEntity> list = new ArrayList<SiegeEntity>( siegesDtos.size() );
        for ( SiegeDto siegeDto : siegesDtos ) {
            list.add( siegeDtoToSiegeEntity( siegeDto ) );
        }

        return list;
    }
}
