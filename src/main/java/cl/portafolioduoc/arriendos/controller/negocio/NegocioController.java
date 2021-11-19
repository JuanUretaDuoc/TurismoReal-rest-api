package cl.portafolioduoc.arriendos.controller.negocio;

import cl.portafolioduoc.arriendos.model.ListarRoles;
import cl.portafolioduoc.arriendos.model.ListarUsuarios;
import cl.portafolioduoc.arriendos.model.TraeMenuSub;
import cl.portafolioduoc.arriendos.model.TraerMenu;
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



}
