package com.example.onlineMagazin.mappers.productLike;

import com.example.onlineMagazin.dto.product.ProductOnlyDto;
import com.example.onlineMagazin.dto.productLike.ProductLikeCreateDto;
import com.example.onlineMagazin.dto.productLike.ProductLikeDto;
import com.example.onlineMagazin.dto.productLike.ProductLikeUpdateDto;
import com.example.onlineMagazin.entity.product.Product;
import com.example.onlineMagazin.entity.product.ProductLike;
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
public class ProductLikeMapperImpl implements ProductLikeMapper {

    @Override
    public ProductLikeDto toDto(ProductLike productLike) {
        if ( productLike == null ) {
            return null;
        }

        ProductLikeDto productLikeDto = new ProductLikeDto();

        return productLikeDto;
    }

    @Override
    public List<ProductLikeDto> toDto(List<ProductLike> e) {
        if ( e == null ) {
            return null;
        }

        List<ProductLikeDto> list = new ArrayList<ProductLikeDto>( e.size() );
        for ( ProductLike productLike : e ) {
            list.add( toDto( productLike ) );
        }

        return list;
    }

    @Override
    public ProductLike fromCreateDto(ProductLikeCreateDto productLikeCreateDto) {
        if ( productLikeCreateDto == null ) {
            return null;
        }

        ProductLike productLike = new ProductLike();

        return productLike;
    }

    @Override
    public ProductLike fromUpdateDto(ProductLikeUpdateDto d) {
        if ( d == null ) {
            return null;
        }

        ProductLike productLike = new ProductLike();

        productLike.setId( d.getId() );

        return productLike;
    }

    @Override
    public ProductOnlyDto fromProductOnlyDto(Product product) {
        if ( product == null ) {
            return null;
        }

        ProductOnlyDto productOnlyDto = new ProductOnlyDto();

        productOnlyDto.setId( product.getId() );
        productOnlyDto.setName( product.getName() );
        productOnlyDto.setDescription( product.getDescription() );
        productOnlyDto.setPrice( product.getPrice() );
        productOnlyDto.setIs_new( product.getIs_new() );

        return productOnlyDto;
    }
}
