/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package is.ico.fes.vista;

import is.ico.fes.modelo.Cliente;
import is.ico.fes.modelo.ModeloTablaClientes;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author Usuario-16
 */
public class VentanaClientes extends JFrame {

    private JTable tabla;
    private JPanel panel;
    private ModeloTablaClientes modelo;

    public VentanaClientes() throws HeadlessException {
        ArrayList<Cliente> carteraClientes
                = new ArrayList<Cliente>();

        carteraClientes.add(new Cliente(345, "Jesús",
                "Hernández", "Cabrera", 98765.43f));
        carteraClientes.add(new Cliente(111, "Maria",
                "Perez", "Gómez", 98765.43f));
        modelo = new ModeloTablaClientes(carteraClientes);
        carteraClientes.add(new Cliente(345, "Jesús",
                "Hernández", "Cabrera", 98765.43f));
        carteraClientes.add(new Cliente(111, "Maria",
                "Perez", "Gómez", 98765.43f));
        modelo = new ModeloTablaClientes(carteraClientes);
        carteraClientes.add(new Cliente(345, "Jesús",
                "Hernández", "Cabrera", 98765.43f));
        carteraClientes.add(new Cliente(111, "Maria",
                "Perez", "Gómez", 98765.43f));
        modelo = new ModeloTablaClientes(carteraClientes);
        carteraClientes.add(new Cliente(345, "Jesús",
                "Hernández", "Cabrera", 98765.43f));
        carteraClientes.add(new Cliente(111, "Maria",
                "Perez", "Gómez", 98765.43f));
        modelo = new ModeloTablaClientes(carteraClientes);
        carteraClientes.add(new Cliente(345, "Jesús",
                "Hernández", "Cabrera", 98765.43f));
        carteraClientes.add(new Cliente(111, "Maria",
                "Perez", "Gómez", 98765.43f));
        modelo = new ModeloTablaClientes(carteraClientes);
        carteraClientes.add(new Cliente(345, "Jesús",
                "Hernández", "Cabrera", 98765.43f));
        carteraClientes.add(new Cliente(111, "Maria",
                "Perez", "Gómez", 98765.43f));
        modelo = new ModeloTablaClientes(carteraClientes);
        carteraClientes.add(new Cliente(345, "Jesús",
                "Hernández", "Cabrera", 98765.43f));
        carteraClientes.add(new Cliente(111, "Maria",
                "Perez", "Gómez", 98765.43f));
        modelo = new ModeloTablaClientes(carteraClientes);
        carteraClientes.add(new Cliente(345, "Jesús",
                "Hernández", "Cabrera", 98765.43f));
        carteraClientes.add(new Cliente(111, "Maria",
                "Perez", "Gómez", 98765.43f));
        modelo = new ModeloTablaClientes(carteraClientes);
        carteraClientes.add(new Cliente(345, "Jesús",
                "Hernández", "Cabrera", 98765.43f));
        carteraClientes.add(new Cliente(111, "Maria",
                "Perez", "Gómez", 98765.43f));
        modelo = new ModeloTablaClientes(carteraClientes);
        carteraClientes.add(new Cliente(345, "Jesús",
                "Hernández", "Cabrera", 98765.43f));
        carteraClientes.add(new Cliente(111, "Maria",
                "Perez", "Gómez", 98765.43f));
        carteraClientes.add(new Cliente(345, "Jesús",
                "Hernández", "Cabrera", 98765.43f));
        carteraClientes.add(new Cliente(111, "Maria",
                "Perez", "Gómez", 98765.43f));
        modelo = new ModeloTablaClientes(carteraClientes);
        carteraClientes.add(new Cliente(345, "Jesús",
                "Hernández", "Cabrera", 98765.43f));
        carteraClientes.add(new Cliente(111, "Maria",
                "Perez", "Gómez", 98765.43f));
        modelo = new ModeloTablaClientes(carteraClientes);
        carteraClientes.add(new Cliente(345, "Jesús",
                "Hernández", "Cabrera", 98765.43f));
        carteraClientes.add(new Cliente(111, "Maria",
                "Perez", "Gómez", 98765.43f));
        modelo = new ModeloTablaClientes(carteraClientes);
        carteraClientes.add(new Cliente(345, "Jesús",
                "Hernández", "Cabrera", 98765.43f));
        carteraClientes.add(new Cliente(111, "Maria",
                "Perez", "Gómez", 98765.43f));
        modelo = new ModeloTablaClientes(carteraClientes);
        carteraClientes.add(new Cliente(345, "Jesús",
                "Hernández", "Cabrera", 98765.43f));
        carteraClientes.add(new Cliente(111, "Maria",
                "Perez", "Gómez", 98765.43f));
        modelo = new ModeloTablaClientes(carteraClientes);
        carteraClientes.add(new Cliente(345, "Jesús",
                "Hernández", "Cabrera", 98765.43f));
        carteraClientes.add(new Cliente(111, "Maria",
                "Perez", "Gómez", 98765.43f));
        modelo = new ModeloTablaClientes(carteraClientes);
        modelo = new ModeloTablaClientes(carteraClientes);

        tabla = new JTable(modelo);
        panel = (JPanel) this.getContentPane();
        panel.setLayout(new FlowLayout());
        panel.add(new JScrollPane(tabla));
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }

        });
        this.setSize(600, 400);
        this.setVisible(true);
        tabla.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "Ren:"+tabla.getSelectedRow());
            }
            
        });

    }

}
