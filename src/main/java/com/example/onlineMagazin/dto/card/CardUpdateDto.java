package com.example.onlineMagazin.dto.card;

import com.example.onlineMagazin.dto.GenericDto;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CardUpdateDto extends GenericDto {
    private Long id;
    private Long userId;
    private Long pan;
    private String card_type;
    private String holder_name;
}
