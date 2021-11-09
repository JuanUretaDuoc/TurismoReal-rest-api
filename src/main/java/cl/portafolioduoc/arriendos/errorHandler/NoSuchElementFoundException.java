package cl.portafolioduoc.arriendos.errorHandler;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class NoSuchElementFoundException extends RuntimeException{
    String message;
    String debugMessage;
    public NoSuchElementFoundException(String clientMessage) {
        this.message = clientMessage;
    }

    public NoSuchElementFoundException(Exception e, String clientMessage) {
        this.debugMessage = e.getMessage();
        this.message = clientMessage;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public String getDebugMessage() {
        return debugMessage;
    }
}
