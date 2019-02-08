package bugeda.system.main.domains.usuario;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Tipo_Usuario")
public class TipoUsuario {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long key;
	private String tipo;
	private Boolean gerencia;
	private Boolean caixa;
	private Boolean pdv;
	private Boolean controleCliente;
	public Long getIdRefUsuario() {
		return key;
	}
	public String getTipo() {
		return tipo;
	}
	public Boolean getGerencia() {
		return gerencia;
	}
	public Boolean getCaixa() {
		return caixa;
	}
	public Boolean getPdv() {
		return pdv;
	}
	public Boolean getControleCliente() {
		return controleCliente;
	}
	public void setIdRefUsuario(Long key) {
		this.key = key;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public void setGerencia(Boolean gerencia) {
		this.gerencia = gerencia;
	}
	public void setCaixa(Boolean caixa) {
		this.caixa = caixa;
	}
	public void setPdv(Boolean pdv) {
		this.pdv = pdv;
	}
	public void setControleCliente(Boolean controleCliente) {
		this.controleCliente = controleCliente;
	}	
}
