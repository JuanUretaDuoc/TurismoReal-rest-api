package cl.portafolioduoc.arriendos.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Mantencion {

    private Long id_mantencion;
    private String descripcion;
    private Date fecha_inicio;
    private Date fecha_termino;
    private Long id_depto;
    private Long id_comuna;
    private Long id_region;
}
