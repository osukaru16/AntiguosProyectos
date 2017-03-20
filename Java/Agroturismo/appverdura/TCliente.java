package appverdura;

import java.sql.SQLException;

import java.util.Vector;

public class TCliente extends MotorBD{
    
    Cliente cli = new Cliente();

    private String tabla="clientes"; 
    
    public TCliente(String filtro) {
        consulta("SELECT * FROM "+tabla+" "+filtro);
    }

    public TCliente() {
        consulta("SELECT * FROM "+tabla);
    }

    public void cargaDatos(){
        try{
            cli.idcliente=rs.getInt("id");
            cli.nombre=rs.getString("nombre");
            cli.apellido=rs.getString("apellidos");
            cli.dni=rs.getString("dni"); 
            cli.email=rs.getString("e-mail");
            cli.tel=rs.getString("telefono");
            cli.usu=rs.getString("usuario");
            //cli.pas=rs.getString("contraseña"); 
            cli.infoa=rs.getBoolean("info_actividades");
            cli.infoo=rs.getBoolean("info_ofertas");
            
            cli.numeroRegistro=rs.getRow();
        }
        catch(SQLException ex){
            cli = new Cliente();
        }
     }


    public void cargaDatosRS(){
        try{
            //rs.updateString("tipo",reg.tipo);
            rs.updateString("nombre",cli.nombre);
            rs.updateString("apellidos",cli.apellido);
            rs.updateString("dni",cli.dni);
            rs.updateString("e-mail",cli.email);
            rs.updateString("telefono",cli.tel);
            rs.updateString("usuario",cli.usu);
            rs.updateString("password",cli.pas);
            rs.updateBoolean("info_actividades",cli.infoa);
            rs.updateBoolean("info_ofertas",cli.infoo);            
        }
        catch(SQLException ex){
            ex.printStackTrace();
        }
     }







    public String getTabla() {
        return tabla;
    }
    
    
    public void setIdcliente(int newidcliente) {
        cli.idcliente = newidcliente;
    }

    public int getIdcliente() {
        return cli.idcliente;
    }

    public void setNombre(String newnombre) {
        cli.nombre = newnombre;
    }

    public String getNombre() {
        return cli.nombre;
    }

    public void setApellido(String newapellido) {
        cli.apellido = newapellido;
    }

    public String getApellido() {
        return cli.apellido;
    }

    public void setDni(String newdni) {
        cli.dni = newdni;
    }

    public String getDni() {
        return cli.dni;
    }

    public void setEmail(String newemail) {
        cli.email = newemail;
    }

    public String getEmail() {
        return cli.email;
    }

    public void setTel(String newtel) {
        cli.tel = newtel;
    }

    public String getTel() {
        return cli.tel;
    }

    public void setUsu(String newusu) {
        cli.usu = newusu;
    }

    public String getUsu() {
        return cli.usu;
    }

    public void setPas(String newpas) {
        cli.pas = newpas;
    }

    public String getPas() {
        return cli.pas;
    }

    public void setInfoa(boolean newinfoa) {
        cli.infoa = newinfoa;
    }

    public boolean isInfoa() {
        return cli.infoa;
    }

    public void setInfoo(boolean newinfoo) {
        cli.infoo = newinfoo;
    }

    public boolean isInfoo() {
        return cli.infoo;
    }

    public void setNumeroRegistro(int newnumeroRegistro) {
        cli.numeroRegistro = newnumeroRegistro;
    }

    public int getNumeroRegistro() {
        return cli.numeroRegistro;
    }
    
    
    
    
    public void asociaDatos(int idcliente, String nombre, String apellido, String dni, String email, String tel, String usu ,String pas ,boolean infoa, boolean infoo, int numeroRegistro) {
    cli.idcliente=idcliente;
    cli.nombre=nombre;
    cli.apellido=apellido;
    cli.dni=dni;
    cli.email=email;
    cli.tel=tel;
    cli.usu=usu;
    cli.pas=pas;
    cli.infoa=infoa;
    cli.infoo=infoo;
 
    }
    
    public Cliente getClassDatos(){
        return cli;
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
        irA(posActual);
        }
        catch(SQLException ex){
            ex.printStackTrace();
        }
        return vcli;
    }

    public Vector toComoBoxSQL(){
        Vector datos = new Vector();
        
        //datos.add(new DatosComboBox());
        datos.add(new DatosComboBox("Nombre","nombre"));
        datos.add(new DatosComboBox("Apellidos","apellido"));
        datos.add(new DatosComboBox("DNI","dni"));
        datos.add(new DatosComboBox("e-mail","email"));

        datos.add(new DatosComboBox("Telefono","tel"));
        datos.add(new DatosComboBox("Usuario","usu"));
        
        datos.add(new DatosComboBox("Info_actividades","infoa"));
        datos.add(new DatosComboBox("Info_ofertas","infoo"));
        
        
        return datos;
    }












}
