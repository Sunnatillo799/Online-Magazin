package com.example.onlineMagazin.mappers.productSize;

import com.example.onlineMagazin.dto.productSize.ProductSizeCreateDto;
import com.example.onlineMagazin.dto.productSize.ProductSizeDto;
import com.example.onlineMagazin.dto.productSize.ProductSizeUpdateDto;
import com.example.onlineMagazin.entity.product.ProductSize;
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
public class ProductSizeMapperImpl implements ProductSizeMapper {

    @Override
    public ProductSizeDto toDto(ProductSize productSize) {
        if ( productSize == null ) {
            return null;
        }

        ProductSizeDto productSizeDto = new ProductSizeDto();

        return productSizeDto;
    }

    @Override
    public List<ProductSizeDto> toDto(List<ProductSize> e) {
        if ( e == null ) {
            return null;
        }

        List<ProductSizeDto> list = new ArrayList<ProductSizeDto>( e.size() );
        for ( ProductSize productSize : e ) {
            list.add( toDto( productSize ) );
        }

        return list;
    }

    @Override
    public ProductSize fromCreateDto(ProductSizeCreateDto productSizeCreateDto) {
        if ( productSizeCreateDto == null ) {
            return null;
        }

        ProductSize productSize = new ProductSize();

        return productSize;
    }

    @Override
    public ProductSize fromUpdateDto(ProductSizeUpdateDto d) {
        if ( d == null ) {
            return null;
        }

        ProductSize productSize = new ProductSize();

        productSize.setId( d.getId() );

        return productSize;
    }
}
