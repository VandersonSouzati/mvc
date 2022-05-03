package curso.springboot.cursomvc.exception;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
@RestController
public class ResourceExceptionHandler {
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<StandardError> genericError(Exception e, WebRequest request){
		StandardError standardError = new StandardError(HttpStatus.INTERNAL_SERVER_ERROR.value(), e.getMessage(), 
				 System.currentTimeMillis());
		
		return new ResponseEntity<>(standardError, HttpStatus.INTERNAL_SERVER_ERROR);
		
	}
	
	@ExceptionHandler(MyExceptionObjectNotFound.class)
	public ResponseEntity<StandardError> objectNotFound(MyExceptionObjectNotFound e, WebRequest req){
	     StandardError  error = new StandardError(HttpStatus.NOT_FOUND.value(), e.getMessage(), System.currentTimeMillis());
	   
	     return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
	}
}
