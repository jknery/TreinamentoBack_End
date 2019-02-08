package appTest.main.sqlQuery;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import appTest.main.domains.Pessoa;

public class SqlQuery {
	
	private Query query;
	private EntityManagerFactory managerFactory;
	private EntityManager entityManager;
	private String sql;
	
	public SqlQuery(String sql, EntityManagerFactory managerFactory, EntityManager entityManager) {
		super();
		this.sql = sql;
		this.managerFactory = managerFactory;
		this.entityManager = entityManager;
	}
	
	public void beginQuery( ) {
		this.entityManager = managerFactory.createEntityManager();
		this.query = this.entityManager.createQuery(this.sql);
	}
	
	@SuppressWarnings("unchecked")
	public List<Pessoa> getResult(){
		
		List<Pessoa> pessoas = this.query.getResultList();
		
		return pessoas;
		
	}
	
	

}
