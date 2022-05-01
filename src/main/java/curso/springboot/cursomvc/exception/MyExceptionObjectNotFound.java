package curso.springboot.cursomvc.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

public class MyExceptionObjectNotFound extends RuntimeException {

	public MyExceptionObjectNotFound(String msg) {
		super(msg);
	}
	
	public MyExceptionObjectNotFound(String msg, Throwable cause) {
		super(msg, cause);
	}
}
