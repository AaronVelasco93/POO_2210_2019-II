/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package is.ico.fes.modelo;

import java.util.ArrayList;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

/**
 *
 * @author Usuario-16
 */
public class ModeloTablaAlumno implements TableModel{
    ArrayList<Alumno> data;

    public ModeloTablaAlumno() {
        data=new ArrayList<Alumno>();
    }

    public ModeloTablaAlumno(ArrayList<Alumno> data) {
        this.data = data;
    }
    
    @Override
    public int getRowCount() {
     return data.size();
    }

    @Override
    public int getColumnCount() {
     return 9;   
    }

    @Override
    public String getColumnName(int columnIndex) {
      String nombre="";
      switch(columnIndex){
          case 0:
              nombre="Nombre";
              break;
          case 1:
              nombre="Paterno";
              break;
          case 2:
              nombre="Materno";
              break;
          case 3:
              nombre="Edad";
              break;
          case 4:
              nombre="NumCta";
              break;
          case 5:
              nombre="Carrera";
              break;
          case 6:
              nombre="Turno";
              break;
          case 7:
              nombre="Promedio";
              break;
          case 8:
              nombre="Semestre";
              break;
          default:
              nombre="NA";
          
      }
      return nombre;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
       switch(columnIndex){
           case 0:
               return String.class;
           case 1:
               return String.class;
           case 2:
               return String.class;
           case 3:
               return Integer.class;
           case 4:
               return String.class;
           case 5:
               return String.class;
           case 6:
               return String.class;
           case 7:
               return Float.class;
           case 8:
               return Integer.class;
               
       }
       return String.class;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Alumno a=data.get(rowIndex);
        switch(columnIndex){
            case 0:
                return a.getNombre();
            case 1:
                return a.getPaterno();
            case 2:
                return a.getMaterno();
            case 3:
                return a.getEdad();
            case 4:
                return a.getNumCta();
            case 5:
                return a.getCarrera();
            case 6:
                return a.getTurno();
            case 7:
                return a.getPromedio();
            case 8:
                return a.getSemestre();
            default:
                return null;
                
        }
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
  
    }

    @Override
    public void addTableModelListener(TableModelListener l) {
    }

    @Override
    public void removeTableModelListener(TableModelListener l) {
    }
    
}
