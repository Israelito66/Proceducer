/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.edu.uniandes.entidades;
import java.util.Calendar;

/**
 *
 * @author Usuario
 */
 public class clsCliente {

    private int _id;
    private String _cedula;
    private String _nombres;
    private String _apellidos;
    private String _direccion;
    private String _telefono;
    private String _celular;
    private String _correo;
    
   

   
    
    public clsCliente() {
    }

    public clsCliente(int _id, String _cedula, String _nombres, String _apellidos, String _direccion, String _telefono, String _celular, String _correo) {
        this._id = _id;
        this._cedula = _cedula;
        this._nombres = _nombres;
        this._apellidos = _apellidos;
        this._direccion = _direccion;
        this._telefono = _telefono;
        this._celular = _celular;
        this._correo = _correo;
    }

    public int getId() {
        return _id;
    }

    public void setId(int _id) {
        this._id = _id;
    }

    public String getCedula() {
        return _cedula;
    }

    public void setCedula(String _cedula) {
        this._cedula = _cedula;
    }

    public String getNombres() {
        return _nombres;
    }

    public void setNombres(String _nombres) {
        this._nombres = _nombres;
    }

    public String getApellidos() {
        return _apellidos;
    }

    public void setApellidos(String _apellidos) {
        this._apellidos = _apellidos;
    }

    public String getDireccion() {
        return _direccion;
    }

    public void setDireccion(String _direccion) {
        this._direccion = _direccion;
    }

    public String getTelefono() {
        return _telefono;
    }

    public void setTelefono(String _telefono) {
        this._telefono = _telefono;
    }

    public String getCelular() {
        return _celular;
    }

    public void setCelular(String _celular) {
        this._celular = _celular;
    }

    public String getCorreo() {
        return _correo;
    }

    public void setCorreo(String _correo) {
        this._correo = _correo;
    }
    
    public void insertCliente(clsCliente cliente){
        
    }

}

