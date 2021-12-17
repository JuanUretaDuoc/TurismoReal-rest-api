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
public class PagoPendiente {
    private Integer id_reserva;
    private Integer monto;
    private Integer id_funcionario;
    private Integer id_depto;
    private String descripcion;
}