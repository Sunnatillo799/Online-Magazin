package com.example.onlineMagazin.mappers.product;

import com.example.onlineMagazin.dto.product.ProductCreateDto;
import com.example.onlineMagazin.dto.product.ProductDto;
import com.example.onlineMagazin.dto.product.ProductDto.ProductDtoBuilder;
import com.example.onlineMagazin.dto.product.ProductUpdateDto;
import com.example.onlineMagazin.entity.product.Product;
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
public class ProductMapperImpl implements ProductMapper {

    @Override
    public ProductDto toDto(Product product) {
        if ( product == null ) {
            return null;
        }

        ProductDtoBuilder productDto = ProductDto.childrenBuilder();

        productDto.id( product.getId() );
        productDto.category( product.getCategory() );
        productDto.name( product.getName() );
        productDto.description( product.getDescription() );
        productDto.price( product.getPrice() );
        productDto.is_new( product.getIs_new() );
        productDto.status( product.getStatus() );

        return productDto.build();
    }

    @Override
    public List<ProductDto> toDto(List<Product> e) {
        if ( e == null ) {
            return null;
        }

        List<ProductDto> list = new ArrayList<ProductDto>( e.size() );
        for ( Product product : e ) {
            list.add( toDto( product ) );
        }

        return list;
    }

    @Override
    public Product fromCreateDto(ProductCreateDto productCreateDto) {
        if ( productCreateDto == null ) {
            return null;
        }

        Product product = new Product();

        product.setName( productCreateDto.getName() );
        product.setDescription( productCreateDto.getDescription() );
        product.setPrice( productCreateDto.getPrice() );

        return product;
    }

    @Override
    public Product fromUpdateDto(ProductUpdateDto d) {
        if ( d == null ) {
            return null;
        }

        Product product = new Product();

        product.setId( d.getId() );
        product.setCategory( d.getCategory() );
        product.setName( d.getName() );
        product.setDescription( d.getDescription() );
        product.setPrice( d.getPrice() );

        return product;
    }

    @Override
    public Product fromUpdateDto(ProductUpdateDto d, Product product) {
        if ( d == null ) {
            return null;
        }

        if ( d.getId() != null ) {
            product.setId( d.getId() );
        }
        if ( d.getCategory() != null ) {
            product.setCategory( d.getCategory() );
        }
        if ( d.getName() != null ) {
            product.setName( d.getName() );
        }
        if ( d.getDescription() != null ) {
            product.setDescription( d.getDescription() );
        }
        if ( d.getPrice() != null ) {
            product.setPrice( d.getPrice() );
        }

        return product;
    }
}
