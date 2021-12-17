package cl.portafolioduoc.arriendos.controller.negocio;

import cl.portafolioduoc.arriendos.model.*;
import cl.portafolioduoc.arriendos.service.Negocio.NegocioService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequiredArgsConstructor
@Slf4j
@RequestMapping("negocio")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class NegocioController {

    private final NegocioService negocioService;

    @PostMapping("/TraerMenu")
    public Map<String, Object> traerMenu(@RequestBody TraerMenu traerMenu) {
        return this.negocioService.traerMenu(traerMenu);
    }

    @PostMapping("/TraerMenuSub")
    public Map<String, Object> traerMenuSub(@RequestBody TraeMenuSub traerMenuSub) {
        return this.negocioService.traerMenuSub(traerMenuSub);
    }

    @PostMapping("/ListarRoles")
    public Map<String, Object> listarRoles(@RequestBody ListarRoles listarRoles) {
        return this.negocioService.listarRoles(listarRoles);
    }

    @PostMapping("/ListarUsuarios")
    public Map<String, Object> listarUsuarios(@RequestBody ListarUsuarios listarUsuarios) {
        return this.negocioService.listarUsuarios(listarUsuarios);
    }

    @GetMapping("/comunas/{id}")
    public Map<String, Object> getComunaById(@PathVariable (value = "id") Long id) {
        return this.negocioService.getComunaById(id);
    }

    @GetMapping("/comunas")
    public Map<String, Object> listComuna() {
        return this.negocioService.listComunas();
    }

    @PostMapping("/CrearUsuario")
    public Map<String, Object> crearUsuario(@RequestBody CrearUsuario crearUsuario) {
        return this.negocioService.crearUsuario(crearUsuario);
    }

    @PostMapping("/InfoUsuario")
    public Map<String, Object> infoUsuario(@RequestBody InfoUsuario infoUsuario) {
        return this.negocioService.infoUsuario(infoUsuario);
    }

    @PostMapping("/ModificarUsuario")
    public Map<String, Object> modificarUsuario(@RequestBody ModificarUsuario modificarUsuario) {
        return this.negocioService.modificarUsuario(modificarUsuario);
    }

    @PostMapping("/EliminarUsuario")
    public Map<String, Object> eliminarUsuario(@RequestBody EliminarUsuario eliminarUsuario) {
        return this.negocioService.eliminarUsuario(eliminarUsuario);
    }

    @PostMapping("/ReintegrarUsuario")
    public Map<String, Object> reintegrarUsuario(@RequestBody ReintegrarUsuario reintegrarUsuario) {
        return this.negocioService.reintegrarUsuario(reintegrarUsuario);
    }

    @PostMapping("/ListarRegiones")
    public Map<String, Object> listarRegiones(@RequestBody ListarRegiones listarRegiones) {
        return this.negocioService.listarRegiones(listarRegiones);
    }

    @PostMapping("/ListarComunas")
    public Map<String, Object> listarComunas(@RequestBody ListarComunas listarComunas) {
        return this.negocioService.listarComunas(listarComunas);
    }

    @PostMapping("/ListarComunasRegion")
    public Map<String, Object> listarComunasRegion(@RequestBody ListarComunasRegion listarComunasRegion) {
        return this.negocioService.listarComunasRegion(listarComunasRegion);
    }

    @PostMapping("/CrearDepartamento")
    public Map<String, Object> agregarDepartamento(@RequestBody AgregarDepartamento agregarDepartamento) {
        return this.negocioService.agregarDepartamento(agregarDepartamento);
    }

    @PostMapping("/ListarDepartamentos")
    public Map<String, Object> listarDepartamentos(@RequestBody ListarDepartamentos listarDepartamentos) {
        return this.negocioService.listarDepartamentos(listarDepartamentos);
    }

    @PostMapping("/InfoDepartamento")
    public Map<String, Object> infoDepartamento(@RequestBody InfoDepartamento infoDepartamento) {
        return this.negocioService.infoDepartamento(infoDepartamento);
    }

    @PostMapping("/ModificarDepartamento")
    public Map<String, Object> modificarDepartamento(@RequestBody ModificarDepartamento modificarDepartamento) {
        return this.negocioService.modificarDepartamento(modificarDepartamento);
    }

    @PostMapping("/EliminarDepartamento")
    public Map<String, Object> eliminarDepartamento(@RequestBody EliminarDepartamento eliminarDepartamento) {
        return this.negocioService.eliminarDepartamento(eliminarDepartamento);
    }

    @PostMapping("/ReintegrarDepartamento")
    public Map<String, Object> reintegrarDepartamento(@RequestBody ReintegrarDepartamento reintegrarDepartamento) {
        return this.negocioService.reintegrarDepartamento(reintegrarDepartamento);
    }

    @PostMapping("/CargarImagen")
    public Map<String, Object> cargarImagen(@RequestBody CargarImagen cargarImagen) {
        return this.negocioService.cargarImagen(cargarImagen);
    }

    @PostMapping("/InfoRegion")
    public Map<String, Object> infoRegion(@RequestBody InfoRegion infoRegion) {
        return this.negocioService.infoRegion(infoRegion);
    }

    @PostMapping("/InfoComuna")
    public Map<String, Object> infoComuna(@RequestBody InfoComuna infoComuna) {
        return this.negocioService.infoComuna(infoComuna);
    }

    @PostMapping("/CrearServicio")
    public Map<String, Object> crearServicio(@RequestBody CrearServicio crearServicio) {
        return this.negocioService.crearServicio(crearServicio);
    }

    @PostMapping("/ModificarServicio")
    public Map<String, Object> modificarServicio(@RequestBody ModificarServicio modificarServicio) {
        return this.negocioService.modificarServicio(modificarServicio);
    }

    @PostMapping("/ListarServicio")
    public Map<String, Object> listarServicio(@RequestBody ListarServicio listarServicio) {
        return this.negocioService.listarServicio(listarServicio);
    }

    @PostMapping("/CrearReserva")
    public Map<String, Object> crearReserva(@RequestBody CrearReserva crearReserva) {
        return this.negocioService.crearReserva(crearReserva);
    }

    @PostMapping("/ConsultarDisponibilidad")
    public Map<String, Object> crearReserva(@RequestBody ConsultarDisponibilidad consultarDisponibilidad) {
        return this.negocioService.consultarDisponibilidad(consultarDisponibilidad);
    }

    @PostMapping("/VerReservasUsuario")
    public Map<String, Object> crearReserva(@RequestBody VerReservasUsuario verReservasUsuario) {
        return this.negocioService.verReservasUsuario(verReservasUsuario);
    }

    @PostMapping("/VerReservasDepartamento")
    public Map<String, Object> crearReserva(@RequestBody VerReservasDepartamento verReservasDepartamento) {
        return this.negocioService.verReservasDepartamento(verReservasDepartamento);
    }

    @PostMapping("/CancelarReserva")
    public Map<String, Object> crearReserva(@RequestBody CancelarReserva cancelarReserva) {
        return this.negocioService.cancelarReserva(cancelarReserva);
    }

    @PostMapping("/ListarTours")
    public Map<String, Object> listarTours(@RequestBody ListarTours listarTours) {
        return this.negocioService.listarTours(listarTours);
    }

    @PostMapping("/AgregarTour")
    public Map<String, Object> AgregarTour(@RequestBody AgregarTour agregarTour) {
        return this.negocioService.agregarTour(agregarTour);
    }

    @PostMapping("/AgendarTour")
    public Map<String, Object> agendarTour(@RequestBody AgendarTour agendarTour) {
        return this.negocioService.agendarTour(agendarTour);
    }

    @PostMapping("/ListarReservas")
    public Map<String, Object> listarReservas(@RequestBody ListarReservas listarReservas) {
        return this.negocioService.listarReservas(listarReservas);
    }

    @PostMapping("/ListarTransportes")
    public Map<String, Object> listarTransportes(@RequestBody ListarTransportes listarTransportes) {
        return this.negocioService.listarTransportes(listarTransportes);
    }

    @PostMapping("/AgregarTransporte")
    public Map<String, Object> AgregarTransporte(@RequestBody AgregarTransporte agregarTransporte) {
        return this.negocioService.agregarTransporte(agregarTransporte);
    }

    @PostMapping("/AgendarTransporte")
    public Map<String, Object> agendarTransporte(@RequestBody AgendarTransporte agendarTransporte) {
        return this.negocioService.agendarTransporte(agendarTransporte);
    }

    @PostMapping("/IngresarCheckIn")
    public Map<String, Object> ingresarCheckIn(@RequestBody IngresarCheckIn ingresarCheckIn) {
        return this.negocioService.ingresarCheckIn(ingresarCheckIn);
    }

    @PostMapping("/IngresarCheckOut")
    public Map<String, Object> ingresarCheckOut(@RequestBody IngresarCheckOut ingresarCheckOut) {
        return this.negocioService.ingresarCheckOut(ingresarCheckOut);
    }

    @PostMapping("/RegistrarMulta")
    public Map<String, Object> registrarMulta(@RequestBody RegistrarMulta registrarMulta) {
        return this.negocioService.registrarMulta(registrarMulta);
    }

    @PostMapping("/PagoPendiente")
    public Map<String, Object> pagoPendiente(@RequestBody PagoPendiente pagoPendiente) {
        return this.negocioService.pagoPendiente(pagoPendiente);
    }

    @PostMapping("/PagoMulta")
    public Map<String, Object> pagoMulta(@RequestBody PagoMulta pagoMulta) {
        return this.negocioService.pagoMulta(pagoMulta);
    }


}
