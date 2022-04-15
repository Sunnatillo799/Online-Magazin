package com.example.onlineMagazin.dto.auth;

import lombok.Getter;
import lombok.Setter;

/**
 * Author : Qozoqboyev Ixtiyor
 * Time : 31.03.2022 21:24
 * Project : online_store
 */
@Getter
@Setter
public class ChangePasswordDto {
    private Long id;
    private String password;
    private String newPassword;
    private String renewPassword;

}
