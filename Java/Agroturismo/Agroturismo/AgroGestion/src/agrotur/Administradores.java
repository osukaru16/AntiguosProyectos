package agrotur;

public class Administradores {
    
    public int idadm;
    public String usuario;
    public String pass;
    public int numeroRegistro;
    
    public Administradores(int idadm,String usuario, String pass, int numeroRegistro) {
     
        this.idadm = idadm;
        this.usuario = usuario;
        this.pass = pass;
        this.numeroRegistro = numeroRegistro;
        
    }
    
    public Administradores(Administradores admin) {
        
        this.idadm=admin.idadm;
        this.usuario=admin.usuario;
        this.pass=admin.pass;
        this.numeroRegistro=admin.numeroRegistro;
    }
    
    public Administradores() {
        this(0,"","",0);
    }

    public void asociaDatos(int id, String user, String clave, int numeroRegistro){
        this.idadm = id;
        this.usuario = user;
        this.pass = clave;
        this.numeroRegistro= numeroRegistro;
    }
    public void setIdadm(int newidadm) {
        this.idadm = newidadm;
    }

    public int getIdadm() {
        return idadm;
    }

    public void setUsuario(String newusuario) {
        this.usuario = newusuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setPass(String newpass) {
        this.pass = newpass;
    }

    public String getPass() {
        return pass;
    }

    public void setNumeroRegistro(int newnumeroRegistro) {
        this.numeroRegistro = newnumeroRegistro;
    }

    public int getNumeroRegistro() {
        return numeroRegistro;
    }
    public String toString(){
        return idadm+" - "+usuario+" - "+pass;
    }
}

