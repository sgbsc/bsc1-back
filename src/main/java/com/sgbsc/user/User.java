package com.sgbsc.user;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Setter @Getter
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long userId;
	private String firstname;
	private String surname;
	
	public User() {}
	
	public User(String firstname, String surname) {
		this.firstname = firstname;
		this.surname = surname;
	}
	
}
