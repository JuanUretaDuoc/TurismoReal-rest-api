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

    @Override
    public Map<String, Object> reintegrarUsuario(ReintegrarUsuario reintegrarUsuario) {
        return negocioRepository.reintegrarUsuario(reintegrarUsuario);
    }

    @Override
    public Map<String, Object> listarRegiones(ListarRegiones listarRegiones) {
        return negocioRepository.listarRegiones(listarRegiones);
    }

    @Override
    public Map<String, Object> listarComunas(ListarComunas listarComunas) {
        return negocioRepository.listarComunas(listarComunas);
    }

    @Override
    public Map<String, Object> listarComunasRegion(ListarComunasRegion listarComunasRegion) {
        return negocioRepository.listarComunasRegion(listarComunasRegion);
    }

    @Override
    public Map<String, Object> agregarDepartamento(AgregarDepartamento agregarDepartamento) {
        return negocioRepository.agregarDepartamento(agregarDepartamento);
    }

    @Override
    public Map<String, Object> listarDepartamentos(ListarDepartamentos listarDepartamentos) {
        return negocioRepository.listarDepartamentos(listarDepartamentos);
    }

    @Override
    public Map<String, Object> infoDepartamento(InfoDepartamento infoDepartamento) {
        return negocioRepository.infoDepartamento(infoDepartamento);
    }

    @Override
    public Map<String, Object> modificarDepartamento(ModificarDepartamento modificarDepartamento) {
        return negocioRepository.modificarDepartamento(modificarDepartamento);
    }

    @Override
    public Map<String, Object> eliminarDepartamento(EliminarDepartamento eliminarDepartamento) {
        return negocioRepository.eliminarDepartamento(eliminarDepartamento);
    }

    @Override
    public Map<String, Object> reintegrarDepartamento(ReintegrarDepartamento reintegrarDepartamento) {
        return negocioRepository.reintegrarDepartamento(reintegrarDepartamento);
    }

    @Override
    public Map<String, Object> cargarImagen(CargarImagen cargarImagen) {
        return negocioRepository.cargarImagen(cargarImagen);
    }

    @Override
    public Map<String, Object> infoRegion(InfoRegion infoRegion) {
        return negocioRepository.infoRegion(infoRegion);
    }

    @Override
    public Map<String, Object> infoComuna(InfoComuna infoComuna) {
        return negocioRepository.infoComuna(infoComuna);
    }

    @Override
    public Map<String, Object> crearServicio(CrearServicio crearServicio) {
        return negocioRepository.crearServicio(crearServicio);
    }

    @Override
    public Map<String, Object> modificarServicio(ModificarServicio modificarServicio) {
        return negocioRepository.modificarServicio(modificarServicio);
    }

    @Override
    public Map<String, Object> listarServicio(ListarServicio listarServicio) {
        return negocioRepository.listarServicio(listarServicio);
    }

}
