package cl.portafolioduoc.arriendos.service.Negocio;

import cl.portafolioduoc.arriendos.model.*;

import java.util.Map;

public interface NegocioService {
    Map<String, Object> traerMenu(TraerMenu traerMenu);

    Map<String, Object> traerMenuSub(TraeMenuSub traerMenuSub);

    Map<String, Object> listarRoles(ListarRoles listarRoles);

    Map<String, Object> listarUsuarios(ListarUsuarios listarUsuarios);

    Map<String, Object> getComunaById(Long id);

    Map<String, Object> listComunas();

    Map<String, Object> crearUsuario(CrearUsuario crearUsuario);

    Map<String, Object> infoUsuario(InfoUsuario infoUsuario);

    Map<String, Object> modificarUsuario(ModificarUsuario modificarUsuario);

    Map<String, Object> eliminarUsuario(EliminarUsuario eliminarUsuario);
}
