package com.shrawin.ProjectOne.Soldier;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Soldier_Table")
public class Soldier {
	@Id
	private int IdNumber;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	
	public int getIdNumber() {
		return IdNumber;
	}
	public void setIdNumber(int idNumber) {
		IdNumber = idNumber;
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
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	@Override
	public String toString() {
		return "Soldier [IdNumber=" + IdNumber + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", phoneNumber=" + phoneNumber + "]";
	}
}
