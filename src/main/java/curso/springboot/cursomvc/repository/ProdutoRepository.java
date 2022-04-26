package curso.springboot.cursomvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import curso.springboot.cursomvc.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer>{

}
