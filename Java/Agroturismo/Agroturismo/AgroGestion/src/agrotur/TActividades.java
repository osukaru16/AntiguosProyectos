package agrotur;


import java.awt.Component;

import java.awt.Image;

import java.sql.SQLException;

import java.util.Vector;

import javax.swing.JList;



public class TActividades extends MotorBD {
    Actividades act = new Actividades();
    
    private String tabla="tactividades";

    public TActividades(String filtro) {
        consulta("SELECT * FROM "+tabla+" "+filtro);
    }
    public TActividades() {
        consulta("SELECT * FROM "+tabla);
    }
    
    public void cargaDatos(){
        try{
            act.id_actividades=rs.getInt("idact");
            act.nombre=rs.getString("nombre");
            act.descripcion=rs.getString("descripcion");
            act.imagen=rs.getString("foto");
            act.precio=rs.getFloat("precio");
            act.numeroRegistro=rs.getRow();
        }
        catch(SQLException ex){
            act = new Actividades();
        }
     }

    public void cargaDatosRS(){
        try{
        //no poner id    rs.updateInt("id_actividades",act.id_actividades);
            rs.updateString("nombre",act.nombre);
            rs.updateString("descripcion",act.descripcion);
            rs.updateString("foto",act.imagen);
            rs.updateFloat("precio",act.precio);    
           
           
        }
        catch(SQLException ex){
            ex.printStackTrace();
        }
     }

    public String getTabla() {
        return tabla;
    }
    
   /* public void borrar(string){
        DELETE FROM tabla WHERE  
        super.borrar();
        }*/
    
    
    public void asociaDatos(int id,String nom, String des,String img,float pre,int num){
        act.id_actividades=id;
        act.nombre=nom;
        act.descripcion=des;
        act.imagen=img;
        act.precio=pre;
        act.numeroRegistro=num; 
        
    }
    
    public Actividades getClassDatos(){
        return act;
    }
    
    

    public void setAct(Actividades newact) {
        this.act = newact;
    }

    public Actividades getAct() {
        return act;
    }

    public void setTabla(String newtabla) {
        this.tabla = newtabla;
    }
    
    public Actividades[] toArray(){
        Actividades vact[] = new Actividades[contarResultados()];        
        try{
        int posActual=rs.getRow();
        
        primero();
        for(int c=0;c<contarResultados();c++){
              vact[c]=new Actividades(act);
              siguiente();
        }
        irA(posActual);
        }
        catch(SQLException ex){
            ex.printStackTrace();
        }
        return vact;
    }  
    
    
    public void setId_actividades(int newid_actividades) {
        act.id_actividades = newid_actividades;
    }
    public int getId_actividades() {
        return act.id_actividades;
    }
    public void setNombre(String newnombre) {
        act.nombre = newnombre;
    }

    public String getNombre() {
        return act.nombre;
    }

    public void setDescripcion(String newdescripcion) {
        act.descripcion = newdescripcion;
    }

    public String getDescripcion() {
        return act.descripcion;
    }

    public void setImagen(String newimagen) {
        act.imagen = newimagen;
    }

    public String getImagen() {
        return act.imagen;
    }

    public void setPrecio(float newprecio) {
        act.precio = newprecio;
    }

    public float getPrecio() {
        return (float)act.precio;
    }

    public void setNumeroRegistro(int newnumeroRegistro) {
        act.numeroRegistro = newnumeroRegistro;
    }

    public int getNumeroRegistro() {
        return act.numeroRegistro;
    }
    
    
}
