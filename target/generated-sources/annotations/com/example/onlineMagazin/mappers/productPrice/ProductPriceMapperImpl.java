package com.example.onlineMagazin.mappers.productPrice;

import com.example.onlineMagazin.dto.productPrice.ProductPriceCreateDto;
import com.example.onlineMagazin.dto.productPrice.ProductPriceDto;
import com.example.onlineMagazin.dto.productPrice.ProductPriceUpdateDto;
import com.example.onlineMagazin.entity.productPrice.ProductPrice;
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
public class ProductPriceMapperImpl implements ProductPriceMapper {

    @Override
    public ProductPriceDto toDto(ProductPrice productPrice) {
        if ( productPrice == null ) {
            return null;
        }

        ProductPriceDto productPriceDto = new ProductPriceDto();

        productPriceDto.setId( productPrice.getId() );
        productPriceDto.setUsd( productPrice.getUsd() );
        productPriceDto.setRub( productPrice.getRub() );
        productPriceDto.setUzs( productPrice.getUzs() );

        return productPriceDto;
    }

    @Override
    public List<ProductPriceDto> toDto(List<ProductPrice> e) {
        if ( e == null ) {
            return null;
        }

        List<ProductPriceDto> list = new ArrayList<ProductPriceDto>( e.size() );
        for ( ProductPrice productPrice : e ) {
            list.add( toDto( productPrice ) );
        }

        return list;
    }

    @Override
    public ProductPrice fromCreateDto(ProductPriceCreateDto productPriceCreateDto) {
        if ( productPriceCreateDto == null ) {
            return null;
        }

        ProductPrice productPrice = new ProductPrice();

        if ( productPriceCreateDto.getUsd() != null ) {
            productPrice.setUsd( productPriceCreateDto.getUsd().doubleValue() );
        }
        if ( productPriceCreateDto.getRub() != null ) {
            productPrice.setRub( productPriceCreateDto.getRub().doubleValue() );
        }
        if ( productPriceCreateDto.getUzs() != null ) {
            productPrice.setUzs( productPriceCreateDto.getUzs().doubleValue() );
        }

        return productPrice;
    }

    @Override
    public ProductPrice fromUpdateDto(ProductPriceUpdateDto d) {
        if ( d == null ) {
            return null;
        }

        ProductPrice productPrice = new ProductPrice();

        productPrice.setId( d.getId() );
        if ( d.getUsd() != null ) {
            productPrice.setUsd( d.getUsd().doubleValue() );
        }
        if ( d.getRub() != null ) {
            productPrice.setRub( d.getRub().doubleValue() );
        }
        if ( d.getUzs() != null ) {
            productPrice.setUzs( d.getUzs().doubleValue() );
        }

        return productPrice;
    }
}
