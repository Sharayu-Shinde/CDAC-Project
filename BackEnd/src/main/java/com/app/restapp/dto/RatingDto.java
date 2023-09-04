package com.app.restapp.dto;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class RatingDto {

    private int id;
    private int rating;
    private String comments;
    private int selectedHostelId;
    private int selectedTenantId;


}
