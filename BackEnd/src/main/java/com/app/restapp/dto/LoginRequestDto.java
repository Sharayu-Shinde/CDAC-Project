package com.app.restapp.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class LoginRequestDto {

    private String mobile;
    private String password;

    public LoginRequestDto(String mobile, String password) {
        this.mobile = mobile;
        this.password = password;
    }
}
