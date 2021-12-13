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
public class ModificarServicio {
    private Integer id_servicios;
    private String nombre;
    private String descripcion;
}