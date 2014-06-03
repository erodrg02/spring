package es.unileon.springapp.service;

import java.util.Date;

import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class ClientData {
	/**
	 * Name of the person
	 */
	@Size(min = 2)
	@NotEmpty
	private String personName;

	/**
	 * surnames of the person
	 */
	@NotEmpty
	private String surnames;

	private int phoneNumber1;
	private int phoneNumber2;
	private String address;
	
	/**
	 * DNI
	 */
	@NotEmpty
	@Size(min = 8, max = 9)
	private String dni;

	public ClientData() {

	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}


	/**
	 * marritage state of the person
	 */
	private String civilState;

	/**
	 * proffesion of the person
	 */
	private String profession;



	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public int getPhoneNumber1() {
		return phoneNumber1;
	}

	public void setPhoneNumber1(int phoneNumber1) {
		this.phoneNumber1 = phoneNumber1;
	}

	public int getPhoneNumber2() {
		return phoneNumber2;
	}

	public void setPhoneNumber2(int phoneNumber2) {
		this.phoneNumber2 = phoneNumber2;
	}

	public String getSurnames() {
		return surnames;
	}

	public void setSurnames(String surnames) {
		this.surnames = surnames;
	}

	public String getCivilState() {
		return civilState;
	}

	public void setCivilState(String civilState) {
		this.civilState = civilState;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
