package bugeda.system.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;

import bugeda.system.main.domains.Produto;
import bugeda.system.main.dto.ProdutoQueryDto;
import bugeda.system.main.repository.ProdutoRepository;

@Service
public class ProdutoService {
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	public void createProduto(Produto produto) {
		produtoRepository.save(produto);
	}
	
	public Produto readProduto(Long idRefProduto){
		return produtoRepository.findById(idRefProduto).get();
	}
	
	public List<Produto> findByParam(ProdutoQueryDto query){
		Produto produto = new Produto(query.getNome() , query.getComercializavel(), query.getValorUnitarioVenda());
		
		ExampleMatcher matcher = ExampleMatcher.matchingAll()
												.withMatcher("nome", match -> match.contains())
												.withMatcher("categoria", match -> match.contains())
												.withMatcher("precoUnt", match -> match.contains())
												.withIgnoreNullValues();
		
		Example<Produto> searchExample = Example.of(produto, matcher);
		return produtoRepository.findAll(searchExample);
	}
	
	public List<Produto> readAllProdutos(){
		return produtoRepository.findAll();
	}
	
	public void updateProduto(Produto produto) {
		produtoRepository.save(produto);		
	}
	
	public void deleteProduto(Produto produto) {
		produtoRepository.delete(produto);
	}
	

}
