package com.example.onlineMagazin.dto.card;

import com.example.onlineMagazin.dto.Dto;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CardCreateDto implements Dto {
    private Long userId;
    private Long pan;
    private String card_type;
    private String holder_name;
}
