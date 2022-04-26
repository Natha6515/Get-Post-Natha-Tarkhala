package com.you;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="Student_details")

public class StudentExtraData {

	
	@Id
	@Column(name="Enrollment_No",nullable=false)
	private int id;
	
	@Column(name="Student_name",nullable=false,length=50)
	private String name;
	
	@Column(name="Surname",nullable=false,length=50)
	private String surname;
	
	@Column(name="Father_name",length=50)
	private String fathername;
	
	@Column(name="Age",nullable=false)
	private int age;
	
	@Column(name="Mobile_number",nullable=false)
	private String mobileno;
	
	@Column(name="Gender",nullable=false,length=10)
	private String gender;
	
	@Column(name="Address",nullable=false,length=200)
	private String address;
	
	@Column(name="City",length=50)
	private String city;
	
	@Transient
	private String bloodgroop;
	
	
	@Column(name="Passport_photo")
	@Lob
	private byte[] image;
	
	
	public StudentExtraData() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StudentExtraData(int id, String name, String surname, String fathername, int age, String city, String mobileno,
			String gender, String address, String bloodgroop,byte[] image) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.fathername = fathername;
		this.age = age;
		this.city = city;
		this.mobileno = mobileno;
		this.gender = gender;
		this.address = address;
		this.bloodgroop = bloodgroop;
		this.image = image;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getFathername() {
		return fathername;
	}

	public void setFathername(String fathername) {
		this.fathername = fathername;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getMobileno() {
		return mobileno;
	}

	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBloodgroop() {
		return bloodgroop;
	}

	public void setBloodgroop(String bloodgroop) {
		this.bloodgroop = bloodgroop;
	}

	
	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}
	
	
	
	
	
}
