package appTest.main;

import appTest.main.dao.ManagerCadastro;

public class AppMain {

	static String SQL = "select p from Pessoa p";
	static String UNIDADE_PERSISTENCIA_1 = "JpaCRUD_CREATE";
	
	public static void main(String[] args) {
		
			ManagerCadastro managerCadastro = new ManagerCadastro(UNIDADE_PERSISTENCIA_1, SQL);
			
			managerCadastro.cadastro();
				
			System.out.println(managerCadastro.getListaPessoas().toString());
			
			managerCadastro.closeConnection();
			
	}
}