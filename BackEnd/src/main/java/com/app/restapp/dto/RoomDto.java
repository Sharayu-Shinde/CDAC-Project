package com.app.restapp.dto;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class RoomDto {

    private int room_id;

    private int hostel_id;

    private String image;

    private double rent;

    private double deposite;

    private enum bed_sharing{PRIVATE,TWO,THREE,MULTI}

    private int min_stay;

    private short is_active;

    public RoomDto(int room_id, int hostel_id, String image, double rent, double deposite, int min_stay, short is_active) {
        this.room_id = room_id;
        this.hostel_id = hostel_id;
        this.image = image;
        this.rent = rent;
        this.deposite = deposite;
        this.min_stay = min_stay;
        this.is_active = is_active;
    }
}
