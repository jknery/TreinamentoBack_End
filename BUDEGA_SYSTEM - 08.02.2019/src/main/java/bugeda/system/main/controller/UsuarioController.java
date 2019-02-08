package bugeda.system.main.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bugeda.system.main.domains.Usuario;
import bugeda.system.main.dto.UsuarioQueryDto;
import bugeda.system.main.service.UsuarioService;

@RestController
@RequestMapping(value = "/budega")
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioService;
	
	@GetMapping(path = "/{idRefUsuario}")
	public ResponseEntity<Usuario> readUsuario(@PathVariable(name = "idRefUsuario") Long idRefUsuario) {
		return new ResponseEntity<Usuario>(usuarioService.readUsuario(idRefUsuario), HttpStatus.OK);
	}
	
	@GetMapping("/usuariosCom")
	public ResponseEntity<List<Usuario>> findUsuario(UsuarioQueryDto query){
		
		List<Usuario> usuarios = usuarioService.findByParam(query);
		return new ResponseEntity<List<Usuario>>(usuarios,HttpStatus.OK);
	}
	
	@PostMapping("/novoUsuario")
	public ResponseEntity<Usuario> createUsuario(@RequestBody Usuario usuario) {
		usuarioService.createUsuario(usuario);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}

	@PutMapping("/atualizaUsuario")
	public ResponseEntity<Usuario> updateUsuario(@RequestBody Usuario usuario) {
		usuarioService.updateUsuario(usuario);
		return new ResponseEntity<Usuario>(HttpStatus.OK);
	}

	@GetMapping("/listaAllUsuarios")
	public ResponseEntity<List<Usuario>> readAllUsuarios() {
		return new ResponseEntity<List<Usuario>>(usuarioService.readAllUsuarios(), HttpStatus.OK);
	}
		
	@DeleteMapping("/excluiUsuario")
	public ResponseEntity<Usuario> deleteUsuario(@RequestBody Usuario usuario){
		usuarioService.deleteUsuario(usuario);
		return new ResponseEntity<Usuario>(HttpStatus.OK);
	}
	

}
