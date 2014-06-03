package es.unileon.springapp.repository;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import es.unileon.springapp.domain.Person;

public class JPAClientDaoTests {
	 private ApplicationContext context;
	    private ClientDao clientDao;

	    @Before
	    public void setUp() throws Exception {
	        context = new ClassPathXmlApplicationContext("classpath:test-context.xml");
	       	clientDao = (ClientDao) context.getBean("clientDao");
	    }

	    @Test
	    public void testGetClientList() {
	        List<Person> clients = clientDao.getClientList();
	        assertEquals(clients.size(), 3);  
	    }

	    @Test
	    public void testSaveClient() {
	        List<Person> persons = clientDao.getClientList();

	        Person client = persons.get(0);
	        String name = client.getPersonName();
	        client.setPersonName("Julian");
	        clientDao.saveClient(client);

	        List<Person> updatedPersons = clientDao.getClientList();
	        Person client2 = updatedPersons.get(0);
	        assertEquals(client2.getPersonName(), "Julian");

	        client2.setPersonName("Juanito");
	        clientDao.saveClient(client2);
	        Person client5 = new Person();
			//TODO
	        client5.setPersonName("Eva");
	        clientDao.saveClient(client5);
	        System.out.println(clientDao.getClientList().size());
	    }
	}

