package com.example.onlineMagazin.mappers.userCart;

import com.example.onlineMagazin.dto.userCart.AuthUserCartCreateDto;
import com.example.onlineMagazin.dto.userCart.AuthUserCartDto;
import com.example.onlineMagazin.dto.userCart.AuthUserCartUpdateDto;
import com.example.onlineMagazin.entity.userCart.AuthUserCart;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-04-15T14:24:00+0500",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17 (Oracle Corporation)"
)
@Component
public class AuthUserCartMapperImpl implements AuthUserCartMapper {

    @Override
    public AuthUserCartDto toDto(AuthUserCart authUserCart) {
        if ( authUserCart == null ) {
            return null;
        }

        AuthUserCartDto authUserCartDto = new AuthUserCartDto();

        authUserCartDto.setCount( authUserCart.getCount() );
        authUserCartDto.setAccept( authUserCart.getAccept() );

        return authUserCartDto;
    }

    @Override
    public List<AuthUserCartDto> toDto(List<AuthUserCart> e) {
        if ( e == null ) {
            return null;
        }

        List<AuthUserCartDto> list = new ArrayList<AuthUserCartDto>( e.size() );
        for ( AuthUserCart authUserCart : e ) {
            list.add( toDto( authUserCart ) );
        }

        return list;
    }

    @Override
    public AuthUserCart fromCreateDto(AuthUserCartCreateDto authUserCartCreateDto) {
        if ( authUserCartCreateDto == null ) {
            return null;
        }

        AuthUserCart authUserCart = new AuthUserCart();

        authUserCart.setCount( authUserCartCreateDto.getCount() );
        authUserCart.setAccept( authUserCartCreateDto.getAccept() );

        return authUserCart;
    }

    @Override
    public AuthUserCart fromUpdateDto(AuthUserCartUpdateDto d) {
        if ( d == null ) {
            return null;
        }

        AuthUserCart authUserCart = new AuthUserCart();

        authUserCart.setId( d.getId() );
        authUserCart.setCount( d.getCount() );
        authUserCart.setAccept( d.getAccept() );

        return authUserCart;
    }
}
