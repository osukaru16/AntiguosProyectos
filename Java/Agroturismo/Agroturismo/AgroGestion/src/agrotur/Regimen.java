package agrotur;

public class Regimen {
    
    public String tipo;
    public String descripcion;
    public float precio;
    public boolean activo;
    public int numeroRegistro;
    
    public Regimen(String tipo, String descripcion, float precio, boolean activo,int numeroRegistro) {
        this.tipo=tipo;
        this.descripcion=descripcion;
        this.precio=(float)precio;
        this.activo=activo;
        this.numeroRegistro=numeroRegistro;
    }
    
    public Regimen(Regimen reg){
        this.tipo=reg.tipo;
        this.descripcion=reg.descripcion;
        this.precio=(float)reg.precio;
        this.activo=reg.activo;
        this.numeroRegistro=reg.numeroRegistro;
    }
    public Regimen() {
        this("","",0.0f,false,0);
    }

    public void asociaDatos(String tipo, String descripcion, float precio, boolean activo,int numeroRegistro) {
        
        this.tipo=tipo;
        this.descripcion=descripcion;
        this.precio=(float)precio;
        this.activo=activo;
        this.numeroRegistro=numeroRegistro;                               
    }
 
    public String toString(){
        return tipo+" - "+descripcion+" - "+precio;
    }


    public void setTipo(String newtipo) {
        this.tipo = newtipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setDescripcion(String newdescripcion) {
        this.descripcion = newdescripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setPrecio(float newprecio) {
        this.precio = newprecio;
    }

    public float getPrecio() {
        return precio;
    }

    public void setActivo(boolean newactivo) {
        this.activo = newactivo;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setNumeroRegistro(int newnumeroRegistro) {
        this.numeroRegistro = newnumeroRegistro;
    }

    public int getNumeroRegistro() {
        return numeroRegistro;
    }
}
