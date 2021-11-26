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
public class ModificarDepartamento {
    private Integer cod_interno;
    private String nombre;
    private String direccion;
    private String precio;
    private Integer region;
    private Integer comuna;
    private Integer dormitorios;
    private Integer banos;
    private Integer capacidad;
    private String descripcion_depto;
    private Integer id_depto;
    private String pass_auth;
    private Integer id_usuario_auth;
}

