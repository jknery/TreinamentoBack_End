package bugeda.system.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import bugeda.system.main.domains.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
