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
public class CrearReserva {
    private String fecha_inicio;
    private String fecha_termino;
    private String total;
    private Integer id_usuario;
    private Integer id_depto;
    private Integer cant_huespedes;
    private String monto_pago;
}
