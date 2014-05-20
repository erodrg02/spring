package es.unileon.springapp.service;

import java.io.Serializable;
import java.util.List;
import es.unileon.springapp.domain.Person;


public interface ClientManager extends Serializable {
	public List<Person> getClients();
	public void addClient(Person client);
}
