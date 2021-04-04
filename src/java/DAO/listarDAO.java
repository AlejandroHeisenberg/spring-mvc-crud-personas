package DAO;

import Entidad.Persona;
import config.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

/**
 *
 * @author Alejandro Reyes
 */
public class listarDAO {

    JdbcTemplate jdbcTemplate;
    Conexion con = new Conexion();
    List datos;

    /**
     *
     * @return
     */
    public List listar() {
        String sql = "select * from persona";
        this.jdbcTemplate = new JdbcTemplate(con.conectar());
        datos = this.jdbcTemplate.queryForList(sql);
        return datos;
    }

    /**
     * Method INSERT
     */
    /**
     * @param DNI
     * @param nombres
     */
    public void insert(String DNI, String nombres) {
        this.jdbcTemplate = new JdbcTemplate(con.conectar());
        String sql = "insert into persona (DNI,nombres)values('" + DNI + "', '" + nombres + "')";
        this.jdbcTemplate.update(sql);
    }

    /**
     * public Persona buscarPersonaxID(int id) { final Persona p = new
     * Persona(); String sql = "select * from persona where id = " + id; return
     * (Persona) jdbcTemplate.query(sql, new ResultSetExtractor<Persona>() {
     * public Persona extractData(ResultSet rs) throws SQLException,
     * DataAccessException { if (rs.next()) { p.setDNI(rs.getString("DNI"));
     * p.setDNI(rs.getString("nombres")); } return p; } });
    }
     */
    /**
     * Method UPDATE
     */
    /**      *
     * @param dni
     * @param nombr
     * @param Id
     */
    public void Editar(int Id, String dni, String nombr) {
        this.jdbcTemplate = new JdbcTemplate(con.conectar());
        String sql = "update persona  set DNI='" + dni + "', nombres='" + nombr + "' where id = '" + Id + "'";
        this.jdbcTemplate.update(sql);
//        
    }
    /** Method of DELETE 
     * @param id 
*/
    public void eliminarPerson(int id) {
        this.jdbcTemplate = new JdbcTemplate(con.conectar());
        String sql = "delete from persona where id ='" + id + "'";
        this.jdbcTemplate.update(sql);
    }
}
