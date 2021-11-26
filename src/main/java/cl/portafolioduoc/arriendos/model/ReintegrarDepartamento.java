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
public class ReintegrarDepartamento {
    private Integer id_depto;
    private Integer id_usuario_auth;
    private String pass_auth;
}

