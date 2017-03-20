package agrotur;

import java.awt.Image;

import java.util.Vector;

public class Actividades {
    public int id_actividades;
    public String nombre;
    public String descripcion;
    public String imagen;
    public float precio;
    public int numeroRegistro;
    
    public Actividades(int id_actividades,String nombre, String descripcion, String foto,float precio,int numeroRegistro) {
        this.id_actividades=id_actividades;
        this.nombre=nombre;
        this.descripcion=descripcion;
        this.imagen=foto;
        this.precio=(float)precio;
        this.numeroRegistro=numeroRegistro;
        }
    
    public Actividades (Actividades Act){
        this.id_actividades=Act.id_actividades;
        this.nombre=Act.nombre;
        this.descripcion=Act.descripcion;
        this.imagen=Act.imagen;
        this.precio=(float)Act.precio;
        this.numeroRegistro=Act.numeroRegistro;
                 }
    public Actividades(){
        this(0,"","","",0.0f,0);
    }

    public void asociaDatos(int id_actividades,String nombre, String descripcion,String foto ,float precio,int numeroRegistro) {
        this.id_actividades=id_actividades;
        this.nombre=nombre;
        this.descripcion=descripcion;
        this.imagen=foto;
        this.precio=(float)precio;   
        this.numeroRegistro=numeroRegistro; 
    }
 
    public String toString(){
        return id_actividades+" - "+nombre+" - "+precio+" €";
    }

    public void setId_actividades(int newid_actividades) {
        this.id_actividades = newid_actividades;
    }
    public int getId_actividades() {
        return id_actividades;
    }
    public void setNombre(String newnombre) {
        this.nombre = newnombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setDescripcion(String newdescripcion) {
        this.descripcion = newdescripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setFoto(String newimagen) {
        this.imagen = newimagen;
    }

    public String getimagen() {
        return imagen;
    }

    public void setPrecio(float newprecio) {
        this.precio = newprecio;
    }

    public float getPrecio() {
        return (float)precio;
    }

    public void setNumeroRegistro(int newnumeroRegistro) {
        this.numeroRegistro = newnumeroRegistro;
    }

    public int getNumeroRegistro() {
        return numeroRegistro;
    }
    

}
