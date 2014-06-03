package es.unileon.springapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import es.unileon.springapp.domain.Person;
import es.unileon.springapp.repository.ClientDao;

@Component
public class SimpleClientManager implements ClientManager {

	private static final long serialVersionUID = 1L;

	@Autowired
	private ClientDao clientDao;

	public void setClientDao(ClientDao clientDao) {
		this.clientDao = clientDao;
	}

	@Override
	public List<Person> getClients() {
		return clientDao.getClientList();
	}

	@Override
	public void addClient(Person client) {
		List<Person> clients = clientDao.getClientList();
		clientDao.saveClient(client);
		System.out.println("Se ha añadido el cliente: "
				+ client.getPersonName());
	}

}
