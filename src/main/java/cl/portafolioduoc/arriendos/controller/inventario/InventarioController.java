package cl.portafolioduoc.arriendos.controller.inventario;

import cl.portafolioduoc.arriendos.service.inventario.InventarioService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("inventario")
public class InventarioController {
    private InventarioService inventarioService;
}
