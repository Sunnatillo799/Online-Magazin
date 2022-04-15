package com.example.onlineMagazin.dto.userCart;

import com.example.onlineMagazin.dto.productImage.ImagePathDto;
import com.example.onlineMagazin.entity.product.Product;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * created by Elyor Ergashov
 *
 * @Author : elyor
 * @Date : 27/03/22
 * @Project : CazoStoreAPI-master
 */

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CartFullDto {
    private Product product;
    private ImagePathDto image;
}

