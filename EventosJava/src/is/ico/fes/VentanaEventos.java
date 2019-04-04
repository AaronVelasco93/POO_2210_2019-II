/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package is.ico.fes;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.HeadlessException;
import java.awt.Label;
import java.awt.TextField;

/**
 *
 * @author Usuario-16
 */
public class VentanaEventos extends Frame {
    TextField caja;
    Button boton;
    Label etiqueta;
    FlowLayout layout;
    EventoSimple evento;  
    EventosRaton evtRaton;
    public VentanaEventos() throws HeadlessException {
        setSize(600, 400);
        layout=new FlowLayout();
        setLayout(layout);
        caja=new TextField("0", 10);
        boton=new Button("Saludar");
        etiqueta=new Label("gg wp");
        add(caja);
        add(boton);
        add(etiqueta);
        setVisible(true);
        evento =new EventoSimple();
        evtRaton=new EventosRaton();
        boton.addMouseListener(evtRaton);
        boton.addActionListener(evento);
        caja.addActionListener(evento);
        this.addMouseListener(evtRaton);
        caja.addMouseListener(evtRaton);
        etiqueta.addMouseListener(evtRaton);
        
    }
    
}
