package bugeda.system.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import bugeda.system.main.domains.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
