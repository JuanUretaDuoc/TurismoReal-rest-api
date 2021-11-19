package cl.portafolioduoc.arriendos.controller.cliente;

import cl.portafolioduoc.arriendos.errorHandler.ErrorResponse;
import cl.portafolioduoc.arriendos.errorHandler.NoSuchElementFoundException;
import cl.portafolioduoc.arriendos.model.Cliente;
import cl.portafolioduoc.arriendos.model.Login;
import cl.portafolioduoc.arriendos.service.cliente.ClienteService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;

import java.util.Map;

@RestController
@RequiredArgsConstructor
@Slf4j
@RequestMapping("cliente")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ClienteController {


    private final ClienteService clienteService;

    @GetMapping("")
    public ResponseEntity<Map<String, Object>> list() {

        Map<String, Object> response = clienteService.list();

        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping("/buscar/{rut}")
    @ResponseBody
    public Map<String, Object> getByRut(@PathVariable(value = "rut") String rut) {
        return clienteService.getByRut(rut);
    }

    @PostMapping("/crear")
    public Map<String, Object> create(@RequestBody Cliente cliente) {
        return this.clienteService.create(cliente);
    }

    @PostMapping("/login")
    public Map<String, Object> login(@RequestBody Login login) {
        return this.clienteService.login(login);
    }

    @DeleteMapping("/{rut}")
    public Map<String, Object> eliminar(@PathVariable(value = "rut") String rut) {
        return this.clienteService.eliminar(rut);
    }
    @PostMapping("/update")
    public Map<String, Object> update(@RequestBody Cliente cliente) {
        return this.clienteService.update(cliente);
    }



    @ExceptionHandler(NoSuchElementFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ResponseEntity<ErrorResponse> handleItemNotFoundException(
            NoSuchElementFoundException exception,
            WebRequest request
    ){
        return buildErrorResponse(exception, exception.getMessage(), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ResponseEntity<ErrorResponse> handleAllUncaughtException(
            Exception exception,
            WebRequest request){
        log.error("Unknown error occurred", exception);
        return buildErrorResponse(
                exception,
                "Se produjo un error desconocido",
                HttpStatus.INTERNAL_SERVER_ERROR
        );
    }

    private ResponseEntity<ErrorResponse> buildErrorResponse(
            Exception exception,
            String clientMessage,
            HttpStatus httpStatus
    ) {
        ErrorResponse errorResponse = new ErrorResponse(
                httpStatus.value(), clientMessage, exception.getMessage()
        );
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorResponse);
    }


}
