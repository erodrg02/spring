package es.unileon.springapp.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import es.unileon.springapp.domain.Person;

@Repository(value = "clientDao")
public class JPAClientDao implements ClientDao {

	private EntityManager em = null;

	/*
	 * Sets the entity manager.
	 */
	@PersistenceContext
	public void setEntityManager(EntityManager em) {
		this.em = em;
	}

	/**
	 * Ejecuta una consulta usando el EntityManager. Para ello incluimos en él
	 * una sentencia SQL que obtiene los objetos persistentes de la clase
	 * Person.
	 * 
	 * @return
	 */

	@Transactional(readOnly = true)
	@SuppressWarnings("unchecked")
	public List<Person> getClientList() {
		return em.createQuery("select p from Person p order by p.id")
				.getResultList();
	}

	/**
	 * Esta vez hacemos un merge para almacenar el producto en la base de datos.
	 * 
	 * @param client
	 */

	@Transactional(readOnly = false)
	public void saveClient(Person client) {
		em.merge(client);
	}
}
