package com.example.onlineMagazin.mappers.size;

import com.example.onlineMagazin.dto.size.SizeCreateDto;
import com.example.onlineMagazin.dto.size.SizeDto;
import com.example.onlineMagazin.dto.size.SizeUpdateDto;
import com.example.onlineMagazin.entity.size.Size;
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
public class SizeMapperImpl implements SizeMapper {

    @Override
    public SizeDto toDto(Size size) {
        if ( size == null ) {
            return null;
        }

        SizeDto sizeDto = new SizeDto();

        sizeDto.setCode( size.getCode() );
        sizeDto.setNumber( size.getNumber() );

        return sizeDto;
    }

    @Override
    public List<SizeDto> toDto(List<Size> e) {
        if ( e == null ) {
            return null;
        }

        List<SizeDto> list = new ArrayList<SizeDto>( e.size() );
        for ( Size size : e ) {
            list.add( toDto( size ) );
        }

        return list;
    }

    @Override
    public Size fromCreateDto(SizeCreateDto sizeCreateDto) {
        if ( sizeCreateDto == null ) {
            return null;
        }

        Size size = new Size();

        size.setCode( sizeCreateDto.getCode() );
        size.setNumber( sizeCreateDto.getNumber() );

        return size;
    }

    @Override
    public Size fromUpdateDto(SizeUpdateDto d) {
        if ( d == null ) {
            return null;
        }

        Size size = new Size();

        size.setId( d.getId() );
        size.setCode( d.getCode() );
        size.setNumber( d.getNumber() );

        return size;
    }
}
