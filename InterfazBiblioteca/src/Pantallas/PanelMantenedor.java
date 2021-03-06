/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pantallas;

import Clases.*;
//import java.awt.BorderLayout;
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.Statement;
//import javax.swing.JOptionPane;
//import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jsoto
 */
public class PanelMantenedor extends javax.swing.JPanel {

    /**
     * Creates new form AgregarIdioma
     */
    public PanelMantenedor() {
        initComponents();
        refrescarTablas();        
    }
    
    public void refrescarTablas(){
        tableTablaCategorias.getTableHeader().setReorderingAllowed(false);
        BDMantenedor.listar(tableTablaCategorias, "categoria");        
        tableTablaEstados.getTableHeader().setReorderingAllowed(false);
        BDMantenedor.listar(tableTablaEstados, "estado");
        tableTablaIdiomas.getTableHeader().setReorderingAllowed(false);
        BDMantenedor.listar(tableTablaIdiomas, "idioma");
        tableTablaMetodos.getTableHeader().setReorderingAllowed(false);
        BDMantenedor.listar(tableTablaMetodos, "metodopago");
        comprobarRegistroSeleccionado();
    }
    
    public void comprobarRegistroSeleccionado(){
        if(tableTablaCategorias.getSelectedRow() == -1){
            btnModificarCategoria.setEnabled(false);
        }else{
            btnModificarCategoria.setEnabled(true);
        }
        if(tableTablaEstados.getSelectedRow() == -1){
            btnModificarEstado.setEnabled(false);
        }else{
            btnModificarEstado.setEnabled(true);
        }
        if(tableTablaIdiomas.getSelectedRow() == -1){
            btnModificarIdioma.setEnabled(false);
        }else{
            btnModificarIdioma.setEnabled(true);
        }
        if(tableTablaMetodos.getSelectedRow() == -1){
            btnModificarMetodo.setEnabled(false);
        }else{
            btnModificarMetodo.setEnabled(true);
        }      
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        lblTitulo = new javax.swing.JLabel();
        jPanelContenido = new javax.swing.JPanel();
        panelTablaCategorias = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableTablaCategorias = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnAgregarCategoria = new javax.swing.JButton();
        btnModificarCategoria = new javax.swing.JButton();
        panelTablaEstados = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableTablaEstados = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        btnAgregarEstado = new javax.swing.JButton();
        btnModificarEstado = new javax.swing.JButton();
        panelTablaIdiomas = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableTablaIdiomas = new javax.swing.JTable();
        lblIdiomas = new javax.swing.JLabel();
        btnAgregarIdioma = new javax.swing.JButton();
        btnModificarIdioma = new javax.swing.JButton();
        panelTablaMetodos = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tableTablaMetodos = new javax.swing.JTable();
        lblMetodos = new javax.swing.JLabel();
        btnAgregarMetodo = new javax.swing.JButton();
        btnModificarMetodo = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(800, 570));
        setMinimumSize(new java.awt.Dimension(800, 570));
        setPreferredSize(new java.awt.Dimension(800, 570));

        lblTitulo.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("MANTENEDOR ENTIDADES");

        panelTablaCategorias.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelTablaCategorias.setMaximumSize(new java.awt.Dimension(365, 190));
        panelTablaCategorias.setMinimumSize(new java.awt.Dimension(365, 190));
        panelTablaCategorias.setPreferredSize(new java.awt.Dimension(365, 190));

