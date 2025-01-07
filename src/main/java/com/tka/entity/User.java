package com.tka.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "user")
public class User {

	@Id
	int id;
	@Column(name ="usname")
	String usname;
	@Column(name = "password")
	String password;
	
	public User() {
		// TODO Auto-generated constructor stub
	}
	
	public User(int id, String usname, String password) {
		super();
		this.id = id;
		this.usname = usname;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsname() {
		return usname;
	}

	public void setUsname(String usname) {
		this.usname = usname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", usname=" + usname + ", password=" + password + "]";
	}
}
