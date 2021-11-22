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
        input.addValue("p_id_usuario", traerMenu.getId_usuario());


        Map<String, Object> outMap = simpleJdbcCall.execute(input);

        return outMap;
    }

    @Override
    public Map<String, Object> traerMenuSub(TraeMenuSub traerMenuSub) {
        simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
                .withProcedureName("SP_TRAE_MENU_SUB");
        MapSqlParameterSource input = new MapSqlParameterSource();
        input.addValue("p_id_usuario", traerMenuSub.getP_id_usuario());
        input.addValue("p_id_meP", traerMenuSub.getP_id_meP());

        Map<String, Object> outMap = simpleJdbcCall.execute(input);

        return outMap;
    }

    @Override
    public Map<String, Object> listarRoles(ListarRoles listarRoles) {
        simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
                .withProcedureName("SP_WS_LISTAR_USUARIO_ROLES");

        Map<String, Object> outMap = simpleJdbcCall.execute();

        return outMap;
    }

    @Override
    public Map<String, Object> listarUsuarios(ListarUsuarios listarUsuarios) {
        simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
                .withProcedureName("SP_LISTAR_USUARIOS");
        MapSqlParameterSource input = new MapSqlParameterSource();
        input.addValue("v_estado", listarUsuarios.getEstado());

        Map<String, Object> outMap = simpleJdbcCall.execute(input);

        return outMap;
    }

    @Override
    public Map<String, Object> getComunaById(Long id) {
        simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
                .withProcedureName("SP_LISTAR_COMUNA");
        MapSqlParameterSource input = new MapSqlParameterSource();
        input.addValue("id_comuna", id);

        Map<String, Object> outMap = simpleJdbcCall.execute(input);

        return outMap;
    }

    @Override
    public Map<String, Object> listComunas() {
        simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
                .withProcedureName("SP_LISTAR_COMUNAS");

        Map<String , Object> out = simpleJdbcCall.execute();
        return out;
    }

    @Override
    public Map<String, Object> crearUsuario(CrearUsuario crearUsuario) {
        simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
                .withProcedureName("SP_CREAR_USUARIO");
        MapSqlParameterSource input = new MapSqlParameterSource();
        input.addValue("p_rut", crearUsuario.getRut());
        input.addValue("p_nombre", crearUsuario.getNombre());
        input.addValue("p_apaterno", crearUsuario.getApaterno());
        input.addValue("p_amaterno", crearUsuario.getAmaterno());
        input.addValue("p_telefono", crearUsuario.getTelefono());
        input.addValue("p_correo", crearUsuario.getCorreo());
        input.addValue("p_pass", crearUsuario.getPass());
        input.addValue("p_rol", crearUsuario.getRol());


        Map<String, Object> outMap = simpleJdbcCall.execute(input);

        return outMap;
    }

    @Override
    public Map<String, Object> infoUsuario(InfoUsuario infoUsuario) {
        simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
                .withProcedureName("SP_CARGAR_INFO_USUARIO");
        MapSqlParameterSource input = new MapSqlParameterSource();
        input.addValue("p_id_usuario", infoUsuario.getId_usuario());


        Map<String, Object> outMap = simpleJdbcCall.execute(input);

        return outMap;
    }

    @Override
    public Map<String, Object> modificarUsuario(ModificarUsuario modificarUsuario) {
        simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
                .withProcedureName("SP_MODIFICAR_USUARIO");
        MapSqlParameterSource input = new MapSqlParameterSource();
        input.addValue("p_rut", modificarUsuario.getRut());
        input.addValue("p_nombre", modificarUsuario.getNombre());
        input.addValue("p_apaterno", modificarUsuario.getApaterno());
        input.addValue("p_amaterno", modificarUsuario.getAmaterno());
        input.addValue("p_telefono", modificarUsuario.getTelefono());
        input.addValue("p_correo", modificarUsuario.getCorreo());
        input.addValue("p_pass", modificarUsuario.getPass());
        input.addValue("p_id_rol", modificarUsuario.getId_rol());
        input.addValue("p_id_usuario", modificarUsuario.getId_usuario());
        input.addValue("p_id_usuario_auth", modificarUsuario.getId_usuario_auth());
        input.addValue("p_pass_auth", modificarUsuario.getPass_auth());


        Map<String, Object> outMap = simpleJdbcCall.execute(input);

        return outMap;
    }

    @Override
    public Map<String, Object> eliminarUsuario(EliminarUsuario eliminarUsuario) {
        simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
                .withProcedureName("SP_BORRAR_USUARIO");
        MapSqlParameterSource input = new MapSqlParameterSource();
        input.addValue("p_id_usuario", eliminarUsuario.getId_usuario());


        Map<String, Object> outMap = simpleJdbcCall.execute(input);

        return outMap;
    }

    @Override
    public Map<String, Object> listarRegiones(ListarRegiones listarRegiones) {
        simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
                .withProcedureName("SP_LISTAR_REGIONES");

        Map<String, Object> outMap = simpleJdbcCall.execute();

        return outMap;
    }

    @Override
    public Map<String, Object> listarComunas(ListarComunas listarComunas) {
        simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
                .withProcedureName("SP_LISTAR_COMUNAS");

        Map<String, Object> outMap = simpleJdbcCall.execute();

        return outMap;
    }

    @Override
    public Map<String, Object> listarComunasRegion(ListarComunasRegion listarComunasRegion) {
        simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
                .withProcedureName("SP_LISTAR_COMUNAS_REGION");
        MapSqlParameterSource input = new MapSqlParameterSource();
        input.addValue("p_id_region", listarComunasRegion.getId_region());

        Map<String, Object> outMap = simpleJdbcCall.execute(input);

        return outMap;
    }

    @Override
    public Map<String, Object> agregarDepartamento(AgregarDepartamento agregarDepartamento) {
        simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
                .withProcedureName("SP_CREAR_DEPARTAMENTO");
        MapSqlParameterSource input = new MapSqlParameterSource();
        input.addValue("p_cod_interno", agregarDepartamento.getCod_interno());
        input.addValue("p_nombre", agregarDepartamento.getNombre());
        input.addValue("p_direccion", agregarDepartamento.getDireccion());
        input.addValue("p_precio", agregarDepartamento.getPrecio());
        input.addValue("p_region", agregarDepartamento.getRegion());
        input.addValue("p_comuna", agregarDepartamento.getComuna());
        input.addValue("p_dormitorios", agregarDepartamento.getDormitorios());
        input.addValue("p_banos", agregarDepartamento.getBanos());
        input.addValue("p_capacidad", agregarDepartamento.getCapacidad());
        input.addValue("p_descripcion_depto", agregarDepartamento.getDescripcion_depto());

        Map<String, Object> outMap = simpleJdbcCall.execute(input);

        return outMap;
    }


}
