package com.example.onlineMagazin.mappers.product;

import com.example.onlineMagazin.dto.GenericDto;
import com.example.onlineMagazin.dto.productImage.ImageCreateDto;
import com.example.onlineMagazin.dto.productImage.ImageDto;
import com.example.onlineMagazin.dto.productImage.ImageDto.ImageDtoBuilder;
import com.example.onlineMagazin.entity.product.ProductImage;
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
public class ImageMapperImpl implements ImageMapper {

    @Override
    public ProductImage fromUpdateDto(GenericDto d) {
        if ( d == null ) {
            return null;
        }

        ProductImage productImage = new ProductImage();

        productImage.setId( d.getId() );

        return productImage;
    }

    @Override
    public ImageDto toDto(ProductImage productImage) {
        if ( productImage == null ) {
            return null;
        }

        ImageDtoBuilder imageDto = ImageDto.childBuilder();

        imageDto.id( productImage.getId() );
        imageDto.product( productImage.getProduct() );
        imageDto.image_path( productImage.getImage_path() );
        imageDto.is_main( productImage.getIs_main() );

        return imageDto.build();
    }

    @Override
    public List<ImageDto> toDto(List<ProductImage> e) {
        if ( e == null ) {
            return null;
        }

        List<ImageDto> list = new ArrayList<ImageDto>( e.size() );
        for ( ProductImage productImage : e ) {
            list.add( toDto( productImage ) );
        }

        return list;
    }

    @Override
    public ProductImage fromCreateDto(ImageCreateDto imageCreateDto) {
        if ( imageCreateDto == null ) {
            return null;
        }

        ProductImage productImage = new ProductImage();

        productImage.setProduct( imageCreateDto.getProduct() );
        productImage.setImage_path( imageCreateDto.getImage_path() );
        productImage.setIs_main( imageCreateDto.getIs_main() );

        return productImage;
    }
}
