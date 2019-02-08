import java.util.List;

import javax.persistence.*;

public class AppTeste {

	public static void main(String[] args) {
		
		//CRIAR UMA CONEX�O COM O BANCO
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TesteJpa");
		
		//GERENCIADOR DE TRANSA��ES
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		//INICIA A TRANSI��O
		entityManager.getTransaction().begin();
		
		//ADICIONA OS ELEMENTOS NO BANCO
		Pessoa p1 = new Pessoa("Jos� Ivo", "057.528.559-18");
		Pessoa p2 = new Pessoa("D�borah", "123.456.789-90");
		Pessoa p3 = new Pessoa("Sylmara", "987.765.543.98");
		
		//PERSISTE 
		entityManager.persist(p1);
		entityManager.persist(p2);
		entityManager.persist(p3);
		
		//CONFIRMA A PERSIST�NCIA
		entityManager.getTransaction().commit();
		
		//FECHA A TRANSI��O
		entityManager.close();
		
		//GERENCIADOR DE TRANSA��ES
				EntityManager entityManager2 = entityManagerFactory.createEntityManager();
		
		String sql = "select p from Pessoa p";
		Query query = entityManager2.createQuery(sql);
		
		List<Pessoa> pessoas = query.getResultList();
		
		System.out.println(pessoas.toString());
		
		//FECHA A TRANSI��O
		entityManager.close();
			
	}

}
