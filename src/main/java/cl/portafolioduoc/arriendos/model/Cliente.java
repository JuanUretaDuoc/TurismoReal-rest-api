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
public class Cliente {

    private String rut_usuario;
    private String nombre;
    private String apaterno;
    private String amaterno;
    private String telefono;
    private String correo;
    private String contrasena;
    private Long id_rol;
    private Long estado;


}
