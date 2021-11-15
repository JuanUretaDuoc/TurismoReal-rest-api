package cl.portafolioduoc.arriendos.repository.cliente;

import cl.portafolioduoc.arriendos.errorHandler.NoSuchElementFoundException;
import cl.portafolioduoc.arriendos.model.Cliente;
import cl.portafolioduoc.arriendos.model.Login;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import java.sql.Types;
import java.util.ArrayList;
import java.util.Map;

@Repository
@RequiredArgsConstructor
public class ClienteRepositoryImpl implements ClienteRepository{

    private final JdbcTemplate jdbcTemplate;
    private SimpleJdbcCall simpleJdbcCall;


    @Override
    public Cliente getById(Long id) {
        return null;
    }

    @Override
    public Map<String, Object> list() {
        simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
                .withProcedureName("SP_LISTAR_USUARIOS");

        Map<String , Object> out = simpleJdbcCall.execute();
        return out;
    }

    @Override
    public Boolean deleteById(Long id) {
        return null;
    }

    @Override
    public Boolean update(Cliente cliente) {
        return null;
    }

    @Override
    public Map<String, Object> create(Cliente cliente) {
        simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
                .withProcedureName("SP_CREAR_USUARIO");
        MapSqlParameterSource input = new MapSqlParameterSource();
        input.addValue("rut_usuario", cliente.getRut_usuario());
        input.addValue("nombre", cliente.getNombre());
        input.addValue("apaterno", cliente.getApaterno());
        input.addValue("amaterno", cliente.getAmaterno());
        input.addValue("telefono", cliente.getTelefono());
        input.addValue("correo", cliente.getCorreo());
        input.addValue("contrasena", cliente.getContrasena());
        input.addValue("id_rol", cliente.getId_rol());

        Map<String, Object> outMap = simpleJdbcCall.execute(input);

        return outMap;

    }


    @Override
    public Map<String, Object> getByRut(String rut) {
        simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
                .withProcedureName("SP_LISTAR_USUARIO")
                .declareParameters(
                        new SqlParameter("rut", Types.NVARCHAR)
                );

        Map<String , Object> out = simpleJdbcCall.execute(
                new MapSqlParameterSource("rut", rut)
        );

        ArrayList<Object> value = (ArrayList<Object>) out.get("CUR_DATOS");
        if (value.size() > 0) {
            return out;
        } else {
            throw new NoSuchElementFoundException("El usuario especificado no existe");
        }
    }

    @Override
    public Map<String, Object> login(Login login) {
        simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
                .withProcedureName("SP_LOGIN")
                .declareParameters(
                        new SqlParameter("usuario", Types.NVARCHAR),
                        new SqlParameter("contrasena", Types.NVARCHAR)
                );

        Map<String , Object> out = simpleJdbcCall.execute(
                new MapSqlParameterSource("usuario", login.getEmail()),
                new MapSqlParameterSource("contrasena", login.getPass())
        );

        return out;
    }
}
