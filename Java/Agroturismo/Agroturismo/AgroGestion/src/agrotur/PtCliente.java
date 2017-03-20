package agrotur;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Rectangle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import java.sql.SQLException;

import javax.swing.BorderFactory;
import javax.swing.DefaultListSelectionModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

public class PtCliente extends JPanel {
    private TCliente tc = new TCliente();
    // private JList jList1 = new JList(tc.toArray());
    //private JScrollPane jScrollPane1 = new JScrollPane();
    private JLabel jLabel1 = new JLabel();
    private JLabel jLabel2 = new JLabel();
    private JLabel jLabel3 = new JLabel();
    private JLabel jLabel4 = new JLabel();
    private JLabel jLabel5 = new JLabel();
    private JLabel jLabel6 = new JLabel();
    private JLabel jLabel7 = new JLabel();
    private JLabel jLabel8 = new JLabel();
    private JLabel jLabel9 = new JLabel();
    private JLabel jLabel10 = new JLabel();
    private JTextField nombre = new JTextField();
    private JTextField apellido1 = new JTextField();
    private JTextField apellido2 = new JTextField();
    private JTextField telefono = new JTextField();
    private JTextField email = new JTextField();
    private JTextField identific = new JTextField();
    private JTextField usuario = new JTextField();
    private JTextField pass = new JTextField();
    private JButton banterior = new JButton();
    private JButton bsiguiente = new JButton();
    private JTextField numeroRegistro = new JTextField();
    private JButton bborrar = new JButton();
    private JButton bnuevo = new JButton();
    private JButton bgrabar = new JButton();
    private JSeparator jSeparator1 = new JSeparator();
    private JLabel jLabel11 = new JLabel();
    private JComboBox jComboBox1 = 
        new JComboBox(tc.toVectorConsultaComboBox());
    private JTextField tbusca = new JTextField();
    private JButton bbusca = new JButton();
    private JLabel jLabel12 = new JLabel();
    private JButton bmodific = new JButton();
    private JButton bcancel = new JButton();
    private boolean nuevo = false;
    // private JCheckBox jCheckBox1 = new JCheckBox();
    private JCheckBox infoact = new JCheckBox();
    private JCheckBox infoofer = new JCheckBox();
    DefaultTableModel modelo = 
        new DefaultTableModel(tc.toVector(), tc.toVectorCabeceras());
    private JTable TablaBusca = new JTable(modelo);
    private JScrollPane jScrollPane2 = new JScrollPane();

    public PtCliente() {
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        cargaDatos();
    }

