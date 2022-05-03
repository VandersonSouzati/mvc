package curso.springboot.cursomvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import curso.springboot.cursomvc.model.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Integer>{

}
