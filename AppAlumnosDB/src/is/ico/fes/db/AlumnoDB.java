/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package is.ico.fes.db;

import is.ico.fes.modelo.Alumno;
import java.sql.PreparedStatement;

/**
 *
 * @author Usuario-16
 */
public class AlumnoDB {
    private Conexion bd;

    public AlumnoDB() {
        bd=new Conexion();
    }
    
    public boolean insertarAlumno(Alumno al){
        boolean resultado=false;
        try {
            String sql="INSERT INTO alumno values(?,?,?,?,?,?,?,?,?);";
            PreparedStatement stm=bd.getConn().prepareStatement(sql);
            stm.setString(1, al.getNombre());
            stm.setString(2, al.getPaterno());
            stm.setString(3, al.getMaterno());
            stm.setInt(4, al.getEdad());
            stm.setString(5, al.getNumCta());
            stm.setString(6, al.getCarrera());
            stm.setString(7, al.getTurno());
            stm.setFloat(8, al.getPromedio());
            stm.setInt(9, al.getSemestre());
            int contadorModif=stm.executeUpdate();
            resultado=contadorModif != 0;
        } catch (Exception e) {
            System.out.println("Error al insertar"+e.toString());
        }
        return resultado;
    }
    
}
