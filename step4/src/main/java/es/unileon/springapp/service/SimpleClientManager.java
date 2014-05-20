package es.unileon.springapp.service;

import java.util.List;

import es.unileon.springapp.domain.Person;

public class SimpleClientManager implements ClientManager {

	private static final long serialVersionUID = 1L;

	private List<Person> clients;

	public List<Person> getClients() {
		return clients;
	}

	public void addClient(Person client) {
		clients.add(client);
	}

	public void setClients(List<Person> clients) {
		this.clients = clients;
	}

}
