package cl.portafolioduoc.arriendos.service.Negocio;

import cl.portafolioduoc.arriendos.model.ListarRoles;
import cl.portafolioduoc.arriendos.model.ListarUsuarios;
import cl.portafolioduoc.arriendos.model.TraerMenu;

import java.util.Map;

public interface NegocioService {
    Map<String, Object> traerMenu(TraerMenu traerMenu);

    Map<String, Object> listarRoles(ListarRoles listarRoles);

    Map<String, Object> listarUsuarios(ListarUsuarios listarUsuarios);
}
