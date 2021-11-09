package cl.portafolioduoc.arriendos.service.cliente;

import cl.portafolioduoc.arriendos.model.Cliente;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public interface ClienteService {
    Cliente getById(Long id);

    Map<String, Object> list();

    Boolean deleteById(Long id);

    Boolean update(Cliente cliente);

    Map<String, Object> create(Cliente cliente);

    Map<String, Object> getByRut(String rut);
}
