package cl.portafolioduoc.arriendos.service.cliente;

import cl.portafolioduoc.arriendos.model.Cliente;
import cl.portafolioduoc.arriendos.model.Login;
import cl.portafolioduoc.arriendos.repository.cliente.ClienteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@RequiredArgsConstructor
public class ClienteServiceImpl implements ClienteService {
    private final ClienteRepository clienteRepository;

    @Override
    public Map<String, Object> list() {
        return clienteRepository.list();
    }


    @Override
    public Map<String, Object> update(Cliente cliente) {
        return clienteRepository.update(cliente);
    }

    @Override
    public Map<String, Object> create(Cliente cliente) {
        return clienteRepository.create(cliente);
    }

    @Override
    public Map<String, Object> getByRut(String rut) {
        return clienteRepository.getByRut(rut);
    }

    @Override
    public Map<String, Object> login(Login login) {
        return clienteRepository.login(login);
    }

    @Override
    public Map<String, Object> eliminar(String rut) {
        return clienteRepository.eliminar(rut);
    }


}
