package appverdura;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

public class VGestionDatos extends JFrame {
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
    private ImageIcon imageOpen = new ImageIcon(VGestionDatos.class.getResource("openfile.gif"));
    private ImageIcon imageClose = new ImageIcon(VGestionDatos.class.getResource("closefile.gif"));
    private ImageIcon imageHelp = new ImageIcon(VGestionDatos.class.getResource("help.gif"));
    private JTabbedPane Pestanas = new JTabbedPane();
    private BorderLayout borderLayout1 = new BorderLayout();
    //Aqui metemos los paneles
    private PTRegimen gestionRegimenes = new PTRegimen();
    private PTCliente ptc = new PTCliente();
    


    public VGestionDatos() {
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void jbInit() throws Exception {
        this.setJMenuBar( menuBar );
        this.getContentPane().setLayout( layoutMain );
        panelCenter.setLayout(borderLayout1);
        this.setSize(new Dimension(424, 360));
        this.setTitle( "Agrogestion v 0.0.0.1 (alpha)" );
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
        //Aqui asociamos el panel con las Pestañas.
        Pestanas.addTab("Regimenes", gestionRegimenes);
        Pestanas.addTab("Clientes", ptc);

        panelCenter.add(Pestanas, BorderLayout.CENTER);
        this.getContentPane().add(panelCenter, BorderLayout.CENTER);
        
    }

    void fileExit_ActionPerformed(ActionEvent e) {
        System.exit(0);
    }

    void helpAbout_ActionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(this, new VGestionDatos_AboutBoxPanel1(), "About", JOptionPane.PLAIN_MESSAGE);
        JFrame a = new JFrame("Datos");   
        a.getContentPane().add(new PTRegimen());
        a.setVisible(true); 
    }
}
