package appverdura;

import java.awt.Dimension;
import java.awt.Rectangle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.event.MouseAdapter;

import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.security.MessageDigest;

import java.sql.SQLException;

public class PTCliente extends JPanel {
    TCliente tc = new TCliente();
    
    

    boolean esnuevo=false;
    
    private JLabel jLabel1 = new JLabel();
    private JLabel jLabel2 = new JLabel();
    private JTextArea cNombre = new JTextArea();
    private JTextArea cApellidos = new JTextArea();
    private JLabel jLabel3 = new JLabel();
    private JTextArea cDNI = new JTextArea();
    private JLabel jLabel4 = new JLabel();
    private JTextArea cEmail = new JTextArea();
    private JLabel jLabel5 = new JLabel();
    private JTextArea cTelefono = new JTextArea();
    private JLabel jLabel6 = new JLabel();
    private JTextArea cUsuario = new JTextArea();
    private JLabel jLabel7 = new JLabel();
    private JTextArea cpas = new JTextArea();
    private JButton palante = new JButton();
    private JButton patras = new JButton();
    private JButton nuevo = new JButton();
    private JCheckBox infoAct = new JCheckBox();
    private JLabel jLabel8 = new JLabel();
    private JLabel jLabel9 = new JLabel();
    private JCheckBox infoOf = new JCheckBox();
    //private JPanel jPanel1 = new JPanel();
    private JLabel jLabel10 = new JLabel();
    private JLabel lid = new JLabel();
   // private JPanel jPanel1 = new JPanel();
   // private JScrollPane jScrollPane1 = new JScrollPane();
    private JScrollPane jScrollPane2 = new JScrollPane();
    private JList lista = new JList();
    private JButton guardar = new JButton();
    private JButton canelar = new JButton();
    private JButton modificar = new JButton();
    private JButton borrar = new JButton();
    private JTextArea cBuscar = new JTextArea();
    private JButton buscar = new JButton();
    private JLabel jLabel11 = new JLabel();
    private ImageIcon busc = new ImageIcon(VGestionDatos.class.getResource("buscar.gif"));
    private JComboBox campos = new JComboBox(tc.toComoBoxSQL());

    public PTCliente() {
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        //muestra();
        //botones();
        actualizar();
        
    }

