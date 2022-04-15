package com.example.onlineMagazin.mappers.color;

import com.example.onlineMagazin.dto.color.ColorCreateDto;
import com.example.onlineMagazin.dto.color.ColorDto;
import com.example.onlineMagazin.dto.color.ColorUpdateDto;
import com.example.onlineMagazin.entity.color.Color;
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
public class ColorMapperImpl implements ColorMapper {

    @Override
    public ColorDto toDto(Color color) {
        if ( color == null ) {
            return null;
        }

        ColorDto colorDto = new ColorDto();

        colorDto.setName( color.getName() );
        colorDto.setCode( color.getCode() );

        return colorDto;
    }

    @Override
    public List<ColorDto> toDto(List<Color> e) {
        if ( e == null ) {
            return null;
        }

        List<ColorDto> list = new ArrayList<ColorDto>( e.size() );
        for ( Color color : e ) {
            list.add( toDto( color ) );
        }

        return list;
    }

    @Override
    public Color fromCreateDto(ColorCreateDto colorCreateDto) {
        if ( colorCreateDto == null ) {
            return null;
        }

        Color color = new Color();

        color.setName( colorCreateDto.getName() );
        color.setCode( colorCreateDto.getCode() );

        return color;
    }

    @Override
    public Color fromUpdateDto(ColorUpdateDto d) {
        if ( d == null ) {
            return null;
        }

        Color color = new Color();

        color.setId( d.getId() );
        color.setName( d.getName() );
        color.setCode( d.getCode() );

        return color;
    }
}
