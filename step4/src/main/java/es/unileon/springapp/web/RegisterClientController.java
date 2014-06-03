package es.unileon.springapp.web;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import es.unileon.springapp.domain.Person;
import es.unileon.springapp.service.ClientData;
import es.unileon.springapp.service.ClientManager;

@Controller
@RequestMapping(value = "registerclient.htm")
public class RegisterClientController {

	@Autowired
	private ClientManager clientManager;

	@RequestMapping(method = RequestMethod.POST)
	public String onSubmit(@Valid ClientData clientData, BindingResult result) {
		if (result.hasErrors()) {
			return "registerclient";
		}

		/*Address address = new Address(clientData.getStreet(),
				clientData.getBlockNumber(), clientData.getFloor(),
				clientData.getDoor(), clientData.getLocality(),
				clientData.getProvince(), clientData.getZipCode());*/
		Person client = new Person(clientData.getName(),
			clientData.getSurnames(), /*address,*/ "soltero", 123456789,0,"estudiante",clientData.getDni());

		clientManager.addClient(client);

		return "redirect:/mainpage.htm";
	}

	@RequestMapping(method = RequestMethod.GET)
	protected ClientData formBackingObject(HttpServletRequest request)
			throws ServletException {
		ClientData clientData = new ClientData();
		return clientData;
	}

	public ClientManager getClientManager() {
		return clientManager;
	}

	public void setClientManager(ClientManager clientManager) {
		this.clientManager = clientManager;
	}

}
