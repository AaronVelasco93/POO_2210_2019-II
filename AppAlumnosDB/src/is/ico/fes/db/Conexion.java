/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package is.ico.fes.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usuario-16
 */
public class Conexion {
private String url;
private String baseDatos;
private Connection conn;

    public Conexion() {
        try {
            url="jdbc:sqlite:";
            baseDatos="alumnos.db";
            conn=DriverManager.getConnection(url+baseDatos);
        } catch (Exception e) {
            System.out.println("Error:"+e.toString());
        }
    }

    public Conexion(String link, String archivo) {
        this.url = link;
        this.baseDatos = archivo;
        try {
            conn=DriverManager.getConnection(link+archivo);
        } catch (Exception e) {
            System.out.println("Error:"+e.toString());
        }
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getBaseDatos() {
        return baseDatos;
    }

    public void setBaseDatos(String baseDatos) {
        this.baseDatos = baseDatos;
    }

    public Connection getConn() {
        return conn;
    }

    public void setConn(Connection conn) {
        this.conn = conn;
    }
    
    public static void main(String[] args) {
        String crea="CREATE database alumnos;";
        Conexion c=new Conexion();
    try {
        boolean res=c.getConn().createStatement().execute(crea);
        if(res)System.out.println("OK");
    } catch (SQLException ex) {
        System.out.println("Error:"+ex.toString());
    }
        
    }


}
