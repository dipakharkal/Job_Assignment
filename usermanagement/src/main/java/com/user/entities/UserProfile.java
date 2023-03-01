package com.user.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class UserProfile {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(length = 50)
	private String  firstName;
	@Column(length = 50)
	private String  middleName;
	@Column(length = 50)
	private String  lastName;
	@Column(length = 50)
	private String  fullName;
	@Column(length = 12)
	private int  uid;
	

	
	@ManyToOne
	@JsonIgnoreProperties("userProfile")
	private Users users;



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getMiddleName() {
		return middleName;
	}



	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public String getFullName() {
		return fullName;
	}



	public void setFullName(String fullName) {
		this.fullName = fullName;
	}



	public int getUid() {
		return uid;
	}



	@Override
	public String toString() {
		return "UserProfile [id=" + id + ", firstName=" + firstName + ", middleName=" + middleName + ", lastName="
				+ lastName + ", fullName=" + fullName + ", uid=" + uid + ", users=" + users + "]";
	}



	public UserProfile() {
		super();
		// TODO Auto-generated constructor stub
	}



	public UserProfile(int id, String firstName, String middleName, String lastName, String fullName, int uid,
			Users users) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.fullName = fullName;
		this.uid = uid;
		this.users = users;
	}



	public void setUid(int uid) {
		this.uid = uid;
	}



	public Users getUsers() {
		return users;
	}



	public void setUsers(Users users) {
		this.users = users;
	}
	
	
	
}