        tableTablaCategorias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableTablaCategorias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableTablaCategoriasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableTablaCategorias);

        jLabel1.setText("Categorías");

        btnAgregarCategoria.setText("Agregar");
        btnAgregarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarCategoriaActionPerformed(evt);
            }
        });

        btnModificarCategoria.setText("Modificar");
        btnModificarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarCategoriaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelTablaCategoriasLayout = new javax.swing.GroupLayout(panelTablaCategorias);
        panelTablaCategorias.setLayout(panelTablaCategoriasLayout);
        panelTablaCategoriasLayout.setHorizontalGroup(
            panelTablaCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTablaCategoriasLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(294, 294, 294))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTablaCategoriasLayout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(btnAgregarCategoria)
                .addGap(18, 18, 18)
                .addComponent(btnModificarCategoria)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(panelTablaCategoriasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelTablaCategoriasLayout.setVerticalGroup(
            panelTablaCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTablaCategoriasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelTablaCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarCategoria)
                    .addComponent(btnModificarCategoria))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelTablaEstados.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelTablaEstados.setMaximumSize(new java.awt.Dimension(365, 190));
        panelTablaEstados.setMinimumSize(new java.awt.Dimension(365, 190));
        panelTablaEstados.setPreferredSize(new java.awt.Dimension(365, 190));

        tableTablaEstados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableTablaEstados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableTablaEstadosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableTablaEstados);

        jLabel2.setText("Estados");

        btnAgregarEstado.setText("Agregar");
        btnAgregarEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarEstadoActionPerformed(evt);
            }
        });

        btnModificarEstado.setText("Modificar");
        btnModificarEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarEstadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelTablaEstadosLayout = new javax.swing.GroupLayout(panelTablaEstados);
        panelTablaEstados.setLayout(panelTablaEstadosLayout);
        panelTablaEstadosLayout.setHorizontalGroup(
            panelTablaEstadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTablaEstadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTablaEstadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(panelTablaEstadosLayout.createSequentialGroup()
                        .addGroup(panelTablaEstadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(panelTablaEstadosLayout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(btnAgregarEstado)
                                .addGap(18, 18, 18)
                                .addComponent(btnModificarEstado)))
                        .addGap(0, 87, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelTablaEstadosLayout.setVerticalGroup(
            panelTablaEstadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTablaEstadosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelTablaEstadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarEstado)
                    .addComponent(btnModificarEstado))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelTablaIdiomas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelTablaIdiomas.setMaximumSize(new java.awt.Dimension(365, 190));
        panelTablaIdiomas.setMinimumSize(new java.awt.Dimension(365, 190));
        panelTablaIdiomas.setPreferredSize(new java.awt.Dimension(365, 190));

        tableTablaIdiomas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableTablaIdiomas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableTablaIdiomasMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tableTablaIdiomas);

        lblIdiomas.setText("Idiomas");

        btnAgregarIdioma.setText("Agregar");
        btnAgregarIdioma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarIdiomaActionPerformed(evt);
            }
        });

        btnModificarIdioma.setText("Modificar");
        btnModificarIdioma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarIdiomaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelTablaIdiomasLayout = new javax.swing.GroupLayout(panelTablaIdiomas);
        panelTablaIdiomas.setLayout(panelTablaIdiomasLayout);
        panelTablaIdiomasLayout.setHorizontalGroup(
            panelTablaIdiomasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTablaIdiomasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTablaIdiomasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(panelTablaIdiomasLayout.createSequentialGroup()
                        .addGroup(panelTablaIdiomasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblIdiomas)
                            .addGroup(panelTablaIdiomasLayout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(btnAgregarIdioma)
                                .addGap(18, 18, 18)
                                .addComponent(btnModificarIdioma)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelTablaIdiomasLayout.setVerticalGroup(
            panelTablaIdiomasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTablaIdiomasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblIdiomas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelTablaIdiomasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarIdioma)
                    .addComponent(btnModificarIdioma))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelTablaMetodos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelTablaMetodos.setMaximumSize(new java.awt.Dimension(365, 190));
        panelTablaMetodos.setMinimumSize(new java.awt.Dimension(365, 190));
        panelTablaMetodos.setPreferredSize(new java.awt.Dimension(365, 190));

        tableTablaMetodos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableTablaMetodos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableTablaMetodosMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tableTablaMetodos);

        lblMetodos.setText("Metodos de pago");

        btnAgregarMetodo.setText("Agregar");
        btnAgregarMetodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarMetodoActionPerformed(evt);
            }
        });

        btnModificarMetodo.setText("Modificar");
        btnModificarMetodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarMetodoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelTablaMetodosLayout = new javax.swing.GroupLayout(panelTablaMetodos);
        panelTablaMetodos.setLayout(panelTablaMetodosLayout);
        panelTablaMetodosLayout.setHorizontalGroup(
            panelTablaMetodosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTablaMetodosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTablaMetodosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(panelTablaMetodosLayout.createSequentialGroup()
                        .addGroup(panelTablaMetodosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMetodos)
                            .addGroup(panelTablaMetodosLayout.createSequentialGroup()
                                .addGap(91, 91, 91)
                                .addComponent(btnAgregarMetodo)
                                .addGap(18, 18, 18)
                                .addComponent(btnModificarMetodo)))
                        .addGap(0, 86, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelTablaMetodosLayout.setVerticalGroup(
            panelTablaMetodosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTablaMetodosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMetodos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelTablaMetodosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarMetodo)
                    .addComponent(btnModificarMetodo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelContenidoLayout = new javax.swing.GroupLayout(jPanelContenido);
        jPanelContenido.setLayout(jPanelContenidoLayout);
        jPanelContenidoLayout.setHorizontalGroup(
            jPanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContenidoLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelTablaIdiomas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelTablaCategorias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelTablaEstados, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelTablaMetodos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanelContenidoLayout.setVerticalGroup(
            jPanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContenidoLayout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(jPanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelTablaCategorias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelTablaEstados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(36, 36, 36)
                .addGroup(jPanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelTablaMetodos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelTablaIdiomas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelContenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelContenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tableTablaEstadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableTablaEstadosMouseClicked
        comprobarRegistroSeleccionado();
    }//GEN-LAST:event_tableTablaEstadosMouseClicked

    private void tableTablaCategoriasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableTablaCategoriasMouseClicked
        comprobarRegistroSeleccionado();
    }//GEN-LAST:event_tableTablaCategoriasMouseClicked

    private void tableTablaIdiomasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableTablaIdiomasMouseClicked
        comprobarRegistroSeleccionado();
    }//GEN-LAST:event_tableTablaIdiomasMouseClicked

    private void tableTablaMetodosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableTablaMetodosMouseClicked
        comprobarRegistroSeleccionado();
    }//GEN-LAST:event_tableTablaMetodosMouseClicked

    private void btnAgregarMetodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarMetodoActionPerformed
        BDMantenedor.ventanaAgregar("Método", "metodopago", "metodo_pago");
    }//GEN-LAST:event_btnAgregarMetodoActionPerformed

    private void btnAgregarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarCategoriaActionPerformed
        BDMantenedor.ventanaAgregar("Categoría", "categoria", "categoria");        
    }//GEN-LAST:event_btnAgregarCategoriaActionPerformed

    private void btnModificarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarCategoriaActionPerformed
        int rowSel = tableTablaCategorias.getSelectedRow();
        String id = String.valueOf(tableTablaCategorias.getValueAt(rowSel, 0));
        String nom = String.valueOf(tableTablaCategorias.getValueAt(rowSel, 1));
        BDMantenedor.ventanaModificar("Categoría", "categoria", "categoria", "id_categoria", id , nom);
    }//GEN-LAST:event_btnModificarCategoriaActionPerformed

    private void btnAgregarEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarEstadoActionPerformed
        BDMantenedor.ventanaAgregar("Estado", "estado", "descripcion_estado");
    }//GEN-LAST:event_btnAgregarEstadoActionPerformed

    private void btnModificarEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarEstadoActionPerformed
        int rowSel = tableTablaEstados.getSelectedRow();
        String id = String.valueOf(tableTablaEstados.getValueAt(rowSel, 0));
        String nom = String.valueOf(tableTablaEstados.getValueAt(rowSel, 1));
        BDMantenedor.ventanaModificar("Estado", "estado", "descripcion_estado", "id_estado", id , nom);        
    }//GEN-LAST:event_btnModificarEstadoActionPerformed

    private void btnAgregarIdiomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarIdiomaActionPerformed
        BDMantenedor.ventanaAgregar("Idioma", "idioma", "idioma");
    }//GEN-LAST:event_btnAgregarIdiomaActionPerformed

    private void btnModificarIdiomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarIdiomaActionPerformed
        int rowSel = tableTablaIdiomas.getSelectedRow();
        String id = String.valueOf(tableTablaIdiomas.getValueAt(rowSel, 0));
        String nom = String.valueOf(tableTablaIdiomas.getValueAt(rowSel, 1));
        BDMantenedor.ventanaModificar("Idioma", "idioma", "idioma", "id_idioma", id , nom);
    }//GEN-LAST:event_btnModificarIdiomaActionPerformed

    private void btnModificarMetodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarMetodoActionPerformed
        int rowSel = tableTablaMetodos.getSelectedRow();
        String id = String.valueOf(tableTablaMetodos.getValueAt(rowSel, 0));
        String nom = String.valueOf(tableTablaMetodos.getValueAt(rowSel, 1));
        BDMantenedor.ventanaModificar("Método", "metodo", "metodo_pago", "id_metodo_pago", id , nom);
    }//GEN-LAST:event_btnModificarMetodoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarCategoria;
    private javax.swing.JButton btnAgregarEstado;
    private javax.swing.JButton btnAgregarIdioma;
    private javax.swing.JButton btnAgregarMetodo;
    private javax.swing.JButton btnModificarCategoria;
    private javax.swing.JButton btnModificarEstado;
    private javax.swing.JButton btnModificarIdioma;
    private javax.swing.JButton btnModificarMetodo;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanelContenido;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblIdiomas;
    private javax.swing.JLabel lblMetodos;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel panelTablaCategorias;
    private javax.swing.JPanel panelTablaEstados;
    private javax.swing.JPanel panelTablaIdiomas;
    private javax.swing.JPanel panelTablaMetodos;
    private javax.swing.JTable tableTablaCategorias;
    private javax.swing.JTable tableTablaEstados;
    private javax.swing.JTable tableTablaIdiomas;
    private javax.swing.JTable tableTablaMetodos;
    // End of variables declaration//GEN-END:variables
}
