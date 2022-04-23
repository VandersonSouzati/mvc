package curso.springboot.cursomvc.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import curso.springboot.cursomvc.model.Categoria;
import curso.springboot.cursomvc.repository.CategoriaRepository;

@Service
public class CategoriaService {
	
    @Autowired   
	private CategoriaRepository repository;
	
	public Categoria buscaCategoria(Integer id){
		Optional<Categoria> obj = repository.findById(id);
		return obj.get();
	}
}
