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

import bugeda.system.main.domains.Produto;
import bugeda.system.main.dto.ProdutoQueryDto;
import bugeda.system.main.service.ProdutoService;

@RestController
@RequestMapping(value = "/budega")
public class ProdutoController {
	
	@Autowired
	private ProdutoService produtoService;
	
	@GetMapping(path = "/{idRefProduto}")
	public ResponseEntity<Produto> readProduto(@PathVariable(name = "idRefProduto") Long idRefProduto) {
		return new ResponseEntity<Produto>(produtoService.readProduto(idRefProduto), HttpStatus.OK);
	}
	
	@GetMapping("/produtosCom")
	public ResponseEntity<List<Produto>> findCliente(ProdutoQueryDto query){
		
		List<Produto> produtos = produtoService.findByParam(query);
		return new ResponseEntity<List<Produto>>(produtos,HttpStatus.OK);
	}
	
	@PostMapping("/novoProduto")
	public ResponseEntity<Produto> createProduto(@RequestBody Produto produto) {
		produtoService.createProduto(produto);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}

	@PutMapping("/atualizaProduto")
	public ResponseEntity<Produto> updateProduto(@RequestBody Produto produto) {
		produtoService.updateProduto(produto);
		return new ResponseEntity<Produto>(HttpStatus.OK);
	}

	@GetMapping("/listaAllProdutos")
	public ResponseEntity<List<Produto>> readAllProdutos() {
		return new ResponseEntity<List<Produto>>(produtoService.readAllProdutos(), HttpStatus.OK);
	}
		
	@DeleteMapping("/excluiProduto")
	public ResponseEntity<Produto> deleteProduto(@RequestBody Produto produto){
		produtoService.deleteProduto(produto);
		return new ResponseEntity<Produto>(HttpStatus.OK);
	}

}
