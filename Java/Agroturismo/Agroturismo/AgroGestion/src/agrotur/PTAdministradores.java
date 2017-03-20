package agrotur;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Rectangle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyAdapter;

import java.awt.event.KeyEvent;

import java.awt.event.MouseAdapter;

import java.awt.event.MouseEvent;

import java.sql.SQLException;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class PTAdministradores extends JPanel {
        
    TAdministradores ta = new TAdministradores();
    private JList listaAdministradores = new JList(ta.toArray());
    private JScrollPane jScrollPane1 = new JScrollPane();
    private JLabel etiuser = new JLabel();
    private JTextField usuario = new JTextField();
    private JLabel etiPassword = new JLabel();
    private JTextField password = new JTextField();
    private JPanel jPanel1 = new JPanel();
    private JButton botonNuevo = new JButton();
    private JButton botonBorrar = new JButton();
    private JPopupMenu jPopupMenu1 = new JPopupMenu();
    private JButton botonModificar = new JButton();
    public int numreg;
    private JButton botonGrabar = new JButton();
    private JButton botonCancelar = new JButton();
    public Administradores reg1;
    public boolean modificar=false;
    public boolean alta=false;
    public PTAdministradores() {
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }

    private void jbInit() throws Exception {
        this.setLayout( null );


        this.setSize(new Dimension(400, 227));
        listaAdministradores.addMouseListener(new MouseAdapter() {
                    public void mouseClicked(MouseEvent e) {
                        listaAdministradores_mouseClicked(e);
                    }
                });
        jScrollPane1.setBounds(new Rectangle(5, 15, 175, 105));
        jScrollPane1.setAutoscrolls(true);
        etiuser.setText("Nombre");
        etiuser.setBounds(new Rectangle(195, 20, 75, 20));
        usuario.setBounds(new Rectangle(255, 15, 105, 20));
        etiPassword.setText("Password");
        etiPassword.setBounds(new Rectangle(195, 50, 55, 20));
        password.setBounds(new Rectangle(255, 50, 105, 20));
        jPanel1.setBounds(new Rectangle(40, 145, 315, 35));
        jPanel1.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        botonNuevo.setText("Nuevo");
        botonNuevo.setSize(new Dimension(76, 23));
        botonNuevo.setPreferredSize(new Dimension(76, 23));
        botonNuevo.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        botonNuevo_actionPerformed(e);
                    }
                });
        botonBorrar.setText("Borrar");
        botonBorrar.setPreferredSize(new Dimension(76, 23));
        botonBorrar.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        botonBorrar_actionPerformed(e);
                    }
                });
        jPopupMenu1.setLabel("jPopupMenu1");
        botonModificar.setText("Modificar");
         botonModificar.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        botonModificar_actionPerformed(e);
                    }
                });
        botonGrabar.setText("Grabar");
        botonGrabar.setBounds(new Rectangle(195, 85, 75, 35));
        botonGrabar.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        botonGrabar_actionPerformed(e);
                    }
                });
        botonCancelar.setText("Cancelar");
        botonCancelar.setBounds(new Rectangle(285, 85, 75, 35));
        botonCancelar.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        botonCancelar_actionPerformed(e);
                    }
                });
        botonCancelar.setVisible(false);
        botonGrabar.setVisible(false);
        jPanel1.add(botonNuevo, null);
        jPanel1.add(botonModificar, null);
        jPanel1.add(botonBorrar, null);
        this.add(botonCancelar, null);
        this.add(botonGrabar, null);
        this.add(jPanel1, null);
        this.add(password, null);
        this.add(etiPassword, null);
        this.add(usuario, null);
        this.add(etiuser, null);
        jScrollPane1.getViewport().add(listaAdministradores, null);
        this.add(jScrollPane1, null);
        botonesoff();
        desactivacampos();
        mostrardatos();
    
    }

    private void listaAdministradores_mouseClicked(MouseEvent e) {
            if(!ta.hayRegistros())return;
            System.out.println(listaAdministradores.getSelectedIndex());
            reg1 = (Administradores)listaAdministradores.getSelectedValue();
            numreg=reg1.getNumeroRegistro();        
            botoneson();
            ta.irA(numreg);
            mostrardatos();
        
    }

    private void botonModificar_actionPerformed(ActionEvent e) {
            modificar=true;
            activacampos();
            botonesoff();
            botonGrabar.setVisible(true);
            botonCancelar.setVisible(true);
        
            }

    private void botonBorrar_actionPerformed(ActionEvent e) {
        ta.irA(numreg);
            ta.borrar();
            listaAdministradores.setListData(ta.toArray());
            ta.anterior();
            mostrardatos();
            
    }

    private void botonNuevo_actionPerformed(ActionEvent e) {
        botonesoff();
        botonGrabar.setVisible(true);
        botonCancelar.setVisible(true);
        usuario.setText("");
        password.setText("");
        alta=true;
       activacampos();
        
    }
    public void mostrardatos(){
        if (ta.hayRegistros()){
            usuario.setText(ta.getUsuario());
            password.setText(ta.getPass());
        }
        else {
            System.out.println("no hay datos en la base de datos");
            usuario.setText("");
            password.setText("");
            botonNuevo.setEnabled(true);
        }    
    }
    
    public void botoneson() {
        
        botonNuevo.setEnabled(true);
        botonModificar.setEnabled(true);
        botonBorrar.setEnabled(true);
    }
    public void botonesoff() {
        
        botonNuevo.setEnabled(false);
        botonModificar.setEnabled(false);
        botonBorrar.setEnabled(false);
    }

    private void botonCancelar_actionPerformed(ActionEvent e) {
        desactivacampos();
        botoneson();
        botonGrabar.setVisible(false);
        botonCancelar.setVisible(false);
        usuario.setText((reg1.usuario));
        password.setText((reg1.pass));
          
    }
    public void activacampos(){
        usuario.setEditable(true);
        password.setEditable(true);
    }
    public void desactivacampos(){
    usuario.setEditable(false);
    password.setEditable(false);
}

    private void botonGrabar_actionPerformed(ActionEvent e) {
        System.out.println(modificar);
       
        if (modificar==true) {
            System.out.println("dentro de modificiar");
            ta.irA(numreg);
            ta.setUsuario(usuario.getText());
            ta.setPass(password.getText());
            ta.modificar();
            listaAdministradores.setListData(ta.toArray());
            desactivacampos();
            modificar=false;
            botonGrabar.setVisible(false);
            botonCancelar.setVisible(false);
            botoneson();
        }
        else{
            if (alta==true){
                System.out.println(modificar);
                ta.setUsuario(usuario.getText());
                ta.setPass(password.getText());
                ta.altas();
                listaAdministradores.setListData(ta.toArray());
                desactivacampos();
                botonGrabar.setVisible(false); 
                botonCancelar.setVisible(false);
                botoneson();
                    
            
            }
        }
    }
}