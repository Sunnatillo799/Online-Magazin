package com.example.onlineMagazin.dto.auth;

import lombok.*;

/**
 * Author : Qozoqboyev Ixtiyor
 * Time : 31.03.2022 21:16
 * Project : v1_api
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class AuthUserSettingsDto {
    private Long id;
    private String language_code;
    private String price_type;
}
