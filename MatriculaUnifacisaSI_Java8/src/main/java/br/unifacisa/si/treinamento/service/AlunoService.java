package br.unifacisa.si.treinamento.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.unifacisa.si.treinamento.domains.Aluno;
import br.unifacisa.si.treinamento.repository.AlunoRepository;

@Service
public class AlunoService {

	@Autowired
	private AlunoRepository alunorepository;

	public Aluno criarAluno(Aluno aluno) {

		return alunorepository.insert(aluno);

	}
	
	public List<Aluno> listaAlunos() {
		
		return alunorepository.findAll();
		
	}
	
	public void updateAluno(Aluno aluno) {
		
		alunorepository.save(aluno);
		
	}
	
	
	public Optional<Aluno> getAluno(String id) {
		
		return alunorepository.findById(id);
		
	}
	
	public void deletarAluno(Aluno aluno) {

		alunorepository.deleteById(aluno.getId());;

	}
}