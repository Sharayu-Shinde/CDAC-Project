package com.app.restapp.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UserDto {

    private int user_id;

    private String first_name;

    private String last_name;

    private String email;

    private String mobile;

    private String aadharcardNumber;


    private String password;

    private int role_id;

    private String gender;

    private String address;

    private short active;

    public UserDto(int user_id, String first_name, String last_name, String email, String mobile, String aadharcardNumber,
                   String password, int role_id, String gender, String address, short active)
    {
        this.user_id = user_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.mobile = mobile;
        this.aadharcardNumber = aadharcardNumber;
        this.password = password;
        this.role_id = role_id;
        this.gender = gender;
        this.address = address;
        this.active = active;
    }
}
