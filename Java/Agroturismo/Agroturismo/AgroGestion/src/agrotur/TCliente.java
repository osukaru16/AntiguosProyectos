package agrotur;
import java.sql.SQLException;
import java.lang.String;

import java.util.Vector;

public class TCliente extends MotorBD{
    Cliente cli = new Cliente();
    public String tabla="tcliente";
   // public String filtro="";
        public TCliente() {
        consulta("SELECT * FROM "+tabla);
    }
    
    public TCliente(String filtro) {
        consulta("SELECT * FROM "+tabla+" "+filtro);
    }
    public void cargaDatos(){
        try{
            cli.idcli=rs.getString("idcli");
            cli.nombre=rs.getString("nombre");
            cli.apellido1=rs.getString("apellido1");
            cli.apellido2=rs.getString("apellido2");
            cli.telefono=rs.getString("telefono"); 
            cli.email=rs.getString("email");
            cli.identific=rs.getString("identific");
            cli.infoact=rs.getBoolean("infoact");
            cli.infoofer=rs.getBoolean("infoofer");
            cli.usuario=rs.getString("usuario");
            cli.pass=rs.getString("pass");
            cli.numeroRegistro=rs.getRow();
            
        }
        catch(SQLException ex){
            cli=new Cliente();
        }
        
    }
      public void cargaDatosRS(){
                try{
                    rs.updateString("nombre",cli.nombre);
                    rs.updateString("apellido1",cli.apellido1);
                    rs.updateString("apellido2",cli.apellido2);  
                    rs.updateString("telefono", cli.telefono);
                    rs.updateString("email", cli.email);
                    rs.updateString("identific", cli.identific);
                    rs.updateBoolean("infoact", cli.infoact);
                    rs.updateBoolean("infoofer", cli.infoofer);
                    rs.updateString("usuario", cli.usuario);
                    rs.updateString("pass", cli.pass);
                }
                catch(SQLException ex){
                    ex.printStackTrace();
                }
             }
       
    public void setIdcli(String newidcli) {
        cli.idcli = newidcli;
    }

    public String getIdcli() {
        return cli.idcli;
    }

    public void setNombre(String newnombre) {
        cli.nombre = newnombre;
    }

    public String getNombre() {
        return cli.nombre;
    }

    public void setApellido1(String newapellido1) {
        cli.apellido1 = newapellido1;
    }

    public String getApellido1() {
        return cli.apellido1;
    }

    public void setApellido2(String newapellido2) {
        cli.apellido2 = newapellido2;
    }

    public String getApellido2() {
        return cli.apellido2;
    }

    public void setTelefono(String newtelefono) {
        cli.telefono = newtelefono;
    }

    public String getTelefono() {
        return cli.telefono;
    }

    public void setEmail(String newemail) {
        cli.email = newemail;
    }

    public String getEmail() {
        return cli.email;
    }

    public void setIdentific(String newidentific) {
        cli.identific = newidentific;
    }

    public String getIdentific() {
        return cli.identific;
    }

    public void setInfoact(boolean newinfoact) {
        cli.infoact = newinfoact;
    }

    public boolean isInfoact() {
        return cli.infoact;
    }

    public void setInfoofer(boolean newinfoofer) {
        cli.infoofer = newinfoofer;
    }

    public boolean isInfoofer() {
        return cli.infoofer;
    }

    public void setUsuario(String newusuario) {
        cli.usuario = newusuario;
    }

    public String getUsuario() {
        return cli.usuario;
    }

    public void setPass(String newpass) {
        cli.pass = newpass;
    }

    public String getPass() {
        return cli.pass;
    }

    public void setNumeroRegistro(int newnumeroRegistro) {
        cli.numeroRegistro = newnumeroRegistro;
    }

    public int getNumeroRegistro() {
        return cli.numeroRegistro;
    }

       public String getTabla() {
        return tabla;
    }
    public void asociaDatos(String idc, String nom, String ap1, String ap2, String tel, String em, String ident, boolean infoa, boolean infoo, String us, String pa, int nRe){
        cli.idcli=idc;
        cli.nombre=nom;
        cli.apellido1=ap1;
        cli.apellido2=ap2;
        cli.telefono=tel;
        cli.email=em;
        cli.identific=ident;
        cli.infoact=infoa;
        cli.infoofer=infoo;
        cli.usuario=us;
        cli.pass=pa;
        cli.numeroRegistro=nRe;
    }
    public Cliente getClassDatos(){
        return cli;
    }
    public Vector toVectorCabeceras(){
        return cli.toVectorCabeceras();
        }
    
    public Cliente[] toArray(){
        Cliente vcli[] = new Cliente[contarResultados()];        
        try{
        int posActual=rs.getRow();
        
        primero();
        for(int c=0;c<contarResultados();c++){
              vcli[c]=new Cliente(cli);
              siguiente();
        }
        primero();
        }
        catch(SQLException ex){
            ex.printStackTrace();
        }
        return vcli;
    }
   
  
    public void borrar() {
        // Borrar todas las reservas del cliente
        super.borrar();
    }
    
    public Vector toVectorConsultaComboBox(){
        return cli.toVectorConsultaComboBox();
    }
    

    public Vector toVector(){
        Vector clientes = new Vector();
        primero();
        for(int c=0;c<contarResultados();c++){
              clientes.add(cli.toVector());
              siguiente();
        }
        primero();
        return clientes;
    }
}

