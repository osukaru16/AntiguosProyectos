package agrotur;

import java.sql.Date;
import java.sql.SQLException;
import java.sql.Date;

public class TConsulta extends MotorBD{
    Consulta reg = new Consulta();
    private String tabla = "consultas";
    
    
    public TConsulta(String filtro) {
        consulta("SELECT * FROM "+tabla+" "+filtro);
    }
    public TConsulta() {
        consulta("SELECT * FROM "+tabla);
    }
   public void cargaDatos(){
        try{
            
            reg.id = rs.getInt("id");
            reg.email = rs.getString("email");
            reg.telefono = rs.getString("telefono_contacto");
            reg.mensaje = rs.getString("mensaje");
            reg.fecha = rs.getDate("fecha_mensaje");   
            reg.resuelto = rs.getBoolean("resuelto");
            reg.numeroRegistro=rs.getRow();
        }
        catch(SQLException ex){
         //   ex.printStackTrace();
         reg = new Consulta();
        }
     }
    public void altas(String correo,String mensaje,Date hoy){
        try{
            rs.moveToInsertRow();
            cargaDatosRS(correo,mensaje,hoy);
            rs.insertRow();
            rs.last();
            cargaDatos();
        }
        catch(SQLException ex){
            ex.printStackTrace();
        }
    }
    
    public void cargaDatosRS(String correo,String mensaje,Date hoy){
        try{
            
            //Date hoy = new Date(0);
            rs.updateString("email",correo);
            rs.updateString("telefono_contacto","");
            rs.updateDate("fecha_mensaje",hoy);
            rs.updateString("mensaje",mensaje);
            rs.updateBoolean("resuelto",false); 
            
        }
        catch(SQLException ex){
            ex.printStackTrace();
        }
     }
    public void cargaDatosRS(){
        try{
            rs.updateString("email",reg.getEmail());
            rs.updateString("telefono_contacto",reg.getTelefono());
            rs.updateDate("fecha_mensaje",reg.getFecha());
            rs.updateString("mensaje",reg.getMensaje());
            rs.updateBoolean("resuelto",true); 
            
        }
        catch(SQLException ex){
            ex.printStackTrace();
        }
     }
   
    

    public void setReg(Consulta newreg) {
        this.reg = newreg;
    }

    public Consulta getReg() {
        return reg;
    }

    public void setTabla(String newtabla) {
        this.tabla = newtabla;
    }

    public String getTabla() {
        return tabla;
    }

    public void setId(int newid) {
        reg.id = newid;
    }

    public int getId() {
        return reg.id;
    }

    public void setEmail(String newemail) {
        reg.email = newemail;
    }

    public String getEmail() {
        return reg.email;
    }

    public void setTelefono(String newtelefono) {
       reg.telefono = newtelefono;
    }

    public String getTelefono() {
        return reg.telefono;
    }

    public void setMensaje(String newmensaje) {
        reg.mensaje = newmensaje;
    }

    public String getMensaje() {
        return reg.mensaje;
    }

    public void setFecha(Date newfecha) {
        reg.fecha = newfecha;
    }

    public Date getFecha() {
        return reg.fecha;
    }

    public void setResuelto(boolean newresuelto) {
        
        reg.resuelto = newresuelto;
    }

    public boolean isResuelto() {
        
        return reg.resuelto;
    }

    public void setNumeroRegistro(int newnumeroRegistro) {
        reg.numeroRegistro = newnumeroRegistro;
    }

    public int getNumeroRegistro() {
        return reg.numeroRegistro;
    }

    public Consulta[] toArray(){
        Consulta vreg[] = new Consulta[contarResultados()];        
        try{
        int posActual=rs.getRow();
        
        primero();
        for(int c=0;c<contarResultados();c++){
              vreg[c]=new Consulta(reg);
              siguiente();
        }
        irA(posActual);
        }
        catch(SQLException ex){
            ex.printStackTrace();
        }
        return vreg;
    }

}
