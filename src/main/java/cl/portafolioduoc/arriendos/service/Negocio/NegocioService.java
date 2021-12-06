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

    Map<String, Object> reintegrarUsuario(ReintegrarUsuario reintegrarUsuario);

    Map<String, Object> listarRegiones(ListarRegiones listarRegiones);

    Map<String, Object> listarComunas(ListarComunas listarComunas);

    Map<String, Object> listarComunasRegion(ListarComunasRegion listarComunasRegion);

    Map<String, Object> agregarDepartamento(AgregarDepartamento agregarDepartamento);

    Map<String, Object> listarDepartamentos(ListarDepartamentos listarDepartamentos);

    Map<String, Object> infoDepartamento(InfoDepartamento infoDepartamento);

    Map<String, Object> modificarDepartamento(ModificarDepartamento modificarDepartamento);

    Map<String, Object> eliminarDepartamento(EliminarDepartamento eliminarDepartamento);

    Map<String, Object> reintegrarDepartamento(ReintegrarDepartamento reintegrarDepartamento);

//    Map<String, Object> incio();

    Map<String, Object> cargarImagen(CargarImagen cargarImagen);
}
