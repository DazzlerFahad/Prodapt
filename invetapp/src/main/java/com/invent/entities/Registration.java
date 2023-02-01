package com.invent.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="registration")
public class Registration {
	
	@Id
	private long empid;
	
	@Column(name = "first_name", length=45, nullable=false)
	private String firstName;
	
	@Column(name = "middle_name", length=45, nullable=false)
	private String middleName;
	
	@Column(name = "last_name", length=45, nullable=false)
	private String lastName;
	
	@Column(name = "mobile", length=15, nullable=false, unique=true)
	private String mobile;
	
	@Column(name = "email", length=128, nullable=false, unique=true)
	private String email;
	
	@Column(name = "password", length=10, nullable=false)
	private String password;

	public long getEmpid() {
		return empid;
	}

	public void setEmpid(long empid) {
		this.empid = empid;
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

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Registration(long empid, String firstName, String middleName, String lastName, String mobile, String email,
			String password) {
		super();
		this.empid = empid;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.mobile = mobile;
		this.email = email;
		this.password = password;
	}

	public Registration() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Registration [empid=" + empid + ", firstName=" + firstName + ", middleName=" + middleName
				+ ", lastName=" + lastName + ", mobile=" + mobile + ", email=" + email + ", password=" + password + "]";
	}
	
	
}