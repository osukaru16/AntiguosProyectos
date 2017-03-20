package agrotur;

import java.sql.Date;

public class Consulta {
        public int id;
        public String email;
        public String telefono;
        public String mensaje;
        public Date fecha;
        public boolean resuelto;
        public int numeroRegistro;
        
        public Consulta(int id,String email,String telefono,String mensaje,Date fecha,boolean resuelto,int numeroRegistro){
            this.id=id;
            this.email=email;
            this.telefono=telefono;
            this.mensaje=mensaje;
            this.fecha=fecha;
            this.resuelto=resuelto;
            this.numeroRegistro=numeroRegistro;
        }
        
    public Consulta(Consulta cons){
        this.id=cons.id;
        this.email=cons.email;
        this.telefono=cons.telefono;
        this.mensaje=cons.mensaje;
        this.fecha=cons.fecha;
        this.resuelto=cons.resuelto;
        this.numeroRegistro=cons.numeroRegistro;
    }
        
        public Consulta(){
            this(0,"","","",new Date(System.currentTimeMillis()),false,0);
        }


    public void setId(int newid) {
        this.id = newid;
    }

    public int getId() {
        return id;
    }

    public void setEmail(String newemail) {
        this.email = newemail;
    }

    public String getEmail() {
        return email;
    }

    public void setTelefono(String newtelefono) {
        this.telefono = newtelefono;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setMensaje(String newmensaje) {
        this.mensaje = newmensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setFecha(Date newfecha) {
        this.fecha = newfecha;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setResuelto(boolean newresuelto) {
        this.resuelto = newresuelto;
    }

    public boolean isResuelto() {
        return resuelto;
    }

    public void setNumeroRegistro(int newnumeroRegistro) {
        this.numeroRegistro = newnumeroRegistro;
    }

    public int getNumeroRegistro() {
        return numeroRegistro;
    }
    
    public String toString(){
        String modoContacto=(email.length()==0)?telefono:email;
        return id+" - "+fecha+" - "+modoContacto;
    }
}