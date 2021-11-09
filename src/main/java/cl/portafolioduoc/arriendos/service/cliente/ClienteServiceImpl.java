package cl.portafolioduoc.arriendos.service.cliente;

import cl.portafolioduoc.arriendos.model.Cliente;
import cl.portafolioduoc.arriendos.repository.cliente.ClienteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class ClienteServiceImpl implements ClienteService {
    private final ClienteRepository clienteRepository;

    @Override
    public Cliente getById(Long id) {
        return clienteRepository.getById(id);
    }

    @Override
    public Map<String, Object> list() {
        return clienteRepository.list();
    }

    @Override
    public Boolean deleteById(Long id) {
        return clienteRepository.deleteById(id);
    }

    @Override
    public Boolean update(Cliente cliente) {
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
}
