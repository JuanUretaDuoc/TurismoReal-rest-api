package cl.portafolioduoc.arriendos.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DepartamentoDetalle {
    private Long id_depto_det;
    private Long cant_dormitorio;
    private Long cant_bano;
    private Long capacidad_depto;
    private String descripcion;
    private Long id_depto;
    private Long id_comuna;
    private Long id_region;
}
