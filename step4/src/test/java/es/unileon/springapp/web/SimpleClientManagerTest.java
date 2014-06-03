package es.unileon.springapp.web;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

//import es.unileon.springapp.domain.Address;
import es.unileon.springapp.domain.Person;
import es.unileon.springapp.repository.ClientDao;
import es.unileon.springapp.repository.InMemoryClientDao;
import es.unileon.springapp.service.SimpleClientManager;

public class SimpleClientManagerTest {

	private List<Person> clients;
	private Person client1;
	private Person client2;
	private SimpleClientManager clientsManager;

	@Before
	public void setUp() throws Exception {
		clientsManager = new SimpleClientManager();
		clients = new ArrayList<Person>();

		client1 = new Person("pepito", "Lopez", "mi calle","soltero", 123456789, 0,
				"estudiante", "9135289L");

		ClientDao clientDao = new InMemoryClientDao(clients);
		clientsManager.setClientDao(clientDao);

		client2 = new Person("juno", "Lopez", "su calle","soltero", 123686789, 0,
				"estudiante", "1346758L");
	}

	@Test
	public void testGetClientsWithNoClients() {
		clientsManager = new SimpleClientManager();
		clientsManager.setClientDao(new InMemoryClientDao(null));
		assertNull(clientsManager.getClients());
	}

	@Test
	public void testGetClients() {
		clientsManager.addClient(client1);
		if(clientsManager.getClients().size()!=0){
			assertEquals(client1, clientsManager.getClients().get(0));
			clientsManager.addClient(client2);
			assertEquals(client2, clientsManager.getClients().get(1));
		}
	}

	@Test
	public void testAddClient() {
		clientsManager.addClient(client1);
		clientsManager.addClient(client2);
		System.out.println(clientsManager.getClients().size());
		assertEquals(clientsManager.getClients().size(),2);
	}

}
