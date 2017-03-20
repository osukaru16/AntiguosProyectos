package agrotur;

import java.sql.SQLException;

public class TRegimen extends MotorBD {
    Regimen reg = new Regimen();
    
    private String tabla="tregimen";

    public TRegimen(String filtro) {
        consulta("SELECT * FROM "+tabla+" "+filtro);
    }
    public TRegimen() {
        consulta("SELECT * FROM "+tabla);
    }
    
    public void cargaDatos(){
        try{
            reg.tipo=rs.getString("tipo");
            reg.descripcion=rs.getString("descripcion");
            reg.precio=(float)rs.getFloat("precio");
            reg.activo=rs.getBoolean("activo");            
            reg.numeroRegistro=rs.getRow();
        }
        catch(SQLException ex){
            ex.printStackTrace();
        }
     }

    public void cargaDatosRS(){
        try{
            rs.updateString("tipo",reg.tipo);
            rs.updateString("descripcion",reg.descripcion);
            rs.updateFloat("precio",reg.precio);
            rs.updateBoolean("activo",reg.activo);            
        }
        catch(SQLException ex){
            ex.printStackTrace();
        }
     }

    public String getTabla() {
        return tabla;
    }
    public void setTipo(String newtipo) {
        reg.tipo = newtipo;
    }

    public String getTipo() {
        return reg.tipo;
    }

    public void setDescripcion(String newdescripcion) {
        reg.descripcion = newdescripcion;
    }

    public String getDescripcion() {
        return reg.descripcion;
    }

    public void setPrecio(float newprecio) {
        reg.precio = newprecio;
    }

    public float getPrecio() {
        return reg.precio;
    }

    public void setActivo(boolean newactivo) {
        reg.activo = newactivo;
    }

    public boolean isActivo() {
        return reg.activo;
    }
    
    public void asociaDatos(String ti, String des, float pre, boolean act){
        reg.tipo=ti;
        reg.descripcion=des;
        reg.precio=pre;
        reg.activo=act;
    }
    
    public Regimen getClassDatos(){
        return reg;
    }
    
    public Regimen[] toArray(){
        Regimen vreg[] = new Regimen[contarResultados()];        
        try{
        int posActual=rs.getRow();
        
        primero();
        for(int c=0;c<contarResultados();c++){
              vreg[c]=new Regimen(reg);
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
