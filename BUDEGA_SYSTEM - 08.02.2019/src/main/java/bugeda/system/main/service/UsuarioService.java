package bugeda.system.main.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;

import bugeda.system.main.domains.Usuario;
import bugeda.system.main.dto.UsuarioQueryDto;
import bugeda.system.main.repository.UsuarioRepository;
@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public void createUsuario(Usuario usuario) {
		usuarioRepository.save(usuario);
	}
	
	
	public List<Usuario> findByParam(UsuarioQueryDto query){
		
		Usuario usuario = new Usuario( query.getIdRefUsuario(), query.getNomeUsuario(), query.getTipoUsuario());
		
		ExampleMatcher matcher = ExampleMatcher.matchingAll()
												.withMatcher("referencia", match -> match.contains())
												.withMatcher("nome", match -> match.contains())
												.withMatcher("tipo", match -> match.contains())
												.withIgnoreNullValues();
		
		Example<Usuario> searchExample = Example.of(usuario, matcher);
		return usuarioRepository.findAll(searchExample);
	}
	
	
	public Usuario readUsuario(Long idRefUsuario){
		return usuarioRepository.findById(idRefUsuario).get();
	}
	
	public List<Usuario> readAllUsuarios(){
		return usuarioRepository.findAll();
	}
	
	public void updateUsuario(Usuario usuario) {
		usuarioRepository.save(usuario);		
	}
	
	public void deleteUsuario(Usuario usuario) {
		usuarioRepository.delete(usuario);
	}

}
