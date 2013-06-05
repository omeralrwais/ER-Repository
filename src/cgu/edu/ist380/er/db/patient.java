package cgu.edu.ist380.er.db;

import java.util.Date;

public class patient {
	private Date dob;
	private char gender;
	private String firstName;
	private String lastName;
	private int phone;
	private String address;
	private String city;
	private int zib;
	
	public patient() {
		super();
		this.dob = null;
		this.gender = ' ';
		this.firstName = " ";
		this.lastName = " ";
		this.phone = 0000000000;
		this.address = " ";
		this.city = " ";
		this.zib = 00000;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getZib() {
		return zib;
	}
	public void setZib(int zib) {
		this.zib = zib;
	}

}
