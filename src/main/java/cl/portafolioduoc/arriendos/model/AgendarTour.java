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
public class AgendarTour {
    private Integer id_cliente;
    private Integer id_reserva;
    private Integer id_tour;
    private Integer cant_personas;
    private String total;
    private String fecha;
    private String fecha_inicio;
    private String fecha_termino;
}
