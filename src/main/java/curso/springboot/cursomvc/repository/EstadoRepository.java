package curso.springboot.cursomvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import curso.springboot.cursomvc.model.Estado;

public interface EstadoRepository extends JpaRepository<Estado, Integer>{

}
