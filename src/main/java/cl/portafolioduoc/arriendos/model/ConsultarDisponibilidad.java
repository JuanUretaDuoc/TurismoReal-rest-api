package cl.portafolioduoc.arriendos.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ConsultarDisponibilidad {
    private String fecha_inicio;
    private String fecha_termino;
    private Integer id_depto;
}
