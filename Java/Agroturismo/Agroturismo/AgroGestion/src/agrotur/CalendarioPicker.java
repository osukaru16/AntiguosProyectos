package agrotur;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.sql.Date;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EtchedBorder;


public class CalendarioPicker extends JDialog {
    
    public final static int FORMATO_SQL = 0;
    public final static int FORMATO_SQL_INVERSO = 1;
    public final  static int FORMATO_EUROPEO = 2;
    
    static String[] ARRMES = 
    { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", 
      "Septiembre", "Octubre", "Noviembre", "Diciembre" };
    static String[] ARRDIASSEMANA = 
    { "Dom", "Lun", "Mar", "Mie", "Jue", "Vie", "Sab" };


    public Calendar fechaActual;
    public Calendar fechaADiaUnoDelMes;
    int dsdu;
    int primerDiaDeLaSemanaDelMes;
    private BotonDia[] botonera;
    private JButton bMesAnterior = new JButton();
    private JButton bMesSiguiente = new JButton();
    private JButton bAnoAnterior = new JButton();
    private JButton bAnoSiguiente = new JButton();
    private JLabel eFecha = new JLabel();
    JPanel losdias;
    public JPanel panelAceptarCancelar;
    public JButton aceptar = new JButton("ok");
    public JButton cancelar = new JButton("ko");
    Date recogeFechaPulsada;
    String anyo="";
    String mes="";
    String dia="";
    String laFechaM;
    Boolean puedoPonerfecha = false;
    private JPanel botonesDerecha;
    private JPanel botonesIzquierda;
    private JLabel jLabel1 = new JLabel();
    JLabel campoRecogeFecha = new JLabel();
    JTextField campoDestino;
    private int formato;

    public CalendarioPicker(JTextField campoDestino,int formato) {
        this.campoDestino = campoDestino;
        this.formato = formato;
        try {
            jbInit();

        } catch (Exception e) {
            e.printStackTrace();
        }
        
        fechaActual = Calendar.getInstance();
        
        inicializaCalendarios(0,0); 
        
        this.setModal(true);
        this.setResizable(false);
        this.setVisible(true);
    }

    public CalendarioPicker(JTextField campoDestino) {
        this(campoDestino,0);
    }

