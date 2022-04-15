package com.example.onlineMagazin.mappers.productRatingType;

import com.example.onlineMagazin.dto.productRatingType.ProductRatingTypeCreateDto;
import com.example.onlineMagazin.dto.productRatingType.ProductRatingTypeDto;
import com.example.onlineMagazin.dto.productRatingType.ProductRatingTypeUpdateDto;
import com.example.onlineMagazin.entity.productRating.ProductRatingType;
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
public class ProductRatingTypeMapperImpl implements ProductRatingTypeMapper {

    @Override
    public ProductRatingTypeDto toDto(ProductRatingType productRatingType) {
        if ( productRatingType == null ) {
            return null;
        }

        ProductRatingTypeDto productRatingTypeDto = new ProductRatingTypeDto();

        productRatingTypeDto.setName( productRatingType.getName() );
        productRatingTypeDto.setCode( productRatingType.getCode() );

        return productRatingTypeDto;
    }

    @Override
    public List<ProductRatingTypeDto> toDto(List<ProductRatingType> e) {
        if ( e == null ) {
            return null;
        }

        List<ProductRatingTypeDto> list = new ArrayList<ProductRatingTypeDto>( e.size() );
        for ( ProductRatingType productRatingType : e ) {
            list.add( toDto( productRatingType ) );
        }

        return list;
    }

    @Override
    public ProductRatingType fromCreateDto(ProductRatingTypeCreateDto productRatingTypeCreateDto) {
        if ( productRatingTypeCreateDto == null ) {
            return null;
        }

        ProductRatingType productRatingType = new ProductRatingType();

        productRatingType.setName( productRatingTypeCreateDto.getName() );
        productRatingType.setCode( productRatingTypeCreateDto.getCode() );

        return productRatingType;
    }

    @Override
    public ProductRatingType fromUpdateDto(ProductRatingTypeUpdateDto d) {
        if ( d == null ) {
            return null;
        }

        ProductRatingType productRatingType = new ProductRatingType();

        productRatingType.setId( d.getId() );
        productRatingType.setName( d.getName() );
        productRatingType.setCode( d.getCode() );

        return productRatingType;
    }
}
