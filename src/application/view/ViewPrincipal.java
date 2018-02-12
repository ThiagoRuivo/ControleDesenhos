
package application.view;

import application.controller.ControllerPrincipal;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ViewPrincipal extends javax.swing.JFrame {
  /*
    Campos
  */
  private ControllerPrincipal controller;
  
  /*
    Construtores
  */
  public ViewPrincipal(ControllerPrincipal controller) {
    this.controller = controller;
    initComponents();
  }
  
  /*
    Get's & Set's
  */
  public ControllerPrincipal getController() {
    return controller;
  }
  public void setController(ControllerPrincipal controller) {
    this.controller = controller;
  }
  public JButton getBtnControleDesenhos() {
    return btnControleDesenhos;
  }
  public void setBtnControleDesenhos(JButton btnControleDesenhos) {
    this.btnControleDesenhos = btnControleDesenhos;
  }
  public JLabel getLblLogoEmilyMalhas() {
    return lblLogoEmilyMalhas;
  }
  public void setLblLogoEmilyMalhas(JLabel lblLogoEmilyMalhas) {
    this.lblLogoEmilyMalhas = lblLogoEmilyMalhas;
  }
  public JPanel getPnlInferior() {
    return pnlInferior;
  }
  public void setPnlInferior(JPanel pnlInferior) {
    this.pnlInferior = pnlInferior;
  }
  public JPanel getPnlSuperior() {
    return pnlSuperior;
  }
  public void setPnlSuperior(JPanel pnlSuperior) {
    this.pnlSuperior = pnlSuperior;
  }
  
  /*
    Demais métodos
  */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {
    java.awt.GridBagConstraints gridBagConstraints;

    pnlSuperior = new javax.swing.JPanel();
    lblLogoEmilyMalhas = new javax.swing.JLabel();
    pnlInferior = new javax.swing.JPanel();
    btnControleDesenhos = new javax.swing.JButton();
    btnOpcoes = new javax.swing.JButton();
    btnEstruturaInidial = new javax.swing.JButton();
    lblVersao = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setResizable(false);
    getContentPane().setLayout(new java.awt.GridBagLayout());

    pnlSuperior.setPreferredSize(new java.awt.Dimension(400, 230));
    pnlSuperior.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    lblLogoEmilyMalhas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/imagens/Logo1 - 400x230.png"))); // NOI18N
    pnlSuperior.add(lblLogoEmilyMalhas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    lblLogoEmilyMalhas.getAccessibleContext().setAccessibleDescription("");

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
    getContentPane().add(pnlSuperior, gridBagConstraints);

    pnlInferior.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
    pnlInferior.setPreferredSize(new java.awt.Dimension(400, 400));
    pnlInferior.setLayout(new java.awt.GridBagLayout());

    btnControleDesenhos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
    btnControleDesenhos.setForeground(new java.awt.Color(15, 57, 91));
    btnControleDesenhos.setLabel("Controle de Desenhos");
    btnControleDesenhos.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnControleDesenhosActionPerformed(evt);
      }
    });
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    gridBagConstraints.ipadx = 150;
    gridBagConstraints.ipady = 5;
    pnlInferior.add(btnControleDesenhos, gridBagConstraints);

    btnOpcoes.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
    btnOpcoes.setForeground(new java.awt.Color(15, 57, 91));
    btnOpcoes.setText("Opções");
    btnOpcoes.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnOpcoesActionPerformed(evt);
      }
    });
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    gridBagConstraints.ipadx = 150;
    gridBagConstraints.ipady = 5;
    pnlInferior.add(btnOpcoes, gridBagConstraints);

    btnEstruturaInidial.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
    btnEstruturaInidial.setForeground(new java.awt.Color(15, 57, 91));
    btnEstruturaInidial.setText("Criar Estrutura de Pastas Inicial");
    btnEstruturaInidial.setActionCommand("");
    btnEstruturaInidial.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnEstruturaInidialActionPerformed(evt);
      }
    });
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    gridBagConstraints.ipadx = 150;
    gridBagConstraints.ipady = 5;
    pnlInferior.add(btnEstruturaInidial, gridBagConstraints);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 0);
    getContentPane().add(pnlInferior, gridBagConstraints);

    lblVersao.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
    lblVersao.setForeground(new java.awt.Color(14, 58, 91));
    lblVersao.setText("Controle Emily Malhas v 1.0.0");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
    gridBagConstraints.insets = new java.awt.Insets(0, 10, 10, 0);
    getContentPane().add(lblVersao, gridBagConstraints);

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void btnControleDesenhosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnControleDesenhosActionPerformed
    // TODO add your handling code here:
    this.controller.criarControleDesenhos();
    this.controller.alterarTelaPrincipal(false);
  }//GEN-LAST:event_btnControleDesenhosActionPerformed

  private void btnOpcoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpcoesActionPerformed
    // TODO add your handling code here:
    this.controller.criarControleOpcoes();
    this.controller.alterarTelaPrincipal(false);
    this.controller.carregar();
  }//GEN-LAST:event_btnOpcoesActionPerformed

  private void btnEstruturaInidialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstruturaInidialActionPerformed
    // TODO add your handling code here:
    this.controller.criarEstruturaInicial();
  }//GEN-LAST:event_btnEstruturaInidialActionPerformed

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnControleDesenhos;
  private javax.swing.JButton btnEstruturaInidial;
  private javax.swing.JButton btnOpcoes;
  private javax.swing.JLabel lblLogoEmilyMalhas;
  private javax.swing.JLabel lblVersao;
  private javax.swing.JPanel pnlInferior;
  private javax.swing.JPanel pnlSuperior;
  // End of variables declaration//GEN-END:variables
}
