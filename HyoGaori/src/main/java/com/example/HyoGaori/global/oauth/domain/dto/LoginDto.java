package com.example.HyoGaori.global.oauth.domain.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class LoginDto {

    private String loginId;
    private String password;

}
