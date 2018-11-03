package br.unifacisa.si.treinamento.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.unifacisa.si.treinamento.domains.Aluno;
import br.unifacisa.si.treinamento.service.AlunoService;

@RestController
public class AlunoController {
	
	@Autowired
	AlunoService alunoservice;
	
	@GetMapping("/getListAlunos")
	public ResponseEntity<List<Aluno>> listaAlunos(){			
				
		return new ResponseEntity<List<Aluno>>(alunoservice.listaAlunos(),HttpStatus.OK);
		
	}
	
	@GetMapping("/getAluno")
	public ResponseEntity<Optional<Aluno>> getAlunos(@PathVariable String id){			
				
		return new ResponseEntity<Optional<Aluno>>(alunoservice.getAluno(id),HttpStatus.OK);
		
	}
	
	@PostMapping("/createAluno")
	public ResponseEntity<Aluno> criarAlunos(@RequestBody Aluno aluno){			
				
		aluno = alunoservice.criarAluno(aluno);
		
		return new ResponseEntity<Aluno>(aluno,HttpStatus.OK);
		
	}
	
	@PutMapping("/updateAluno")
	public ResponseEntity<Aluno> putAlunos(@RequestBody Aluno aluno){			
				
		alunoservice.updateAluno(aluno);
		
		return new ResponseEntity<Aluno>(aluno,HttpStatus.OK);
		
	}
	
	
	

}
