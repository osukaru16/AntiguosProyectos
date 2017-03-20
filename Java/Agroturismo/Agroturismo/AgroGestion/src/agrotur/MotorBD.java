package agrotur;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MotorBD {
    private Connection con = null;
    private Statement stmt = null;
    public ResultSet rs = null;
    private String bd = "agrogestion";
    private String login = "root";
    private String password = "ebitebit";
    private String url = "jdbc:mysql://localhost/";
    private boolean conectado = false;
    private int nReg=0;

    /**
     * Method MotorBD
     *
     *
     */
     public MotorBD(String bd) {
         this.bd = bd;
         conectar();
     }
    
    public MotorBD() {
        this("agrogestion");
    }



    /**
     * Method conectar
     *
     *
     * @return
     *
     */
    public boolean conectar() {
        if (conectado)
            return conectado;
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            con = DriverManager.getConnection(url + bd, login, password);
            if (con != null) conectado = true;

        } catch (SQLException ex) {
            System.out.println(ex);
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        } catch (Exception ex) {
           System.out.println(ex);
        }

        return conectado;
    }

    /**
     * Method desconectar
     *
     *
     * @return
     *
     */
    public boolean desconectar() {
        if (!conectado)
            return true;
        try {
            if (con != null)con.close();
            if (stmt != null)stmt.close();
            if (rs != null)rs.close();
            con = null;
            rs = null;
            stmt = null;
            conectado = false;
        } catch (SQLException ex) {
            System.out.println(ex);
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return !conectado;
    }

    /**
     * Method consulta
     *
     *
     * @param sql
     *
     */
    public void consulta(String sql) {
        if(!conectado)return;
        try {
           stmt=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
           rs=stmt.executeQuery(sql);
            
            if(rs!=null){
               contarResultados();
               primero();
               cargaDatos();
            }
            
        } catch (SQLException ex) {
            System.out.println(ex);
        }  catch (Exception ex) {
            System.out.println(ex);
        }
    }

    public void cargaDatos(){
    }
    /**
     * Method anterior
     *
     *
     */
    public void anterior() {
        if(!conectado)return;
        try {
            if(rs!=null){
                if(!rs.isFirst()){
                    rs.previous();
                    cargaDatos();
                }
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }  catch (Exception ex) {
            System.out.println(ex);
        }
    }

    /**
     * Method siguiente
     *
     *
     */
    public void siguiente() {
        if(!conectado)return;
        try {
            if(rs!=null){
                if(!rs.isLast()){
                    rs.next();
                    cargaDatos();
                }
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }  catch (Exception ex) {
            System.out.println(ex);
        }
    }

    /**
     * Method primero
     *
     *
     */
    public void primero() {
        if(!conectado)return;
        try {
            if(rs!=null){
                rs.first();
              cargaDatos();
              
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }  catch (Exception ex) {
            System.out.println(ex);
        }
    }

    /**
     * Method ultimo
     *
     *
     */
    public void ultimo() {
        if(!conectado)return;
        try {
            if(rs!=null){
                rs.last();
              cargaDatos();
              
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }  catch (Exception ex) {
            System.out.println(ex);
        }
    }

    /**
     * Method irA
     *
     *
     * @param nRegistro
     *
     */
    public void irA(int nRegistro) {
        if(!conectado)return;
        try {
            if(rs!=null){
                
                if(nRegistro<=nReg){
                    rs.first();
                    rs.relative(nRegistro-1);
                    cargaDatos();
                }
              
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }  catch (Exception ex) {
            System.out.println(ex);
        }
    }

    /**
     * Method borrar
     *
     *
     */
    public void borrar() {
        if(!conectado)return;
        try {
            if(rs!=null){
                rs.deleteRow();
                contarResultados();
                if(nReg>0) {
                    if(!rs.previous())rs.next();
                    cargaDatos();
                }
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }  catch (Exception ex) {
            System.out.println(ex);
        }
    }

    /**
     * Method contarResultados
     *
     *
     * @return
     *
     */
    public int contarResultados() {
        try{
            int colActual = rs.getRow();
            rs.last();
            nReg=rs.getRow();
            rs.beforeFirst();    
            rs.relative(colActual);
        }
        catch(SQLException ex){
            //ex.printStackTrace();
            return nReg=0;
        }
        return nReg;
    }


    public void cargaDatosRS(){
    }

    public void altas(){
        try{
            rs.moveToInsertRow();
            cargaDatosRS();
            rs.insertRow();
            rs.last();
            contarResultados();
            cargaDatos();
        }
        catch(SQLException ex){
            ex.printStackTrace();
        }
    }
    
    public void modificar(){
        try{

            cargaDatosRS();
            rs.updateRow();
        }
        catch(SQLException ex){
            ex.printStackTrace();
        }
    }    
    public boolean isUltimo(){
        
        try{
            return rs.isLast();
        }
        catch(SQLException ex){
            ex.printStackTrace();
        }
        return true;
    }    
    
    public boolean isPrimero(){
        
        try{
            return rs.isFirst();
        }
        catch(SQLException ex){
            ex.printStackTrace();
        }
        return true;
    }    
    
    
    public boolean hayRegistros(){
        if(nReg>0)return true;
        else return false;
    }
    
    
  
    
    
    
}

