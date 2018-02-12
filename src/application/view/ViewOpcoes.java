
package application.view;

import application.controller.ControllerOpcoes;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ViewOpcoes extends javax.swing.JFrame {
  /*
    Campos
  */
  private ControllerOpcoes controller;
  
  /*
    Construtores
  */
  public ViewOpcoes(ControllerOpcoes controller) {
    this.controller = controller;
    initComponents();
  }
  
  /*
    Get's & Set's
  */
  public ControllerOpcoes getController() {
    return controller;
  }
  public void setController(ControllerOpcoes controller) {
    this.controller = controller;
  }
  public JButton getBtnCriar() {
    return btnCriar;
  }
  public void setBtnCriar(JButton btnCriar) {
    this.btnCriar = btnCriar;
  }
  public JLabel getLblCaminho() {
    return lblCaminho;
  }
  public void setLblCaminho(JLabel lblCaminho) {
    this.lblCaminho = lblCaminho;
  }
  public JLabel getLblData() {
    return lblData;
  }
  public void setLblData(JLabel lblData) {
    this.lblData = lblData;
  }
  public JPanel getPnlPastaRaiz() {
    return pnlPastaRaiz;
  }
  public void setPnlPastaRaiz(JPanel pnlPastaRaiz) {
    this.pnlPastaRaiz = pnlPastaRaiz;
  }
  public JTextField getTxtCaminho() {
    return txtCaminho;
  }
  public void setTxtCaminho(JTextField txtCaminho) {
    this.txtCaminho = txtCaminho;
  }
  public JButton getBtnSalvarValor() {
    return btnSalvarValor;
  }
  public void setBtnSalvarValor(JButton btnSalvarValor) {
    this.btnSalvarValor = btnSalvarValor;
  }
  public JLabel getLblValor() {
    return lblValor;
  }
  public void setLblValor(JLabel lblValor) {
    this.lblValor = lblValor;
  }
  public JLabel getLblValorAtual() {
    return lblValorAtual;
  }
  public void setLblValorAtual(JLabel lblValorAtual) {
    this.lblValorAtual = lblValorAtual;
  }
  public JPanel getPnlValorPonto() {
    return pnlValorPonto;
  }
  public void setPnlValorPonto(JPanel pnlValorPonto) {
    this.pnlValorPonto = pnlValorPonto;
  }
  public JTextField getTxtValor() {
    return txtValor;
  }
  public void setTxtValor(JTextField txtValor) {
    this.txtValor = txtValor;
  }
  
  /*
    Demais métodos
  */
  
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {
    java.awt.GridBagConstraints gridBagConstraints;

    pnlPastaRaiz = new javax.swing.JPanel();
    lblData = new javax.swing.JLabel();
    txtCaminho = new javax.swing.JTextField();
    lblCaminho = new javax.swing.JLabel();
    btnCriar = new javax.swing.JButton();
    pnlValorPonto = new javax.swing.JPanel();
    lblValor = new javax.swing.JLabel();
    txtValor = new javax.swing.JTextField();
    lblValorAtual = new javax.swing.JLabel();
    btnSalvarValor = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    setPreferredSize(new java.awt.Dimension(640, 300));
    setResizable(false);
    addWindowListener(new java.awt.event.WindowAdapter() {
      public void windowClosed(java.awt.event.WindowEvent evt) {
        formWindowClosed(evt);
      }
    });
    getContentPane().setLayout(new java.awt.GridBagLayout());

    pnlPastaRaiz.setBorder(javax.swing.BorderFactory.createTitledBorder("Pasta raiz"));
    pnlPastaRaiz.setForeground(new java.awt.Color(14, 58, 91));
    pnlPastaRaiz.setPreferredSize(new java.awt.Dimension(600, 110));

    lblData.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    lblData.setForeground(new java.awt.Color(14, 58, 91));
    lblData.setText("Caminho");

    txtCaminho.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    txtCaminho.setForeground(new java.awt.Color(14, 58, 91));
    txtCaminho.setText("C:/User");
    txtCaminho.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        txtCaminhoActionPerformed(evt);
      }
    });
    txtCaminho.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyReleased(java.awt.event.KeyEvent evt) {
        txtCaminhoKeyReleased(evt);
      }
    });

    lblCaminho.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
    lblCaminho.setForeground(new java.awt.Color(14, 58, 91));
    lblCaminho.setText("Caminho Atual: C:/User/Malharia/Bordados");

    btnCriar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    btnCriar.setForeground(new java.awt.Color(14, 58, 91));
    btnCriar.setText("Salvar");
    btnCriar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnCriarActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout pnlPastaRaizLayout = new javax.swing.GroupLayout(pnlPastaRaiz);
    pnlPastaRaiz.setLayout(pnlPastaRaizLayout);
    pnlPastaRaizLayout.setHorizontalGroup(
      pnlPastaRaizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPastaRaizLayout.createSequentialGroup()
        .addContainerGap(43, Short.MAX_VALUE)
        .addGroup(pnlPastaRaizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addGroup(pnlPastaRaizLayout.createSequentialGroup()
            .addComponent(lblCaminho)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnCriar))
          .addGroup(pnlPastaRaizLayout.createSequentialGroup()
            .addComponent(lblData)
            .addGap(18, 18, 18)
            .addComponent(txtCaminho, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addGap(31, 31, 31))
    );
    pnlPastaRaizLayout.setVerticalGroup(
      pnlPastaRaizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(pnlPastaRaizLayout.createSequentialGroup()
        .addGap(16, 16, 16)
        .addGroup(pnlPastaRaizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(lblData)
          .addComponent(txtCaminho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(pnlPastaRaizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addComponent(lblCaminho)
          .addComponent(btnCriar))
        .addContainerGap(17, Short.MAX_VALUE))
    );

    getContentPane().add(pnlPastaRaiz, new java.awt.GridBagConstraints());

    pnlValorPonto.setBorder(javax.swing.BorderFactory.createTitledBorder("Valor por ponto de bordado"));
    pnlValorPonto.setForeground(new java.awt.Color(14, 58, 91));
    pnlValorPonto.setPreferredSize(new java.awt.Dimension(600, 110));

    lblValor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    lblValor.setForeground(new java.awt.Color(14, 58, 91));
    lblValor.setText("Valor (R$)");

    txtValor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    txtValor.setForeground(new java.awt.Color(14, 58, 91));
    txtValor.setText("C:/User");
    txtValor.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        txtValorActionPerformed(evt);
      }
    });
    txtValor.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyReleased(java.awt.event.KeyEvent evt) {
        txtValorKeyReleased(evt);
      }
    });

    lblValorAtual.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
    lblValorAtual.setForeground(new java.awt.Color(14, 58, 91));
    lblValorAtual.setText("Valor Atual: R$ 0,0008");

    btnSalvarValor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    btnSalvarValor.setForeground(new java.awt.Color(14, 58, 91));
    btnSalvarValor.setText("Salvar");
    btnSalvarValor.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnSalvarValorActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout pnlValorPontoLayout = new javax.swing.GroupLayout(pnlValorPonto);
    pnlValorPonto.setLayout(pnlValorPontoLayout);
    pnlValorPontoLayout.setHorizontalGroup(
      pnlValorPontoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlValorPontoLayout.createSequentialGroup()
        .addContainerGap(34, Short.MAX_VALUE)
        .addGroup(pnlValorPontoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addGroup(pnlValorPontoLayout.createSequentialGroup()
            .addComponent(lblValorAtual)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnSalvarValor))
          .addGroup(pnlValorPontoLayout.createSequentialGroup()
            .addComponent(lblValor)
            .addGap(18, 18, 18)
            .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addGap(31, 31, 31))
    );
    pnlValorPontoLayout.setVerticalGroup(
      pnlValorPontoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(pnlValorPontoLayout.createSequentialGroup()
        .addGap(16, 16, 16)
        .addGroup(pnlValorPontoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(lblValor)
          .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(pnlValorPontoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addComponent(lblValorAtual)
          .addComponent(btnSalvarValor))
        .addContainerGap(17, Short.MAX_VALUE))
    );

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.insets = new java.awt.Insets(0, 0, 20, 0);
    getContentPane().add(pnlValorPonto, gridBagConstraints);

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
    // TODO add your handling code here:
    this.controller.habilitarTelaPrincipal(this.controller.getCtrlPrincipal());
  }//GEN-LAST:event_formWindowClosed

  private void txtCaminhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCaminhoActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_txtCaminhoActionPerformed

  private void txtCaminhoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCaminhoKeyReleased
    // TODO add your handling code here:
  }//GEN-LAST:event_txtCaminhoKeyReleased

  private void btnCriarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCriarActionPerformed
    // TODO add your handling code here:
    this.controller.salvarCaminhoRais();
  }//GEN-LAST:event_btnCriarActionPerformed

  private void txtValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_txtValorActionPerformed

  private void txtValorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValorKeyReleased
    // TODO add your handling code here:
  }//GEN-LAST:event_txtValorKeyReleased

  private void btnSalvarValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarValorActionPerformed
    // TODO add your handling code here:
    this.controller.salvarValorPonto();
  }//GEN-LAST:event_btnSalvarValorActionPerformed

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnCriar;
  private javax.swing.JButton btnSalvarValor;
  private javax.swing.JLabel lblCaminho;
  private javax.swing.JLabel lblData;
  private javax.swing.JLabel lblValor;
  private javax.swing.JLabel lblValorAtual;
  private javax.swing.JPanel pnlPastaRaiz;
  private javax.swing.JPanel pnlValorPonto;
  private javax.swing.JTextField txtCaminho;
  private javax.swing.JTextField txtValor;
  // End of variables declaration//GEN-END:variables
}
