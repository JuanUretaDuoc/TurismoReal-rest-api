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
public class AgregarTour {
    private String nombre_tour;
    private String lugar;
    private String descripcion;
    private String hora_inicio;
    private String hora_termino;
    private Integer precio;
}
