package microservices3.spring.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ExceptionEmployee extends RuntimeException {
    public ExceptionEmployee(String message) {
        super(message);
    }
}
