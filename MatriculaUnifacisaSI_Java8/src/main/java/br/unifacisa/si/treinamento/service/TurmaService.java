package br.unifacisa.si.treinamento.service;

import br.unifacisa.si.treinamento.domains.Turma;
import br.unifacisa.si.treinamento.repository.TurmaRepository;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class TurmaService {
	
	@Autowired
	private TurmaRepository turmarepository;
	
	public Turma criarTurma( Turma turma ) {
		
		//Aqui_v�o_as_regras_do_neg�cio
		
		return turmarepository.insert(turma);
	}

}
