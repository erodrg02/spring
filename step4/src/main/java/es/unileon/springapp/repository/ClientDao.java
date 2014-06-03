package es.unileon.springapp.repository;

import java.util.List;

import es.unileon.springapp.domain.*;

public interface ClientDao {

	public List<Person> getClientList();
	public void saveClient(Person client);
}
