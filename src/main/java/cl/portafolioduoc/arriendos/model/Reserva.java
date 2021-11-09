package cl.portafolioduoc.arriendos.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Reserva {

    private Long id_reserva;
    private Date fecha_inicio;
    private Date fecha_termino;
    private Long total;
    private String rut_usuario;
    private Long id_depto;
    private Long id_comuna;
    private Long id_region;
}
