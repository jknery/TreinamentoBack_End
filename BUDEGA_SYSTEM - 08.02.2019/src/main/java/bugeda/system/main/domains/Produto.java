package bugeda.system.main.domains;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "PRODUTOS")
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE )
	private Long key;
	private String nome;
	private Double qntdEstoque;
	private Float tamanhoUnidade;
	private Boolean comercializavel;
	private Float valorUnitarioVenda;
		
	public Produto(String nome, Boolean comercializavel, Float valorUnitarioVenda) {
		super();
		this.nome = nome;
		this.comercializavel = comercializavel;
		this.valorUnitarioVenda = valorUnitarioVenda;
	}
	public Produto() {
		super();
	}
	public Long getKey() {
		return key;
	}
	public String getNome() {
		return nome;
	}
	
	public Double getQntdEstoque() {
		return qntdEstoque;
	}
	
	public Float getTamanhoUnidade() {
		return tamanhoUnidade;
	}
	public Boolean getComercializavel() {
		return comercializavel;
	}
	public Float getValorUnitarioVenda() {
		return valorUnitarioVenda;
	}
	public void setKey(Long key) {
		this.key = key;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setQntdEstoque(Double qntdEstoque) {
		this.qntdEstoque = qntdEstoque;
	}
	
	public void setTamanhoUnidade(Float tamanhoUnidade) {
		this.tamanhoUnidade = tamanhoUnidade;
	}
	public void setComercializavel(Boolean comercializavel) {
		this.comercializavel = comercializavel;
	}
	public void setValorUnitarioVenda(Float valorUnitarioVenda) {
		this.valorUnitarioVenda = valorUnitarioVenda;
	}
	
	
	
	
	
	
}