    private void jbInit() throws Exception {
        this.setLayout(null);
        this.setSize(new Dimension(625, 414));
        this.setBackground(new Color(165, 198, 255));
        jScrollPane2.getViewport().add(TablaBusca, null);
        this.add(jScrollPane2, null);
        this.add(infoofer, null);
        this.add(infoact, null);
        this.add(bcancel, null);
        this.add(bmodific, null);
        this.add(jLabel12, null);
        this.add(bbusca, null);
        this.add(tbusca, null);
        this.add(jComboBox1, null);
        this.add(jLabel11, null);
        this.add(jSeparator1, null);
        this.add(bgrabar, null);
        this.add(bnuevo, null);
        this.add(bborrar, null);
        this.add(numeroRegistro, null);
        this.add(bsiguiente, null);
        this.add(banterior, null);
        this.add(pass, null);
        this.add(usuario, null);
        jLabel1.setText("Nombre");
        jLabel1.setBounds(new Rectangle(205, 45, 85, 15));
        jLabel2.setText("Apellido");
        jLabel2.setBounds(new Rectangle(205, 65, 70, 15));
        jLabel3.setText("Segundo Apellido");
        jLabel3.setBounds(new Rectangle(205, 85, 95, 15));
        jLabel4.setText("Telefono");
        jLabel4.setBounds(new Rectangle(205, 105, 75, 15));
        jLabel5.setText("E-mail");
        jLabel5.setBounds(new Rectangle(205, 125, 50, 15));
        jLabel6.setText("Identificacion");
        jLabel6.setBounds(new Rectangle(205, 145, 70, 15));
        jLabel7.setText("Info Actividades");
        jLabel7.setBounds(new Rectangle(200, 165, 90, 15));
        jLabel8.setText("Info Ofertas");
        jLabel8.setBounds(new Rectangle(370, 165, 90, 15));
        jLabel9.setText("Usuario");
        jLabel9.setBounds(new Rectangle(420, 40, 80, 15));
        jLabel10.setText("Contraseña");
        jLabel10.setBounds(new Rectangle(405, 60, 70, 15));
        nombre.setBounds(new Rectangle(295, 40, 95, 20));
        apellido1.setBounds(new Rectangle(295, 60, 100, 20));
        apellido2.setBounds(new Rectangle(295, 80, 100, 20));
        telefono.setBounds(new Rectangle(295, 100, 75, 20));
        email.setBounds(new Rectangle(295, 120, 145, 20));
        identific.setBounds(new Rectangle(295, 140, 105, 20));
        usuario.setBounds(new Rectangle(485, 40, 95, 20));
        pass.setBounds(new Rectangle(485, 60, 95, 20));
        banterior.setText("<<<<");
        banterior.setBounds(new Rectangle(40, 355, 71, 23));
        banterior.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        jButton1_actionPerformed(e);
                    }
                });
        bsiguiente.setText(">>>>");
        bsiguiente.setBounds(new Rectangle(520, 355, 75, 25));
        bsiguiente.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        jButton2_actionPerformed(e);
                    }
                });
        numeroRegistro.setBounds(new Rectangle(485, 80, 45, 20));
        bborrar.setText("Borrar");
        bborrar.setBounds(new Rectangle(10, 110, 71, 23));
        bborrar.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        jButton3_actionPerformed(e);
                    }
                });
        bnuevo.setText("Nuevo");
        bnuevo.setBounds(new Rectangle(10, 80, 70, 25));
        bnuevo.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        bnuevo_actionPerformed(e);
                    }
                });
        bgrabar.setText("Grabar");
        bgrabar.setBounds(new Rectangle(10, 30, 71, 23));
        bgrabar.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        bgrabar_actionPerformed(e);
                    }
                });
        jSeparator1.setBounds(new Rectangle(0, 25, 610, 15));
        jSeparator1.setBackground(new Color(0, 132, 132));
        jSeparator1.setBorder(BorderFactory.createEmptyBorder(2, 0, 2, 0));
        jLabel11.setText("Buscar por");
        jLabel11.setBounds(new Rectangle(20, 10, 60, 15));
        jComboBox1.setBounds(new Rectangle(100, 5, 130, 20));
        jComboBox1.setToolTipText("null");
        jComboBox1.setSelectedIndex(0);
        //jComboBox1.addActionListener(this);
        jComboBox1.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        jComboBox1_actionPerformed(e);
                    }
                });
        tbusca.setBounds(new Rectangle(235, 5, 105, 20));
        bbusca.setText("Busca");
        bbusca.setBounds(new Rectangle(345, 5, 70, 20));
        bbusca.setForeground(new Color(255, 66, 0));
        bbusca.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        bbusca_actionPerformed(e);
                    }
                });
        jLabel12.setText("Numero Registro");
        jLabel12.setBounds(new Rectangle(395, 80, 100, 20));
        bmodific.setText("Modificar");
        bmodific.setBounds(new Rectangle(85, 80, 85, 25));
        bmodific.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        bmodific_actionPerformed(e);
                    }
                });
        bcancel.setText("Cancel");
        bcancel.setBounds(new Rectangle(10, 55, 71, 23));
        bcancel.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        bcancel_actionPerformed(e);
                    }
                });
        infoact.setBounds(new Rectangle(320, 160, 45, 20));
        infoact.setText("Si");
        infoact.setBackground(new Color(165, 198, 255));
        infoofer.setBounds(new Rectangle(445, 160, 45, 20));
        infoofer.setText("Si");
        infoofer.setBackground(new Color(165, 198, 255));
        TablaBusca.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        TablaBusca.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
                    public void valueChanged(ListSelectionEvent e) {
                        seleccionEnTabla(e);
                    }
                });
        jScrollPane2.setBounds(new Rectangle(5, 200, 600, 115));
        jScrollPane2.setBackground(new Color(165, 198, 255));
        this.add(identific, null);
        this.add(email, null);
        this.add(telefono, null);
        this.add(apellido2, null);
        this.add(apellido1, null);
        this.add(nombre, null);
        this.add(jLabel10, null);
        this.add(jLabel9, null);
        this.add(jLabel8, null);
        this.add(jLabel7, null);
        this.add(jLabel6, null);
        this.add(jLabel5, null);
        this.add(jLabel4, null);
        this.add(jLabel3, null);
        this.add(jLabel2, null);
        this.add(jLabel1, null);
    }
    public void cargaDatos() {
        if (tc.hayRegistros() && !nuevo) {
            nombre.setText(tc.getNombre());
            apellido1.setText(tc.getApellido1());
            apellido2.setText(tc.getApellido2());
            telefono.setText(tc.getTelefono());
            email.setText(tc.getEmail());
            identific.setText(tc.getIdentific());
            infoofer.setSelected(tc.isInfoofer());
            infoact.setSelected(tc.isInfoact());
            usuario.setText(tc.getUsuario());
            pass.setText(tc.getPass());
            numeroRegistro.setText("" + tc.getNumeroRegistro());
            numeroRegistro.setVisible(true);
        } else {
            nuevo = true;
            nombre.setText("");
            apellido1.setText("");
            apellido2.setText("");
            telefono.setText("");
            email.setText("");
            identific.setText("");
            infoofer.setSelected(false);
            infoact.setSelected(false);
            usuario.setText("");
            pass.setText("");
            numeroRegistro.setText("");
        }
        activadesBoton();
    }

    public void cargaDatosText() {
         tc.asociaDatos(tc.getIdcli(),nombre.getText(),apellido1.getText(),apellido2.getText(),telefono.getText(),email.getText(),identific.getText(),infoact.isSelected(),infoofer.isSelected(),usuario.getText(),pass.getText(),tc.getNumeroRegistro());
    }
    private void jButton1_actionPerformed(ActionEvent e) {
        //Anterior
        tc.anterior();
        cargaDatos();
    }
    //  private void jList1_mouseClicked(MouseEvent e) {
    //Lista        
    //     Cliente clie = (Cliente)jList1.getSelectedValue();
    //    tc.irA(clie.getNumeroRegistro());
    //   cargaDatos();
    private void jButton2_actionPerformed(ActionEvent e) {
        //Siguiente
        tc.siguiente();
        cargaDatos();
    }

    private void jButton3_actionPerformed(ActionEvent e) {
        //Borrar
        int op = 
            JOptionPane.showConfirmDialog(this, "Seguro que deseas Borrar?", 
                                          "Alerta", JOptionPane.YES_NO_OPTION);
        if (op == JOptionPane.YES_OPTION) {
            tc.borrar();
            actualTabla();
        }
        if (op == JOptionPane.NO_OPTION)cargaDatos();
    }

    private void bnuevo_actionPerformed(ActionEvent e) {
        nuevo = true;
        actualTabla();
    }

    private void bgrabar_actionPerformed(ActionEvent e) {
        cargaDatosText();
        tc.altas();
        nuevo = false;
        actualTabla();
   }

    private void actualTabla(){
            TablaBusca.removeAll();
            modelo.setDataVector(tc.toVector(), tc.toVectorCabeceras());
            cargaDatos();
    }
    private void jComboBox1_actionPerformed(ActionEvent e) {
        String seleccionado = 
            ((DatosComboBox)jComboBox1.getSelectedItem()).getDatoInterno();

    }

    private void bmodific_actionPerformed(ActionEvent e) {
        cargaDatosText();
        tc.modificar();
        actualTabla();
   }

    private void activadesBoton() {
        bgrabar.setVisible(false);
        bmodific.setVisible(false);
        bnuevo.setVisible(false);
        banterior.setVisible(false);
        bborrar.setVisible(false);
        bsiguiente.setVisible(false);
        bcancel.setVisible(false);
        numeroRegistro.setVisible(false);

        if (nuevo) {
            numeroRegistro.setVisible(false);
            bgrabar.setVisible(true);
            if (tc.hayRegistros())
                bcancel.setVisible(true);
        } else {

            bnuevo.setVisible(true);
            bborrar.setVisible(true);
            bmodific.setVisible(true);
            banterior.setVisible(true);
            bsiguiente.setVisible(true);
            numeroRegistro.setVisible(true);

        }
    }

    private void bcancel_actionPerformed(ActionEvent e) {
        nuevo = false;
        cargaDatos();
    }

    public void buscar() {
        String tv = 
         ((DatosComboBox)jComboBox1.getSelectedItem()).getDatoInterno();
        String filtro = 
            " WHERE " + tv + " LIKE " + " '%" + tbusca.getText() + "%' ";
        tc = new TCliente(filtro);
        // jList1.setListData(tc.toArray());
        TablaBusca.clearSelection();
        actualTabla();
        nuevo = false;

    }
    //   public void renovarLista(){
    //      jList1.removeAll();
    //     tc.toArray();
    //    }

    private void bbusca_actionPerformed(ActionEvent e) {
        buscar();
        actualTabla();
        activadesBoton();

    }

    private void infoact_actionPerformed(ActionEvent e) {

    }

    private void seleccionEnTabla(ListSelectionEvent e) {
        try {
            String dato = 
                ((DatosComboBox)TablaBusca.getValueAt(TablaBusca.getSelectedRow(), 
                                                      0)).getDatoInterno();
            int regis = Integer.parseInt(dato);
            tc.irA(regis);
            cargaDatos();
        } catch (Exception ex) {
            System.out.print("");
        }

    }

}


//Actualizar despues de grabar.

