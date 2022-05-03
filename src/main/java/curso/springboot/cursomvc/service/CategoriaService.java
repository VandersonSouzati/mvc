package curso.springboot.cursomvc.service;

import java.util.Optional;
import java.util.function.Supplier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import curso.springboot.cursomvc.exception.MyExceptionObjectNotFound;
import curso.springboot.cursomvc.model.Categoria;
import curso.springboot.cursomvc.repository.CategoriaRepository;

@Service
public class CategoriaService {
	
    @Autowired   
	private CategoriaRepository repository;
	
    /*
    Supplier<MyExceptionObjectNotFound> supplier = new Supplier<>() {

		@Override
		public MyExceptionObjectNotFound get() {
			
			return new MyExceptionObjectNotFound("Teste");
		}
	     
    };
    */
    
	public Categoria buscaCategoria(Integer id){
		Optional<Categoria> obj = repository.findById(id);
	
		return obj.orElseThrow(() -> new MyExceptionObjectNotFound("Categoria not found Id: " + id));
	}
}
