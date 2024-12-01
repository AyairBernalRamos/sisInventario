/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vista;

import controlador.AuCategorias;
import controlador.DaoEntradas;
import controlador.DaoProveedor;
import java.sql.Date;
import java.util.Calendar;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Categoria;
import modelo.entradas;
import modelo.proveedor;

/**
 *
 * @author Ayair Martin
 */
public class Entradas extends javax.swing.JPanel {
    
    //instanciando
    
    entradas e = new entradas();
    Categoria ct = new Categoria();
    proveedor pr = new proveedor();
    DaoEntradas dao = new DaoEntradas();
    AuCategorias daoC = new AuCategorias();
    DaoProveedor daoP = new DaoProveedor();
    DefaultTableModel modelo = new DefaultTableModel();

    /**
     * Creates new form Entradas
     */
    public Entradas() {
        initComponents();
        listarEntradas();
    }
    
    //metodo para listar
    private void listarEntradas(){
        List<entradas> lista = dao.Listar();
        modelo = (DefaultTableModel) tablaentradas.getModel();
        Object[] ob = new Object[9];
        for(int i=0;i<lista.size();i++){
            ob[0]=lista.get(i).getIdentrada();
            ob[1]=lista.get(i).getNomProd();
            ob[2]=lista.get(i).getStock();
            ob[3]=lista.get(i).getIdCategoria();
            ob[4]=lista.get(i).getFecha();
            ob[5]=lista.get(i).getIdProveedor();
            ob[6]=lista.get(i).getPrecioEntrada();
            ob[7]=lista.get(i).getPrecioVenta();
            ob[8]=lista.get(i).getTotal();
            modelo.addRow(ob);
            
            
        }
        tablaentradas.setModel(modelo);
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        rSButtonMaterialIconDos1 = new RSMaterialComponent.RSButtonMaterialIconDos();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtidentrada = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtstock = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtprecioentrada = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtprecioventa = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txttotal = new javax.swing.JTextField();
        btn_guardar = new RSMaterialComponent.RSButtonMaterialIconDos();
        datefecha = new com.toedter.calendar.JDateChooser();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txtcategoria = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtidcategoria = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        btnbuscarcategoria = new RSMaterialComponent.RSButtonMaterialIconDos();
        jPanel3 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        txtproveedor = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtidproveedor = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        btnbuscarproveedor = new RSMaterialComponent.RSButtonMaterialIconDos();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaentradas = new javax.swing.JTable();
        btnbuscar = new RSMaterialComponent.RSButtonMaterialIconDos();
        btneditar = new RSMaterialComponent.RSButtonMaterialIconDos();
        btneliminar = new RSMaterialComponent.RSButtonMaterialIconDos();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1000, 700));

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Registro de Entradas");

        rSButtonMaterialIconDos1.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.INPUT);
        rSButtonMaterialIconDos1.setRound(25);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel2.setFont(new java.awt.Font("Roboto", 2, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("ID:");

        txtidentrada.setFont(new java.awt.Font("Roboto", 2, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Roboto", 2, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Nombre Producto:");

        txtnombre.setFont(new java.awt.Font("Roboto", 2, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Roboto", 2, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Stock:");

        txtstock.setFont(new java.awt.Font("Roboto", 2, 14)); // NOI18N
        txtstock.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtstockKeyReleased(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Roboto", 2, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Fecha:");

        jLabel6.setFont(new java.awt.Font("Roboto", 2, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Precio Entrada:");

        txtprecioentrada.setFont(new java.awt.Font("Roboto", 2, 14)); // NOI18N
        txtprecioentrada.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtprecioentradaKeyReleased(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Roboto", 2, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Precio Venta:");

        txtprecioventa.setFont(new java.awt.Font("Roboto", 2, 14)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Roboto", 2, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Total:");

        txttotal.setFont(new java.awt.Font("Roboto", 2, 14)); // NOI18N
        txttotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttotalActionPerformed(evt);
            }
        });

        btn_guardar.setText("Guardar");
        btn_guardar.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SAVE);
        btn_guardar.setRound(25);
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtprecioventa)
                    .addComponent(txtstock)
                    .addComponent(txtnombre)
                    .addComponent(txtprecioentrada)
                    .addComponent(btn_guardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(datefecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txttotal, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtidentrada, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel9))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtidentrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtstock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(7, 7, 7)
                .addComponent(datefecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtprecioentrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtprecioventa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btn_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 105, 248));
        jLabel10.setText("Datos de la Categoria");

        txtcategoria.setFont(new java.awt.Font("Roboto", 2, 14)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Roboto", 2, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("ID:");

        txtidcategoria.setFont(new java.awt.Font("Roboto", 2, 14)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Roboto", 2, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Categoria:");

        btnbuscarcategoria.setBackground(new java.awt.Color(102, 105, 248));
        btnbuscarcategoria.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SEARCH);
        btnbuscarcategoria.setRound(25);
        btnbuscarcategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarcategoriaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtcategoria, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtidcategoria, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel11)
                                .addComponent(jLabel10))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                            .addComponent(btnbuscarcategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel11))
                    .addComponent(btnbuscarcategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtidcategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtcategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(153, 153, 255));
        jLabel13.setText("Datos del Proveedor");

        txtproveedor.setFont(new java.awt.Font("Roboto", 2, 14)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Roboto", 2, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("ID:");

        txtidproveedor.setFont(new java.awt.Font("Roboto", 2, 14)); // NOI18N

        jLabel15.setFont(new java.awt.Font("Roboto", 2, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Nombre Proveedor:");

        btnbuscarproveedor.setBackground(new java.awt.Color(153, 153, 255));
        btnbuscarproveedor.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SEARCH);
        btnbuscarproveedor.setRound(25);
        btnbuscarproveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarproveedorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtproveedor, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                        .addComponent(txtidproveedor)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel14)
                                .addComponent(jLabel13))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnbuscarproveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel14))
                    .addComponent(btnbuscarproveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtidproveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtproveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tablaentradas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Producto", "Producto", "Stock", "ID Categoria", "Fecha", "ID Proveedor", "Precio Entrada", "Precio Venta", "Total"
            }
        ));
        tablaentradas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaentradasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaentradas);

        btnbuscar.setText("Buscar");
        btnbuscar.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SEARCH);
        btnbuscar.setRound(25);
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });

        btneditar.setText("Editar");
        btneditar.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.EDIT);
        btneditar.setRound(25);
        btneditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditarActionPerformed(evt);
            }
        });

        btneliminar.setBackground(new java.awt.Color(255, 0, 51));
        btneliminar.setText("Eliminar");
        btneliminar.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.DELETE);
        btneliminar.setRound(25);
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rSButtonMaterialIconDos1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(btneditar, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btneliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(144, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(rSButtonMaterialIconDos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btneditar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btneliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txttotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttotalActionPerformed

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        // TODO add your handling code here:
        //variables para la efcha
        Calendar cal;
        int d,me,a;
        cal = datefecha.getCalendar();
        d = cal.get(Calendar.DAY_OF_MONTH);
        me = cal.get(Calendar.MONTH);
        a = cal.get(Calendar.YEAR)-1900;
        
        e.setNomProd(txtnombre.getText());
        e.setStock(Integer.parseInt(txtstock.getText()));
        e.setIdCategoria(Integer.parseInt(txtidcategoria.getText()));
        e.setFecha(new Date(a,me,d));
        e.setIdProveedor(Integer.parseInt(txtidproveedor.getText()));
        e.setPrecioEntrada(Double.parseDouble(txtprecioentrada.getText()));
        e.setPrecioVenta(Double.parseDouble(txtprecioventa.getText()));
        e.setTotal(Double.parseDouble(txttotal.getText()));
        if(dao.insertar(e)){
            //JOptionPane.showMessageDialog(null, "Cliente registrado con éxito");
            MenuPrinci m = new MenuPrinci();
            m.exito("Entrada registrado con éxito");
            limpiarCampos();//llamamos al metodo limpiar
            limpiarTabla();
            listarEntradas();
        }else{
            MenuPrinci m = new MenuPrinci();
            m.error("No se pudo registrar la entrada");
        }

    }//GEN-LAST:event_btn_guardarActionPerformed

    private void btneditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditarActionPerformed
        // TODO add your handling code here:
        int fila = tablaentradas.getSelectedRow();
        if(fila==-1 && txtidentrada.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Seleccione una Entrada");
        }
        else{
            Calendar cal;
            int d,me,a;
            cal = datefecha.getCalendar();
            d = cal.get(Calendar.DAY_OF_MONTH);
            me = cal.get(Calendar.MONTH);
            a = cal.get(Calendar.YEAR)-1900;

            e.setIdentrada(Integer.parseInt(txtidentrada.getText()));
            e.setNomProd(txtnombre.getText());
            e.setStock(Integer.parseInt(txtstock.getText()));
            e.setIdCategoria(Integer.parseInt(txtidcategoria.getText()));
            e.setFecha(new Date(a,me,d));
            e.setIdProveedor(Integer.parseInt(txtidproveedor.getText()));
            e.setPrecioEntrada(Double.parseDouble(txtprecioentrada.getText()));
            e.setPrecioVenta(Double.parseDouble(txtprecioventa.getText()));
            e.setTotal(Double.parseDouble(txttotal.getText()));
            if (dao.editar(e)) {
                //JOptionPane.showMessageDialog(null, "Se modificó con éxito el cliente");
                MenuPrinci m = new MenuPrinci();
                m.exito("Se modificó con éxito la entrada");
                limpiarTabla();
                listarEntradas();
                limpiarCampos();
            }
            else{
            MenuPrinci m = new MenuPrinci();
            m.error("No se pudo modificar la entrada");
            }
        }
    }//GEN-LAST:event_btneditarActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        // TODO add your handling code here:
        if (!txtidentrada.getText().isEmpty()) {
            int confirmacion = JOptionPane.showConfirmDialog(null, "¿Esta seguro de eliminar la entrada?","Confirmar",2);
            if(confirmacion == 0){
                e.setIdentrada(Integer.parseInt(txtidentrada.getText()));
                dao.eliminar(e);
                limpiarTabla();
                listarEntradas();
                limpiarCampos();
                //JOptionPane.showMessageDialog(null, "Se eliminó con éxito");
                MenuPrinci m = new MenuPrinci();
                m.exito("Se eliminó con éxito");

            }
        }else{
            MenuPrinci m = new MenuPrinci();
            m.warning("Seleccione una entrada");
            //JOptionPane.showMessageDialog(null, "Seleccione una entrada");
        }
    }//GEN-LAST:event_btneliminarActionPerformed

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
        // BUSCAR
        e.setIdentrada(Integer.parseInt(txtidentrada.getText()));
        if(dao.buscar(e)){
            txtidentrada.setText(e.getIdentrada()+"");
            txtnombre.setText(e.getNomProd());
            txtstock.setText(e.getStock()+"");
            txtprecioentrada.setText(e.getPrecioEntrada()+"");
            txtprecioventa.setText(e.getPrecioVenta()+"");
            txttotal.setText(e.getTotal()+"");
            txtidcategoria.setText(e.getIdCategoria()+"");
            txtidproveedor.setText(e.getIdProveedor()+"");
            ct.setIdCategoria(Integer.parseInt(txtidcategoria.getText()));
            if(daoC.buscar(ct)){
                txtcategoria.setText(ct.getNomCategoria()+"");

            }else{
                txtcategoria.setText("ERROR");
            }

            pr.setIdProveedor(Integer.parseInt(txtidproveedor.getText()));
            if(daoP.buscar(pr)){
                txtproveedor.setText(pr.getNombres()+"");

            }else{
                txtproveedor.setText("ERROR");
            }
        }else{
            JOptionPane.showMessageDialog(null, "La entrada no existe");
            limpiarCampos();
        }
    }//GEN-LAST:event_btnbuscarActionPerformed

    private void btnbuscarproveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarproveedorActionPerformed
        // TODO add your handling code here:
        BuscaDato.tipo=false;
        BuscaDato m = new BuscaDato();
        m.setVisible(true);
    }//GEN-LAST:event_btnbuscarproveedorActionPerformed

    private void btnbuscarcategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarcategoriaActionPerformed
        // TODO add your handling code here:
        
        BuscaDato.tipo=true;
        BuscaDato m = new BuscaDato();
        m.setVisible(true);
        
        
    }//GEN-LAST:event_btnbuscarcategoriaActionPerformed

    private void txtprecioentradaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtprecioentradaKeyReleased
        // TODO add your handling code here:
        double cant, precio;
        if (!txtstock.getText().isEmpty()) {
            cant = Double.parseDouble(txtstock.getText());
            precio = Double.parseDouble(txtprecioentrada.getText());

            txttotal.setText(cant*precio+"");
        }
        else{
            
        }
        
        
    }//GEN-LAST:event_txtprecioentradaKeyReleased

    private void tablaentradasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaentradasMouseClicked
        // TODO add your handling code here:
        int fila=tablaentradas.getSelectedRow();
        txtidentrada.setText(tablaentradas.getValueAt(fila, 0).toString());
        txtnombre.setText(tablaentradas.getValueAt(fila, 1).toString());
        txtstock.setText(tablaentradas.getValueAt(fila, 2).toString());
        txtidcategoria.setText(tablaentradas.getValueAt(fila, 3).toString());
        datefecha.setDate(Date.valueOf(tablaentradas.getValueAt(fila, 4).toString()));
        txtidproveedor.setText(tablaentradas.getValueAt(fila, 5).toString());
        txtprecioentrada.setText(tablaentradas.getValueAt(fila, 6).toString());
        txtprecioventa.setText(tablaentradas.getValueAt(fila, 7).toString());
        txttotal.setText(tablaentradas.getValueAt(fila, 8).toString());
        
        ct.setIdCategoria(Integer.parseInt(txtidcategoria.getText()));
        if(daoC.buscar(ct)){
            txtcategoria.setText(ct.getNomCategoria()+"");
                        
        }else{
            txtcategoria.setText("ERROR");
        }
        
        pr.setIdProveedor(Integer.parseInt(txtidproveedor.getText()));
        if(daoP.buscar(pr)){
            txtproveedor.setText(pr.getNombres()+"");
                        
        }else{
            txtproveedor.setText("ERROR");
        }
        
    }//GEN-LAST:event_tablaentradasMouseClicked

    private void txtstockKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtstockKeyReleased
        // TODO add your handling code here:
        
        double cant, precio;
        if (!txtprecioentrada.getText().isEmpty()) {
            cant = Double.parseDouble(txtstock.getText());
            precio = Double.parseDouble(txtprecioentrada.getText());

            txttotal.setText(cant*precio+"");
        }
        else{
            
        }
        
    }//GEN-LAST:event_txtstockKeyReleased

    //limpiar campos
    void limpiarCampos(){
        txtidentrada.setText("");
        txtnombre.setText("");
        txtstock.setText("");
        txtprecioentrada.setText("");
        txtprecioventa.setText("");
        txttotal.setText("");
        txtidcategoria.setText("");
        txtcategoria.setText("");
        txtidproveedor.setText("");
        txtproveedor.setText("");
    }
    void limpiarTabla(){
        for(int i=0;i<modelo.getRowCount();i++){
            modelo.removeRow(i);
            i=0-1;
        }
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private RSMaterialComponent.RSButtonMaterialIconDos btn_guardar;
    private RSMaterialComponent.RSButtonMaterialIconDos btnbuscar;
    private RSMaterialComponent.RSButtonMaterialIconDos btnbuscarcategoria;
    private RSMaterialComponent.RSButtonMaterialIconDos btnbuscarproveedor;
    private RSMaterialComponent.RSButtonMaterialIconDos btneditar;
    private RSMaterialComponent.RSButtonMaterialIconDos btneliminar;
    private com.toedter.calendar.JDateChooser datefecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private RSMaterialComponent.RSButtonMaterialIconDos rSButtonMaterialIconDos1;
    private javax.swing.JTable tablaentradas;
    public static javax.swing.JTextField txtcategoria;
    public static javax.swing.JTextField txtidcategoria;
    private javax.swing.JTextField txtidentrada;
    public static javax.swing.JTextField txtidproveedor;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtprecioentrada;
    private javax.swing.JTextField txtprecioventa;
    public static javax.swing.JTextField txtproveedor;
    private javax.swing.JTextField txtstock;
    private javax.swing.JTextField txttotal;
    // End of variables declaration//GEN-END:variables
}