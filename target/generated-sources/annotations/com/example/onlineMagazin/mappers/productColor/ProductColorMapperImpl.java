package com.example.onlineMagazin.mappers.productColor;

import com.example.onlineMagazin.dto.productColor.ProductColorCreateDto;
import com.example.onlineMagazin.dto.productColor.ProductColorDto;
import com.example.onlineMagazin.dto.productColor.ProductColorUpdateDto;
import com.example.onlineMagazin.entity.product.ProductColor;
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
public class ProductColorMapperImpl implements ProductColorMapper {

    @Override
    public ProductColorDto toDto(ProductColor productColor) {
        if ( productColor == null ) {
            return null;
        }

        ProductColorDto productColorDto = new ProductColorDto();

        return productColorDto;
    }

    @Override
    public List<ProductColorDto> toDto(List<ProductColor> e) {
        if ( e == null ) {
            return null;
        }

        List<ProductColorDto> list = new ArrayList<ProductColorDto>( e.size() );
        for ( ProductColor productColor : e ) {
            list.add( toDto( productColor ) );
        }

        return list;
    }

    @Override
    public ProductColor fromCreateDto(ProductColorCreateDto productColorCreateDto) {
        if ( productColorCreateDto == null ) {
            return null;
        }

        ProductColor productColor = new ProductColor();

        return productColor;
    }

    @Override
    public ProductColor fromUpdateDto(ProductColorUpdateDto d) {
        if ( d == null ) {
            return null;
        }

        ProductColor productColor = new ProductColor();

        productColor.setId( d.getId() );

        return productColor;
    }
}
