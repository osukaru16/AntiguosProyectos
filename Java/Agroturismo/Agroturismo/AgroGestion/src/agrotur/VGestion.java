package agrotur;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javamail.PCorreo;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JToolBar;

public class VGestion extends JFrame {
    private BorderLayout layoutMain = new BorderLayout();
    private JPanel panelCenter = new JPanel();
    private JMenuBar menuBar = new JMenuBar();
    private JMenu menuFile = new JMenu();
    private JMenuItem menuFileExit = new JMenuItem();
    private JMenu menuHelp = new JMenu();
    private JMenuItem menuHelpAbout = new JMenuItem();
    private JLabel statusBar = new JLabel();
    private JToolBar toolBar = new JToolBar();
    private JButton buttonOpen = new JButton();
    private JButton buttonClose = new JButton();
    private JButton buttonHelp = new JButton();
    private ImageIcon imageOpen = new ImageIcon(VGestion.class.getResource("openfile.gif"));
    private ImageIcon imageClose = new ImageIcon(VGestion.class.getResource("closefile.gif"));
    private ImageIcon imageHelp = new ImageIcon(VGestion.class.getResource("help.gif"));

    private JTabbedPane pestanas = new JTabbedPane();
    private PTRegimen panelRegimen = new PTRegimen();
    private PTRHabitaciones panelHabitaciones = new PTRHabitaciones();  
    
    private PTActividades panelActividades = new PTActividades();
    private PTActProp panelActividadesPropuestas = new PTActProp();        
    private PTReservaActividad panelActividadesRes = new PTReservaActividad();
    
    private PtCliente panelClientes = new PtCliente();
        
      
   
    private PTConsulta panelConsulta = new PTConsulta();        
    private PCorreo panelCorreo = new PCorreo();
     
    private PTAdministradores panelAdministradores = new PTAdministradores();
    
    public VGestion() {
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void jbInit() throws Exception {
        this.setJMenuBar( menuBar );
        this.getContentPane().setLayout( layoutMain );
        panelCenter.setLayout( new BorderLayout() );
        this.setSize(new Dimension(698, 531));
        this.setTitle( "Gestión del Agroturismo" );
        menuFile.setText( "File" );
        menuFileExit.setText( "Exit" );
        menuFileExit.addActionListener( new ActionListener() { public void actionPerformed( ActionEvent ae ) { fileExit_ActionPerformed( ae ); } } );
        menuHelp.setText( "Help" );
        menuHelpAbout.setText( "About" );
        menuHelpAbout.addActionListener( new ActionListener() { public void actionPerformed( ActionEvent ae ) { helpAbout_ActionPerformed( ae ); } } );
        statusBar.setText( "" );
        buttonOpen.setToolTipText( "Open File" );
        buttonOpen.setIcon( imageOpen );
        buttonClose.setToolTipText( "Close File" );
        buttonClose.setIcon( imageClose );
        buttonHelp.setToolTipText( "About" );
        buttonHelp.setIcon( imageHelp );
        menuFile.add( menuFileExit );
        menuBar.add( menuFile );
        menuHelp.add( menuHelpAbout );
        menuBar.add( menuHelp );
        this.getContentPane().add( statusBar, BorderLayout.SOUTH );
        toolBar.add( buttonOpen );
        toolBar.add( buttonClose );
        toolBar.add( buttonHelp );
        this.getContentPane().add( toolBar, BorderLayout.NORTH );
        
        
        pestanas.addTab("Regimenes", panelRegimen );
        pestanas.addTab("Habitaciones", panelHabitaciones );
        pestanas.addTab("Actividades", panelActividades );
        pestanas.addTab("Actividades Prop.", panelActividadesPropuestas );
        pestanas.addTab("Actividades Reserva",panelActividadesRes );        
        
        
        pestanas.addTab("Clientes", panelClientes );

        
        pestanas.addTab("Consulta", panelConsulta );
        pestanas.addTab("E-Mail", panelCorreo);
        pestanas.addTab("Administradores", panelAdministradores );
        
        panelCenter.add(pestanas, BorderLayout.CENTER);
        this.getContentPane().add( panelCenter, BorderLayout.CENTER );
        
    }

    void fileExit_ActionPerformed(ActionEvent e) {
        System.exit(0);
    }

    void helpAbout_ActionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(this, new VGestion_AboutBoxPanel1(), "About", JOptionPane.PLAIN_MESSAGE);
    }
}
