package br.unifacisa.si.treinamento.service;

import br.unifacisa.si.treinamento.domains.Aluno;
import br.unifacisa.si.treinamento.repository.AlunoRepository;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class AlunoService {

	@Autowired
	private AlunoRepository alunorepository;

	public Aluno criarAluno(Aluno aluno) {

		return alunorepository.insert(aluno);

	}

	public void deletarAluno(Aluno aluno) {

		alunorepository.deleteById(aluno.getId());;

	}
}