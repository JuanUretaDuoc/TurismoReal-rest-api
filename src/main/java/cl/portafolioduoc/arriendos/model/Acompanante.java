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
public class Acompanante {
    private String rut_acompanante;
    private String nombre;
    private Date fecha_nacimiento;
    private Long codigo_reserva;
    private String rut_usuario;
    private Long id_usuario;
    private Long id_depto;
    private Long id_comuna;
    private Long id_region;
}
