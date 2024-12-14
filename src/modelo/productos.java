/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.Date;

/**
 *
 * @author Ayair Martin
 */
public class productos {
    int idproducto;
    String nomProd;
    int stock;
    int idCategoria;
    
    int idProveedor;
    double precioVenta;

    public productos() {
    }

    public productos(int idproducto, String nomProd, int stock, int idCategoria, int idProveedor, double precioVenta) {
        this.idproducto = idproducto;
        this.nomProd = nomProd;
        this.stock = stock;
        this.idCategoria = idCategoria;
        
        this.idProveedor = idProveedor;
        this.precioVenta = precioVenta;
    }

    public int getIdProducto() {
        return idproducto;
    }

    public void setIdProducto(int idproducto) {
        this.idproducto = idproducto;
    }

    public String getNomProd() {
        return nomProd;
    }

    public void setNomProd(String nomProd) {
        this.nomProd = nomProd;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }
    
    
    
    
    
}
