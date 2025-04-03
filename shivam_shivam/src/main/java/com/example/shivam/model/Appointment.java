package com.example.shivam.model;

import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "appointments")

public class Appointment {
	 
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

    private String name;
    private String email;
    private String phone;
    private String date;
    private String time;
    private String service;
    private String message;
    public Appointment() {
		super();
	}
    public Appointment(Long id, String name, String email, String phone, String date, String time, String service,
			String message) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.date = date;
		this.time = time;
		this.service = service;
		this.message = message;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getService() {
		return service;
	}
	public void setService(String service) {
		this.service = service;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "Appointment [id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + ", date=" + date
				+ ", time=" + time + ", service=" + service + ", message=" + message + "]";
	}
    

	

}
