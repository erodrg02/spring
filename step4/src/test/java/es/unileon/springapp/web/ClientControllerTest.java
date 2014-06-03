package es.unileon.springapp.web;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Map;

import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;

import es.unileon.springapp.domain.Person;
import es.unileon.springapp.repository.InMemoryClientDao;
import es.unileon.springapp.service.SimpleClientManager;

public class ClientControllerTest {
	@Test
	public void testHandleRequestView() throws Exception {
		ClientController controller = new ClientController();
		SimpleClientManager spm = new SimpleClientManager();
		spm.setClientDao(new InMemoryClientDao(new ArrayList<Person>()));
		controller.setClientManager(spm);
		ModelAndView modelAndView = controller.handleRequest(null, null);
		assertEquals("mainpage", modelAndView.getViewName());
		assertNotNull(modelAndView.getModel());
		@SuppressWarnings("unchecked")
		Map<String, Object> modelMap = (Map<String, Object>) modelAndView
				.getModel().get("model");
		assertNotNull(modelMap);
	}

}
