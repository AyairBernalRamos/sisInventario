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
import modelo.clientes;
import modelo.conexion;

/**
 *
 * @author Ayair Martin
 */
public class AuClientes {
    Connection con;
    conexion cn = new conexion();
    PreparedStatement ps;
    ResultSet rs;
    
    public boolean insertar(clientes c){
        String SQL="INSERT INTO cliente (nombres, apellidos, documento, direccion, telefono, correo) VALUES (?,?,?,?,?,?)";
        try{
            con = cn.conectar();
            ps=con.prepareStatement(SQL);
            ps.setString(1, c.getNombres());
            ps.setString(2, c.getApellidos());
            ps.setString(3, c.getDocumento());
            ps.setString(4, c.getDireccion());
            ps.setString(5, c.getTelefono());
            ps.setString(6, c.getCorreo());
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
        List<clientes> lista = new ArrayList<>();
        String SQL="SELECT * FROM cliente";
        
        try{
            con = cn.conectar();
            ps=con.prepareStatement(SQL);
            rs = ps.executeQuery();
            while(rs.next()){
                clientes c = new clientes();
                c.setIdCliente(rs.getInt(1));
                c.setNombres(rs.getString(2));
                c.setApellidos(rs.getString(3));
                c.setDocumento(rs.getString(4));
                c.setDireccion(rs.getString(5));
                c.setTelefono(rs.getString(6));
                c.setCorreo(rs.getString(7));
                lista.add(c);               
            }
            
        }
        catch(Exception e){
            JOptionPane.showConfirmDialog(null, e);
            
        }
        return lista;
        
    }
    
    
    
}
