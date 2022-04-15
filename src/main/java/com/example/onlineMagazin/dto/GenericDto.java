package com.example.onlineMagazin.dto;

import lombok.*;


@Getter
@Setter
@NoArgsConstructor
public class GenericDto implements Dto{

    private Long id;

    public GenericDto(Long id) {
        this.id = id;
    }

}
