package agrotur;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.Rectangle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.io.File;

import javax.swing.ImageIcon;


public class PTRHabitaciones extends JPanel {
    String datoSeleccionado;
    THabitaciones thab = new THabitaciones();
    File f =new File("../imagenes");

    
    private JLabel id = new JLabel();
    private JLabel nhab = new JLabel();
    private JTextField textnom = new JTextField();
    private JLabel ocup = new JLabel();
    private JTextField textocup = new JTextField();
    private JLabel det = new JLabel();
    private JLabel pre = new JLabel();
    private JTextArea textpre = new JTextArea();
    private JLabel fot = new JLabel();
    private JButton atras = new JButton();
    private JButton alante = new JButton();
    private JTextArea idhab = new JTextArea();
    private JButton borr = new JButton();
    private JButton alta = new JButton();
    private JButton actua = new JButton();
    private JButton limp = new JButton();
    private JButton acept = new JButton();
    private JButton canc = new JButton();
    private JScrollPane jScrollPane1 = new JScrollPane();
    private JTextArea textdet = new JTextArea();
    public JComboBox cfotos = new JComboBox();
    private JButton botonfoto = new JButton();
    private ImageIcon imagenFoto=new ImageIcon();

    public PTRHabitaciones() {
        if(f.list().length>0)cfotos = new JComboBox(f.list());
        
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }

