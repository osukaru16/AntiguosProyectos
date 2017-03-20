package agrotur;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Rectangle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.Vector;

import javax.swing.DebugGraphics;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ImageIcon;

public class PTReservaActividad extends JPanel {
    
    TReservaActividad tablaReservaActividad = new TReservaActividad();
    TCliente client = new TCliente();
    
    private boolean regnuevo = false;
    private boolean regmodificado = false;


    private JLabel etiqActividad = new JLabel();
    private JLabel etiqCliente = new JLabel();
    private JLabel etiqPlazas = new JLabel();
    private JLabel etiqPrecio = new JLabel();
    private JTextField campoIdResAct = new JTextField();
    private JTextField campoPlazas = new JTextField();
    private JTextField campoPrecio = new JTextField();
    private JButton Anterior = new JButton();
    private JButton Siguiente = new JButton();
    private JButton Nuevo = new JButton();
    private JButton Borrar = new JButton();
    private JButton Grabar = new JButton();
    private JButton Cancelar = new JButton();
    private JButton Modificar = new JButton();
    private Vector palCombo = ApoyoReservaActividades.toVector();
    private JComboBox comboActividades = new JComboBox(palCombo);
    private JList listaReservasAct = new JList(tablaReservaActividad.toArray());
    private Cliente []  arrcli= client.toArray();
    
    private JComboBox comboClientes = new JComboBox(arrcli);


    public PTReservaActividad() {
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        cargaDatos();
        comprobarBotones();
    }

