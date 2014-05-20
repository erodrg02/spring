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
	private String name;

	/**
	 * surnames of the person
	 */
	@NotEmpty
	private String surnames;

	/**
	 * address of the person
	 */
	/**
	 * Street
	 */
	@NotEmpty
	private String street;

	/**
	 * Block in the street
	 */
	private int blockNumber;

	/**
	 * Floor in the block
	 */
	private int floor;

	/**
	 * Door in the floor
	 */

	private char door;

	/**
	 * Locality
	 */
	@NotEmpty
	@Size(min = 3)
	private String locality;

	/**
	 * Province
	 */
	@NotEmpty
	@Size(min = 3)
	private String province;

	/**
	 * Zip Code
	 */

	@Min(99)
	private int zipCode;

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

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public int getBlockNumber() {
		return blockNumber;
	}

	public void setBlockNumber(int blockNumber) {
		this.blockNumber = blockNumber;
	}

	public int getFloor() {
		return floor;
	}

	public void setFloor(int floor) {
		this.floor = floor;
	}

	public char getDoor() {
		return door;
	}

	public void setDoor(char door) {
		this.door = door;
	}

	public String getLocality() {
		return locality;
	}

	public void setLocality(String locality) {
		this.locality = locality;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	/**
	 * marritage state of the person
	 */
	private String civilState;

	/**
	 * phone numbers of the person
	 */
	private int[] phoneNumbers;

	/**
	 * proffesion of the person
	 */
	private String profession;

	/**
	 * birth date of the person
	 */
	private Date birthDate;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public int[] getPhoneNumbers() {
		return phoneNumbers;
	}

	public void setPhoneNumbers(int[] phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
}
