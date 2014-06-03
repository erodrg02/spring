package es.unileon.springapp.web;

import static org.junit.Assert.*;

import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;
import org.junit.Before;
import org.junit.Test;

import es.unileon.springapp.domain.Person;

public class ClientDataTest {

	//private Address address;
	private String street;
	private int blockNumber;
	private int floor;
	private char door;
	private String locality;
	private String province;
	private int zipCode;
	private String dni;
	private Person client;

	@Before
	public void setUp() throws Exception {

		this.locality = "Leon";
		this.province = "Leon";
		this.door = 'A';
		this.floor = 3;
		this.street = "Avn Universidad";
		/*this.address = new Address(street, blockNumber, floor, door, locality,
				province, zipCode);*/
		client = new Person("pepito", "Lopez","soltero",123456789,0,"estudiante","9135289L");
	}

	@Test
	public void testGetAndSetName() {
		assertEquals(client.getPersonName(), "pepito");
		client.setPersonName("juanito");
		assertEquals(client.getPersonName(), "juanito");
	}

//	@Test
//	public void testGetAndSetProvince() {
//		assertEquals(this.province.equals(this.address.getProvince()), true);
//		String other = "other";
//		this.address.setProvince(other);
//		assertEquals(other.equals(this.address.getProvince()), true);
//		other = "ElBierzo";
//		this.address.setProvince(other);
//		assertEquals(other.equals(this.address.getProvince()), true);
//		other = "Zamara";
//		this.address.setProvince(other);
//		assertEquals(other.equals(this.address.getProvince()), true);
//	}
//
//	@Test
//	public void testGetAndSetLocality() {
//		assertEquals(this.locality.equals(this.address.getLocality()), true);
//		String other = "other";
//		this.address.setLocality(other);
//		assertEquals(other.equals(this.address.getLocality()), true);
//		other = "Bembibre";
//		this.address.setLocality(other);
//		assertEquals(other.equals(this.address.getLocality()), true);
//		other = "Ponferrada";
//		this.address.setLocality(other);
//		assertEquals(other.equals(this.address.getLocality()), true);
//
//	}
//
//	@Test
//	public void testGetAndSetStreet() {
//		assertEquals(this.street.equals(this.address.getStreet()), true);
//		String other = "other";
//		this.address.setStreet(other);
//		assertEquals(other.equals(this.address.getStreet()), true);
//		other = "Avn Universidad";
//		this.address.setStreet(other);
//		assertEquals(other.equals(this.address.getStreet()), true);
//		other = "La condesa";
//		this.address.setStreet(other);
//		assertEquals(other.equals(this.address.getStreet()), true);
//	}
//
//	@Test
//	public void testGetAndSeZipCode() {
//		assertEquals(this.zipCode, this.address.getZipCode());
//		int newZip = 10;
//		this.address.setZipCode(newZip);
//		assertEquals(newZip, this.address.getZipCode());
//		newZip = 12;
//		this.address.setZipCode(newZip);
//		assertEquals(newZip, this.address.getZipCode());
//		newZip = 110;
//		this.address.setZipCode(newZip);
//		assertEquals(newZip, this.address.getZipCode());
//		newZip = 1201300;
//		this.address.setZipCode(newZip);
//		assertEquals(newZip, this.address.getZipCode());
//	}
//
//	@Test
//	public void testGetAndSetFloor() {
//		assertEquals(this.floor, this.address.getFloor());
//		int newFloor = 3;
//		this.address.setFloor(newFloor);
//		assertEquals(newFloor, this.address.getFloor());
//		newFloor = 103;
//		this.address.setFloor(newFloor);
//		assertEquals(newFloor, this.address.getFloor());
//		newFloor = 3222;
//		this.address.setFloor(newFloor);
//		assertEquals(newFloor, this.address.getFloor());
//		newFloor = 3101;
//		this.address.setFloor(newFloor);
//		assertEquals(newFloor, this.address.getFloor());
//	}
//
//	@Test
//	public void testGetAndSetDoor() {
//		assertEquals(this.door, this.address.getDoor());
//		char newDoor = 'Z';
//		this.address.setDoor(newDoor);
//		assertEquals(newDoor, this.address.getDoor());
//		newDoor = 'A';
//		this.address.setDoor(newDoor);
//		assertEquals(newDoor, this.address.getDoor());
//		newDoor = 'U';
//		this.address.setDoor(newDoor);
//		assertEquals(newDoor, this.address.getDoor());
//	}
//
//	@Test
//	public void testGetAndSetBlockNumber() {
//		assertEquals(this.blockNumber, this.address.getBlockNumber());
//		int newBlockNumber = 3;
//		this.address.setBlockNumber(newBlockNumber);
//		assertEquals(newBlockNumber, this.address.getBlockNumber());
//		newBlockNumber = 30;
//		this.address.setBlockNumber(newBlockNumber);
//		assertEquals(newBlockNumber, this.address.getBlockNumber());
//		newBlockNumber = 130;
//		this.address.setBlockNumber(newBlockNumber);
//		assertEquals(newBlockNumber, this.address.getBlockNumber());
//		newBlockNumber = 232;
//		this.address.setBlockNumber(newBlockNumber);
//		assertEquals(newBlockNumber, this.address.getBlockNumber());
//	}

}
