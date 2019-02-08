package bugeda.system.main.domains;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

import bugeda.system.main.domains.usuario.TipoUsuario;

@Entity
@Table(name = "USUARIOS")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long idRefUsuario;
	private String nomeUsuario;
	private String loginUsuario;
	@ManyToOne
	private TipoUsuario tipoUsuario;
	@NotEmpty
	private String senhaUsuario;
				
	public Usuario() {
		super();
	}

	public Usuario(Long idRefUsuario, String nomeUsuario, TipoUsuario tipoUsuario) {
		super();
		this.idRefUsuario = idRefUsuario;
		this.nomeUsuario = nomeUsuario;
		this.tipoUsuario = tipoUsuario;
	}

	public TipoUsuario getNivelUsuario() {
		return tipoUsuario;
	}

	public void setNivelUsuario(TipoUsuario nivelUsuario) {
		this.tipoUsuario = nivelUsuario;
	}

	public String getLoginUsuario() {
		return loginUsuario;
	}

	public void setLoginUsuario(String loginUsuario) {
		this.loginUsuario = loginUsuario;
	}

	public Usuario(Long idRefUsuario, String nomeUsuario) {
		super();
		this.idRefUsuario = idRefUsuario;
		this.nomeUsuario = nomeUsuario;
	}
	
	public Usuario(Long idRefUsuario, String nomeUsuario, String senhaUsuario) {
		super();
		this.idRefUsuario = idRefUsuario;
		this.nomeUsuario = nomeUsuario;
		this.senhaUsuario = senhaUsuario;
	}
	
	public Long getIdRefUsuario() {
		return idRefUsuario;
	}
	public String getNomeUsuario() {
		return nomeUsuario;
	}
	
	public String getSenhaUsuario() {
		return senhaUsuario;
	}
	
	//setters
	public void setIdRefUsuario(Long idRefUsuario) {
		this.idRefUsuario = idRefUsuario;
	}
	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}
	
	
	public void setSenhaUsuario(String senhaUsuario) {
	
		this.senhaUsuario = senhaUsuario;
	}
}