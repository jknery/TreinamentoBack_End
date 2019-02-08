import java.util.List;

import javax.persistence.*;

public class AppTeste {

	public static void main(String[] args) {
		
		//CRIAR UMA CONEXÃO COM O BANCO
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TesteJpa");
		
		//GERENCIADOR DE TRANSAÇÕES
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		//INICIA A TRANSIÇÃO
		entityManager.getTransaction().begin();
		
		//ADICIONA OS ELEMENTOS NO BANCO
		Pessoa p1 = new Pessoa("José Ivo", "057.528.559-18");
		Pessoa p2 = new Pessoa("Déborah", "123.456.789-90");
		Pessoa p3 = new Pessoa("Sylmara", "987.765.543.98");
		
		//PERSISTE 
		entityManager.persist(p1);
		entityManager.persist(p2);
		entityManager.persist(p3);
		
		//CONFIRMA A PERSISTÊNCIA
		entityManager.getTransaction().commit();
		
		//FECHA A TRANSIÇÃO
		entityManager.close();
		
		//GERENCIADOR DE TRANSAÇÕES
				EntityManager entityManager2 = entityManagerFactory.createEntityManager();
		
		String sql = "select p from Pessoa p";
		Query query = entityManager2.createQuery(sql);
		
		List<Pessoa> pessoas = query.getResultList();
		
		System.out.println(pessoas.toString());
		
		//FECHA A TRANSIÇÃO
		entityManager.close();
			
	}

}
