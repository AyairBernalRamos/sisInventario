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
import modelo.conexion;
import modelo.productos;


/**
 *
 * @author Ayair Martin
 */
public class DaoProductos {
    
    
    Connection con;
    conexion cn = new conexion();
    PreparedStatement ps;
    ResultSet rs;
    
    public boolean insertar(productos c){
        String SQL="INSERT INTO productos (idproducto,nombre,stock,idCategoria,precioVenta) VALUES (?,?,?,?,?)";
        try{
            con = cn.conectar();
            ps=con.prepareStatement(SQL);
            ps.setInt(1, c.getIdProducto());
            ps.setString(2, c.getNomProd());
            ps.setInt(3, c.getStock());
            ps.setInt(4, c.getIdCategoria());
            ps.setDouble(5, c.getPrecioVenta());
            
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
    
    //metodo para listar los clientes que estan en la bd para mostrar en el programa
    public List Listar(){
        List<productos> lista = new ArrayList<>();
        String SQL="SELECT * FROM productos";
        
        try{
            con = cn.conectar();
            ps=con.prepareStatement(SQL);
            rs = ps.executeQuery();
            while(rs.next()){
                productos c = new productos();
                c.setIdProducto(rs.getInt(1));
                c.setNomProd(rs.getString(2));
                c.setStock(rs.getInt(3));
                c.setIdCategoria(rs.getInt(4));
                c.setPrecioVenta(rs.getDouble(5));
                
                lista.add(c);               
            }
            
        }
        catch(Exception e){
            JOptionPane.showConfirmDialog(null, e);
            
        }
        return lista;
        
    }
    
    //buscar
    public boolean buscar(productos c){
        String SQL="SELECT * FROM productos WHERE idproducto=?";
        try{
            con = cn.conectar();
            ps=con.prepareStatement(SQL);
            ps.setInt(1, c.getIdProducto());
            rs = ps.executeQuery();
            if(rs.next()){
                c.setIdProducto(rs.getInt(1));
                c.setNomProd(rs.getString(2));
                c.setStock(rs.getInt(3));
                c.setIdCategoria(rs.getInt(4));
                c.setPrecioVenta(rs.getDouble(5));
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
    public boolean editar(productos c){
        String SQL = "UPDATE productos set nombre=?,stock=?,idCategoria=?,precioVenta=? WHERE idproducto=";
        try{
            con=cn.conectar();
            ps=con.prepareStatement(SQL);
            ps.setString(1, c.getNomProd());
            ps.setInt(2, c.getStock());
            ps.setInt(3, c.getIdCategoria());
            ps.setDouble(4, c.getPrecioVenta());
            ps.setDouble(5, c.getIdProducto());
            int n=ps.executeUpdate();
            if (n!=0) {
                return true;
            }else{
                return false;
            }
        }catch(Exception e){
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }
    
    
    
    public boolean sumarStock(int idproducto, int cantidad){
        String SQL="UPDATE productos SET stock=stock+"+cantidad+" WHERE idproducto="+idproducto;
        try{
            con = cn.conectar();
            ps=con.prepareStatement(SQL);
            
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
    
    public boolean restarStock(int idp, int cant){
        String SQL ="UPDATE productos set stock=stock-"+cant+" WHERE idproducto="+idp;
        try {
            con = cn.conectar();
            ps=con.prepareStatement(SQL);
            int n=ps.executeUpdate();
            if (n!=0) {
                return true;
            }else{
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
        
    }
    
    //numero de salidas
    public int numProducto(){
        int numero = 0;
        String SQL="SELECT MAX(idproducto) FROM productos";
        try{
            con = cn.conectar();
            ps=con.prepareStatement(SQL);
            rs = ps.executeQuery();
            while(rs.next()){
                numero = rs.getInt(1);
                
            }
        }
        catch(Exception e){
            JOptionPane.showConfirmDialog(null, e);
        }
        return numero;
    }
    
    
    
    
    
}
