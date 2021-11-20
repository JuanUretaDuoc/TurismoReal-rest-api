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
public class ModificarUsuario {
    private String rut;
    private String nombre;
    private String apaterno;
    private String amaterno;
    private String telefono;
    private String correo;
    private String pass;
    private Integer id_rol;
    private Integer id_usuario;
    private Integer id_usuario_auth;
    private String pass_auth;
}

