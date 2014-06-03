package es.unileon.springapp.web;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import es.unileon.springapp.domain.Address;
import es.unileon.springapp.domain.Person;
import es.unileon.springapp.service.SimpleClientManager;

public class SimpleClientManagerTest {

	private Person client1;
	private Person client2;
	private SimpleClientManager clientsManager;
	private String locality;
	private String province;
	private char door;
	private int floor;
	private String street;
	private Address address;

	@Before
	public void setUp() throws Exception {
		clientsManager = new SimpleClientManager();
		client1 = new Person();
		this.locality = "Leon";
		this.province = "Leon";
		this.door = 'A';
		this.floor = 3;
		this.street = "Avn Universidad";
		this.address = new Address(street, 10, floor, door, locality, province,
				1000);
		client1 = new Person("pepito", "Lopez", this.address, "9135289L");
		clientsManager.setClients(new ArrayList<Person>());
		client2 = new Person();
	}

	@Test
	public void testGetClients() {
		clientsManager.addClient(client1);
		assertEquals(client1, clientsManager.getClients().get(0));
		clientsManager.addClient(client2);
		assertEquals(client2, clientsManager.getClients().get(1));
	}

	@Test
	public void testAddClient() {
		clientsManager.addClient(client1);
		clientsManager.addClient(client2);
		assertEquals(2, clientsManager.getClients().size());
	}

}
