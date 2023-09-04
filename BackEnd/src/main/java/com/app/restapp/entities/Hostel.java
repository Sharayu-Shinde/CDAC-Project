package com.app.restapp.entities;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "hostel")
@Getter
@Setter
@NoArgsConstructor
public class Hostel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int hostel_id;

	@Column(name="hostel_name")
	private String hostel_name;

	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
	@JoinColumn(name = "owner_id")
	private User user;
	
	private String address;
	
	private String street;
	
	private String city;
	
	private String state;
	
	private int no_of_floors;
	
	private int pincode;
	
	private String facilities;
	
	private String image;
	
	private String rules;

	@OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private Set<Room> rooms = new HashSet<>();


	@DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
	private LocalDateTime posted_on;

	public Hostel(int hostel_id, String hostel_name, User user, String address, String street, String city, String state, int no_of_floors, int pincode, String facilities, String image, String rules, Set<Room> rooms, LocalDateTime posted_on) {
		this.hostel_id = hostel_id;
		this.hostel_name = hostel_name;
		this.user = user;
		this.address = address;
		this.street = street;
		this.city = city;
		this.state = state;
		this.no_of_floors = no_of_floors;
		this.pincode = pincode;
		this.facilities = facilities;
		this.image = image;
		this.rules = rules;
		this.rooms = rooms;
		this.posted_on = posted_on;
	}
}
