/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.exemplos.poo.caneta;

import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frmCaneta extends javax.swing.JFrame {
    Caneta caneta = new Caneta();
    
    // < Cria uma ArrayList para salvar as canetas na memória >
    ArrayList<Caneta> canetas = new ArrayList();
    
    DefaultTableModel modelo;
    
    public frmCaneta() 
    {
        initComponents();
        
        // < Janela no centro da tela >
        this.setLocationRelativeTo(null);
        
        // < Cria um modelo >
        modelo = (DefaultTableModel) tbCaneta.getModel();
        
        modelo.addColumn("Modelo");
        modelo.addColumn("Ponta");
        modelo.addColumn("Cor");
        modelo.addColumn("Carga");
        modelo.addColumn("Estado");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lbCadastroCanetas = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtModelo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtCarga = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        rb07 = new javax.swing.JRadioButton();
        rb10 = new javax.swing.JRadioButton();
        rb14 = new javax.swing.JRadioButton();
        rb16 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        rbPreta = new javax.swing.JRadioButton();
        rbAzul = new javax.swing.JRadioButton();
        rbVermelha = new javax.swing.JRadioButton();
        rbVerde = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        rbTampada = new javax.swing.JRadioButton();
        rbDestampada = new javax.swing.JRadioButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbCaneta = new javax.swing.JTable();
        jSeparator3 = new javax.swing.JSeparator();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lbCadastroCanetas.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbCadastroCanetas.setIcon(new javax.swing.ImageIcon("C:\\Users\\aluno\\Downloads\\3d-pen.png")); // NOI18N
        lbCadastroCanetas.setText("Cadastro de Canetas");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\aluno\\Downloads\\pen (1).png")); // NOI18N
        jLabel5.setText("Modelo");

        txtModelo.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txtModelo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        txtModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtModeloActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\aluno\\Downloads\\loading-bar.png")); // NOI18N
        jLabel6.setText("Carga");

        txtCarga.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txtCarga.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        txtCarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCargaActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\aluno\\Downloads\\fountain-pen-close-up (1).png")); // NOI18N
        jLabel7.setText("Ponta");

        rb07.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rb07);
        rb07.setText("0.7");
        rb07.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb07ActionPerformed(evt);
            }
        });

        rb10.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rb10);
        rb10.setText("1.0");
        rb10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb10ActionPerformed(evt);
            }
        });

        rb14.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rb14);
        rb14.setText("1.4");
        rb14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb14ActionPerformed(evt);
            }
        });

        rb16.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rb16);
        rb16.setText("1.6");
        rb16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb16ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\aluno\\Downloads\\colour (1).png")); // NOI18N
        jLabel9.setText("Cor");

        rbPreta.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(rbPreta);
        rbPreta.setText("Preta");
        rbPreta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbPretaActionPerformed(evt);
            }
        });

        rbAzul.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(rbAzul);
        rbAzul.setText("Azul");
        rbAzul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbAzulActionPerformed(evt);
            }
        });

        rbVermelha.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(rbVermelha);
        rbVermelha.setText("Vermelha");
        rbVermelha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbVermelhaActionPerformed(evt);
            }
        });

        rbVerde.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(rbVerde);
        rbVerde.setText("Verde");
        rbVerde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbVerdeActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\aluno\\Downloads\\button.png")); // NOI18N
        jLabel10.setText("Estado");

        rbTampada.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup3.add(rbTampada);
        rbTampada.setText("Tampada");
        rbTampada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbTampadaActionPerformed(evt);
            }
        });

        rbDestampada.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup3.add(rbDestampada);
        rbDestampada.setText("Destampada");
        rbDestampada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbDestampadaActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\aluno\\Downloads\\database (1).png")); // NOI18N
        jLabel11.setText("Canetas cadastradas");

        jLabel2.setText("Visualize o modelo, ponta, cor, carga e estado das canetas cadastradas.");

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        tbCaneta.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        tbCaneta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tbCaneta.setGridColor(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(tbCaneta);

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\aluno\\Downloads\\diskette.png")); // NOI18N
        jButton2.setText("Cadastrar");
        jButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\aluno\\Downloads\\logout (1).png")); // NOI18N
        jButton1.setText("Sair");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jSeparator2)
            .addComponent(jSeparator3)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rbTampada)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbDestampada))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rb07)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rb10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rb14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rb16))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtCarga, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(329, 329, 329)
                                        .addComponent(jLabel1))))
                            .addComponent(jLabel7)
                            .addComponent(jLabel9)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rbPreta)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbAzul)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbVermelha)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbVerde))
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel2)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(lbCadastroCanetas))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton1, jButton2});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(lbCadastroCanetas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb07)
                    .addComponent(rb14)
                    .addComponent(rb16)
                    .addComponent(rb10, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbPreta)
                    .addComponent(rbAzul)
                    .addComponent(rbVermelha)
                    .addComponent(rbVerde))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbTampada)
                    .addComponent(rbDestampada))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton1, jButton2});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 444, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtModeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModeloActionPerformed

    private void txtCargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCargaActionPerformed

    private void rb07ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb07ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb07ActionPerformed

    private void rb10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb10ActionPerformed

    private void rb14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb14ActionPerformed

    private void rb16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb16ActionPerformed

    private void rbPretaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPretaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbPretaActionPerformed

    private void rbAzulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbAzulActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbAzulActionPerformed

    private void rbVermelhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbVermelhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbVermelhaActionPerformed

    private void rbVerdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbVerdeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbVerdeActionPerformed

    private void rbTampadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbTampadaActionPerformed
        int erro = caneta.tampar();
        if (erro > 0)
        {
            JOptionPane.showMessageDialog(this, "A caneta JÁ está TAMPADA!");
        }
    }//GEN-LAST:event_rbTampadaActionPerformed

    private void rbDestampadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbDestampadaActionPerformed
        int erro = caneta.destampar();
        
        if (erro > 0)
        {
            JOptionPane.showMessageDialog(this, "A caneta JÁ está DESTAMPADA!");
        }
    }//GEN-LAST:event_rbDestampadaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // < Converte a carga recebida de string para int >
        int carga_convertida;
        
        try 
        {
            carga_convertida = Integer.parseInt(txtCarga.getText());
        }
        catch (IllegalArgumentException NumArgumentException)
        {
            JOptionPane.showMessageDialog(this, "Informe uma carga válida!");
            return;
        }
        
        // < Valida a carga entre 0 e 100 >
        if (carga_convertida > 100 || carga_convertida < 0)
        {
            JOptionPane.showMessageDialog(this, "Informe uma carga válida!");
            return;
        }
        
        // < Seta o modelo 
        caneta.modelo = txtModelo.getText();
        
        // < Seta a cor >
        if (rbAzul.isSelected())
        {
            caneta.cor = rbAzul.getText();
        }
        else if (rbPreta.isSelected())
        {
            caneta.cor = rbPreta.getText();
        }
        else if (rbVermelha.isSelected())
        {
            caneta.cor = rbVermelha.getText();
        }
        else
        {
            caneta.cor = rbVerde.getText();
        }

        // < Seta a ponta >
        if (rb07.isSelected())
        {
            caneta.ponta = Float.parseFloat(rb07.getText());
        }
        else if (rb10.isSelected())
        {
            caneta.ponta = Float.parseFloat(rb10.getText());
        }
        else if (rb14.isSelected())
        {
            caneta.ponta = Float.parseFloat(rb14.getText());
        }
        else
        {
            caneta.ponta = Float.parseFloat(rb16.getText());
        }

        // < Seta a carga >
        caneta.carga = carga_convertida;
        
        // < Adiciona a caneta no ArrayList
        canetas.add(caneta);
        
        // < Adiciona um elemento no modelo (combobox) >
        modelo.addRow(new Object[]{ caneta.modelo, caneta.cor, caneta.ponta, caneta.carga, caneta.tampada });
        
        // < Cria um novo objeto caneta para a próxima inserção >
        caneta = new Caneta();
        
        
        // < Informa que foi cadastrada >
        JOptionPane.showMessageDialog(this, "Caneta cadastrada com sucesso!");
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lbCadastroCanetas;
    private javax.swing.JRadioButton rb07;
    private javax.swing.JRadioButton rb10;
    private javax.swing.JRadioButton rb14;
    private javax.swing.JRadioButton rb16;
    private javax.swing.JRadioButton rbAzul;
    private javax.swing.JRadioButton rbDestampada;
    private javax.swing.JRadioButton rbPreta;
    private javax.swing.JRadioButton rbTampada;
    private javax.swing.JRadioButton rbVerde;
    private javax.swing.JRadioButton rbVermelha;
    private javax.swing.JTable tbCaneta;
    private javax.swing.JTextField txtCarga;
    private javax.swing.JTextField txtModelo;
    // End of variables declaration//GEN-END:variables
}
