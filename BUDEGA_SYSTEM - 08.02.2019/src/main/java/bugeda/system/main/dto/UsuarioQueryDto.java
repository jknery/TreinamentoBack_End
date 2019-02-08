package bugeda.system.main.dto;



import bugeda.system.main.domains.usuario.TipoUsuario;

public class UsuarioQueryDto {
	
	private Long idRefUsuario;
	private String nomeUsuario;
	private String loginUsuario;
	private TipoUsuario tipoUsuario;
	private String senhaUsuario;
	
	
	
	public UsuarioQueryDto(Long idRefUsuario, String nomeUsuario, TipoUsuario tipoUsuario) {
		super();
		this.idRefUsuario = idRefUsuario;
		this.nomeUsuario = nomeUsuario;
		this.tipoUsuario = tipoUsuario;
	}
	public UsuarioQueryDto(Long idRefUsuario, String nomeUsuario, String loginUsuario, TipoUsuario tipoUsuario,
			String senhaUsuario) {
		super();
		this.idRefUsuario = idRefUsuario;
		this.nomeUsuario = nomeUsuario;
		this.loginUsuario = loginUsuario;
		this.tipoUsuario = tipoUsuario;
		this.senhaUsuario = senhaUsuario;
	}
	
	public Long getIdRefUsuario() {
		return idRefUsuario;
	}
	public String getNomeUsuario() {
		return nomeUsuario;
	}
	public String getLoginUsuario() {
		return loginUsuario;
	}
	public TipoUsuario getTipoUsuario() {
		return tipoUsuario;
	}
	public String getSenhaUsuario() {
		return senhaUsuario;
	}
	public void setIdRefUsuario(Long idRefUsuario) {
		this.idRefUsuario = idRefUsuario;
	}
	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}
	public void setLoginUsuario(String loginUsuario) {
		this.loginUsuario = loginUsuario;
	}
	public void setTipoUsuario(TipoUsuario tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}
	public void setSenhaUsuario(String senhaUsuario) {
		this.senhaUsuario = senhaUsuario;
	}
	
	

}
