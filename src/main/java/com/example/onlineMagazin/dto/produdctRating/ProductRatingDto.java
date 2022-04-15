package com.example.onlineMagazin.dto.produdctRating;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductRatingDto {
    private Long productId;
    private Long ratingTypeId;
    private Long countLike;
}
