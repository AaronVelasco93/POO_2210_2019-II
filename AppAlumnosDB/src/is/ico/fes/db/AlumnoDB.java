/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package is.ico.fes.db;

import is.ico.fes.modelo.Alumno;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

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
    
    public Alumno buscaPorNumCta(String nc){
        Alumno resultado=null;
        String sql="SELECT * FROM alumno WHERE numCta=?;";
        try {
            PreparedStatement pstm=bd.getConn().prepareStatement(sql);
            pstm.setString(1, nc);
            ResultSet rst=pstm.executeQuery();
            if(rst.next()){
                resultado=new Alumno();
                resultado.setNombre(rst.getString(1));
                resultado.setPaterno(rst.getString(2));
                resultado.setMaterno(rst.getString(3));
                resultado.setEdad(rst.getInt(4));
                resultado.setNumCta(rst.getString(5));
                resultado.setCarrera(rst.getString(6));
                resultado.setTurno(rst.getString(7));
                resultado.setPromedio(rst.getFloat(8));
                resultado.setSemestre(rst.getInt(9));   
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        
        return resultado;
    }
    
    public boolean modificaAlumno(Alumno al){
        boolean resultado=false;
        String sql="UPDATE alumno set nombre=?, paterno=?"
                + ",materno=?,edad=?,carrera=?,turno=?"
                + ",promedio=?,semestre=? WHERE numCta=?;";
        try {
            PreparedStatement pstm=bd.getConn().prepareStatement(sql);
            pstm.setString(1, al.getNombre());
            pstm.setString(2, al.getPaterno());
            pstm.setString(3, al.getMaterno());
            pstm.setInt(4, al.getEdad());
            pstm.setString(5, al.getCarrera());
            pstm.setString(6, al.getTurno());
            pstm.setFloat(7, al.getPromedio());
            pstm.setInt(8, al.getSemestre());
            pstm.setString(9, al.getNumCta());
            int rowCount=pstm.executeUpdate();
            resultado=rowCount != 0;
        } catch (SQLException ex) {
          ex.printStackTrace();
        }
        
        return resultado;
    }

    public ArrayList<Alumno>  bucarTodos(){
        ArrayList<Alumno> als=new ArrayList<Alumno>();
        String sql="SELECT * FROM alumno;";
        try {
            Statement stm=bd.getConn().createStatement();
            ResultSet rst=stm.executeQuery(sql);
            while(rst.next()){
                als.add(new Alumno(
                            rst.getString(1),
                            rst.getString(2),
                            rst.getString(3),
                            rst.getInt(4),
                            rst.getString(5),
                            rst.getString(6),
                            rst.getString(7),
                            rst.getFloat(8),
                            rst.getInt(9)
                            ));
            }
            
        } catch (SQLException ex) {
          ex.printStackTrace();
        }
        
        
        return als;
    } 

}