    private void jbInit() throws Exception {
        this.setLayout( null );
        this.setForeground(new Color(165, 198, 255));
        this.setBackground(new Color(82, 198, 255));
        this.setSize(new Dimension(435, 300));
        etiqActividad.setText("Actividad");
        etiqActividad.setBounds(new Rectangle(40, 120, 65, 15));
        etiqActividad.setFont(new Font("Dialog", 1, 14));
        etiqActividad.setForeground(Color.white);
        etiqCliente.setText("Cliente");
        etiqCliente.setBounds(new Rectangle(40, 145, 55, 15));
        etiqCliente.setFont(new Font("Dialog", 1, 14));
        etiqCliente.setForeground(Color.white);
        etiqPlazas.setText("Plazas");
        etiqPlazas.setBounds(new Rectangle(40, 170, 45, 15));
        etiqPlazas.setFont(new Font("Dialog", 1, 14));
        etiqPlazas.setForeground(Color.white);
        etiqPrecio.setText("Precio");
        etiqPrecio.setBounds(new Rectangle(40, 195, 45, 15));
        etiqPrecio.setFont(new Font("Dialog", 1, 14));
        etiqPrecio.setForeground(Color.white);
        campoIdResAct.setBounds(new Rectangle(5, 275, 40, 20));
        campoPlazas.setBounds(new Rectangle(155, 170, 40, 20));
        campoPrecio.setBounds(new Rectangle(155, 195, 55, 20));
        Anterior.setText("Anterior");
        Anterior.setBounds(new Rectangle(15, 240, 80, 25));
        Anterior.setFont(new Font("Dialog", 1, 11));
        Anterior.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        Anterior_actionPerformed(e);
                    }
                });
        Siguiente.setText("Siguiente");
        Siguiente.setBounds(new Rectangle(90, 240, 85, 25));
        Siguiente.setFont(new Font("Dialog", 1, 11));
        Siguiente.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        Siguiente_actionPerformed(e);
                    }
                });
        Nuevo.setText("Nuevo");
        Nuevo.setBounds(new Rectangle(255, 240, 71, 23));
        Nuevo.setFont(new Font("Dialog", 1, 11));
        Nuevo.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        Nuevo_actionPerformed(e);
                    }
                });
        Borrar.setText("Borrar");
        Borrar.setBounds(new Rectangle(180, 240, 71, 23));
        Borrar.setFont(new Font("Dialog", 1, 11));
        Borrar.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        Borrar_actionPerformed(e);
                    }
                });
        Grabar.setText("Grabar");
        Grabar.setBounds(new Rectangle(240, 270, 71, 23));
        Grabar.setFont(new Font("Dialog", 1, 11));
        Grabar.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        Grabar_actionPerformed(e);
                    }
                });
        Cancelar.setText("Cancelar");
        Cancelar.setBounds(new Rectangle(320, 270, 80, 25));
        Cancelar.setFont(new Font("Dialog", 1, 11));


        Cancelar.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        Cancelar_actionPerformed(e);
                    }
                });
        
        
        Modificar.setText("Modificar");
        Modificar.setBounds(new Rectangle(335, 240, 90, 25));
        Modificar.setFont(new Font("Dialog", 1, 11));
        Modificar.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        Modificar_actionPerformed(e);
                    }
                });
        comboActividades.setBounds(new Rectangle(155, 115, 265, 25));
        comboActividades.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        comboActividades_actionPerformed(e);
                    }
                });
        listaReservasAct.setBounds(new Rectangle(25, 10, 395, 95));
        comboClientes.setBounds(new Rectangle(155, 140, 265, 25));
        this.add(comboClientes, null);
        this.add(listaReservasAct, null);
        this.add(comboActividades, null);
        this.add(Modificar, null);
        
        this.add(Cancelar, null);
        this.add(Grabar, null);
        this.add(Borrar, null);
        this.add(Nuevo, null);
        this.add(Siguiente, null);
        this.add(Anterior, null);
        this.add(campoPrecio, null);
        this.add(campoPlazas, null);
        this.add(campoIdResAct, null);
        this.add(etiqPrecio, null);
        this.add(etiqPlazas, null);
        this.add(etiqCliente, null);
        this.add(etiqActividad, null);
    }

    private void icono_actionPerformed(ActionEvent e) {
    }

    private void Anterior_actionPerformed(ActionEvent e) {
        tablaReservaActividad.anterior();
        cargaDatos();
        comprobarBotones();
        
    }

    private void Siguiente_actionPerformed(ActionEvent e) {
        tablaReservaActividad.siguiente();
        cargaDatos();
        comprobarBotones();
        
    }

    private void Borrar_actionPerformed(ActionEvent e) {
        tablaReservaActividad.borrar();
        cargaDatos();
        comprobarBotones();
        
    }

    private void Nuevo_actionPerformed(ActionEvent e) {
        limpiaCampos();
        regnuevo = true;
        comprobarBotones();
    }

    private void Grabar_actionPerformed(ActionEvent e) {  
        cargaDatos_a_Tabla();
        if (regnuevo) tablaReservaActividad.altas();
        if (regmodificado) tablaReservaActividad.modificar();
        cargaDatos();
        regnuevo=false;
        regmodificado=false;
        comprobarBotones();
    }

    private void Cancelar_actionPerformed(ActionEvent e) {
        regnuevo = false;
        regmodificado = false;
        cargaDatos();
        comprobarBotones();
    }


    private void Modificar_actionPerformed(ActionEvent e) {
    
        regmodificado = true;
        comprobarBotones();
    }
   
   
    private void cargaDatos(){
        
        tablaReservaActividad.contarResultados();
        if(tablaReservaActividad.hayRegistros()){
        campoIdResAct.setText(""+tablaReservaActividad.getIdresact());
        int id =tablaReservaActividad.getActividad();

        for(int c=0;c<palCombo.size();c++){
            if (((ApoyoReservaActividades)palCombo.get(c)).getIdActividadPro()==id){
                comboActividades.setSelectedItem(palCombo.get(c));
                break;
            }
        }
        int idcli =tablaReservaActividad.getCliente();
        
        for(int c=0;c<arrcli.length;c++){
                if (Integer.parseInt(arrcli[c].getIdcli())==idcli){
                    comboClientes.setSelectedItem(arrcli[c]);
                    break;
                }
           }

         
        //campoCliente.setText(""+tablaReservaActividad.getCliente());
        campoPlazas.setText(""+tablaReservaActividad.getPlazas());
        campoPrecio.setText(""+tablaReservaActividad.getPrecio());
        }
        else{
        
       campoIdResAct.setText("0");
       
      // campoCliente.setText("0");
       campoPlazas.setText("0");
       campoPrecio.setText("0.0");   
            
            
            }
        }
    
        
    private void cargaDatos_a_Tabla(){
        
   int actProp = ((ApoyoReservaActividades)comboActividades.getSelectedItem()).getIdActividadPro();
   
   
       System.out.println(actProp);
    tablaReservaActividad.setActividad(actProp);
    
    int idClient = Integer.parseInt(((Cliente)comboClientes.getSelectedItem()).getIdcli());
    
    tablaReservaActividad.setCliente(idClient);
   
    tablaReservaActividad.setPlazas(Integer.parseInt(campoPlazas.getText()));
    tablaReservaActividad.setPrecio(Float.parseFloat(campoPrecio.getText()));
             
   }

    private void limpiaCampos(){
           
          // if (!tablaReservaActividad.hayRegistros()) campoIdResAct.setText("0");
        
        //PROBLEMA: SI LA TABLA ESTA VACIA, AL HACER UN NUEVO, NO SE COMO TRATAR EL ID
        //PROBLEMA CON ID Y CON LOS BOTONES
        
            
            campoPlazas.setText("0");
            campoPrecio.setText("0.0");
              
        }

    private void comprobarBotones(){
        Anterior.setEnabled(true);
        Siguiente.setEnabled(true);
        Borrar.setEnabled(false);
        Nuevo.setEnabled(true);
        Grabar.setEnabled(false);
        Cancelar.setEnabled(false);
        Modificar.setEnabled(false);
        
        if (tablaReservaActividad.hayRegistros()){
            Borrar.setEnabled(true);
            Modificar.setEnabled(true);
        }

            if (!tablaReservaActividad.hayRegistros()){
                Siguiente.setEnabled(false);
                Anterior.setEnabled(false);
            }



        if (tablaReservaActividad.isPrimero()) Anterior.setEnabled(false);
           
        if (tablaReservaActividad.isUltimo()) Siguiente.setEnabled(false);
        
        if ((regnuevo)||(regmodificado)){
            
                Anterior.setEnabled(false);
                Siguiente.setEnabled(false);
                Borrar.setEnabled(false);
                Grabar.setEnabled(true);
                Cancelar.setEnabled(true);     
                Nuevo.setEnabled(false);
                Modificar.setEnabled(false);
            
            
            }
        
        }


    private void comboActividades_actionPerformed(ActionEvent e) {
       campoPrecio.setText(""+((ApoyoReservaActividades)comboActividades.getSelectedItem()).getPrecio());
        
    }
}
