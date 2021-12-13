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
}
