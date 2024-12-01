/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import modelo.conexion;

/**
 *
 * @author Ayair Martin
 */
public class DaoDetallesSalidas {
    
    Connection con;
    conexion cn = new conexion();
    PreparedStatement ps;
    ResultSet rs;
    
    public boolean insertar(int idSalida,int idEntrada, int cantidad, double importe){
        String SQL="INSERT INTO detallesalida (idsalida,identrada,cantidad,importe) VALUES ("+idSalida+","+idEntrada+","+cantidad+","+importe+")";
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
    
}
