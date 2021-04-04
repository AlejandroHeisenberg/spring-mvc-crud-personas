/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Alejandro Reyes
 */
public class Persona {
    int id;
    String DNI;
    String nombres;

    /**
     *
     */
    public Persona() {
    }

    /**
     *
     * @param id
     * @param DNI
     * @param nombres
     */
    public Persona(int id, String DNI, String nombres) {
        this.id = id;
        this.DNI = DNI;
        this.nombres = nombres;
    }
    
    /**
     *
     * @return
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     *
     * @return
     */
    public String getDNI() {
        return DNI;
    }

    /**
     *
     * @param DNI
     */
    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    /**
     *
     * @return
     */
    public String getNombres() {
        return nombres;
    }

    /**
     *
     * @param nombres
     */
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    
}
