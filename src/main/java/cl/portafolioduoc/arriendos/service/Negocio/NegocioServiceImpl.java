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

    @Override
    public Map<String, Object> crearReserva(CrearReserva crearReserva) {
        return negocioRepository.crearReserva(crearReserva);
    }

    @Override
    public Map<String, Object> consultarDisponibilidad(ConsultarDisponibilidad consultarDisponibilidad) {
        return negocioRepository.consultarDisponibilidad(consultarDisponibilidad);
    }

    @Override
    public Map<String, Object> verReservasUsuario(VerReservasUsuario verReservasUsuario) {
        return negocioRepository.verReservasUsuario(verReservasUsuario);
    }

    @Override
    public Map<String, Object> verReservasDepartamento(VerReservasDepartamento verReservasDepartamento) {
        return negocioRepository.verReservasDepartamento(verReservasDepartamento);
    }

    @Override
    public Map<String, Object> cancelarReserva(CancelarReserva cancelarReserva) {
        return negocioRepository.cancelarReserva(cancelarReserva);
    }

    @Override
    public Map<String, Object> listarTours(ListarTours listarTours) {
        return negocioRepository.listarTours(listarTours);
    }

    @Override
    public Map<String, Object> agregarTour(AgregarTour agregarTour) {
        return negocioRepository.agregarTour(agregarTour);
    }

    @Override
    public Map<String, Object> agendarTour(AgendarTour agendarTour) {
        return negocioRepository.agendarTour(agendarTour);
    }

    @Override
    public Map<String, Object> listarReservas(ListarReservas listarReservas) {
        return negocioRepository.listarReservas(listarReservas);
    }

    @Override
    public Map<String, Object> listarTransportes(ListarTransportes listarTransportes) {
        return negocioRepository.listarTransportes(listarTransportes);
    }

    @Override
    public Map<String, Object> agregarTransporte(AgregarTransporte agregarTransporte) {
        return negocioRepository.agregarTransporte(agregarTransporte);
    }

    @Override
    public Map<String, Object> agendarTransporte(AgendarTransporte agendarTransporte) {
        return negocioRepository.agendarTransporte(agendarTransporte);
    }

    @Override
    public Map<String, Object> ingresarCheckIn(IngresarCheckIn ingresarCheckIn) {
        return negocioRepository.ingresarCheckIn(ingresarCheckIn);
    }

    @Override
    public Map<String, Object> ingresarCheckOut(IngresarCheckOut ingresarCheckOut) {
        return negocioRepository.ingresarCheckOut(ingresarCheckOut);
    }

    @Override
    public Map<String, Object> registrarMulta(RegistrarMulta registrarMulta) {
        return negocioRepository.registrarMulta(registrarMulta);
    }

    @Override
    public Map<String, Object> pagoPendiente(PagoPendiente pagoPendiente) {
        return negocioRepository.pagoPendiente(pagoPendiente);
    }

    @Override
    public Map<String, Object> pagoMulta(PagoMulta pagoMulta) {
        return negocioRepository.pagoMulta(pagoMulta);
    }
}
