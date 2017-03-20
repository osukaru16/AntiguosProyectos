package appverdura;


import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class PTRegimen extends JPanel {
    TRegimen tablaRegimenes = new TRegimen();

    private JCheckBox activo1 = new JCheckBox();
    private JLabel tipo1 = new JLabel();
    private JLabel descripcion1 = new JLabel();
    private JTextArea precio1 = new JTextArea();

    private JCheckBox activo2 = new JCheckBox();
    private JLabel tipo2 = new JLabel();
    private JLabel descripcion2 = new JLabel();
    private JTextArea precio2 = new JTextArea();

    private JCheckBox activo3 = new JCheckBox();
    private JLabel tipo3 = new JLabel();
    private JLabel descripcion3 = new JLabel();
    private JTextArea precio3 = new JTextArea();

    private JCheckBox activo4 = new JCheckBox();
    private JLabel tipo4 = new JLabel();
    private JLabel descripcion4 = new JLabel();
    private JTextArea precio4 = new JTextArea();

    private JCheckBox activo5 = new JCheckBox();
    private JLabel tipo5 = new JLabel();
    private JLabel descripcion5 = new JLabel();
    private JTextArea precio5 = new JTextArea();
    private JLabel lActivar = new JLabel();
    private JLabel lPrecio = new JLabel();
    private JButton btnActualizar = new JButton();

    public PTRegimen() {
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void jbInit() throws Exception {
        this.setLayout( null );
        this.setSize(new Dimension(347, 240));
        activo1.setText("jCheckBox1");
        activo1.setBounds(new Rectangle(15, 35, 15, 15));
        activo1.setSelected(tablaRegimenes.isActivo());
        tipo1.setText(tablaRegimenes.getTipo());
        tipo1.setBounds(new Rectangle(35, 30, 45, 25));
        descripcion1.setText(tablaRegimenes.getDescripcion());
        descripcion1.setBounds(new Rectangle(90, 30, 180, 25));
        precio1.setBounds(new Rectangle(290, 30, 50, 25));
        precio1.setText(""+tablaRegimenes.getPrecio());

        tablaRegimenes.siguiente();
        activo2.setText("jCheckBox1");
        activo2.setBounds(new Rectangle(15, 65, 15, 15));
        activo2.setSelected(tablaRegimenes.isActivo());
        tipo2.setText(tablaRegimenes.getTipo());
        tipo2.setBounds(new Rectangle(35, 60, 45, 25));
        descripcion2.setText(tablaRegimenes.getDescripcion());
        descripcion2.setBounds(new Rectangle(90, 60, 180, 25));
        precio2.setBounds(new Rectangle(290, 60, 50, 25));
        precio2.setText(""+tablaRegimenes.getPrecio());

        tablaRegimenes.siguiente();
        
        activo3.setText("jCheckBox1");
        activo3.setBounds(new Rectangle(15, 100, 15, 15));
        activo3.setSelected(tablaRegimenes.isActivo());
        tipo3.setText(tablaRegimenes.getTipo());
        tipo3.setBounds(new Rectangle(35, 95, 45, 25));
        descripcion3.setText(tablaRegimenes.getDescripcion());
        descripcion3.setBounds(new Rectangle(90, 95, 180, 25));
        precio3.setBounds(new Rectangle(290, 95, 50, 25));
        precio3.setText(""+tablaRegimenes.getPrecio());

        tablaRegimenes.siguiente();

        activo4.setText("jCheckBox1");
        activo4.setBounds(new Rectangle(15, 135, 15, 15));
        activo4.setSelected(tablaRegimenes.isActivo());
        tipo4.setText(tablaRegimenes.getTipo());
        tipo4.setBounds(new Rectangle(35, 130, 45, 25));
        descripcion4.setText(tablaRegimenes.getDescripcion());
        descripcion4.setBounds(new Rectangle(90, 130, 180, 25));
        precio4.setBounds(new Rectangle(290, 130, 50, 25));
        precio4.setText(""+tablaRegimenes.getPrecio());

        tablaRegimenes.siguiente();

        activo5.setText("jCheckBox1");
        activo5.setBounds(new Rectangle(15, 165, 15, 15));
        activo5.setSelected(tablaRegimenes.isActivo());
        tipo5.setText(tablaRegimenes.getTipo());
        tipo5.setBounds(new Rectangle(35, 160, 45, 25));
        descripcion5.setText(tablaRegimenes.getDescripcion());
        descripcion5.setBounds(new Rectangle(90, 160, 180, 25));
        precio5.setBounds(new Rectangle(290, 160, 50, 25));
        precio5.setText(""+tablaRegimenes.getPrecio());




        lActivar.setText("Activar");
        lActivar.setBounds(new Rectangle(0, 10, 50, 15));
        lPrecio.setText("Precio");
        
        
        lPrecio.setBounds(new Rectangle(280, 5, 70, 20));
        btnActualizar.setText("Actualizar Datos");
        btnActualizar.setBounds(new Rectangle(80, 205, 195, 30));

        btnActualizar.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        btnActualizar_actionPerformed(e);
                    }
                });
        this.add(btnActualizar, null);
        this.add(lPrecio, null);
        this.add(lActivar, null);
        this.add(precio1, null);
        this.add(descripcion1, null);
        this.add(tipo1, null);
        this.add(activo1, null);
        this.add(precio2, null);
        this.add(descripcion2, null);
        this.add(tipo2, null);
        this.add(activo2, null);
        this.add(precio3, null);
        this.add(descripcion3, null);
        this.add(tipo3, null);
        this.add(activo3, null);
        this.add(precio4, null);
        this.add(descripcion4, null);
        this.add(tipo4, null);
        this.add(activo4, null);
        this.add(precio5, null);
        this.add(descripcion5, null);
        this.add(tipo5, null);
        this.add(activo5, null);
    }


    private void btnActualizar_actionPerformed(ActionEvent e) {
        tablaRegimenes.primero();
        tablaRegimenes.setActivo(activo1.isSelected());
        tablaRegimenes.setPrecio(Float.parseFloat(precio1.getText()));;
        tablaRegimenes.modificar();
        tablaRegimenes.siguiente();
        tablaRegimenes.setActivo(activo2.isSelected());
        tablaRegimenes.setPrecio(Float.parseFloat(precio2.getText()));;
        tablaRegimenes.modificar();
        tablaRegimenes.siguiente();
        tablaRegimenes.setActivo(activo3.isSelected());
        tablaRegimenes.setPrecio(Float.parseFloat(precio3.getText()));;
        tablaRegimenes.modificar();
        tablaRegimenes.siguiente();
        tablaRegimenes.setActivo(activo4.isSelected());
        tablaRegimenes.setPrecio(Float.parseFloat(precio4.getText()));;
        tablaRegimenes.modificar();
        tablaRegimenes.siguiente();
        tablaRegimenes.setActivo(activo5.isSelected());
        tablaRegimenes.setPrecio(Float.parseFloat(precio5.getText()));;
        tablaRegimenes.modificar();        
    }
}
