package agrotur;

import java.awt.Dimension;
import java.awt.Rectangle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class PTActProp extends JPanel {
    private JTextField TPla = new JTextField();
    private JTextField TFe = new JTextField();
    private JTextField THo = new JTextField();
    private JLabel jLabel1 = new JLabel();
    private JLabel jLabel2 = new JLabel();
    private JLabel jLabel3 = new JLabel();
    private JLabel jLabel4 = new JLabel();
    private JButton BModifica = new JButton();

    private TActProp tap = new TActProp();
    private TActividades tac = new TActividades();
    private Actividades [] lAct = tac.toArray();
    private JScrollPane jScrollPane1 = new JScrollPane();
    private JList jList1 = new JList(tap.toArray());
    private JComboBox jComboBox1 = new JComboBox(lAct);
    private JButton BAtras = new JButton();
    private JButton BAlante = new JButton();
    private JButton BNuevo = new JButton();
    private JButton BBorra = new JButton();
    private JButton BCancela = new JButton();
    private JButton BCrea = new JButton();
    private JButton BActualiza = new JButton();
    private boolean esNuevo = false;
    private JLabel jLabel6 = new JLabel();
    private JLabel TID = new JLabel();
    public JButton BCal = new JButton();
    public ImageIcon imageCal = new ImageIcon(VGestion.class.getResource("calendario.gif"));
    public int sx = imageCal.getIconHeight();
    public int sy = imageCal.getIconWidth();
    
    
    public PTActProp() {
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        muestraDatos();
    }

    private void jbInit() throws Exception {
        this.setLayout( null );
        this.setSize(new Dimension(501, 327));
        jScrollPane1.setBounds(new Rectangle(15, 230, 410, 85));
        jList1.addMouseListener(new MouseAdapter() {
                    public void mouseClicked(MouseEvent e) {
                        jList1_mouseClicked();
                    }
                });
        jComboBox1.setBounds(new Rectangle(305, 20, 155, 20));
        BAtras.setText("<<<");
        BAtras.setToolTipText("Atrás");
        BAtras.setBounds(new Rectangle(285, 175, 65, 25));
        BAtras.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        patras();
                    }
                });
        BAlante.setText(">>>");
        BAlante.setToolTipText("Adelante");
        BAlante.setBounds(new Rectangle(405, 175, 60, 25));
        BAlante.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        palante();
                    }
                });
        BNuevo.setText("Nuevo");
        BNuevo.setToolTipText("Nuevo");
        BNuevo.setBounds(new Rectangle(15, 20, 90, 20));
        BNuevo.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        nuevo();
                    }
                });
        BBorra.setText("Borrar");
        BBorra.setToolTipText("Destruye");
        BBorra.setBounds(new Rectangle(125, 115, 90, 20));
        BBorra.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        borrar();
                    }
                });
        BCancela.setText("Cancelar");
        BCancela.setToolTipText("Cancelar");
        BCancela.setBounds(new Rectangle(125, 70, 90, 20));
        BCancela.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        cancelar();
                    }
                });
        BCrea.setText("Crea");
        BCrea.setToolTipText("Crea");
        BCrea.setBounds(new Rectangle(125, 20, 90, 20));
        BCrea.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        crea();
                    }
                });
        BActualiza.setText("Actualizar");
        BActualiza.setToolTipText("Refresca");
        BActualiza.setBounds(new Rectangle(15, 115, 90, 20));
        BActualiza.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        actualizar();
                    }
                });
        jLabel6.setText("ID Act.");
        jLabel6.setBounds(new Rectangle(245, 20, 50, 20));
        jLabel6.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel6.setHorizontalTextPosition(SwingConstants.CENTER);
        TID.setBounds(new Rectangle(130, 175, 50, 25));
        BCal.setBounds(new Rectangle(430, 85, 30, 25));
        BCal.setToolTipText("Calendario");
        BCal.setIcon(imageCal);
        BCal.setSize(sx,sy);
        BCal.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        BCal_actionPerformed();
                    }
                });
        TPla.setBounds(new Rectangle(355, 55, 45, 25));
        TFe.setBounds(new Rectangle(335, 95, 80, 25));
        THo.setBounds(new Rectangle(350, 130, 55, 25));
        jLabel1.setText("ID Act. Prop.");
        jLabel1.setBounds(new Rectangle(30, 175, 75, 25));
        jLabel1.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel2.setText("Plazas");
        jLabel2.setBounds(new Rectangle(240, 55, 65, 25));
        jLabel2.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel3.setText("Fecha");
        jLabel3.setBounds(new Rectangle(245, 95, 55, 25));
        jLabel3.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel4.setText("Hora");
        jLabel4.setBounds(new Rectangle(250, 130, 45, 25));
        jLabel4.setHorizontalAlignment(SwingConstants.CENTER);
        BModifica.setText("Modifica");
        BModifica.setToolTipText("Modifica");
        BModifica.setBounds(new Rectangle(15, 70, 90, 20));
        BModifica.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        modifica();
                    }
                });
        this.add(BCal, null);
        this.add(TID, null);
        this.add(jLabel6, null);
        this.add(BActualiza, null);
        this.add(BCrea, null);
        this.add(BCancela, null);
        this.add(BBorra, null);
        this.add(BNuevo, null);
        this.add(BAlante, null);
        this.add(BAtras, null);
        this.add(jComboBox1, null);
        this.add(BModifica, null);
        this.add(jLabel4, null);
        this.add(jLabel3, null);
        this.add(jLabel2, null);
        this.add(jLabel1, null);
        this.add(THo, null);
        this.add(TFe, null);
        this.add(TPla, null);
        jScrollPane1.getViewport().add(jList1, null);
        this.add(jScrollPane1, null);
    }
    
    private void jList1_mouseClicked() {
        if(!tap.hayRegistros())return;
        int nreg = ((ActProp) jList1.getSelectedValue()).getNumeroRegistro();
        tap.irA(nreg);
        muestraDatos();
    }

    private void patras() {
        tap.anterior();
        muestraDatos();
        jList1.setListData(tap.toArray());
    }
    
    private void palante() {
        tap.siguiente();
        muestraDatos();
        jList1.setListData(tap.toArray());
    }
    
    private void muestraDatos(){
        if(tap.hayRegistros()&&!esNuevo){
            TID.setText(""+tap.getid_apropuestas());
            TPla.setText(""+tap.getplazas());
            TFe.setText(tap.getfecha());
            THo.setText(tap.ishora());
            seleccionaElemento(tap.getid_act());
        }
        else{
            esNuevo=true;
            TID.setText("");
            TPla.setText("");
            TFe.setText("");
            THo.setText("");
        }
        controlDeBotones();   
    }

    public void controlDeBotones(){
        BModifica.setEnabled(false);
        BAtras.setEnabled(false);
        BAlante.setEnabled(false);
        BNuevo.setEnabled(false);
        BBorra.setEnabled(false);
        BCancela.setEnabled(false);
        BCrea.setEnabled(false);
        BActualiza.setEnabled(false);
        if(esNuevo){
            BCrea.setEnabled(true);
            if(tap.hayRegistros())BCancela.setEnabled(true);
        }
        else{
           BModifica.setEnabled(true);
           BAtras.setEnabled(true);
           BAlante.setEnabled(true);
           BNuevo.setEnabled(true);
           BBorra.setEnabled(true);
           BActualiza.setEnabled(true);
        }
    }

    private void nuevo() {
        esNuevo=true;
        muestraDatos();
    }

    private void borrar() {
        tap.borrar();
        actualizar();
        jList1.setListData(tap.toArray());
    }

    private void cancelar() {
        esNuevo=false;
        muestraDatos();
    }

    private void modifica() {
        ponDatos();
        tap.modificar();
        jList1.setListData(tap.toArray());
    }

    private void actualizar() {
        tap = new TActProp();
        muestraDatos();
        jList1.setListData(tap.toArray());
    }

    private void crea() {
         if(TPla.getText().length()==0 || TFe.getText().length()==0 || THo.getText().length()==0) return;
        else{
            
            ponDatos();
           
            tap.altas();

            esNuevo=false;
            muestraDatos();
            jList1.setListData(tap.toArray());
        }
    }
    
    private void ponDatos(){
            tap.setplazas(Integer.parseInt(TPla.getText()));
            tap.setfecha(TFe.getText());
            tap.sethora(THo.getText());
            tap.setid_act(((Actividades)jComboBox1.getSelectedItem()).getId_actividades() );
    }

    private void BCal_actionPerformed() {
     new CalendarioPicker(TFe);
    }
    
    public void seleccionaElemento(int idsel){
        for(int c=0;c<lAct.length;c++){
            if(lAct[c].getId_actividades()==idsel){
                jComboBox1.setSelectedItem(lAct[c]);
                break;
            }
        }
    }
}
//Falla al dar de alta
/*  salto de linea en boton
 * 
 *    ""+(char)13+""
 * 
 */