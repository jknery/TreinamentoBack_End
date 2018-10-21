package br.unifacisa.si.treinamento.controller;

import java.util.Scanner;
//import br.unifacisa.si.treinamento.domains.Aluno;

public class AlunoController {
	
	private Scanner dados;
	private String nomeAluno;
	private Long matriculaAluno;
	
	public String getNomeAluno() {
		return nomeAluno;
	}
	
	public void setNomeAluno() {
		
		System.out.println("Digite o nome do Aluno: ");
		dados = new Scanner(System.in);
		this.nomeAluno = dados.nextLine();
		//dados.close();
	}
	
	public Long getMatriculaAluno() {
		return matriculaAluno;
	}
	
	public void setMatriculaAluno() {
		System.out.println("Digite a Matricula do Aluno: ");
		dados = new Scanner(System.in);
		this.matriculaAluno = dados.nextLong();
	}

	
	
}
