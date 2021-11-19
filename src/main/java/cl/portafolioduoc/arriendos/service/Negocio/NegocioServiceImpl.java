package cl.portafolioduoc.arriendos.service.Negocio;

import cl.portafolioduoc.arriendos.model.ListarRoles;
import cl.portafolioduoc.arriendos.model.ListarUsuarios;
import cl.portafolioduoc.arriendos.model.TraeMenuSub;
import cl.portafolioduoc.arriendos.model.TraerMenu;
import cl.portafolioduoc.arriendos.repository.Negocio.NegocioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@RequiredArgsConstructor
public class NegocioServiceImpl implements NegocioService{
    private final NegocioRepository negocioRepository;

    @Override
    public Map<String, Object> traerMenu(TraerMenu traerMenu) {
        return negocioRepository.traerMenu(traerMenu);
    }

    @Override
    public Map<String, Object> traerMenuSub(TraeMenuSub traerMenuSub) {
        return negocioRepository.traerMenuSub(traerMenuSub);
    }

    @Override
    public Map<String, Object> listarRoles(ListarRoles listarRoles) {
        return negocioRepository.listarRoles(listarRoles);
    }

    @Override
    public Map<String, Object> listarUsuarios(ListarUsuarios listarUsuarios) {
        return negocioRepository.listarUsuarios(listarUsuarios);
    }

    @Override
    public Map<String, Object> getComunaById(Long id) {
        return negocioRepository.getComunaById(id);
    }

    @Override
    public Map<String, Object> listComunas() {
        return negocioRepository.listComunas();
    }
}
