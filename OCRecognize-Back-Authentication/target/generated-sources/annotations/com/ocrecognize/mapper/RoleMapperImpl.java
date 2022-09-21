package com.ocrecognize.mapper;

import com.ocrecognize.model.dto.RoleDto;
import com.ocrecognize.model.entity.RoleEntity;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-09-21T16:20:28-0400",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 16.0.2 (Oracle Corporation)"
)
@Component
public class RoleMapperImpl implements RoleMapper {

    @Override
    public RoleDto entityToDto(RoleEntity RoleEntity) {
        if ( RoleEntity == null ) {
            return null;
        }

        RoleDto roleDto = new RoleDto();

        roleDto.setId( RoleEntity.getId() );
        roleDto.setRoleName( RoleEntity.getRoleName() );

        return roleDto;
    }

    @Override
    public RoleEntity dtoToEntity(RoleDto RoleDto) {
        if ( RoleDto == null ) {
            return null;
        }

        RoleEntity roleEntity = new RoleEntity();

        roleEntity.setId( RoleDto.getId() );
        roleEntity.setRoleName( RoleDto.getRoleName() );

        return roleEntity;
    }

    @Override
    public List<RoleDto> listEntityToDto(List<RoleEntity> listRoleEntity) {
        if ( listRoleEntity == null ) {
            return null;
        }

        List<RoleDto> list = new ArrayList<RoleDto>( listRoleEntity.size() );
        for ( RoleEntity roleEntity : listRoleEntity ) {
            list.add( entityToDto( roleEntity ) );
        }

        return list;
    }

    @Override
    public List<RoleEntity> listDtoToEntity(List<RoleDto> listRoleDto) {
        if ( listRoleDto == null ) {
            return null;
        }

        List<RoleEntity> list = new ArrayList<RoleEntity>( listRoleDto.size() );
        for ( RoleDto roleDto : listRoleDto ) {
            list.add( dtoToEntity( roleDto ) );
        }

        return list;
    }
}
