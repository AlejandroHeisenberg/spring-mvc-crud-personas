/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 *
 * @author Alejandro Reyes
 */
public class Conexion {

    /**
     *
     * @return
     */
    public DriverManagerDataSource conectar() {
        DriverManagerDataSource dataSourse = new DriverManagerDataSource();
        dataSourse.setDriverClassName("com.mysql.jdbc.Driver");
        dataSourse.setUrl("jdbc:mysql://localhost:3306/registro");
        dataSourse.setUsername("root");
        dataSourse.setPassword("");
        return dataSourse;
    }
}
