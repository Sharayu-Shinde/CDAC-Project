package com.app.restapp.dto;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class BookingDto {

    private int id;
    private int room_id;
    private int tenant_id;
    private String transaction_id;

    public BookingDto(int id, int room_id, int tenant_id, String transaction_id) {
        this.id = id;
        this.room_id = room_id;
        this.tenant_id = tenant_id;
        this.transaction_id = transaction_id;
    }
}
