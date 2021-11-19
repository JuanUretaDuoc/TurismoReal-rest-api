package cl.portafolioduoc.arriendos.repository.Negocio;

import cl.portafolioduoc.arriendos.errorHandler.NoSuchElementFoundException;
import cl.portafolioduoc.arriendos.model.*;
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

public class NegocioRepositoryImpl implements NegocioRepository {

    private final JdbcTemplate jdbcTemplate;
    private SimpleJdbcCall simpleJdbcCall;

    @Override
    public Map<String, Object> traerMenu(TraerMenu traerMenu) {
        simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
                .withProcedureName("SP_TRAE_MENU");
        MapSqlParameterSource input = new MapSqlParameterSource();
        input.addValue("id_usuario", traerMenu.getId_usuario());


        Map<String, Object> outMap = simpleJdbcCall.execute(input);

        return outMap;
    }

    @Override
    public Map<String, Object> listarRoles(ListarRoles listarRoles) {
        simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
                .withProcedureName("SP_WS_LISTAR_USUARIO_ROLES");
        MapSqlParameterSource input = new MapSqlParameterSource();
        input.addValue("id_usuario", listarRoles.getId_usuario());

        Map<String, Object> outMap = simpleJdbcCall.execute();

        return outMap;
    }

    @Override
    public Map<String, Object> listarUsuarios(ListarUsuarios listarUsuarios) {
        simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
                .withProcedureName("SP_WS_LISTAR_USUARIOS");
        MapSqlParameterSource input = new MapSqlParameterSource();
        input.addValue("estado", listarUsuarios.getEstado());

        Map<String, Object> outMap = simpleJdbcCall.execute();

        return outMap;
    }

}
