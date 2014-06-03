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
	    private ClientDao PersonDao;

	    @Before
	    public void setUp() throws Exception {
	        context = new ClassPathXmlApplicationContext("classpath:test-context.xml");
	        PersonDao = (ClientDao) context.getBean("ClientDao");
	    }

	    @Test
	    public void testGetClientList() {
	        List<Person> clients = PersonDao.getClientList();
	        assertEquals(clients.size(), 3);  
	    }

	    @Test
	    public void testSaveClient() {
	        List<Person> Persons = PersonDao.getClientList();

	        Person client = Persons.get(0);
	        String name = client.getName();
	        client.setName("Julian");
	        PersonDao.saveClient(client);

	        List<Person> updatedPersons = PersonDao.getClientList();
	        Person client2 = updatedPersons.get(0);
	        assertEquals(client2.getName(), "Julian");

	        client2.setName("Juanito");
	        PersonDao.saveClient(client2);
	    }
	}

