/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.edu.uniandes.acceso;

public final  class Global
{    
    public final static String URL;
    public final static String DRIVER;
    public final static String USER;
    public final static String PASS;
    static
    {
        URL = getValor("url");
        DRIVER = getValor("driver");
        USER = getValor("usuario");
        PASS = getValor("clave");        
    }
     public static String getValor(String clave)
     {
         // CARGO DATOS DESDE ARCHIVO DE CONFIGURACION
        java.util.ResourceBundle Configuracion = java.util.ResourceBundle.getBundle("ec.edu.uniandes.acceso.DataBase");
        return  Configuracion.getString(clave);
     }    
}