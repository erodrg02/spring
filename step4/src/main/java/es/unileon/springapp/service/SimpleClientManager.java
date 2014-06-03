package es.unileon.springapp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import es.unileon.springapp.domain.Person;
import es.unileon.springapp.repository.ClientDao;

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
		List<Person> clients =clientDao.getClientList();
		//clients.add(client);
		
		clients.saveClient(client);
	}

	/*public void setClients(List<Person> clients) {
		this.clients = clients;
	}*/

}
