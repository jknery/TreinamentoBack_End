package appTest.main.dao;

import java.util.List;
import java.util.Scanner;

import appTest.main.domains.Pessoa;
import appTest.main.sqlQuery.SqlQuery;
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
import appTest.main.startConnection.StartConnection;

public class ManagerCadastro {
	
	private Scanner string;
	private StartConnection starter;
	private String sql;
	
	public ManagerCadastro(String unidadePersistencia, String sql) {
		super();
		
		starter = new StartConnection();
		starter.setConnection(unidadePersistencia);
		this.sql = sql;
		
	}
	
		
	public void cadastro() {
		
		starter.setTransition();
		starter.beginTransition();
		
			string = new Scanner(System.in);
			String nome, cpf;
		
			System.out.flush();
			System.out.println("########## SIMPLE CRUD JPA_REPOSITORY ##########");
			System.out.println("##            CADASTRO DE PESSOAS             ##");
			System.out.println("##                                            ##");
			System.out.println("################################################");
			System.out.println("## DIGITE O NOME DA PESSOA:");
			nome = string.nextLine();
			System.out.println("## DIGITE O CPF DA PESSOA:");
			cpf = string.nextLine();
			
			Pessoa p1 = new Pessoa(nome, cpf);
			
		starter.persistEntity(p1);
		starter.commitPersist();
					
		
	}
	
	public List<Pessoa> getListaPessoas(){
		
		starter.closeTransition();
		starter.setTransition();
		
		SqlQuery sqlQuery = new SqlQuery(this.sql, starter.getConnection(), starter.getTransition());
		sqlQuery.beginQuery();
		
		return sqlQuery.getResult();
	
	}
	
	public void closeConnection() {
		starter.closeConnection();
	}	
}