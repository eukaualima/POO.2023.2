/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.exemplos.poo.caneta;

import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class frmCaneta extends javax.swing.JFrame {
    Caneta caneta = new Caneta();
    /**
     * Creates new form frmCaneta
     */
    public frmCaneta() {
        initComponents();
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
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jColorChooser1 = new javax.swing.JColorChooser();
        jColorChooser2 = new javax.swing.JColorChooser();
        jFileChooser1 = new javax.swing.JFileChooser();
        jFrame1 = new javax.swing.JFrame();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jToggleButton1 = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        BotaoCadastrar = new javax.swing.JButton();
        BotaoExibir = new javax.swing.JButton();
        BotaoTampar = new javax.swing.JButton();
        BotaoDestampar = new javax.swing.JButton();
        BotaoSair = new javax.swing.JButton();
        CampoModelo = new javax.swing.JTextField();
        LabelCor = new javax.swing.JLabel();
        RadioBtAzul = new javax.swing.JRadioButton();
        RadioBtPreta = new javax.swing.JRadioButton();
        RadioBtVermelha = new javax.swing.JRadioButton();
        RadioBtVerde = new javax.swing.JRadioButton();
        LabelPonta = new javax.swing.JLabel();
        RadioBtPonta07 = new javax.swing.JRadioButton();
        RadioBtPonta1 = new javax.swing.JRadioButton();
        RadioBtPonta14 = new javax.swing.JRadioButton();
        RadioBtPonta16 = new javax.swing.JRadioButton();
        jSeparator1 = new javax.swing.JSeparator();
        CampoCarga = new javax.swing.JTextField();
        LabelCarga1 = new javax.swing.JLabel();
        RadioBtTampada = new javax.swing.JRadioButton();
        RadioBtDestampada = new javax.swing.JRadioButton();

        jLabel1.setText("jLabel1");

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable1);

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BotaoCadastrar.setText("Cadastrar");
        BotaoCadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotaoCadastrarMouseClicked(evt);
            }
        });
        BotaoCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCadastrarActionPerformed(evt);
            }
        });
        jPanel1.add(BotaoCadastrar);

        BotaoExibir.setText("Exibir");
        BotaoExibir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotaoExibirMouseClicked(evt);
            }
        });
        BotaoExibir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoExibirActionPerformed(evt);
            }
        });
        jPanel1.add(BotaoExibir);

        BotaoTampar.setText("Tampar");
        BotaoTampar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotaoTamparMouseClicked(evt);
            }
        });
        BotaoTampar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoTamparActionPerformed(evt);
            }
        });
        jPanel1.add(BotaoTampar);

        BotaoDestampar.setText("Destampar");
        BotaoDestampar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotaoDestamparMouseClicked(evt);
            }
        });
        BotaoDestampar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoDestamparActionPerformed(evt);
            }
        });
        jPanel1.add(BotaoDestampar);

        BotaoSair.setText("Sair");
        BotaoSair.setBorderPainted(false);
        BotaoSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotaoSairMouseClicked(evt);
            }
        });
        BotaoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoSairActionPerformed(evt);
            }
        });
        jPanel1.add(BotaoSair);

        CampoModelo.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        CampoModelo.setToolTipText("");
        CampoModelo.setBorder(javax.swing.BorderFactory.createTitledBorder("Modelo"));
        CampoModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoModeloActionPerformed(evt);
            }
        });

        LabelCor.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        LabelCor.setText("Cor:");

        RadioBtAzul.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        RadioBtAzul.setText("Azul");
        RadioBtAzul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioBtAzulActionPerformed(evt);
            }
        });

        RadioBtPreta.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        RadioBtPreta.setText("Preta");
        RadioBtPreta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioBtPretaActionPerformed(evt);
            }
        });

        RadioBtVermelha.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        RadioBtVermelha.setText("Vermelha");
        RadioBtVermelha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioBtVermelhaActionPerformed(evt);
            }
        });

        RadioBtVerde.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        RadioBtVerde.setText("Verde");
        RadioBtVerde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioBtVerdeActionPerformed(evt);
            }
        });

        LabelPonta.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        LabelPonta.setText("Ponta:");

        RadioBtPonta07.setText("0.7");
        RadioBtPonta07.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioBtPonta07ActionPerformed(evt);
            }
        });

        RadioBtPonta1.setText("1.0");
        RadioBtPonta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioBtPonta1ActionPerformed(evt);
            }
        });

        RadioBtPonta14.setText("1.4");
        RadioBtPonta14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioBtPonta14ActionPerformed(evt);
            }
        });

        RadioBtPonta16.setText("1.6");
        RadioBtPonta16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioBtPonta16ActionPerformed(evt);
            }
        });

        CampoCarga.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        CampoCarga.setToolTipText("");
        CampoCarga.setBorder(javax.swing.BorderFactory.createTitledBorder("Carga"));
        CampoCarga.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        CampoCarga.setOpaque(false);
        CampoCarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoCargaActionPerformed(evt);
            }
        });

        LabelCarga1.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        LabelCarga1.setText("%");

        RadioBtTampada.setText("Tampada");
        RadioBtTampada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioBtTampadaActionPerformed(evt);
            }
        });

        RadioBtDestampada.setText("Destampada");
        RadioBtDestampada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioBtDestampadaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 409, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LabelCor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(RadioBtAzul)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RadioBtPreta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RadioBtVermelha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RadioBtVerde))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CampoModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CampoCarga, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelCarga1))
                    .addComponent(RadioBtDestampada)
                    .addComponent(RadioBtTampada)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LabelPonta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(RadioBtPonta07)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RadioBtPonta1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RadioBtPonta14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RadioBtPonta16)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(CampoModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CampoCarga, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelCarga1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(LabelCor)
                    .addComponent(RadioBtAzul)
                    .addComponent(RadioBtPreta)
                    .addComponent(RadioBtVermelha, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RadioBtVerde))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(LabelPonta)
                    .addComponent(RadioBtPonta07)
                    .addComponent(RadioBtPonta1)
                    .addComponent(RadioBtPonta14, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RadioBtPonta16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RadioBtTampada)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RadioBtDestampada)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {CampoCarga, CampoModelo});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {LabelCor, RadioBtAzul, RadioBtPreta, RadioBtVerde, RadioBtVermelha});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {LabelPonta, RadioBtPonta07, RadioBtPonta1, RadioBtPonta14, RadioBtPonta16});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCadastrarActionPerformed
        
    }//GEN-LAST:event_BotaoCadastrarActionPerformed

    private void RadioBtAzulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioBtAzulActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RadioBtAzulActionPerformed

    private void RadioBtPretaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioBtPretaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RadioBtPretaActionPerformed

    private void RadioBtVermelhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioBtVermelhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RadioBtVermelhaActionPerformed

    private void RadioBtVerdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioBtVerdeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RadioBtVerdeActionPerformed

    private void CampoModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoModeloActionPerformed
        caneta.modelo = CampoModelo.getText();
    }//GEN-LAST:event_CampoModeloActionPerformed

    private void RadioBtPonta07ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioBtPonta07ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RadioBtPonta07ActionPerformed

    private void RadioBtPonta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioBtPonta1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RadioBtPonta1ActionPerformed

    private void RadioBtPonta14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioBtPonta14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RadioBtPonta14ActionPerformed

    private void RadioBtPonta16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioBtPonta16ActionPerformed
        
    }//GEN-LAST:event_RadioBtPonta16ActionPerformed

    private void RadioBtTampadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioBtTampadaActionPerformed
        
    }//GEN-LAST:event_RadioBtTampadaActionPerformed

    private void RadioBtDestampadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioBtDestampadaActionPerformed
        
    }//GEN-LAST:event_RadioBtDestampadaActionPerformed

    private void BotaoExibirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoExibirActionPerformed
        if (caneta.modelo != null)
        {
            JOptionPane.showMessageDialog(null, "Modelo:");
        }
    }//GEN-LAST:event_BotaoExibirActionPerformed

    private void BotaoTamparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoTamparActionPerformed
        
    }//GEN-LAST:event_BotaoTamparActionPerformed

    private void BotaoDestamparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoDestamparActionPerformed
        
    }//GEN-LAST:event_BotaoDestamparActionPerformed

    private void BotaoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoSairActionPerformed
        
    }//GEN-LAST:event_BotaoSairActionPerformed

    private void BotaoCadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoCadastrarMouseClicked
        
    }//GEN-LAST:event_BotaoCadastrarMouseClicked

    private void BotaoExibirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoExibirMouseClicked
        
    }//GEN-LAST:event_BotaoExibirMouseClicked

    private void BotaoTamparMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoTamparMouseClicked
        if (caneta.tampada)
        {
            JOptionPane.showMessageDialog(null, "Caneta já está tampada!");
        }
        else
        {
            caneta.tampada = true;
            JOptionPane.showMessageDialog(null, "Você tampou a caneta!");
        }
    }//GEN-LAST:event_BotaoTamparMouseClicked

    private void BotaoDestamparMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoDestamparMouseClicked
        if (!caneta.tampada)
        {
            JOptionPane.showMessageDialog(null, "Caneta já está destampada!");
        }
        else
        {
            caneta.tampada = false;
            JOptionPane.showMessageDialog(null, "Você destampou a caneta!");
        }
    }//GEN-LAST:event_BotaoDestamparMouseClicked

    private void BotaoSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoSairMouseClicked
        
    }//GEN-LAST:event_BotaoSairMouseClicked

    private void CampoCargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoCargaActionPerformed
        String carga;
        carga = CampoCarga.getText();
        
        caneta.carga = Integer.parseInt(carga);
    }//GEN-LAST:event_CampoCargaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmCaneta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCaneta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCaneta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCaneta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCaneta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoCadastrar;
    private javax.swing.JButton BotaoDestampar;
    private javax.swing.JButton BotaoExibir;
    private javax.swing.JButton BotaoSair;
    private javax.swing.JButton BotaoTampar;
    private javax.swing.JTextField CampoCarga;
    private javax.swing.JTextField CampoModelo;
    private javax.swing.JLabel LabelCarga1;
    private javax.swing.JLabel LabelCor;
    private javax.swing.JLabel LabelPonta;
    private javax.swing.JRadioButton RadioBtAzul;
    private javax.swing.JRadioButton RadioBtDestampada;
    private javax.swing.JRadioButton RadioBtPonta07;
    private javax.swing.JRadioButton RadioBtPonta1;
    private javax.swing.JRadioButton RadioBtPonta14;
    private javax.swing.JRadioButton RadioBtPonta16;
    private javax.swing.JRadioButton RadioBtPreta;
    private javax.swing.JRadioButton RadioBtTampada;
    private javax.swing.JRadioButton RadioBtVerde;
    private javax.swing.JRadioButton RadioBtVermelha;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JColorChooser jColorChooser2;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
