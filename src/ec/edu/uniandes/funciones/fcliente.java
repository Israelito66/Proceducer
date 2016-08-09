 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.edu.uniandes.funciones;

import ec.edu.uniandes.entidades.*;

import ec.edu.uniandes.acceso.*;
import java.util.*;

/**
 *
 * @author Usuario
 */
public class fcliente {
     public static boolean insCliente(clsCliente cliente){
        boolean respuesta = false;
        String sql = "INSERT INTO clientes "
                         +"values(?,?,?,?,?,?,?)";
        ArrayList<Parametro> lstParametro=new ArrayList<>();
        lstParametro.add(new Parametro(1, cliente.getId()));
           lstParametro.add(new Parametro(2, cliente.getCedula()));
               lstParametro.add(new Parametro(3, cliente.getNombres()));
                   lstParametro.add(new Parametro(4, cliente.getApellidos()));
                         lstParametro.add(new Parametro(5, cliente.getDireccion()));
                               lstParametro.add(new Parametro(6, cliente.getCorreo()));
                                    lstParametro.add(new Parametro(7, cliente.getTelefono()));
                                        
                           
        try{
            respuesta=AccesoDatos.ejecutaComando(sql, lstParametro);
            
        }
        catch(Exception ex){
            System.out.printf("error: " + ex.getMessage());
        }
        return respuesta;
     }
     
     //clase borrar
     public static boolean delCliente(clsCliente cliente){
        boolean respuesta=false;
        String sql="DELETE FROM clientes "
                +" WHERE id=?";
                
        ArrayList<Parametro>lstParametro=new ArrayList<>();
        lstParametro.add(new Parametro(1, cliente.getId()));
        
        try {
            respuesta=AccesoDatos.ejecutaComando(sql, lstParametro);
        } catch (Exception ex) {
            System.out.println("error:  "+ ex.getMessage());
        }
        
        
        
        return respuesta;
    }
     
     //actualizar funcion
     
     public static boolean actualizarCliente(clsCliente cliente){
          boolean respuesta=false;
       String sql=  "UPDATE clientes " 
  + "SET nombres= ?,apellidos= ?,cedula= ?,telefono= ?,direccion= ?,correo= ?"
 +"WHERE id= ?";
       
        ArrayList<Parametro> lstParametro=new ArrayList<>();
        lstParametro.add(new Parametro(7, cliente.getId()));
           lstParametro.add(new Parametro(3, cliente.getCedula()));
               lstParametro.add(new Parametro(1, cliente.getNombres()));
                   lstParametro.add(new Parametro(2, cliente.getApellidos()));
                         lstParametro.add(new Parametro(5, cliente.getDireccion()));
                               lstParametro.add(new Parametro(6, cliente.getCorreo()));
                                    lstParametro.add(new Parametro(4, cliente.getTelefono()));
        
         try {
            respuesta=AccesoDatos.ejecutaComando(sql, lstParametro);
        } catch (Exception ex) {
            System.out.println("error:  "+ ex.getMessage());
        }
        
        return respuesta;
    }
     
     //Extracion de datos de la tabla
        public static clsCliente Cliente(int id){
            clsCliente cliente = null;
            String sql="SELECT * FROM "
                    +"FROM clientes "
                    +"WHERE id=?,?,?,?,?,?,?";
           ArrayList<Parametro> lstParametro=new ArrayList<>();
         lstParametro.add(new Parametro(1, cliente.getId()));
           lstParametro.add(new Parametro(2, cliente.getCedula()));
               lstParametro.add(new Parametro(3, cliente.getNombres()));
                   lstParametro.add(new Parametro(4, cliente.getApellidos()));
                         lstParametro.add(new Parametro(5, cliente.getDireccion()));
                               lstParametro.add(new Parametro(6, cliente.getCorreo()));
                                    lstParametro.add(new Parametro(7, cliente.getTelefono()));
                                   
                                    
          try{
              ConjuntoResultado respuesta = AccesoDatos.ejecutaQuery(sql, lstParametro);
              while(respuesta.next()){
                  cliente = new clsCliente(respuesta.getInt(0),respuesta.getString(1),respuesta.getString(2),respuesta.getString(3),respuesta.getString(4),respuesta.getString(5),respuesta.getString(6),"");
              }
              
          }
          catch(Exception ex){
              System.out.println("error: "+ex.getMessage());
          }
          return cliente;
        }
       
        

 //para en listar lo que hay en la base de datos 
        
 public static ArrayList<clsCliente> getCliente(String id){
    ArrayList<clsCliente> ltsCliente = new ArrayList<>();
    String sql = "Select * from clientes where id = "+id;
    ArrayList<Parametro> lstParametro = new ArrayList<>();
    try{
        ConjuntoResultado respuesta= AccesoDatos.ejecutaQuery(sql, lstParametro);
        clsCliente client=null;
        while(respuesta.next())
            client=new clsCliente(respuesta.getInt(0),respuesta.getString(1),respuesta.getString(2),respuesta.getString(3),respuesta.getString(4),respuesta.getString(5),respuesta.getString(6),"");
            ltsCliente.add(client);
    }
         catch(Exception ex){
              System.out.println("errorr: "+ex.getMessage());
          }
          return ltsCliente;
        }
        
    }


//Otra forma de hacer lo del parametro ejemplo 

//parametro prm = new parametro();
//prm.setPosition(1);
//prm.setValor(cliente.getId);
//lstParametro.add(prm);
    
