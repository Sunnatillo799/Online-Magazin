package com.example.onlineMagazin.dto.card;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CardDto {
    private Long userId;
    private Long pan;
    private String card_type;
    private String holder_name;
}
