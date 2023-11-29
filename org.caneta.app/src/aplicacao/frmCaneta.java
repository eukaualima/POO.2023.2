package aplicacao;

import dao.CanetaDAO;
import dao.DAOFactory;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Caneta;

public class frmCaneta extends javax.swing.JFrame {
    Caneta caneta = new Caneta();
    
    CanetaDAO canetaDAO = DAOFactory.criarCanetaDAO();
    
    public frmCaneta(Caneta caneta) 
    {
        initComponents();
        
        this.caneta = caneta;
        
        if (this.caneta != null)
        {
            btnSalvar.setText("Editar");
            txtModelo.setText(this.caneta.getModelo());
            
            String cor = this.caneta.getCor();
            if (cor.equals(rbAzul.getText()))
            {
                rbAzul.setSelected(true);
            }
            else if (cor.equals(rbPreta.getText()))
            {
                rbPreta.setSelected(true);
            }
            else if (cor.equals(rbVermelha.getText()))
            {
                rbVermelha.setSelected(true);
            }
            else
            {
                rbVerde.setSelected(true);
            }
            
            boolean tampada = this.caneta.isTampada();
            
            if (tampada)
            {
                rbTampada.setSelected(true);
                rbDestampada.setSelected(false);
            }
            else
            {
                rbDestampada.setSelected(true);
                rbTampada.setSelected(false);
            }
            
            float ponta = this.caneta.getPonta();
            if (ponta == Float.parseFloat(rb07.getText()))
            {
                rb07.setSelected(true);
            }
            else if (ponta == Float.parseFloat(rb10.getText()))
            {
                rb10.setSelected(true);
            }
            else if (ponta == Float.parseFloat(rb14.getText()))
            {
                rb14.setSelected(true);
            }
            else if (ponta == Float.parseFloat(rb16.getText()))
            {
                rb16.setSelected(true);
            }
            
            int carga = this.caneta.getCarga();
            txtCarga.setText(String.valueOf(carga));
        }    
            
        // < Janela no centro da tela >
        this.setLocationRelativeTo(null);
    }
    
    private void inserir() {
        Caneta canetaInserida = new Caneta();
        canetaInserida.setModelo(txtModelo.getText());
        
        if (rbAzul.isSelected()) {
            canetaInserida.setCor(rbAzul.getText());
        } else if (rbVermelha.isSelected()) {
            canetaInserida.setCor(rbVermelha.getText());
        } else if (rbPreta.isSelected()) {
            canetaInserida.setCor(rbPreta.getText());
        } else {
            canetaInserida.setCor(rbVerde.getText());
        }

        if (rb07.isSelected()) {
            canetaInserida.setPonta(Float.parseFloat(rb07.getText()));
        } else if (rb10.isSelected()) {
            canetaInserida.setPonta(Float.parseFloat(rb10.getText()));
        } else if (rb14.isSelected()) {
            canetaInserida.setPonta(Float.parseFloat(rb14.getText()));
        } else {
            canetaInserida.setPonta(Float.parseFloat(rb16.getText()));
        }

        canetaInserida.setCarga(Integer.parseInt(txtCarga.getText()));
        canetaInserida.setTampada(rbTampada.isSelected());
        
        int linha = canetaDAO.inserir(canetaInserida);
        if (linha > 0) {
            JOptionPane.showMessageDialog(this, "Caneta inserida com sucesso!");
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao inserir Caneta.");
        }
        
        this.dispose();
    }
    
    private void editar() {
        Caneta caneta_editada = new Caneta();
        caneta_editada.setCodigo(caneta.getCodigo());
        caneta_editada.setModelo(txtModelo.getText());
        
        if (rbAzul.isSelected()) {
            caneta_editada.setCor(rbAzul.getText());
        } else if (rbVermelha.isSelected()) {
            caneta_editada.setCor(rbVermelha.getText());
        } else if (rbPreta.isSelected()) {
            caneta_editada.setCor(rbPreta.getText());
        } else {
            caneta_editada.setCor(rbVerde.getText());
        }

        if (rb07.isSelected()) {
            caneta_editada.setPonta(Float.parseFloat(rb07.getText()));
        } else if (rb10.isSelected()) {
            caneta_editada.setPonta(Float.parseFloat(rb10.getText()));
        } else if (rb14.isSelected()) {
            caneta_editada.setPonta(Float.parseFloat(rb14.getText()));
        } else {
            caneta_editada.setPonta(Float.parseFloat(rb16.getText()));
        }
        
        caneta_editada.setCarga(Integer.parseInt(txtCarga.getText()));
        caneta_editada.setTampada(caneta.isTampada());

        int linha = canetaDAO.editar(caneta_editada);
        if (linha > 0) {
            JOptionPane.showMessageDialog(this, "Caneta editada com sucesso!");
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao editar Caneta.");
        }
        
        this.dispose();
    }
    
    private void cancelar() {
        Object[] opcao = {"Não", "Sim"};
        int opcaoSelecionada = JOptionPane.showOptionDialog(this, "Deseja realmente sair?", "Aviso",
                JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, opcao, opcao[0]);
        if (opcaoSelecionada == 1) {
            this.dispose();
        }
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
        jSeparator3 = new javax.swing.JSeparator();
        btnSalvar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();

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
        lbCadastroCanetas.setText("Cadastro de Canetas");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setText("Modelo");

        txtModelo.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txtModelo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        txtModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtModeloActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setText("Carga");

        txtCarga.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txtCarga.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        txtCarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCargaActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
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

        btnSalvar.setBackground(new java.awt.Color(255, 255, 255));
        btnSalvar.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnSair.setBackground(new java.awt.Color(255, 255, 255));
        btnSair.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        btnSair.setText("Sair");
        btnSair.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
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
                            .addComponent(jLabel10)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(lbCadastroCanetas))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rb10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rb07)
                        .addComponent(rb14)
                        .addComponent(rb16)))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

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

    }//GEN-LAST:event_rbTampadaActionPerformed

    private void rbDestampadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbDestampadaActionPerformed

    }//GEN-LAST:event_rbDestampadaActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if (this.caneta == null) {
            inserir();
        } else {
            editar();
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        cancelar();
    }//GEN-LAST:event_btnSairActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalvar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
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
    private javax.swing.JTextField txtCarga;
    private javax.swing.JTextField txtModelo;
    // End of variables declaration//GEN-END:variables
}
