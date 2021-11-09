package cl.portafolioduoc.arriendos.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DepartamentoImagen {

    private Long id_imagen;
    private String ruta;
    private String nombre;
    private Long id_depto;
    private Long id_comuna;
    private Long id_region;
}
