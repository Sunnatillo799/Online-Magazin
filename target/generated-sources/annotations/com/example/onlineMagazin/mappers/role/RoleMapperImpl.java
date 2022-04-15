package com.example.onlineMagazin.mappers.role;

import com.example.onlineMagazin.dto.role.RoleCreateDto;
import com.example.onlineMagazin.dto.role.RoleDto;
import com.example.onlineMagazin.dto.role.RoleUpdateDto;
import com.example.onlineMagazin.entity.role.Role;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-04-15T14:24:01+0500",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17 (Oracle Corporation)"
)
@Component
public class RoleMapperImpl implements RoleMapper {

    @Override
    public RoleDto toDto(Role role) {
        if ( role == null ) {
            return null;
        }

        RoleDto roleDto = new RoleDto();

        roleDto.setName( role.getName() );
        roleDto.setCode( role.getCode() );

        return roleDto;
    }

    @Override
    public List<RoleDto> toDto(List<Role> e) {
        if ( e == null ) {
            return null;
        }

        List<RoleDto> list = new ArrayList<RoleDto>( e.size() );
        for ( Role role : e ) {
            list.add( toDto( role ) );
        }

        return list;
    }

    @Override
    public Role fromCreateDto(RoleCreateDto roleCreateDto) {
        if ( roleCreateDto == null ) {
            return null;
        }

        Role role = new Role();

        role.setName( roleCreateDto.getName() );
        role.setCode( roleCreateDto.getCode() );

        return role;
    }

    @Override
    public Role fromUpdateDto(RoleUpdateDto d) {
        if ( d == null ) {
            return null;
        }

        Role role = new Role();

        role.setId( d.getId() );
        role.setName( d.getName() );
        role.setCode( d.getCode() );

        return role;
    }
}
