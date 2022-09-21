package com.ocrecognize.mapper;

import com.ocrecognize.model.dto.UserDto;
import com.ocrecognize.model.entity.UserEntity;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-09-21T16:20:28-0400",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 16.0.2 (Oracle Corporation)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Autowired
    private RoleMapper roleMapper;

    @Override
    public UserDto entityToDto(UserEntity userEntity) {
        if ( userEntity == null ) {
            return null;
        }

        UserDto userDto = new UserDto();

        userDto.setRoleDto( roleMapper.entityToDto( userEntity.getRoleEntity() ) );
        userDto.setId( userEntity.getId() );
        userDto.setUsername( userEntity.getUsername() );
        userDto.setPassword( userEntity.getPassword() );
        userDto.setFirstname( userEntity.getFirstname() );
        userDto.setLastname( userEntity.getLastname() );

        return userDto;
    }

    @Override
    public UserEntity dtoToEntity(UserDto userDto) {
        if ( userDto == null ) {
            return null;
        }

        UserEntity userEntity = new UserEntity();

        userEntity.setRoleEntity( roleMapper.dtoToEntity( userDto.getRoleDto() ) );
        userEntity.setId( userDto.getId() );
        userEntity.setUsername( userDto.getUsername() );
        userEntity.setPassword( userDto.getPassword() );
        userEntity.setFirstname( userDto.getFirstname() );
        userEntity.setLastname( userDto.getLastname() );

        return userEntity;
    }

    @Override
    public List<UserDto> listEntityToDto(List<UserEntity> listUserEntity) {
        if ( listUserEntity == null ) {
            return null;
        }

        List<UserDto> list = new ArrayList<UserDto>( listUserEntity.size() );
        for ( UserEntity userEntity : listUserEntity ) {
            list.add( entityToDto( userEntity ) );
        }

        return list;
    }

    @Override
    public List<UserEntity> listDtoToEntity(List<UserDto> listUserDto) {
        if ( listUserDto == null ) {
            return null;
        }

        List<UserEntity> list = new ArrayList<UserEntity>( listUserDto.size() );
        for ( UserDto userDto : listUserDto ) {
            list.add( dtoToEntity( userDto ) );
        }

        return list;
    }
}
