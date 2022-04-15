package com.example.onlineMagazin.mappers.productComment;

import com.example.onlineMagazin.dto.productComment.ProductCommentCreateDto;
import com.example.onlineMagazin.dto.productComment.ProductCommentDto;
import com.example.onlineMagazin.dto.productComment.ProductCommentUpdateDto;
import com.example.onlineMagazin.entity.product.ProductComment;
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
public class ProductCommentMapperImpl implements ProductCommentMapper {

    @Override
    public ProductCommentDto toDto(ProductComment productComment) {
        if ( productComment == null ) {
            return null;
        }

        ProductCommentDto productCommentDto = new ProductCommentDto();

        productCommentDto.setMessage( productComment.getMessage() );
        productCommentDto.setRating( productComment.getRating() );

        return productCommentDto;
    }

    @Override
    public List<ProductCommentDto> toDto(List<ProductComment> e) {
        if ( e == null ) {
            return null;
        }

        List<ProductCommentDto> list = new ArrayList<ProductCommentDto>( e.size() );
        for ( ProductComment productComment : e ) {
            list.add( toDto( productComment ) );
        }

        return list;
    }

    @Override
    public ProductComment fromCreateDto(ProductCommentCreateDto productCommentCreateDto) {
        if ( productCommentCreateDto == null ) {
            return null;
        }

        ProductComment productComment = new ProductComment();

        productComment.setMessage( productCommentCreateDto.getMessage() );
        productComment.setRating( productCommentCreateDto.getRating() );

        return productComment;
    }

    @Override
    public ProductComment fromUpdateDto(ProductCommentUpdateDto d) {
        if ( d == null ) {
            return null;
        }

        ProductComment productComment = new ProductComment();

        productComment.setId( d.getId() );
        productComment.setMessage( d.getMessage() );

        return productComment;
    }
}
