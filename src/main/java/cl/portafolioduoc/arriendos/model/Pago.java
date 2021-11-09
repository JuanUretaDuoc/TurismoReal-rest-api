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
public class Pago {
    private Long id_pago;
    private Long monto;
    private Date fecha;
    private Long codigo_reserva;
    private String rut_usuario;
    private Long id_usuario;
    private Long id_depto;
    private Long id_comuna;
    private Long id_region;
}
