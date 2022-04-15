package com.example.onlineMagazin.mappers.category;

import com.example.onlineMagazin.dto.category.CategoryCreateDto;
import com.example.onlineMagazin.dto.category.CategoryDto;
import com.example.onlineMagazin.dto.category.CategoryDto.CategoryDtoBuilder;
import com.example.onlineMagazin.dto.category.CategoryUpdateDto;
import com.example.onlineMagazin.entity.category.Category;
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
public class CategoryMapperImpl implements CategoryMapper {

    @Override
    public CategoryDto toDto(Category category) {
        if ( category == null ) {
            return null;
        }

        CategoryDtoBuilder categoryDto = CategoryDto.builder();

        categoryDto.name( category.getName() );

        return categoryDto.build();
    }

    @Override
    public List<CategoryDto> toDto(List<Category> e) {
        if ( e == null ) {
            return null;
        }

        List<CategoryDto> list = new ArrayList<CategoryDto>( e.size() );
        for ( Category category : e ) {
            list.add( toDto( category ) );
        }

        return list;
    }

    @Override
    public Category fromCreateDto(CategoryCreateDto categoryCreateDto) {
        if ( categoryCreateDto == null ) {
            return null;
        }

        Category category = new Category();

        category.setName( categoryCreateDto.getName() );

        return category;
    }

    @Override
    public Category fromUpdateDto(CategoryUpdateDto d) {
        if ( d == null ) {
            return null;
        }

        Category category = new Category();

        category.setId( d.getId() );
        category.setName( d.getName() );

        return category;
    }
}
