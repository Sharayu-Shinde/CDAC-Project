package com.app.restapp.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ForgotPasswordDto {

    private String mobile;
    private String password;

    public ForgotPasswordDto(String mobile, String password) {
        this.mobile = mobile;
        this.password = password;
    }
}
