package cl.portafolioduoc.arriendos.repository.cliente;

import cl.portafolioduoc.arriendos.errorHandler.NoSuchElementFoundException;
import cl.portafolioduoc.arriendos.model.Cliente;
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
                .withProcedureName("SP_CREAR_USUARIO")
                .declareParameters(
                        new SqlParameter("rut_usuario", Types.NVARCHAR),
                        new SqlParameter("nombre", Types.NVARCHAR),
                        new SqlParameter("apaterno", Types.NVARCHAR),
                        new SqlParameter("amaterno", Types.NVARCHAR),
                        new SqlParameter("telefono", Types.NVARCHAR),
                        new SqlParameter("correo", Types.NVARCHAR),
                        new SqlParameter("contrasena", Types.NVARCHAR),
                        new SqlParameter("id_rol", Types.NUMERIC)
                );

        Map<String , Object> out = simpleJdbcCall.execute(
                new MapSqlParameterSource("rut_usuario", cliente.getRut_usuario()),
                new MapSqlParameterSource("nombre", cliente.getNombre()),
                new MapSqlParameterSource("apaterno", cliente.getApaterno()),
                new MapSqlParameterSource("amaterno", cliente.getAmaterno()),
                new MapSqlParameterSource("telefono", cliente.getTelefono()),
                new MapSqlParameterSource("correo", cliente.getCorreo()),
                new MapSqlParameterSource("contrasena", cliente.getContrasena()),
                new MapSqlParameterSource("id_rol", cliente.getId_rol())
        );

        return out;
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
}
