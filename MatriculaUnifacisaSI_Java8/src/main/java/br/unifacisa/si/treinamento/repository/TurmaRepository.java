package br.unifacisa.si.treinamento.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.unifacisa.si.treinamento.domains.Turma;

@Repository
public interface TurmaRepository extends MongoRepository<Turma,String> {}