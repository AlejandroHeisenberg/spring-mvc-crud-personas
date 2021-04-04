/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.listarDAO;
import Entidad.Persona;
import Entidad.PersonaValidation;
import com.sun.net.httpserver.HttpServer;
import config.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Alejandro Reyes
 */
@Controller
public class Controlador {

    private JdbcTemplate jdbcTemplate;
    PersonaValidation perValidar;

    /**
     *
     */
    public Controlador() {
        this.perValidar = new PersonaValidation();
        Conexion con = new Conexion();
        this.jdbcTemplate = new JdbcTemplate(con.conectar());
    }

    int id;
    List datos;
//select datos
//    @RequestMapping("index.htm")

//    public ModelAndView listar() {
//
//        String sql = "select * from persona";
//
//        datos = this.jdbcTemplate.queryForList(sql);
//        mav.addObject("lista", datos);
//        mav.setViewName("index");
//        return mav;
//    }

    /**
     *
     * @return
     */
    @RequestMapping("index.htm")
    public ModelAndView listar() {
        ModelAndView mav = new ModelAndView();
        listarDAO listDAO = new listarDAO();
        mav.addObject("lista", listDAO.listar());
        return mav;
    }

//insert datos

    /**
     *
     * @return
     */
    @RequestMapping(value = "agregar.htm", method = RequestMethod.GET)
    public ModelAndView Agregar() {
        ModelAndView mav = new ModelAndView();
        mav.addObject("formAddPersona", new Persona());
        mav.setViewName("agregar");
        return mav;
    }

    /**
     *
     * @param p
     * @param result
     * @param status
     * @return : Vista Model and view
     */
    @RequestMapping(value = "agregar.htm", method = RequestMethod.POST)
    public ModelAndView Agregar(
            @ModelAttribute("formAddPersona") Persona p,
            BindingResult result,
            SessionStatus status) {
        this.perValidar.validate(p, result);
        if (result.hasErrors()) {
            ModelAndView mav = new ModelAndView();
            mav.addObject("formAddPersona", new Persona());
            mav.setViewName("agregar");
            return mav;
        } else {
            ModelAndView mav = new ModelAndView();
            listarDAO listDAO = new listarDAO();
            String dni = p.getDNI();
            String nomb = p.getNombres();
            listDAO.insert(dni, nomb);
            mav.setViewName("redirect:/index.htm");
            return mav;
        }
    }

    /**
     * UPDATE
     *
     * @param request
     * @return : Vista Model and view
     */
//Update datos
    @RequestMapping(value = "editar.htm", method = RequestMethod.GET)
    public ModelAndView Editar(HttpServletRequest request) {
        ModelAndView mav = new ModelAndView();
//        listarDAO consultar = new listarDAO();
        int Id = Integer.parseInt(request.getParameter("id"));
        //String sql = "select * from persona where id = " + id;        
        Persona p = this.buscarPersonaxID(Id);
        //datos = this.jdbcTemplate.queryForList(sql);
        mav.addObject("listar", new Persona(Id, p.getDNI(), p.getNombres()));
        mav.setViewName("editar");
        return mav;
    }

    /**
     *
     * @param p
     * @param result
     * @param status
     * @return : Vista Model and view
     */
    @RequestMapping(value = "editar.htm", method = RequestMethod.POST)
    public ModelAndView Editar(
            @ModelAttribute("listar") Persona p,
            BindingResult result,
            SessionStatus status
    ) {
        this.perValidar.validate(p, result);
        if (result.hasErrors()) {
            ModelAndView mov = new ModelAndView();
            mov.addObject("listar", new Persona());
            mov.setViewName("editar");
            return mov;
        } else {
            ModelAndView mav = new ModelAndView();
            listarDAO listdao = new listarDAO();
            String dni = p.getDNI();
            String nom = p.getNombres();
            int Id = p.getId();
            listdao.Editar(Id, dni, nom);
            mav.setViewName("redirect:/index.htm");
            return mav;
        }
//        String sql = "update persona  set DNI=?, nombres=? where id = ?";
//        this.jdbcTemplate.update(sql, p.getDNI(), p.getNombres(), id);
//        return new ModelAndView("redirect:/index.htm");
    }

    /**
     *
     * @param id
     * @return
     */
    public Persona buscarPersonaxID(int id) {
        final Persona p = new Persona();
        String sql = "select * from persona where id = " + id;
        return (Persona) jdbcTemplate.query(sql, new ResultSetExtractor<Persona>() {
            public Persona extractData(ResultSet rs) throws SQLException, DataAccessException {
                if (rs.next()) {
                    p.setDNI(rs.getString("DNI"));
                    p.setNombres(rs.getString("nombres"));
                }
                return p;
            }
        });
    }
//Delete datos

    /**
     *
     *
     * @param request
     * @return : Vista Model and view
     */
    @RequestMapping("eliminar.htm")
    public ModelAndView Eliminar(HttpServletRequest request) {
        ModelAndView mav = new ModelAndView();
        id = Integer.parseInt(request.getParameter("id"));
        listarDAO listdao = new listarDAO();
        listdao.eliminarPerson(id);
//        String sql = "delete from persona where id =" + id;
//        this.jdbcTemplate.update(id);
        mav.setViewName("redirect:/index.htm");
        //return new ModelAndView("redirect:/index.htm");
        return mav;
    }
}
