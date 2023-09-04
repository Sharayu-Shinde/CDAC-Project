package com.app.restapp.entities;

import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "room")
@Getter
@Setter
@NoArgsConstructor
public class Room {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int room_id;
	
	private String image;
	
	private double rent;
	
	private double deposite;
	
	private int min_stay;

	@Enumerated(EnumType.STRING)
	private BedSharing bed_share;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
	private LocalDateTime posted_on;
	
	private short is_active=1;

	public Room(int room_id, String image, double rent, double deposite, int min_stay, LocalDateTime posted_on,
			short is_active) {
		super();
		this.room_id = room_id;
		this.image = image;
		this.rent = rent;
		this.deposite = deposite;
		this.min_stay = min_stay;
		this.posted_on = posted_on;
		this.is_active = is_active;
	}

	
}
