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
public class ModeloTablaClientes implements TableModel {

    ArrayList<Cliente> datos;

    public ModeloTablaClientes() {
    }

    public ModeloTablaClientes(ArrayList<Cliente> datos) {
        this.datos = datos;
    }

    public ArrayList<Cliente> getDatos() {
        return datos;
    }

    public void setDatos(ArrayList<Cliente> datos) {
        this.datos = datos;
    }

    @Override
    public int getRowCount() {
        return datos.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public String getColumnName(int columnIndex) {
        String nombre = "";
        switch (columnIndex) {
            case 0:
                nombre = "Num. Cuenta";
                break;
            case 1:
                nombre = "Nombre";
                break;
            case 2:
                nombre = "Paterno";
                break;
            case 3:
                nombre = "Materno";
                break;
            case 4:
                nombre = "Balance";
                break;

        }

        return nombre;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return Integer.class;
            case 1:
                return String.class;
            case 2:
                return String.class;
            case 3:
                return String.class;
            case 4:
                return Float.class;
        }
        return String.class;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Cliente c = datos.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return c.getNumCuenta();
            case 1:
                return c.getNombre();
            case 2:
                return c.getPaterno();
            case 3:
                return c.getMaterno();
            case 4:
                return c.getBalance();
        }
        return null;
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
