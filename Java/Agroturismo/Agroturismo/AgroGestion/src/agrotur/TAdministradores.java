package agrotur;

import java.sql.SQLException;

public class TAdministradores extends MotorBD { 
    Administradores admin = new Administradores();
    private String tabla="administradores";
        
    public TAdministradores() {
        consulta("SELECT * FROM "+tabla);
    }
    public void cargaDatos(){
        try{
            admin.idadm = rs.getInt("idadm");
            admin.usuario = rs.getString("usuario");
            admin.pass = rs.getString("pass");
            admin.numeroRegistro = rs.getRow();
            //System.out.println(admin.idadm);
            //System.out.println(admin.usuario);
            //System.out.println(admin.pass);
        }
        catch(SQLException ex){
            admin = new Administradores();
        }
        
    }

    public void setAdmin(Administradores newadmin) {
        this.admin = newadmin;
    }

    public Administradores getAdmin() {
        return admin;
    }

    public void setTabla(String newtabla) {
        this.tabla = newtabla;
    }

    public String getTabla() {
        return tabla;
    }
    
    public void asociaDatos(int id, String user, String clave){
        admin.idadm = id;
        admin.usuario = user;
        admin.pass = clave;
    }
    

    public void setIdadm(int newidadm) {
        admin.idadm = newidadm;
    }

    public int getIdadm() {
        return admin.idadm;
    }

    public void setUsuario(String newusuario) {
        admin.usuario = newusuario;
    }

    public String getUsuario() {
        return admin.usuario;
    }

    public void setPass(String newpass) {
        admin.pass = newpass;
    }

    public String getPass() {
        return admin.pass;
    }

    public void setNumeroRegistro(int newnumeroRegistro) {
        admin.numeroRegistro = newnumeroRegistro;
    }
        public void cargaDatosRS(){
            try{
                rs.updateString("usuario",admin.usuario);
                rs.updateString("pass",admin.pass);
                
            }
            catch(SQLException ex){
                ex.printStackTrace();
            }
         }
    public int getNumeroRegistro() {
        return admin.numeroRegistro;
    }
    public Administradores getClassDatos(){
            return admin;
    }
        public Administradores[] toArray(){
            Administradores vadmin[] = new Administradores[contarResultados()];        
            try{
            int posActual=rs.getRow();
            
            primero();
            for(int c=0;c<contarResultados();c++){
                  vadmin[c]=new Administradores(admin);
                  siguiente();
            }
                
            irA(posActual);
            }
            catch(SQLException ex){
                ex.printStackTrace();
            }
            System.out.println (vadmin);
            
            return vadmin;
        }
    }

