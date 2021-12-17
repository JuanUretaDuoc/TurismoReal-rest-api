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
public class AgregarTransporte {
    private Integer id_depto;
    private Integer id_vehiculo;
    private String origen;
    private String destino;
    private Integer precio;
}