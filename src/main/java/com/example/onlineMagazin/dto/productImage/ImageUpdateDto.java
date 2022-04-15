package com.example.onlineMagazin.dto.productImage;

import com.example.onlineMagazin.entity.product.Product;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ImageUpdateDto {
    private Long id;
    private Long productId;
    private String image_path;
    private Boolean is_main;
}
