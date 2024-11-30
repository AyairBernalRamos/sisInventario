/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Ayair Martin
 */
public class proveedor {
    
    int idProveedor;
    String nombres;
    String apellidos;
    String documento;
    String Rsocial;
    String direccion;
    String telefono;
    String correo;

    public proveedor() {
    }

    public proveedor(int idProveedor, String nombres, String apellidos, String documento, String Rsocial, String direccion, String telefono, String correo) {
        this.idProveedor = idProveedor;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.documento = documento;
        this.Rsocial = Rsocial;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getRsocial() {
        return Rsocial;
    }

    public void setRsocial(String Rsocial) {
        this.Rsocial = Rsocial;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    
    
    
    
    
}
