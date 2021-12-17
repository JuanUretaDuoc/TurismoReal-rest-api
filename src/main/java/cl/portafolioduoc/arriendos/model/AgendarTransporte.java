
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
public class AgendarTransporte {
    private Integer id_cliente;
    private Integer id_reserva;
    private Integer id_transporte;
    private String fecha;
    private String hora;
    private String fecha_inicio;
    private String fecha_termino;
}