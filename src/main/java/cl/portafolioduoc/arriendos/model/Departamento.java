package cl.portafolioduoc.arriendos.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Departamento {
    private Long id_depto;
    private String nombre;
    private String direccion;
    private String comuna;
    private String descripcion;
    private Long precio;
    private Long estado;
    private Long id_comuna;
    private Long id_region;

}
