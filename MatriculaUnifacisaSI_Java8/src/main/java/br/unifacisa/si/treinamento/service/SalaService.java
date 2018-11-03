package br.unifacisa.si.treinamento.service;

import br.unifacisa.si.treinamento.domains.Sala;
import br.unifacisa.si.treinamento.repository.SalaRepository;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class SalaService {
	
	@Autowired
	private SalaRepository salarepository;
	
	public Sala criarSala( Sala sala ) {
		
		//Aqui_v�o_as_regras_do_neg�cio
		
		return salarepository.insert(sala);
	}

}
