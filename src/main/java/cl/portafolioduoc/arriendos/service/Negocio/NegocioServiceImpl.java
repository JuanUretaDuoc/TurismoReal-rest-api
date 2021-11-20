package cl.portafolioduoc.arriendos.service.Negocio;

import cl.portafolioduoc.arriendos.model.*;
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

    @Override
    public Map<String, Object> crearUsuario(CrearUsuario crearUsuario) {
        return negocioRepository.crearUsuario(crearUsuario);
    }

    @Override
    public Map<String, Object> infoUsuario(InfoUsuario infoUsuario) {
        return negocioRepository.infoUsuario(infoUsuario);
    }

    @Override
    public Map<String, Object> modificarUsuario(ModificarUsuario modificarUsuario) {
        return negocioRepository.modificarUsuario(modificarUsuario);
    }

    @Override
    public Map<String, Object> eliminarUsuario(EliminarUsuario eliminarUsuario) {
        return negocioRepository.eliminarUsuario(eliminarUsuario);
    }
}
