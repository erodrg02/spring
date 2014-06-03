package es.unileon.springapp.repository;

import java.util.List;

import es.unileon.springapp.domain.Person;

public class InMemoryClientDao implements ClientDao {

	    private List<Person> clientList;

	    public InMemoryClientDao(List<Person> clientList) {
	        this.clientList = clientList;
	    }

		public List<Person> getClientList() {
			return clientList;
		}

		public void saveClient(Person client) {
		}
}
