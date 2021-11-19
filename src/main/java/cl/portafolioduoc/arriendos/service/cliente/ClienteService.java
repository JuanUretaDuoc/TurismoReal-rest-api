package cl.portafolioduoc.arriendos.service.cliente;

import cl.portafolioduoc.arriendos.model.Cliente;
import cl.portafolioduoc.arriendos.model.Login;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public interface ClienteService {

    Map<String, Object> list();

    Map<String, Object> update(Cliente cliente);

    Map<String, Object> create(Cliente cliente);

    Map<String, Object> getByRut(String rut);

    Map<String, Object> login(Login login);

    Map<String, Object> eliminar(String rut);
}