    private void jbInit() throws Exception {
        this.setLayout(new BorderLayout());
        this.setSize(new Dimension(231, 232));
        this.setBackground(Color.white);
        JPanel cabecera = new JPanel(new BorderLayout());
        bMesAnterior.setText("-mes");
        bMesAnterior.setBounds(new Rectangle(0, 0, 45, 25));
        bMesAnterior.setMargin(new Insets(1, 5, 1, 5));
        bMesAnterior.setFont(new Font("Dialog", 0, 10));
        bMesAnterior.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        bMesAnterior_actionPerformed(e);
                    }
                });
        bMesSiguiente.setText("+mes");
        bMesSiguiente.setBounds(new Rectangle(0, 0, 20, 22));
        bMesSiguiente.setMargin(new Insets(1, 5, 1, 5));
        bMesSiguiente.setFont(new Font("Dialog", 0, 10));
        bMesSiguiente.setMaximumSize(new Dimension(20, 22));
        bMesSiguiente.setMinimumSize(new Dimension(20, 22));
        bMesSiguiente.setToolTipText("null");
        bMesSiguiente.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        bMesSiguiente_actionPerformed(e);
                    }
                });

        bAnoAnterior.setText("-año");
        bAnoAnterior.setBounds(new Rectangle(0, 0, 45, 25));
        bAnoAnterior.setMargin(new Insets(1, 5, 1, 5));

        bAnoAnterior.setFont(new Font("Dialog", 0, 10));
        bAnoAnterior.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        bAnoAnterior_actionPerformed(e);
                    }
                });
        bAnoSiguiente.setText("+año");
        bAnoSiguiente.setBounds(new Rectangle(0, 0, 45, 25));
        bAnoSiguiente.setMargin(new Insets(1, 5, 1, 5));

        bAnoSiguiente.setFocusTraversalPolicyProvider(true);
        bAnoSiguiente.setFont(new Font("Dialog", 0, 10));
        bAnoSiguiente.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        bAnoSiguiente_actionPerformed(e);
                    }
                });
        eFecha.setText("jLabel1");
        eFecha.setBounds(new Rectangle(45, 0, 150, 25));
        eFecha.setHorizontalAlignment(SwingConstants.CENTER);

        cabecera.add(eFecha, BorderLayout.SOUTH);


        botonesDerecha = new JPanel();
        botonesDerecha.setLayout(new BorderLayout());
        cabecera.add(botonesDerecha, BorderLayout.EAST);
        botonesDerecha.add(bMesSiguiente, BorderLayout.WEST);
        botonesDerecha.add(bAnoSiguiente, BorderLayout.EAST);
        botonesDerecha.setBackground(Color.WHITE);

        botonesIzquierda = new JPanel();
        botonesIzquierda.setLayout(new BorderLayout());
        cabecera.add(botonesIzquierda, BorderLayout.WEST);
        botonesIzquierda.add(bMesAnterior, BorderLayout.EAST);
        botonesIzquierda.add(bAnoAnterior, BorderLayout.WEST);
        botonesIzquierda.setBackground(Color.WHITE);
        this.add(cabecera, BorderLayout.NORTH);
        cabecera.setBackground(Color.WHITE);
        campoRecogeFecha.setFont(new Font("Trebuchet MS", 1, 12));
        campoRecogeFecha.setForeground(new Color(0, 132, 198));
        campoRecogeFecha.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel1.setText("jLabel1");
        panelAceptarCancelar = new JPanel();
        panelAceptarCancelar.setLayout(new BorderLayout());
        aceptar.setMargin(new Insets(1, 2, 1, 2));
        cancelar.setMargin(new Insets(1, 2, 1, 2));
        cancelar.setIcon(new ImageIcon(CalendarioPicker.class.getResource("ko.gif")));
        cancelar.setText("");
        cancelar.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        cancelar_actionPerformed(e);
                    }
                });
        aceptar.setIcon(new ImageIcon(CalendarioPicker.class.getResource("ok.gif")));
        aceptar.setBackground(Color.white);
        aceptar.setText("");
        aceptar.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        aceptar_actionPerformed(e);
                    }
                });
        campoRecogeFecha.setBounds(45, 20, 125, 25);
        panelAceptarCancelar.add(aceptar, BorderLayout.EAST);
        panelAceptarCancelar.setBackground(Color.WHITE);

        panelAceptarCancelar.add(cancelar, BorderLayout.WEST);
        panelAceptarCancelar.add(campoRecogeFecha, BorderLayout.CENTER);
        this.add(panelAceptarCancelar, BorderLayout.SOUTH);


    }

   
    private void inicializaCalendarios(int sumaRestaMes,int sumaRestaAno) {

        fechaActual.set(fechaActual.get(fechaActual.YEAR)+sumaRestaAno, 
                        fechaActual.get(fechaActual.MONTH) + sumaRestaMes, 1);
        
        
        
        fechaADiaUnoDelMes = Calendar.getInstance();
        
        fechaADiaUnoDelMes.set(fechaActual.get(fechaActual.YEAR), 
                               fechaActual.get(fechaActual.MONTH), 1);
        
        primerDiaDeLaSemanaDelMes = 
                fechaADiaUnoDelMes.get(Calendar.DAY_OF_WEEK) - 1;
        
        
        if (primerDiaDeLaSemanaDelMes == 0)
            primerDiaDeLaSemanaDelMes = 7;
        
        
        muestraMesyAno();

        creaArrayDeBotones(5, 0);

    }

    private void creaArrayDeBotones(int x, int y) {

        int distanciaBotones = 20;
        losdias = new JPanel();
        losdias.setLayout(null);
        losdias.setBackground(Color.WHITE);
        
        botonera = 
                new BotonDia[fechaActual.getActualMaximum(fechaActual.DAY_OF_MONTH)];
        GregorianCalendar fechaTemporalA = 
            new GregorianCalendar(fechaActual.get(fechaActual.YEAR), 
                                  fechaActual.get(fechaActual.MONTH), 1);
        int extra = (fechaTemporalA.get(Calendar.WEEK_OF_MONTH) == 0) ? 0 : 1;
//
        for (int c = 0; c < botonera.length; c++) {
            GregorianCalendar fechaTemporal = 
                new GregorianCalendar(fechaActual.get(fechaActual.YEAR), 
                                      fechaActual.get(fechaActual.MONTH), 
                                      c + 1);
            int posYBoton = 
                (fechaTemporal.get(Calendar.WEEK_OF_MONTH) - extra) * 
                distanciaBotones;
            int diaDeLaSemana = fechaTemporal.get(Calendar.DAY_OF_WEEK) - 1;
            if (diaDeLaSemana == 0)diaDeLaSemana = 7;
            diaDeLaSemana--;
            int posXBoton = x + (diaDeLaSemana * distanciaBotones);
            botonera[c] = new BotonDia("" + (c + 1), fechaTemporal.getTime());
            botonera[c].setBounds(posXBoton, posYBoton, 20, 20);
            botonera[c].addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            diaPulsado(e);
                        }
                    });
            losdias.add(botonera[c], null);

        }
        this.add(losdias, BorderLayout.CENTER);


    }

    public void diaPulsado(ActionEvent e) {

        recogeFechaPulsada = new Date(((BotonDia)e.getSource()).getFecha().getTime());
        
        //        new Date(((BotonDia)e.getSource()).getFecha().getTime());
        String textoCampo = "" + recogeFechaPulsada;
        anyo = 
(textoCampo.valueOf(recogeFechaPulsada)).replace("-", " ").substring(0, 4);
        mes = 
(textoCampo.valueOf(recogeFechaPulsada)).replace("-", " ").substring(5, 7);
        dia = 
(textoCampo.valueOf(recogeFechaPulsada)).replace("-", " ").substring(8, 10);

        puedoPonerfecha = true;
        ponfecha();
    }

    private void bMesAnterior_actionPerformed(ActionEvent e) {
        eliminarBotones();
        inicializaCalendarios(-1,0);

    }

    private void bMesSiguiente_actionPerformed(ActionEvent e) {
        eliminarBotones();
        inicializaCalendarios(1,0);
    }

    private void eliminarBotones() {
        losdias.removeAll();
    }

    private void muestraMesyAno() {
        eFecha.setText(ARRMES[fechaActual.get(Calendar.MONTH)] + " - " + 
                       fechaActual.get(Calendar.YEAR));
    }


    public String ponfecha() {
        campoRecogeFecha.setText(dia + "-" + mes + "-" + anyo);
        String laFecha = campoRecogeFecha.getText();

        return laFecha;
    }

    private void bAnoSiguiente_actionPerformed(ActionEvent e) {
        eliminarBotones();
        inicializaCalendarios(0,1);
    }

    private void bAnoAnterior_actionPerformed(ActionEvent e) {
        eliminarBotones();
        inicializaCalendarios(0,-1);
    }

    private void aceptar_actionPerformed(ActionEvent e) {

        campoDestino.setText(dimeFecha(formato));
        this.setVisible(false);
    }

    public String dimeFecha (int formato){
        String cadena="";
        if(!anyo.equals("")){
            switch(formato){
                case 0:
                    cadena= anyo+"-"+mes+"-"+dia;        
                    break;
                case 1:
                    cadena= dia+"-"+mes+"-"+anyo;        
                    break;
                case 2:
                    cadena= dia+"/"+mes+"/"+anyo;
                    break;
            
            }
        }
        return cadena;
    }
    private void cancelar_actionPerformed(ActionEvent e) {
        this.setVisible(false);
    }
}
