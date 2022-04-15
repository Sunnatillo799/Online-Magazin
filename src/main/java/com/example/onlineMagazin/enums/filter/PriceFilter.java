package com.example.onlineMagazin.enums.filter;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PriceFilter {
    ALL("price between 0 and price"),
    ZERO_TO_FIFTY("price between 0 and 50"),
    FIFTY_TO_HUNDRED("price between 50 and 100"),
    HUNDRED_T0_ONE_HUND_FIFTY("price between 100 and 150"),
    ONE_HUND_FIFTY_TO_TWO_HUNDRED("price between 150 and 200"),
    TWO_HUNDRED_TO_PLUS("price between 200 and price");
    private final String query;

    public static String getByFilterId(Long id) {
        if (id == 0) {
            return ALL.query;
        } else if (id == 1) {
            return ZERO_TO_FIFTY.query;
        } else if (id == 2) {
            return FIFTY_TO_HUNDRED.query;
        } else if (id == 3) {
            return HUNDRED_T0_ONE_HUND_FIFTY.query;
        } else if (id == 4) {
            return ONE_HUND_FIFTY_TO_TWO_HUNDRED.query;
        } else if (id == 5) {
            return TWO_HUNDRED_TO_PLUS.query;
        } else {
            return ALL.query;
        }
    }
}
