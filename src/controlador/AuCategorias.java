/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.Categoria;
import modelo.conexion;
/**
 *
 * @author Ayair Martin
 */
public class AuCategorias {
    
    Connection con;
    conexion cn = new conexion();
    PreparedStatement ps;
    ResultSet rs;
    
    public boolean insertar(Categoria c){
        String SQL="INSERT INTO categorias (categoria) VALUES (?)";
        try{
            con = cn.conectar();
            ps=con.prepareStatement(SQL);
            ps.setString(1, c.getNomCategoria());
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
    
    //metodo para listar las categorias que estan en la bd para mostrar en el programa
    public List Listar(){
        List<Categoria> lista = new ArrayList<>();
        String SQL="SELECT * FROM categorias";
        
        try{
            con = cn.conectar();
            ps=con.prepareStatement(SQL);
            rs = ps.executeQuery();
            while(rs.next()){
                Categoria c = new Categoria();
                c.setIdCategoria(rs.getInt(1));
                c.setNomCategoria(rs.getString(2));
                lista.add(c);               
            }
            
        }
        catch(Exception e){
            JOptionPane.showConfirmDialog(null, e);
            
        }
        return lista;
        
    }
    //metodo editar
    public boolean editar(Categoria c){
        String SQL="UPDATE categorias set categoria=? WHERE idCategoria=?";
        try{
            con = cn.conectar();
            ps=con.prepareStatement(SQL);
            ps.setString(1, c.getNomCategoria());
            ps.setInt(2, c.getIdCategoria());
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
    public boolean eliminar(Categoria c){
        String SQL="DELETE FROM categorias WHERE idCategoria=?";
        try{
            con = cn.conectar();
            ps=con.prepareStatement(SQL);
            ps.setInt(1, c.getIdCategoria());
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
    public boolean buscar(Categoria c){
        String SQL="SELECT * FROM categorias WHERE idCategoria=?";
        try{
            con = cn.conectar();
            ps=con.prepareStatement(SQL);
            ps.setInt(1, c.getIdCategoria());
            rs = ps.executeQuery();
            if(rs.next()){
                c.setIdCategoria(rs.getInt(1));
                c.setNomCategoria(rs.getString(2));
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
