package com.example.onlineMagazin.mappers.language;

import com.example.onlineMagazin.dto.language.LanguageCreateDto;
import com.example.onlineMagazin.dto.language.LanguageDto;
import com.example.onlineMagazin.dto.language.LanguageUpdateDto;
import com.example.onlineMagazin.entity.language.Language;
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
public class LanguageMapperImpl implements LanguageMapper {

    @Override
    public LanguageDto toDto(Language language) {
        if ( language == null ) {
            return null;
        }

        LanguageDto languageDto = new LanguageDto();

        languageDto.setName( language.getName() );
        languageDto.setCode( language.getCode() );

        return languageDto;
    }

    @Override
    public List<LanguageDto> toDto(List<Language> e) {
        if ( e == null ) {
            return null;
        }

        List<LanguageDto> list = new ArrayList<LanguageDto>( e.size() );
        for ( Language language : e ) {
            list.add( toDto( language ) );
        }

        return list;
    }

    @Override
    public Language fromCreateDto(LanguageCreateDto languageCreateDto) {
        if ( languageCreateDto == null ) {
            return null;
        }

        Language language = new Language();

        language.setName( languageCreateDto.getName() );
        language.setCode( languageCreateDto.getCode() );

        return language;
    }

    @Override
    public Language fromUpdateDto(LanguageUpdateDto d) {
        if ( d == null ) {
            return null;
        }

        Language language = new Language();

        language.setId( d.getId() );
        language.setName( d.getName() );
        language.setCode( d.getCode() );

        return language;
    }
}
