package com.example.onlineMagazin.mappers.status;

import com.example.onlineMagazin.dto.status.StatusCreateDto;
import com.example.onlineMagazin.dto.status.StatusDto;
import com.example.onlineMagazin.dto.status.StatusUpdateDto;
import com.example.onlineMagazin.entity.status.Status;
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
public class StatusMapperImpl implements StatusMapper {

    @Override
    public StatusDto toDto(Status status) {
        if ( status == null ) {
            return null;
        }

        StatusDto statusDto = new StatusDto();

        statusDto.setName( status.getName() );
        statusDto.setCode( status.getCode() );

        return statusDto;
    }

    @Override
    public List<StatusDto> toDto(List<Status> e) {
        if ( e == null ) {
            return null;
        }

        List<StatusDto> list = new ArrayList<StatusDto>( e.size() );
        for ( Status status : e ) {
            list.add( toDto( status ) );
        }

        return list;
    }

    @Override
    public Status fromCreateDto(StatusCreateDto statusCreateDto) {
        if ( statusCreateDto == null ) {
            return null;
        }

        Status status = new Status();

        status.setName( statusCreateDto.getName() );
        status.setCode( statusCreateDto.getCode() );

        return status;
    }

    @Override
    public Status fromUpdateDto(StatusUpdateDto d) {
        if ( d == null ) {
            return null;
        }

        Status status = new Status();

        status.setId( d.getId() );
        status.setName( d.getName() );
        status.setCode( d.getCode() );

        return status;
    }
}
