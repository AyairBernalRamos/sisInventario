/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.conexion;
import modelo.usuarios;

/**
 *
 * @author Ayair Martin
 */
public class AUsuarios {
    
    Connection con;
    conexion cn = new conexion();
    PreparedStatement ps;
    ResultSet rs;
    
    public usuarios login(String usuario, String pass) {
        usuarios us = new usuarios();
        String sql = "SELECT * FROM usuarios WHERE usuario='"+usuario+"' and password='"+pass+"'";
        try{
            con=cn.conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
        while (rs.next()) {
            us.setIdusuario(rs.getInt(1));
            us.setNombres(rs.getString(2));
            us.setApellidos(rs.getString(3));
            us.setDocumento(rs.getString(4));
            us.setDireccion(rs.getString(5));
            us.setTelefono(rs.getString(6));
            us.setCorreo(rs.getString(7));
            us.setTipoUsuario(rs.getString(8));
            us.setUsuario(rs.getString(9));
            us.setPassword(rs.getString(10));
        }
        
        }catch(SQLException ex){
            JOptionPane.showConfirmDialog(null, ex);
        }
        return us;
    }   
}
