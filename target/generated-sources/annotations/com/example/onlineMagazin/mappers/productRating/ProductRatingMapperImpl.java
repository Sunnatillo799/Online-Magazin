package com.example.onlineMagazin.mappers.productRating;

import com.example.onlineMagazin.dto.produdctRating.ProductRatingCreateDto;
import com.example.onlineMagazin.dto.produdctRating.ProductRatingDto;
import com.example.onlineMagazin.dto.produdctRating.ProductRatingUpdateDto;
import com.example.onlineMagazin.entity.productRating.ProductRating;
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
public class ProductRatingMapperImpl implements ProductRatingMapper {

    @Override
    public ProductRatingDto toDto(ProductRating productRating) {
        if ( productRating == null ) {
            return null;
        }

        ProductRatingDto productRatingDto = new ProductRatingDto();

        productRatingDto.setCountLike( productRating.getCountLike() );

        return productRatingDto;
    }

    @Override
    public List<ProductRatingDto> toDto(List<ProductRating> e) {
        if ( e == null ) {
            return null;
        }

        List<ProductRatingDto> list = new ArrayList<ProductRatingDto>( e.size() );
        for ( ProductRating productRating : e ) {
            list.add( toDto( productRating ) );
        }

        return list;
    }

    @Override
    public ProductRating fromCreateDto(ProductRatingCreateDto productRatingCreateDto) {
        if ( productRatingCreateDto == null ) {
            return null;
        }

        ProductRating productRating = new ProductRating();

        return productRating;
    }

    @Override
    public ProductRating fromUpdateDto(ProductRatingUpdateDto d) {
        if ( d == null ) {
            return null;
        }

        ProductRating productRating = new ProductRating();

        productRating.setId( d.getId() );
        productRating.setCountLike( d.getCountLike() );

        return productRating;
    }
}
