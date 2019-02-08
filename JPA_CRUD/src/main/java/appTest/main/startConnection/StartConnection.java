package appTest.main.startConnection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import appTest.main.domains.Pessoa;

public class StartConnection {
		
	@SuppressWarnings("unused")
	private EntityManagerFactory managerFactory;
	private EntityManager entityManager;
	
	public void setConnection(String undPersist) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory(undPersist);
		this.managerFactory =  entityManagerFactory;
	}
	
	public EntityManagerFactory getConnection() {
		return managerFactory;
	}
	
	public void setTransition() {
		EntityManager entityManager = managerFactory.createEntityManager();
		this.entityManager = entityManager;
	}
	
	public EntityManager getTransition() {
		return entityManager;
	}
	
	public void beginTransition() {
		entityManager.getTransaction().begin();
	}
	
	public void persistEntity(Pessoa pessoa) {
		entityManager.persist(pessoa);		
	}
	
	public void commitPersist() {
		entityManager.getTransaction().commit();	
	}
	
	public void closeTransition() {
		entityManager.close();
	}
	
	public void closeConnection() {
		managerFactory.close();
	}
	
	
	
}