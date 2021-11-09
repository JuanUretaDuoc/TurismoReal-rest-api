package cl.portafolioduoc.arriendos.controller.departamento;

import cl.portafolioduoc.arriendos.service.departamento.DepartamentoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("depto")
public class DepartamentoController {
    private DepartamentoService departamentoService;
}
