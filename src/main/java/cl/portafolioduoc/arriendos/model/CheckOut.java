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
public class CheckOut {
    private Long id_check_out;
    private Date fecha;
    private String descripcion;
    private Long total;
    private Long id_reserva;
    private Long id_usuario;
    private Long id_depto;
    private Long id_comuna;
    private Long id_region;
}
