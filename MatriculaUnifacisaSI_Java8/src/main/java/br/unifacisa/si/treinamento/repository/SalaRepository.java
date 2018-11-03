package br.unifacisa.si.treinamento.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.unifacisa.si.treinamento.domains.Sala;

@Repository
public interface SalaRepository extends MongoRepository<Sala, String> {}
