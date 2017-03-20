package agrotur;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;


public class PTActividades extends JPanel {
    private TActividades ta = new TActividades();
    File f =new File("../ImagenesA");

    private JScrollPane jScrollPane1 = new JScrollPane();
    private JList jList1 = new JList(ta.toArray());
    

    
    TActividades tablaActividades = new TActividades();
    
    private boolean esNuevo=false;    
    private JLabel jLabel1 = new JLabel();
    private JLabel jLabel2 = new JLabel();
    private JTextField nombreText = new JTextField();
    private JLabel jLabel3 = new JLabel();
    private JLabel jLabel4 = new JLabel();
    private JLabel jLabel5 = new JLabel();
    private JTextArea descripcionText = new JTextArea();
    private JLabel jLabel6 = new JLabel();
    private JTextField precioText = new JTextField();
    private JButton jButton1 = new JButton();
    private JButton jButton2 = new JButton();
    private JTextField idText = new JTextField();
    private JButton atrasB = new JButton();
    private JButton adelanteB = new JButton();
    private JButton nuevoB = new JButton();
    private JButton grabarB = new JButton();
    private JButton cancelarB = new JButton();
    private JButton borrarB = new JButton();
    private JButton actualizarB = new JButton();
    private JButton modificarB = new JButton();
    private JLabel jLabel7 = new JLabel();
    private JButton jButton3 = new JButton();
    private JButton image = new JButton();
    private JComboBox jComboBox1 = new JComboBox();
    // private ImageIcon imagen= new ImageIcon();
    public PTActividades() {
        if(f.list().length>0)jComboBox1 = new JComboBox(f.list());
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        muestraDatos();
        
        
    }
    private void jbInit() throws Exception {
        this.setLayout( null );
        this.setSize(new Dimension(682, 246));
        this.setDoubleBuffered(false);
        jScrollPane1.setBounds(new Rectangle(15, 35, 210, 65));

        jList1.addListSelectionListener(new ListSelectionListener() {
                    public void valueChanged(ListSelectionEvent e) {
                        jList1_mouseClicked(e);
                    }
                });
        jScrollPane1.setBounds(new Rectangle(20, 15, 145, 155));
        jLabel1.setText("jLabel1");
        jLabel2.setText("nombre");
        jLabel2.setBounds(new Rectangle(175, 45, 55, 25));
        jLabel2.setHorizontalTextPosition(SwingConstants.CENTER);
        jLabel2.setHorizontalAlignment(SwingConstants.CENTER);
        nombreText.setBounds(new Rectangle(255, 45, 120, 25));
        jLabel3.setText("descripcion");
        jLabel3.setBounds(new Rectangle(175, 80, 60, 20));
        jLabel3.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel3.setHorizontalTextPosition(SwingConstants.CENTER);
        jLabel4.setText("id_actividades");
        jLabel4.setBounds(new Rectangle(155, 10, 100, 25));
        jLabel4.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel4.setHorizontalTextPosition(SwingConstants.CENTER);
        jLabel5.setText("foto");
        jLabel5.setBounds(new Rectangle(160, 125, 85, 20));
        jLabel5.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel5.setHorizontalTextPosition(SwingConstants.CENTER);
        descripcionText.setBounds(new Rectangle(255, 80, 120, 25));
        jLabel6.setText("precio");
        jLabel6.setBounds(new Rectangle(195, 165, 50, 25));
        jLabel6.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel6.setHorizontalTextPosition(SwingConstants.CENTER);
        precioText.setBounds(new Rectangle(255, 165, 60, 25));
        jButton1.setText("jButton1");
        jButton1.setSize(new Dimension(403, 303));
        jButton2.setText("actualizar");
        jButton2.setBounds(new Rectangle(40, 185, 85, 25));


        idText.setBounds(new Rectangle(255, 10, 45, 25));
        idText.setFocusable(false);
        atrasB.setText("<<");
        atrasB.setBounds(new Rectangle(5, 175, 50, 20));
        atrasB.addActionListener(new ActionListener() {
                   public void actionPerformed(ActionEvent e) {
                        atras(e);
                    }
                });
        adelanteB.setText(">>");
        adelanteB.setBounds(new Rectangle(140, 175, 50, 20));
        adelanteB.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        adelante(e);
                    }
                });
        nuevoB.setText("nuevo");
        nuevoB.setBounds(new Rectangle(10, 200, 65, 20));
        nuevoB.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        nuevo(e);
                    }
                });
        grabarB.setText("grabar");
        grabarB.setBounds(new Rectangle(335, 200, 75, 20));
        grabarB.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        grabar(e);
                    }
                });
        cancelarB.setText("cancelar");
        cancelarB.setBounds(new Rectangle(165, 200, 75, 20));
        cancelarB.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        cancelar(e);
                    }
                });

        borrarB.setText("borrar");
        borrarB.setBounds(new Rectangle(60, 175, 75, 20));
        borrarB.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        borra(e);
                    }
                });
        actualizarB.setText("actualizar");
        actualizarB.setBounds(new Rectangle(245, 200, 85, 20));
        actualizarB.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        actualiza(e);
                    }
                });
        modificarB.setText("modificar");
        modificarB.setBounds(new Rectangle(80, 200, 80, 20));
        modificarB.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        modifica(e);
                    }
                });
        jLabel7.setText("€");
        jLabel7.setBounds(new Rectangle(320, 165, 25, 25));
        jButton3.setText("jButton3");
        image.setBounds(new Rectangle(380, 5, 215, 195));

        jComboBox1.setBounds(new Rectangle(255, 125, 80, 20));
        jComboBox1.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        comboControl(e);
                    }
                });
        this.add(jComboBox1, null);
        this.add(image, null);
        this.add(jLabel7, null);
        this.add(modificarB, null);
        this.add(actualizarB, null);
        this.add(borrarB, null);
        this.add(cancelarB, null);
        this.add(grabarB, null);
        this.add(nuevoB, null);
        this.add(adelanteB, null);
        this.add(atrasB, null);
        this.add(idText, null);
        this.add(precioText, null);
        this.add(jLabel6, null);
        this.add(descripcionText, null);
        this.add(jLabel5, null);
        this.add(jLabel4, null);
        this.add(jLabel3, null);
        this.add(nombreText, null);
        this.add(jLabel2, null);
        jScrollPane1.getViewport().add(jList1, null);
        this.add(jScrollPane1, null);
      //image.setIcon(imagen);
    }
    private void jList1_mouseClicked(ListSelectionEvent e) {
        int nreg =((Actividades)jList1.getSelectedValue()).getNumeroRegistro();
        ta.irA(nreg);
        ImageIcon afoto= new ImageIcon("../ImagenesA/"+ta.getImagen());
        muestraDatos();
        
              
    }


    private void atras(ActionEvent e) {
        ta.anterior();
        muestraDatos();
    }

   private void nuevo(ActionEvent e) {
        esNuevo=true;
        muestraDatos();
    }

    private void grabar(ActionEvent e) {
        //Control del usuario
         ponDatos();
        ta.altas();
        esNuevo=false;
        muestraDatos();
        jList1.removeAll();
        jList1.setListData(ta.toArray());
    }


    private void ponDatos() {
         
        ta.setNombre(nombreText.getText()); 
        ta.setDescripcion(descripcionText.getText()); 
        ta.setImagen((String)jComboBox1.getSelectedItem());
        ta.setPrecio(Float.parseFloat(precioText.getText())); 
        
    }
    
    private void adelante(ActionEvent e) {
       
        ta.siguiente();
        muestraDatos();
       
    }

    private void cancelar(ActionEvent e) {
        esNuevo=false;
        muestraDatos();
    }
    private void muestraDatos(){
        if(ta.hayRegistros()&&!esNuevo){
            idText.setText(""+ta.getId_actividades());
            nombreText.setText(ta.getNombre());
            descripcionText.setText(ta.getDescripcion());
            precioText.setText(""+ta.getPrecio());
            ImageIcon afoto= new ImageIcon("../ImagenesA/"+ta.getImagen());
            Image a =afoto.getImage();
            afoto.setImage(a.getScaledInstance(image.getWidth(),image.getHeight(),1));
            image.setIcon(afoto);
            jComboBox1.setSelectedItem(ta.getImagen());
        }
        else{
            esNuevo=true;
            nombreText.setText("");
            idText.setText("");
            image.setText("");
            precioText.setText("");
            descripcionText.setText("");
        }
        controlDeBotones();
        
    }

    public void controlDeBotones(){
        jButton1.setEnabled(false);
        jButton2.setEnabled(false);
        atrasB.setEnabled(false);
        adelanteB.setEnabled(false);
        nuevoB.setEnabled(false);
        grabarB.setEnabled(false);
        cancelarB.setEnabled(false);
        borrarB.setEnabled(false);
        actualizarB.setEnabled(false);
        modificarB.setEnabled(false);
        
        if(esNuevo){
            grabarB.setEnabled(true);
            if(ta.hayRegistros())cancelarB.setEnabled(true);
        }
        else{
            jButton1.setEnabled(true);
            jButton2.setEnabled(true);
            atrasB.setEnabled(true);
            adelanteB.setEnabled(true);
            nuevoB.setEnabled(true);
            borrarB.setEnabled(true);
            actualizarB.setEnabled(true);
            modificarB.setEnabled(true);
            
        }
        
    }
    private void borra(ActionEvent e) {
        ta.borrar();
        if (!ta.hayRegistros()) 
       nuevo(e);
        else {
            ta.ultimo();}
        actualiza(e);
   }
    private void actualiza(ActionEvent e) {
        ta = new TActividades();
        jList1.setListData(ta.toArray());
        //cargar lista
        muestraDatos();        
    }

    private void modifica(ActionEvent e) { 
       ponDatos();
       ta.modificar(); 
    }


    private void comboControl(ActionEvent e) {
        String datoSeleccionado = (String)jComboBox1.getSelectedItem();
        ImageIcon afoto= new ImageIcon("../ImagenesA/"+datoSeleccionado);
        Image a =afoto.getImage();
        afoto.setImage(a.getScaledInstance(image.getWidth(),image.getHeight(),1));
        image.setIcon(afoto);
        
        
    }
}

//Cagada al grabar o actualizar los datos