package cl.portafolioduoc.arriendos.repository.Negocio;


import cl.portafolioduoc.arriendos.model.*;

import java.util.Map;

public interface NegocioRepository {


    Map<String, Object> traerMenu(TraerMenu traerMenu);

    Map<String, Object> traerMenuSub(TraeMenuSub traerMenuSub);

    Map<String, Object> listarRoles(ListarRoles listarRoles);

    Map<String, Object> listarUsuarios(ListarUsuarios listarUsuarios);

    Map<String, Object> getComunaById(Long id);

    Map<String, Object> listComunas();



}
