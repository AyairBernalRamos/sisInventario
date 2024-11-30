/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.proveedor;
import modelo.conexion;

/**
 *
 * @author Ayair Martin
 */
public class DaoProveedor {
    
    Connection con;
    conexion cn = new conexion();
    PreparedStatement ps;
    ResultSet rs;
    
    public boolean insertar(proveedor p){
        String SQL="INSERT INTO proveedor (nombres, apellidos, documento, Rsocial, direccion, telefono, correo) VALUES (?,?,?,?,?,?,?)";
        try{
            con = cn.conectar();
            ps=con.prepareStatement(SQL);
            ps.setString(1, p.getNombres());
            ps.setString(2, p.getApellidos());
            ps.setString(3, p.getDocumento());
            ps.setString(4, p.getRsocial());
            ps.setString(5, p.getDireccion());
            ps.setString(6, p.getTelefono());
            ps.setString(7, p.getCorreo());
            int n = ps.executeUpdate();
            if(n!=0){
                return true;
            }else{
                return false;
            }
        }
        catch(Exception e){
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
        
        
    }  
    
    public List Listar(){
        List<proveedor> lista = new ArrayList<>();
        String SQL="SELECT * FROM proveedor";
        
        try{
            con = cn.conectar();
            ps=con.prepareStatement(SQL);
            rs = ps.executeQuery();
            while(rs.next()){
                proveedor c = new proveedor();
                c.setIdProveedor(rs.getInt(1));
                c.setNombres(rs.getString(2));
                c.setApellidos(rs.getString(3));
                c.setDocumento(rs.getString(4));
                c.setRsocial(rs.getString(5));
                c.setDireccion(rs.getString(6));
                c.setTelefono(rs.getString(7));
                c.setCorreo(rs.getString(8));
                lista.add(c);               
            }
            
        }
        catch(Exception e){
            JOptionPane.showConfirmDialog(null, e);
            
        }
        return lista;
        
    }
    
    //buscar
    public boolean buscar(proveedor c){
        String SQL="SELECT * FROM proveedor WHERE idproveedor=?";
        try{
            con = cn.conectar();
            ps=con.prepareStatement(SQL);
            ps.setInt(1, c.getIdProveedor());
            rs = ps.executeQuery();
            if(rs.next()){
                c.setIdProveedor(rs.getInt(1));
                c.setNombres(rs.getString(2));
                c.setApellidos(rs.getString(3));
                c.setDocumento(rs.getString(4));
                c.setRsocial(rs.getString(5));
                c.setDireccion(rs.getString(6));
                c.setTelefono(rs.getString(7));
                c.setCorreo(rs.getString(8));
                return true;
            }else{
                return false;
            }
        }
        catch(Exception e){
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }
    
    //metodo editar
    public boolean editar(proveedor c){
        String SQL="UPDATE proveedor set nombres=?, apellidos=?, documento=?, Rsocial=?, direccion=?, telefono=?, correo=? WHERE idproveedor=?";
        try{
            con = cn.conectar();
            ps=con.prepareStatement(SQL);
            ps.setString(1, c.getNombres());
            ps.setString(2, c.getApellidos());
            ps.setString(3, c.getDocumento());
            ps.setString(4, c.getRsocial());
            ps.setString(5, c.getDireccion());
            ps.setString(6, c.getTelefono());
            ps.setString(7, c.getCorreo());
            ps.setInt(8, c.getIdProveedor());
            int n = ps.executeUpdate();
            if(n!=0){
                return true;
            }else{
                return false;
            }
        }
        catch(Exception e){
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
        
    }
    
    //eliminar
    public boolean eliminar(proveedor c){
        String SQL="DELETE FROM proveedor WHERE idproveedor=?";
        try{
            con = cn.conectar();
            ps=con.prepareStatement(SQL);
            ps.setInt(1, c.getIdProveedor());
            int n = ps.executeUpdate();
            if(n!=0){
                return true;
            }else{
                return false;
            }
        }
        catch(Exception e){
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }
    
    //buscar
    public boolean buscarDocumento(proveedor c){
        String SQL="SELECT * FROM proveedor WHERE documento=?";
        try{
            con = cn.conectar();
            ps=con.prepareStatement(SQL);
            ps.setString(1, c.getDocumento());
            rs = ps.executeQuery();
            if(rs.next()){
                c.setIdProveedor(rs.getInt(1));
                c.setNombres(rs.getString(2));
                c.setApellidos(rs.getString(3));
                c.setDocumento(rs.getString(4));
                c.setRsocial(rs.getString(5));
                c.setDireccion(rs.getString(6));
                c.setTelefono(rs.getString(7));
                c.setCorreo(rs.getString(8));
                return true;
            }else{
                return false;
            }
        }
        catch(Exception e){
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }
    
    
}
