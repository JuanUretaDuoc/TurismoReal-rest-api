package cl.portafolioduoc.arriendos.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ServicioExtra {
    private Long id_servicio;
    private String tipo;
    private String descripcion;
    private Long codigo_reserva;
    private String rut_usuario;
    private Long total;
    private Long id_usuario;
    private Long id_depto;
    private Long id_comuna;
    private Long id_region;
}
