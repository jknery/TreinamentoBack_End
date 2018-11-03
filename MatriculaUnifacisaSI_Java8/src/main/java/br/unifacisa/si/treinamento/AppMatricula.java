package br.unifacisa.si.treinamento;

import br.unifacisa.si.treinamento.domains.Aluno;
import br.unifacisa.si.treinamento.service.AlunoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppMatricula implements CommandLineRunner {

	@Autowired
	AlunoService alunoservice;
	
	public static void main(String[] args) {
		
		//System.out.println("TESTE PROJETO");		
		SpringApplication.run(AppMatricula.class,  args);
	}

	public void run(String... args) throws Exception {
		
		
		//Aluno aluno = new Aluno();
		
		//aluno.setNome("JOSE IVO");
		
		//aluno.setMatricula(1823080007L);
		
		//alunoservice.criarAluno(aluno);
		
		//alunoservice.listaAlunos();
		
		//alunoservice.deletarAluno(aluno)
				
		//System.out.println("ID: " + aluno.getId() + " NOME: " + aluno.getNome() + " MATRICULA: " + aluno.getMatricula());
		
		
		
	}

}
