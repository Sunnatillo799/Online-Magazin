package com.example.onlineMagazin.enums.filter;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum SortByFilter {
    DEFAULT("and rating_type_id = rating_type_id"),
    POPULARITY("and rating_type_id = 1"),
    AVERAGE_RATING("and rating_type_id = 2"),
    NEWNESS("and is_new = true"),
    PRICE_LOW_TO_HIGH("order by product.price ASC"),
    PRICE_HIGH_TO_LOW("order by product.price DESC");
    private final String query;

    public static String getByFilterId(Long id) {
        if (id == 0) {
            return DEFAULT.query;
        } else if (id == 1) {
            return POPULARITY.query;
        } else if (id == 2) {
            return AVERAGE_RATING.query;
        } else if (id == 3) {
            return NEWNESS.query;
        } else if (id == 4) {
            return PRICE_LOW_TO_HIGH.query;
        } else if (id == 5) {
            return PRICE_HIGH_TO_LOW.query;
        } else {
            return DEFAULT.query;
        }
    }
}
