package com.app.restapp.dto;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class RoleDto {

    private int role_id;

    private String role_name;

    public RoleDto(int role_id, String role_name)
    {
        this.role_id = role_id;
        this.role_name = role_name;
    }
}