        ponDatos();
    }

    private void jbInit() throws Exception {
        this.setLayout( null );
        this.setSize(new Dimension(584, 349));
        this.setVisible(false);
        id.setText("ID");
        id.setBounds(new Rectangle(20, 20, 35, 15));
        nhab.setText("Nombre");
        nhab.setBounds(new Rectangle(65, 15, 65, 20));
        textnom.setBounds(new Rectangle(60, 40, 75, 25));
        ocup.setText("Ocupacion");
        ocup.setBounds(new Rectangle(65, 75, 65, 20));
        textocup.setBounds(new Rectangle(60, 105, 75, 25));
        det.setText("Detalles");
        det.setBounds(new Rectangle(25, 145, 60, 20));
        pre.setText("Precio");
        pre.setBounds(new Rectangle(160, 10, 65, 25));
        textpre.setBounds(new Rectangle(155, 40, 70, 25));
        fot.setText("Foto");
        fot.setBounds(new Rectangle(390, 65, 30, 20));
        atras.setText("<<");
        atras.setBounds(new Rectangle(150, 80, 50, 25));
        atras.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        atras(e);
                    }
                });
        alante.setText(">>");
        alante.setBounds(new Rectangle(210, 80, 50, 25));
        alante.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        alante(e);
                    }
                });
        idhab.setBounds(new Rectangle(10, 40, 35, 30));
        idhab.setFocusable(false);
        borr.setText("Borrar");
        borr.setBounds(new Rectangle(270, 170, 100, 25));
        borr.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        borr(e);
                    }
                });
        alta.setText("Alta");
        alta.setBounds(new Rectangle(270, 110, 100, 25));
        alta.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        alta(e);
                    }
                });
        actua.setText("Actualizar");
        actua.setBounds(new Rectangle(270, 140, 100, 25));
        actua.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        actua(e);
                    }
                });
        limp.setText("Limpiar");
        limp.setBounds(new Rectangle(270, 70, 100, 35));
        limp.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        limp(e);
                    }
                });
        acept.setText("Aceptar");
        acept.setBounds(new Rectangle(215, 215, 75, 25));
        acept.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        acept(e);
                    }
                });
        canc.setText("Cancelar");
        canc.setBounds(new Rectangle(300, 215, 80, 25));
        canc.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        canc(e);
                    }
                });
        jScrollPane1.getViewport().add(textdet, null);
        //this.add(jList1, null);
        this.add(botonfoto, null);
        this.add(cfotos, null);
        this.add(jScrollPane1, null);
        this.add(canc, null);
        this.add(acept, null);
        this.add(limp, null);
        this.add(actua, null);
        this.add(alta, null);
        this.add(borr, null);
        this.add(idhab, null);
        this.add(alante, null);
        this.add(atras, null);
        this.add(fot, null);
        this.add(textpre, null);
        this.add(pre, null);
        this.add(det, null);
        this.add(textocup, null);
        this.add(ocup, null);
        this.add(textnom, null);
        this.add(nhab, null);
        this.add(id, null);
        acept.setVisible(false); 
        canc.setVisible(false);
        jScrollPane1.setBounds(new Rectangle(20, 170, 170, 75));
        cfotos.setBounds(new Rectangle(205, 280, 195, 35));
        cfotos.setForeground(Color.red);
        cfotos.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        ctfotos(e);
                    }
                });
        botonfoto.setBounds(new Rectangle(385, 90, 200, 180));
        botonfoto.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        botonfoto.setFocusable(false);
        botonfoto.setFocusPainted(false);
        botonfoto.setRequestFocusEnabled(false);
        botonfoto.setVerifyInputWhenFocusTarget(false);
        botonfoto.setBorderPainted(false);
        botonfoto.setContentAreaFilled(false);
        botonfoto.setMargin(new Insets(0, 0, 0, 0));
        botonfoto.setIconTextGap(0);
        //jList1.setBounds(new Rectangle(85, 115, 0, 0));
    }
    
    

    private void atras(ActionEvent e) {
        
        thab.anterior();
        thab.cargaDatos();
        ponDatos();
    }

    private void alante(ActionEvent e) {
        
    thab.siguiente();
    thab.cargaDatos();
    ponDatos();
    
    }
    
    public void ponDatos(){
        
    //de la base de datos al panel
        
    idhab.setText(""+thab.getId_habitaciones());
    textnom.setText(thab.getNombre_habitacion());
    textpre.setText(""+thab.getPrecio());
    textdet.setText(thab.getDetalles());
    textocup.setText(""+thab.getOcupacion_max());
        
    //botonfoto.setIcon(new ImageIcon(thab.getFoto()));
   
   
    botonfoto.setIcon(new ImageIcon("../imagenes/"+thab.getFoto()));
    botonfoto.setPressedIcon(new ImageIcon("../imagenes/"+thab.getFoto()));    //textfot.setText(thab.getFoto());
    cfotos.setSelectedItem(thab.getFoto());
    //tablaRegimenes.setPrecio(Float.parseFloat(precio4.getText()));;
    
    }
    
  
    public void enviarDatos(){
        //pon los datos en la base de datos
    
     
    thab.setNombre_habitacion(textnom.getText());
    thab.setDetalles(textdet.getText());
    thab.setPrecio(Float.parseFloat(textpre.getText()));
    thab.setOcupacion_max(Integer.parseInt(textocup.getText()));
    thab.setFoto(cfotos.getSelectedItem().toString());
        
    // tablaRegimenes.setPrecio(Float.parseFloat(precio4.getText()));;
    //thab.setFoto(textfot.getText());
    
    
     
    }
    


    private void borr(ActionEvent e) {
        thab.borrar();
        ponDatos();
    }

    private void alta(ActionEvent e) {
        limpiar();
        //enviarDatos();
        //ponDatos();
        
        //limpiar();
        acept.setVisible(true);
        canc.setVisible(true);
            
    }

    private void actua(ActionEvent e) {
        
        enviarDatos();
        //ponDatos();
        /*thab.rs.updateString("nombre_habitacion");
        thab.rs.updateString("detalles");*/
        //thab.cargaDatosRS();
        thab.modificar();
        
    }

    private void limp(ActionEvent e) {
        
    }

    private void limpiar(){
        textnom.setText("");
        textpre.setText("");
        textdet.setText("");
        textocup.setText("");
        //textfot.setText("");
    }
    private void acept(ActionEvent e) {
        
        enviarDatos();
        thab.altas();
        ponDatos();
        //thab.altas();
        //thab.cargaDatos();
        acept.setVisible(false);
        canc.setVisible(false);
    }

    private void canc(ActionEvent e) {
        //thab.primero();
        ponDatos();
        canc.setVisible(false);
        acept.setVisible(false);
        
    }

    
    private void ctfotos(ActionEvent e) {
       // String datoSeleccionado = (String)cfotos.getSelectedItem();
        datoSeleccionado = (String)cfotos.getSelectedItem();
        botonfoto.setIcon(new ImageIcon("../imagenes/"+datoSeleccionado));

        botonfoto.setPressedIcon(new ImageIcon("../imagenes/"+datoSeleccionado));
    
        
    }
}

//Da Error si no hay datos dados de alta