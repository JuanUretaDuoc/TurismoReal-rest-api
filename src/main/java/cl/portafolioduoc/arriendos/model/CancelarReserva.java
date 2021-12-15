package cl.portafolioduoc.arriendos.model;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CancelarReserva {
    private Integer id_reserva;
    private Integer id_depto;
    private Integer id_usuario;
}
