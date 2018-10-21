package br.unifacisa.si.treinamento.domains;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Sala {
	
	@Id
	private String id;
	private Short capacidade;
	private Integer numero;
	private boolean disponibilidade;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Short getCapacidade() {
		return capacidade;
	}
	public void setCapacidade(Short capacidade) {
		this.capacidade = capacidade;
	}
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public boolean isDisponibilidade() {
		return disponibilidade;
	}
	public void setDisponibilidade(boolean disponibilidade) {
		this.disponibilidade = disponibilidade;
	}
	
	
	
	

}
