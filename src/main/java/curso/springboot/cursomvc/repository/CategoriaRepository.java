package curso.springboot.cursomvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import curso.springboot.cursomvc.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer>{

}
