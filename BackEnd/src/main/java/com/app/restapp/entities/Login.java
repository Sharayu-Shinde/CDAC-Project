package com.app.restapp.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;


@Entity
@Table(name = "login")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Login {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(unique = true,nullable = false)
	private String mobile;
	
	@Column(nullable = false)
	private String password;

	@Column(nullable = false)
	private String role;

	public Login(int id,String mobile, String password, String role) {
		super();
		this.id = id;
		this.mobile = mobile;
		this.password = password;
		this.role = role;
	}


	
}
