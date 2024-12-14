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
import modelo.entradas;
import modelo.conexion;

/**
 *
 * @author Ayair Martin
 */
public class DaoEntradas {
    Connection con;
    conexion cn = new conexion();
    PreparedStatement ps;
    ResultSet rs;
    
    public boolean insertar(entradas c){
        String SQL="INSERT INTO entrada (idproducto,stock,idCategoria,fecha,idProveedor,precioEntrada,precioVenta,total) VALUES (?,?,?,?,?,?,?,?)";
        try{
            con = cn.conectar();
            ps=con.prepareStatement(SQL);
            ps.setInt(1, c.getIdproducto());
            ps.setInt(2, c.getStock());
            ps.setInt(3, c.getIdCategoria());
            ps.setDate(4, c.getFecha());
            ps.setInt(5, c.getIdProveedor());
            ps.setDouble(6, c.getPrecioEntrada());
            ps.setDouble(7, c.getPrecioVenta());
            ps.setDouble(8, c.getTotal());
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
        List<entradas> lista = new ArrayList<>();
        String SQL="SELECT * FROM entrada";
        
        try{
            con = cn.conectar();
            ps=con.prepareStatement(SQL);
            rs = ps.executeQuery();
            while(rs.next()){
                entradas c = new entradas();
                c.setIdentrada(rs.getInt(1));
                c.setIdproducto(rs.getInt(2));
                c.setStock(rs.getInt(3));
                c.setIdCategoria(rs.getInt(4));
                c.setFecha(rs.getDate(5));
                c.setIdProveedor(rs.getInt(6));
                c.setPrecioEntrada(rs.getDouble(7));
                c.setPrecioVenta(rs.getDouble(8));
                c.setTotal(rs.getDouble(9));
                lista.add(c);               
            }
            
        }
        catch(Exception e){
            JOptionPane.showConfirmDialog(null, e);
            
        }
        return lista;
        
    }
    
    //metodo editar
    public boolean editar(entradas c){
        String SQL="UPDATE entrada set idproducto=?, stock=?, idCategoria=?, fecha=?, idProveedor=?, precioEntrada=?, precioVenta=?, total=? WHERE identrada=?";
        try{
            con = cn.conectar();
            ps=con.prepareStatement(SQL);
            ps.setInt(1, c.getIdproducto());
            ps.setInt(2, c.getStock());
            ps.setInt(3, c.getIdCategoria());
            ps.setDate(4, c.getFecha());
            ps.setInt(5, c.getIdProveedor());
            ps.setDouble(6, c.getPrecioEntrada());
            ps.setDouble(7, c.getPrecioVenta());
            ps.setDouble(8, c.getTotal());
            ps.setInt(9, c.getIdentrada());
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
    public boolean eliminar(entradas c){
        String SQL="DELETE FROM entrada WHERE identrada=?";
        try{
            con = cn.conectar();
            ps=con.prepareStatement(SQL);
            ps.setInt(1, c.getIdentrada());
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
    public boolean buscar(entradas c){
        String SQL="SELECT * FROM entrada WHERE identrada=?";
        try{
            con = cn.conectar();
            ps=con.prepareStatement(SQL);
            ps.setInt(1, c.getIdentrada());
            rs = ps.executeQuery();
            if(rs.next()){
                c.setIdentrada(rs.getInt(1));
                c.setIdproducto(rs.getInt(2));
                c.setStock(rs.getInt(3));
                c.setIdCategoria(rs.getInt(4));
                c.setFecha(rs.getDate(5));
                c.setIdProveedor(rs.getInt(6));
                c.setPrecioEntrada(rs.getDouble(7));
                c.setPrecioVenta(rs.getDouble(8));
                c.setTotal(rs.getDouble(9));
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