    private void jbInit() throws Exception {
        this.setLayout( null );
        this.setSize(new Dimension(508, 344));
        jLabel1.setText("Nombre");
        jLabel1.setBounds(new Rectangle(255, 25, 45, 25));
        jLabel2.setText("Apellidos");
        jLabel2.setBounds(new Rectangle(250, 60, 45, 20));
        cNombre.setBounds(new Rectangle(310, 25, 145, 25));
        cApellidos.setBounds(new Rectangle(310, 60, 170, 25));
        jLabel3.setText("DNI");
        jLabel3.setBounds(new Rectangle(275, 95, 20, 25));
        cDNI.setBounds(new Rectangle(310, 95, 140, 25));
        jLabel4.setText("e-mail");
        jLabel4.setBounds(new Rectangle(265, 130, 35, 25));
        cEmail.setBounds(new Rectangle(310, 130, 170, 25));
        jLabel5.setText("Telefono");
        jLabel5.setBounds(new Rectangle(250, 165, 45, 25));
        cTelefono.setBounds(new Rectangle(310, 165, 115, 25));
        jLabel6.setText("usuario");
        jLabel6.setBounds(new Rectangle(255, 200, 45, 20));
        cUsuario.setBounds(new Rectangle(310, 200, 110, 25));
        jLabel7.setText("contraseña");
        jLabel7.setBounds(new Rectangle(240, 235, 55, 20));
        cpas.setBounds(new Rectangle(310, 235, 170, 25));
        palante.setText("adelante");
        palante.setBounds(new Rectangle(410, 305, 75, 25));
        palante.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        palante(e);
                    }
                });
        patras.setText("atras");
        patras.setBounds(new Rectangle(20, 305, 60, 25));
        patras.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        patras(e);
                    }
                });
        nuevo.setText("Nuevo");
        nuevo.setBounds(new Rectangle(85, 305, 75, 25));
        nuevo.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        nuevo(e);
                    }
                });
        infoAct.setText("jCheckBox1");
        infoAct.setBounds(new Rectangle(105, 275, 15, 15));
        jLabel8.setText("info actividades");
        jLabel8.setBounds(new Rectangle(20, 270, 80, 20));
        jLabel9.setText("info ofertas");
        jLabel9.setBounds(new Rectangle(135, 270, 60, 20));
        infoOf.setText("jCheckBox2");
        infoOf.setBounds(new Rectangle(205, 275, 15, 15));
        jLabel10.setText("Id");
        jLabel10.setBounds(new Rectangle(255, 270, 15, 20));
        lid.setBounds(new Rectangle(275, 270, 25, 20));
        jScrollPane2.setBounds(new Rectangle(15, 80, 190, 185));
        lista.addMouseListener(new MouseAdapter() {
                    public void mouseClicked(MouseEvent e) {
                        listaAccion(e);
                    }
                });
        guardar.setText("Guardar");
        guardar.setBounds(new Rectangle(245, 305, 75, 25));
        guardar.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        guardar(e);
                    }
                });
        canelar.setText("Canelar");
        canelar.setBounds(new Rectangle(165, 305, 75, 25));
        canelar.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        canelar(e);
                    }
                });
        modificar.setText("modificar");
        modificar.setBounds(new Rectangle(325, 305, 80, 25));
        modificar.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        modificar(e);
                    }
                });
        borrar.setText("Borrar");
        borrar.setBounds(new Rectangle(325, 275, 75, 25));
        borrar.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        borrar(e);
                    }
                });
        cBuscar.setBounds(new Rectangle(20, 25, 135, 20));
        buscar.setBounds(new Rectangle(160, 20, 35, 25));
        jLabel11.setText("Buscar");
        jLabel11.setBounds(new Rectangle(20, 5, 40, 20));
        campos.setBounds(new Rectangle(15, 55, 190, 20));
      /*  campos.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        campos_actionPerformed(e);
                    }
                });*/
        this.add(campos, null);
        this.add(jLabel11, null);
        this.add(buscar, null);
        this.add(cBuscar, null);
        this.add(borrar, null);
        this.add(modificar, null);
        this.add(canelar, null);
        this.add(guardar, null);
        jScrollPane2.getViewport().add(lista, null);
        this.add(jScrollPane2, null);
        this.add(lid, null);
        this.add(jLabel10, null);
        this.add(infoOf, null);
        this.add(jLabel9, null);
        this.add(jLabel8, null);
        this.add(infoAct, null);
        this.add(nuevo, null);
        this.add(patras, null);
        this.add(palante, null);
        this.add(cpas, null);
        this.add(jLabel7, null);
        this.add(cUsuario, null);
        this.add(jLabel6, null);
        this.add(cTelefono, null);
        this.add(jLabel5, null);
        this.add(cEmail, null);
        this.add(jLabel4, null);
        this.add(cDNI, null);
        this.add(jLabel3, null);
        this.add(cApellidos, null);
        this.add(cNombre, null);
        this.add(jLabel2, null);
        this.add(jLabel1, null);
        buscar.setIcon(busc);
        buscar.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        buscar_actionPerformed(e);
                    }
                });

    }

    private void patras(ActionEvent e) {
        tc.anterior();
        muestra();
        
    }

    private void palante(ActionEvent e) {
        tc.siguiente();
        muestra();
    }
    
    public void muestra(){
        lid.setText(""+tc.getIdcliente());
        cNombre.setText(tc.getNombre());
        cApellidos.setText(tc.getApellido());
        cDNI.setText(tc.getDni());
        cEmail.setText(tc.getEmail());
        cTelefono.setText(tc.getTel());
        cUsuario.setText(tc.getUsu());
        
        /*try{
            
        MessageDigest md = MessageDigest.getInstance("MD5");
            
        cpas.setText(md.toString().concat(tc.getPas()));
        }
        catch(Exception ex){
            System.out.println(ex);
        }*/
        
        infoAct.setSelected(tc.isInfoa());
        infoOf.setSelected(tc.isInfoo());
        
        //lista.setListData(tc.toArray());
        
        botones();
        
    }


    private void nuevo(ActionEvent e) {
        esnuevo=true;
        //botones();
        muestra();
        
        lid.setText("");
        cNombre.setText("");
        cApellidos.setText("");
        cDNI.setText("");
        cEmail.setText("");
        cTelefono.setText("");
        cUsuario.setText("");
        cpas.setText("");
               
        infoAct.setSelected(true);
        infoOf.setSelected(true);
        
   
        
        
    }
    
    public void carga(){
        tc.setNombre(cNombre.getText());
        tc.setApellido(cApellidos.getText());
        tc.setDni(cDNI.getText());
        tc.setEmail(cEmail.getText());
        tc.setTel(cTelefono.getText());
        tc.setUsu(cUsuario.getText());
        tc.setPas(cpas.getText());
        
        //tablaRegimenes.setActivo(activo1.isSelected());
        
        tc.setInfoa(infoAct.isSelected());
        tc.setInfoo(infoOf.isSelected());
        
        
        
        
        
    }
    
    public void botones(){
       
        guardar.setVisible(false);
        canelar.setVisible(false);
        patras.setVisible(false);
        palante.setVisible(false);
        modificar.setVisible(false);
        nuevo.setVisible(false);
        borrar.setVisible(false);
        
        if(esnuevo){
            guardar.setVisible(true);
            canelar.setVisible(true);
        }
        else{
        //guardar.setVisible(false);
        //canelar.setVisible(false);
        patras.setVisible(true);
        palante.setVisible(true);
        modificar.setVisible(true);
        nuevo.setVisible(true);
        borrar.setVisible(true);
        }
        
        
        
        
        
        
        
        
    }
    
    
    
    public void actualizar(){
        //tc = new TCliente();
        lista.setListData(tc.toArray());
        muestra();        
    }

    private void guardar(ActionEvent e) {
     carga();
     tc.altas();
     tc.ultimo();
     tc.cargaDatos();
     
     esnuevo=false;
     actualizar();
        
        
        
        
        
        
        
       
        
        
        
    }

    private void canelar(ActionEvent e) {
        esnuevo=false;
        //botones();
        muestra();
        
        
        
        
        
        
    }


    private void modificar(ActionEvent e) {
        
        carga();
        tc.modificar();
        actualizar();
    }


    private void borrar(ActionEvent e) {
        tc.borrar();
        tc.ultimo();
        actualizar();
        
    }

    private void listaAccion(MouseEvent e) {
        tc.irA(((Cliente)lista.getSelectedValue()).getNumeroRegistro());
        //muestra();
        actualizar();

    }


    private void buscar_actionPerformed(ActionEvent e) {
        
        String campo=((DatosComboBox)campos.getSelectedItem()).getDatoAMostrar();
        
        //String campo = (String)campos.setSelectedItem(new DatosComboBox());
        
        //String campo = "nombre"; //Sacar campo de busqueda;
        String valorBuscado = cBuscar.getText();
        String filtro = "WHERE "+campo+" LIKE '%"+valorBuscado+"%'";
        tc = new TCliente(filtro);
        //muestra();
        actualizar();
        //renovar lista;
    }

    /*private void campos_actionPerformed(ActionEvent e) {
        
        
        
        
    }*/
}
