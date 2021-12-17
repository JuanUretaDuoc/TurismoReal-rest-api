package cl.portafolioduoc.arriendos.repository.Negocio;

import cl.portafolioduoc.arriendos.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

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
        input.addValue("p_dv", crearUsuario.getDv());
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
        input.addValue("p_dv", modificarUsuario.getDv());
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
                .withProcedureName("SP_ELIMINAR_USUARIO");
        MapSqlParameterSource input = new MapSqlParameterSource();
        input.addValue("p_id_usuario", eliminarUsuario.getId_usuario());
        input.addValue("p_id_usuario_auth", eliminarUsuario.getId_usuario_auth());
        input.addValue("p_pass_auth", eliminarUsuario.getPass_auth());


        Map<String, Object> outMap = simpleJdbcCall.execute(input);

        return outMap;
    }

    @Override
    public Map<String, Object> reintegrarUsuario(ReintegrarUsuario reintegrarUsuario) {
        simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
                .withProcedureName("SP_REINTEGRAR_USUARIO");
        MapSqlParameterSource input = new MapSqlParameterSource();
        input.addValue("p_id_usuario", reintegrarUsuario.getId_usuario());
        input.addValue("p_id_usuario_auth", reintegrarUsuario.getId_usuario_auth());
        input.addValue("p_pass_auth", reintegrarUsuario.getPass_auth());


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
        input.addValue("p_cama", agregarDepartamento.getCama());
        input.addValue("p_descripcion_larga_depto", agregarDepartamento.getDescripcion_larga_depto());

        Map<String, Object> outMap = simpleJdbcCall.execute(input);

        return outMap;
    }

    public Map<String, Object> listarDepartamentos(ListarDepartamentos listarDepartamentos) {
        simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
                .withProcedureName("SP_LISTAR_DEPARTAMENTOS");
        MapSqlParameterSource input = new MapSqlParameterSource();
        input.addValue("v_estado", listarDepartamentos.getEstado());

        Map<String, Object> outMap = simpleJdbcCall.execute(input);


        return outMap;
    }

    @Override
    public Map<String, Object> infoDepartamento(InfoDepartamento infoDepartamento) {
        simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
                .withProcedureName("SP_CARGAR_INFO_DEPARTAMENTO");
        MapSqlParameterSource input = new MapSqlParameterSource();
        input.addValue("p_id_depto", infoDepartamento.getId_depto());


        Map<String, Object> outMap = simpleJdbcCall.execute(input);

        return outMap;
    }

    @Override
    public Map<String, Object> modificarDepartamento(ModificarDepartamento modificarDepartamento) {
        simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
                .withProcedureName("SP_MODIFICAR_DEPARTAMENTO");
        MapSqlParameterSource input = new MapSqlParameterSource();
//        input.addValue("p_cod_interno", modificarDepartamento.getCod_interno());
        input.addValue("p_nombre", modificarDepartamento.getNombre());
        input.addValue("p_direccion", modificarDepartamento.getDireccion());
        input.addValue("p_precio", modificarDepartamento.getPrecio());
        input.addValue("p_region", modificarDepartamento.getRegion());
        input.addValue("p_comuna", modificarDepartamento.getComuna());
        input.addValue("p_dormitorios", modificarDepartamento.getDormitorios());
        input.addValue("p_banos", modificarDepartamento.getBanos());
        input.addValue("p_capacidad", modificarDepartamento.getCapacidad());
        input.addValue("p_descripcion_depto", modificarDepartamento.getDescripcion_depto());
        input.addValue("p_id_depto", modificarDepartamento.getId_depto());
        input.addValue("p_id_usuario_auth", modificarDepartamento.getId_usuario_auth());
        input.addValue("p_pass_auth", modificarDepartamento.getPass_auth());
        input.addValue("p_cama", modificarDepartamento.getCama());
        input.addValue("p_descripcion_larga_depto", modificarDepartamento.getDescripcion_larga_depto());


        Map<String, Object> outMap = simpleJdbcCall.execute(input);

        return outMap;
    }

    @Override
    public Map<String, Object> eliminarDepartamento(EliminarDepartamento eliminarDepartamento) {
        simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
                .withProcedureName("SP_ELIMINAR_DEPARTAMENTO");
        MapSqlParameterSource input = new MapSqlParameterSource();
        input.addValue("p_id_depto", eliminarDepartamento.getId_depto());
        input.addValue("p_id_usuario_auth", eliminarDepartamento.getId_usuario_auth());
        input.addValue("p_pass_auth", eliminarDepartamento.getPass_auth());


        Map<String, Object> outMap = simpleJdbcCall.execute(input);

        return outMap;
    }

    @Override
    public Map<String, Object> reintegrarDepartamento(ReintegrarDepartamento reintegrarDepartamento) {
        simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
                .withProcedureName("SP_REINTEGRAR_DEPARTAMENTO");
        MapSqlParameterSource input = new MapSqlParameterSource();
        input.addValue("p_id_depto", reintegrarDepartamento.getId_depto());
        input.addValue("p_id_usuario_auth", reintegrarDepartamento.getId_usuario_auth());
        input.addValue("p_pass_auth", reintegrarDepartamento.getPass_auth());


        Map<String, Object> outMap = simpleJdbcCall.execute(input);

        return outMap;
    }

    @Override
    public Map<String, Object> cargarImagen(CargarImagen cargarImagen) {
        simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
                .withProcedureName("SP_CREAR_USUARIO");
        MapSqlParameterSource input = new MapSqlParameterSource();
            input.addValue("p_ruta", cargarImagen.getRuta());
            input.addValue("p_nombre", cargarImagen.getNombre());
            input.addValue("p_id_depto", cargarImagen.getId_depto());


        Map<String, Object> outMap = simpleJdbcCall.execute(input);

        return outMap;
    }

    @Override
    public Map<String, Object> infoRegion(InfoRegion infoRegion) {
        simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
                .withProcedureName("SP_CARGAR_INFO_REGION");
        MapSqlParameterSource input = new MapSqlParameterSource();
        input.addValue("p_id_region", infoRegion.getId_region());


        Map<String, Object> outMap = simpleJdbcCall.execute(input);

        return outMap;
    }

    @Override
    public Map<String, Object> infoComuna(InfoComuna infoComuna) {
        simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
                .withProcedureName("SP_CARGAR_INFO_COMUNA");
        MapSqlParameterSource input = new MapSqlParameterSource();
        input.addValue("p_id_comuna", infoComuna.getId_comuna());


        Map<String, Object> outMap = simpleJdbcCall.execute(input);

        return outMap;
    }

    @Override
    public Map<String, Object> crearServicio(CrearServicio crearServicio) {
        simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
                .withProcedureName("SP_CREAR_SERVICIO");
        MapSqlParameterSource input = new MapSqlParameterSource();
        input.addValue("p_nombre", crearServicio.getNombre());
        input.addValue("p_descripcion", crearServicio.getDescripcion());

        Map<String, Object> outMap = simpleJdbcCall.execute(input);

        return outMap;
    }

    public Map<String, Object> modificarServicio(ModificarServicio modificarServicio) {
        simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
                .withProcedureName("SP_MODIFICAR_SERVICIO");
        MapSqlParameterSource input = new MapSqlParameterSource();
        input.addValue("p_id_servicios", modificarServicio.getId_servicios());
        input.addValue("p_nombre", modificarServicio.getNombre());
        input.addValue("p_descripcion", modificarServicio.getDescripcion());

        Map<String, Object> outMap = simpleJdbcCall.execute(input);

        return outMap;
    }

    @Override
    public Map<String, Object> listarServicio(ListarServicio listarServicio) {
        simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
                .withProcedureName("SP_LISTAR_SERVICIOS");
        MapSqlParameterSource input = new MapSqlParameterSource();
        input.addValue("p_id_servicios", listarServicio.getId_servicios());

        Map<String, Object> outMap = simpleJdbcCall.execute();

        return outMap;
    }

    @Override
    public Map<String, Object> crearReserva(CrearReserva crearReserva) {
        simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
                .withProcedureName("SP_CREAR_RESERVA");
        MapSqlParameterSource input = new MapSqlParameterSource();
        input.addValue("p_fecha_inicio", crearReserva.getFecha_inicio());
        input.addValue("p_fecha_termino", crearReserva.getFecha_termino());
        input.addValue("p_total", crearReserva.getTotal());
        input.addValue("p_id_usuario", crearReserva.getId_usuario());
        input.addValue("p_id_depto", crearReserva.getId_depto());
        input.addValue("p_cant_huespedes", crearReserva.getCant_huespedes());
        input.addValue("p_monto_pago", crearReserva.getMonto_pago());


        Map<String, Object> outMap = simpleJdbcCall.execute(input);

        return outMap;
    }

    @Override
    public Map<String, Object> consultarDisponibilidad(ConsultarDisponibilidad consultarDisponibilidad) {
        simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
                .withProcedureName("SP_CONSULTAR_DISPONIBILIDAD");
        MapSqlParameterSource input = new MapSqlParameterSource();
        input.addValue("p_fecha_inicio", consultarDisponibilidad.getFecha_inicio());
        input.addValue("p_fecha_termino", consultarDisponibilidad.getFecha_termino());
        input.addValue("p_id_depto", consultarDisponibilidad.getId_depto());


        Map<String, Object> outMap = simpleJdbcCall.execute(input);

        return outMap;
    }

    public Map<String, Object> verReservasUsuario(VerReservasUsuario verReservasUsuario) {
        simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
                .withProcedureName("SP_VER_RESERVAS_USUARIO");
        MapSqlParameterSource input = new MapSqlParameterSource();
        input.addValue("p_id_usuario", verReservasUsuario.getId_usuario());


        Map<String, Object> outMap = simpleJdbcCall.execute(input);

        return outMap;
    }

    public Map<String, Object> verReservasDepartamento(VerReservasDepartamento verReservasDepartamento) {
        simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
                .withProcedureName("SP_VER_RESERVAS_DEPARTAMENTO");
        MapSqlParameterSource input = new MapSqlParameterSource();
        input.addValue("p_id_depto", verReservasDepartamento.getId_depto());


        Map<String, Object> outMap = simpleJdbcCall.execute(input);

        return outMap;
    }

    public Map<String, Object> cancelarReserva(CancelarReserva cancelarReserva) {
        simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
                .withProcedureName("SP_CANCELAR_RESERVA");
        MapSqlParameterSource input = new MapSqlParameterSource();
        input.addValue("p_id_reserva", cancelarReserva.getId_reserva());
        input.addValue("p_id_depto", cancelarReserva.getId_depto());
        input.addValue("p_id_usuario", cancelarReserva.getId_usuario());


        Map<String, Object> outMap = simpleJdbcCall.execute(input);

        return outMap;
    }

    public Map<String, Object> listarTours(ListarTours listarTours) {
        simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
                .withProcedureName("SP_LISTAR_TOURS");
        MapSqlParameterSource input = new MapSqlParameterSource();
        input.addValue("p_id_depto", listarTours.getId_depto());


        Map<String, Object> outMap = simpleJdbcCall.execute(input);

        return outMap;
    }

    public Map<String, Object> agregarTour(AgregarTour agregarTour) {
        simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
                .withProcedureName("SP_AGREGAR_TOUR");
        MapSqlParameterSource input = new MapSqlParameterSource();
        input.addValue("p_nombre_tour", agregarTour.getNombre_tour());
        input.addValue("p_lugar", agregarTour.getLugar());
        input.addValue("p_descripcion", agregarTour.getDescripcion());
        input.addValue("p_hora_inicio", agregarTour.getHora_inicio());
        input.addValue("p_hora_termino", agregarTour.getHora_termino());
        input.addValue("p_precio", agregarTour.getPrecio());


        Map<String, Object> outMap = simpleJdbcCall.execute(input);

        return outMap;
    }

    public Map<String, Object> agendarTour(AgendarTour agendarTour) {
        simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
                .withProcedureName("SP_AGENDAR_TOUR");
        MapSqlParameterSource input = new MapSqlParameterSource();
        input.addValue("p_id_cliente", agendarTour.getId_cliente());
        input.addValue("p_id_reserva", agendarTour.getId_reserva());
        input.addValue("p_id_tour", agendarTour.getId_tour());
        input.addValue("p_cant_personas", agendarTour.getCant_personas());
        input.addValue("p_total", agendarTour.getTotal());
        input.addValue("p_fecha", agendarTour.getFecha());
        input.addValue("p_fecha_inicio", agendarTour.getFecha_inicio());
        input.addValue("p_fecha_termino", agendarTour.getFecha_termino());

        Map<String, Object> outMap = simpleJdbcCall.execute(input);

        return outMap;
    }

}

