
package application.view;

import application.controller.ControllerControleDesenho;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextField;

public class ViewControleDesenhos extends javax.swing.JFrame {
  /*
    Campos
  */
  private ControllerControleDesenho controller;

  /*
    Construtores
  */
  public ViewControleDesenhos(ControllerControleDesenho controller) {
    this.controller = controller;
    initComponents();
  }
  
  /*
  Get's & Set's
   */
  public void setTxtTamanho(JTextField txtTamanho) {
    this.txtTamanho = txtTamanho;
  }
  public JButton getBtnCriar() {
    return btnCriar;
  }
  public void setBtnCriar(JButton btnCriar) {
    this.btnCriar = btnCriar;
  }
  public JButton getBtnCriar1() {
    return btnCriar1;
  }
  public void setBtnCriar1(JButton btnCriar1) {
    this.btnCriar1 = btnCriar1;
  }
  public JButton getBtnLimpar() {
    return btnLimpar;
  }
  public void setBtnLimpar(JButton btnLimpar) {
    this.btnLimpar = btnLimpar;
  }
  public JButton getBtnSair() {
    return btnSair;
  }
  public void setBtnSair(JButton btnSair) {
    this.btnSair = btnSair;
  }
  public ButtonGroup getGbtnTipo() {
    return gbtnTipo;
  }
  public void setGbtnTipo(ButtonGroup gbtnTipo) {
    this.gbtnTipo = gbtnTipo;
  }
  public JComboBox<String> getCboCliente() {
    return cboCliente;
  }
  public void setCboCliente(JComboBox<String> jComboBox1) {
    this.cboCliente = jComboBox1;
  }
  public JPanel getjPanel1() {
    return jPanel1;
  }
  public void setjPanel1(JPanel jPanel1) {
    this.jPanel1 = jPanel1;
  }
  public JPanel getjPanel2() {
    return jPanel2;
  }
  public void setjPanel2(JPanel jPanel2) {
    this.jPanel2 = jPanel2;
  }
  public JScrollPane getjScrollPane1() {
    return jScrollPane1;
  }
  public void setjScrollPane1(JScrollPane jScrollPane1) {
    this.jScrollPane1 = jScrollPane1;
  }
  public JLabel getLblAltura() {
    return lblAltura;
  }
  public void setLblAltura(JLabel lblAltura) {
    this.lblAltura = lblAltura;
  }
  public JLabel getLblBastidor() {
    return lblBastidor;
  }
  public void setLblBastidor(JLabel lblBastidor) {
    this.lblBastidor = lblBastidor;
  }
  public JLabel getLblData() {
    return lblData;
  }
  public void setLblData(JLabel lblData) {
    this.lblData = lblData;
  }
  public JLabel getLblLargura() {
    return lblLargura;
  }
  public void setLblLargura(JLabel lblLargura) {
    this.lblLargura = lblLargura;
  }
  public JLabel getLblNomeCliente() {
    return lblNomeCliente;
  }
  public void setLblNomeCliente(JLabel lblNomeCliente) {
    this.lblNomeCliente = lblNomeCliente;
  }
  public JLabel getLblNomeDesenho() {
    return lblNomeDesenho;
  }
  public void setLblNomeDesenho(JLabel lblNomeDesenho) {
    this.lblNomeDesenho = lblNomeDesenho;
  }
  public JLabel getLblPontos() {
    return lblPontos;
  }
  public void setLblPontos(JLabel lblPontos) {
    this.lblPontos = lblPontos;
  }
  public JLabel getLblRevisao() {
    return lblRevisao;
  }
  public void setLblRevisao(JLabel lblRevisao) {
    this.lblRevisao = lblRevisao;
  }
  public JLabel getLblTabela() {
    return lblTabela;
  }
  public void setLblTabela(JLabel lblTabela) {
    this.lblTabela = lblTabela;
  }
  public JLabel getLblTamanho() {
    return lblTamanho;
  }
  public void setLblTamanho(JLabel lblTamanho) {
    this.lblTamanho = lblTamanho;
  }
  public JTable getTblCores() {
    return tblCores;
  }
  public void setTblCores(JTable tblCores) {
    this.tblCores = tblCores;
  }
  public JTextField getTxtAltura() {
    return txtAltura;
  }
  public void setTxtAltura(JTextField txtAltura) {
    this.txtAltura = txtAltura;
  }
  public JTextField getTxtBastidor() {
    return txtBastidor;
  }
  public void setTxtBastidor(JTextField txtBastidor) {
    this.txtBastidor = txtBastidor;
  }
  public JTextField getTxtData() {
    return txtData;
  }
  public void setTxtData(JTextField txtData) {
    this.txtData = txtData;
  }
  public JTextField getTxtLargura() {
    return txtLargura;
  }
  public void setTxtLargura(JTextField txtLargura) {
    this.txtLargura = txtLargura;
  }
  public JTextField getTxtNomeDesenho() {
    return txtNomeDesenho;
  }
  public void setTxtNomeDesenho(JTextField txtNomeDesenho) {
    this.txtNomeDesenho = txtNomeDesenho;
  }
  public JTextField getTxtPontos() {
    return txtPontos;
  }
  public void setTxtPontos(JTextField txtPontos) {
    this.txtPontos = txtPontos;
  }
  public JTextField getTxtRevisao() {
    return txtRevisao;
  }
  public void setTxtRevisao(JTextField txtRevisao) {
    this.txtRevisao = txtRevisao;
  }
  public JTextField getTxtTamanho() {
    return txtTamanho;
  }
  public ControllerControleDesenho getController() {
    return controller;
  }
  public void setController(ControllerControleDesenho controller) {
    this.controller = controller;
  }
  public JLabel getLblNumeroDesenho() {
    return lblNumeroDesenho;
  }
  public void setLblNumeroDesenho(JLabel lblNumeroDesenho) {
    this.lblNumeroDesenho = lblNumeroDesenho;
  }
  public JTextField getTxtNumeoDesenho() {
    return txtNumeoDesenho;
  }
  public void setTxtNumeoDesenho(JTextField txtNumeoDesenho) {
    this.txtNumeoDesenho = txtNumeoDesenho;
  }
  public JSpinner getCgrLinhas() {
    return cgrLinhas;
  }
  public void setCgrLinhas(JSpinner cgrLinhas) {
    this.cgrLinhas = cgrLinhas;
  }
  public JLabel getLblLinhas() {
    return lblLinhas;
  }
  public void setLblLinhas(JLabel lblLinhas) {
    this.lblLinhas = lblLinhas;
  }
  public JLabel getLblValorDesenho() {
    return lblValorDesenho;
  }
  public void setLblValorDesenho(JLabel lblValorDesenho) {
    this.lblValorDesenho = lblValorDesenho;
  }
  public JSpinner getCgrRepetibilidade() {
    return cgrRepetibilidade;
  }
  public void setCgrRepetibilidade(JSpinner cgrRepetibilidade) {
    this.cgrRepetibilidade = cgrRepetibilidade;
  }
  public JLabel getLblMm1() {
    return lblMm1;
  }
  public void setLblMm1(JLabel lblMm1) {
    this.lblMm1 = lblMm1;
  }
  public JLabel getLblMm2() {
    return lblMm2;
  }
  public void setLblMm2(JLabel lblMm2) {
    this.lblMm2 = lblMm2;
  }
  public JLabel getLblRepetibilidade() {
    return lblRepetibilidade;
  }
  public void setLblRepetibilidade(JLabel lblRepetibilidade) {
    this.lblRepetibilidade = lblRepetibilidade;
  }
  public JLabel getLblValorTotal() {
    return lblValorTotal;
  }
  public void setLblValorTotal(JLabel lblValorTotal) {
    this.lblValorTotal = lblValorTotal;
  }
  
  /*
    Demais métodos
  */

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {
    java.awt.GridBagConstraints gridBagConstraints;

    gbtnTipo = new javax.swing.ButtonGroup();
    jPanel1 = new javax.swing.JPanel();
    lblNomeDesenho = new javax.swing.JLabel();
    lblData = new javax.swing.JLabel();
    lblRevisao = new javax.swing.JLabel();
    txtNomeDesenho = new javax.swing.JTextField();
    txtData = new javax.swing.JTextField();
    txtRevisao = new javax.swing.JTextField();
    cboCliente = new javax.swing.JComboBox<>();
    lblNomeCliente = new javax.swing.JLabel();
    btnCriar1 = new javax.swing.JButton();
    lblNumeroDesenho = new javax.swing.JLabel();
    txtNumeoDesenho = new javax.swing.JTextField();
    jPanel2 = new javax.swing.JPanel();
    lblBastidor = new javax.swing.JLabel();
    txtBastidor = new javax.swing.JTextField();
    lblTamanho = new javax.swing.JLabel();
    lblAltura = new javax.swing.JLabel();
    lblLargura = new javax.swing.JLabel();
    txtTamanho = new javax.swing.JTextField();
    txtAltura = new javax.swing.JTextField();
    txtLargura = new javax.swing.JTextField();
    txtPontos = new javax.swing.JTextField();
    lblPontos = new javax.swing.JLabel();
    lblTabela = new javax.swing.JLabel();
    jScrollPane1 = new javax.swing.JScrollPane();
    tblCores = new javax.swing.JTable();
    btnLimpar = new javax.swing.JButton();
    cgrLinhas = new javax.swing.JSpinner();
    lblLinhas = new javax.swing.JLabel();
    lblMm1 = new javax.swing.JLabel();
    lblMm2 = new javax.swing.JLabel();
    lblValorDesenho = new javax.swing.JLabel();
    lblRepetibilidade = new javax.swing.JLabel();
    cgrRepetibilidade = new javax.swing.JSpinner();
    lblValorTotal = new javax.swing.JLabel();
    btnSair = new javax.swing.JButton();
    btnCriar = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    setPreferredSize(new java.awt.Dimension(700, 850));
    setResizable(false);
    addWindowListener(new java.awt.event.WindowAdapter() {
      public void windowClosed(java.awt.event.WindowEvent evt) {
        formWindowClosed(evt);
      }
    });
    getContentPane().setLayout(new java.awt.GridBagLayout());

    jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados do Desenho"));
    jPanel1.setForeground(new java.awt.Color(14, 58, 91));
    jPanel1.setPreferredSize(new java.awt.Dimension(645, 220));

    lblNomeDesenho.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    lblNomeDesenho.setForeground(new java.awt.Color(14, 58, 91));
    lblNomeDesenho.setText("Nome do Desenho");

    lblData.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    lblData.setForeground(new java.awt.Color(14, 58, 91));
    lblData.setText("Data");

    lblRevisao.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    lblRevisao.setForeground(new java.awt.Color(14, 58, 91));
    lblRevisao.setText("Revisão");

    txtNomeDesenho.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    txtNomeDesenho.setForeground(new java.awt.Color(14, 58, 91));

    txtData.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    txtData.setForeground(new java.awt.Color(14, 58, 91));

    txtRevisao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    txtRevisao.setForeground(new java.awt.Color(14, 58, 91));

    cboCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    cboCliente.setForeground(new java.awt.Color(14, 58, 91));
    cboCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
    cboCliente.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        cboClienteActionPerformed(evt);
      }
    });

    lblNomeCliente.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    lblNomeCliente.setForeground(new java.awt.Color(14, 58, 91));
    lblNomeCliente.setText("Nome do Cliente");

    btnCriar1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    btnCriar1.setForeground(new java.awt.Color(14, 58, 91));
    btnCriar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/imagens/add-user.png"))); // NOI18N
    btnCriar1.setToolTipText("");
    btnCriar1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    btnCriar1.setMinimumSize(new java.awt.Dimension(40, 40));
    btnCriar1.setPreferredSize(new java.awt.Dimension(40, 40));
    btnCriar1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnCriar1ActionPerformed(evt);
      }
    });

    lblNumeroDesenho.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    lblNumeroDesenho.setForeground(new java.awt.Color(14, 58, 91));
    lblNumeroDesenho.setText("Número do Desenho");

    txtNumeoDesenho.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    txtNumeoDesenho.setForeground(new java.awt.Color(14, 58, 91));

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
        .addGap(176, 176, 176)
        .addComponent(txtNomeDesenho)
        .addGap(57, 57, 57))
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
        .addGap(64, 64, 64)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addComponent(lblRevisao)
          .addComponent(lblData)
          .addComponent(lblNomeDesenho)
          .addComponent(lblNomeCliente))
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(10, 10, 10)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(cboCliente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(txtData)
                .addGap(209, 209, 209)))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(btnCriar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(52, 52, 52))
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(txtRevisao, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addGap(52, 52, 52)
        .addComponent(lblNumeroDesenho)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(txtNumeoDesenho, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(lblNomeDesenho)
          .addComponent(txtNomeDesenho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(lblData)
          .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(8, 8, 8)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
          .addComponent(btnCriar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(cboCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(lblNomeCliente))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(txtRevisao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(lblRevisao))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(txtNumeoDesenho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(lblNumeroDesenho))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    getContentPane().add(jPanel1, new java.awt.GridBagConstraints());

    jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Características do Desenho"));
    jPanel2.setForeground(new java.awt.Color(14, 58, 91));
    jPanel2.setMinimumSize(new java.awt.Dimension(200, 200));
    jPanel2.setPreferredSize(new java.awt.Dimension(200, 520));

    lblBastidor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    lblBastidor.setForeground(new java.awt.Color(14, 58, 91));
    lblBastidor.setText("Bastidor");

    txtBastidor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    txtBastidor.setForeground(new java.awt.Color(14, 58, 91));

    lblTamanho.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    lblTamanho.setForeground(new java.awt.Color(14, 58, 91));
    lblTamanho.setText("Tamanho");

    lblAltura.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    lblAltura.setForeground(new java.awt.Color(14, 58, 91));
    lblAltura.setText("Altura");

    lblLargura.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    lblLargura.setForeground(new java.awt.Color(14, 58, 91));
    lblLargura.setText("Largura");

    txtTamanho.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    txtTamanho.setForeground(new java.awt.Color(14, 58, 91));

    txtAltura.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    txtAltura.setForeground(new java.awt.Color(14, 58, 91));
    txtAltura.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        txtAlturaActionPerformed(evt);
      }
    });

    txtLargura.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    txtLargura.setForeground(new java.awt.Color(14, 58, 91));
    txtLargura.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        txtLarguraActionPerformed(evt);
      }
    });

    txtPontos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    txtPontos.setForeground(new java.awt.Color(14, 58, 91));
    txtPontos.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        txtPontosActionPerformed(evt);
      }
    });

    lblPontos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    lblPontos.setForeground(new java.awt.Color(14, 58, 91));
    lblPontos.setText("Pontos");

    lblTabela.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    lblTabela.setForeground(new java.awt.Color(14, 58, 91));
    lblTabela.setText("Tabela de Cores");

    tblCores.setForeground(new java.awt.Color(14, 58, 91));
    tblCores.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {
        {null, null, null},
        {null, null, null},
        {null, null, null},
        {null, null, null},
        {null, null, null},
        {null, null, null},
        {null, null, null},
        {null, null, null},
        {null, null, null},
        {null, null, null}
      },
      new String [] {
        "Title 1", "Title 2", "Title 3"
      }
    ));
    tblCores.setCellSelectionEnabled(true);
    jScrollPane1.setViewportView(tblCores);
    tblCores.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

    btnLimpar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    btnLimpar.setForeground(new java.awt.Color(14, 58, 91));
    btnLimpar.setText("Limpar");
    btnLimpar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnLimparActionPerformed(evt);
      }
    });

    cgrLinhas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    cgrLinhas.setModel(new javax.swing.SpinnerNumberModel(1, 1, 255, 1));
    cgrLinhas.setEditor(new javax.swing.JSpinner.NumberEditor(cgrLinhas, ""));
    cgrLinhas.addChangeListener(new javax.swing.event.ChangeListener() {
      public void stateChanged(javax.swing.event.ChangeEvent evt) {
        cgrLinhasStateChanged(evt);
      }
    });

    lblLinhas.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    lblLinhas.setForeground(new java.awt.Color(14, 58, 91));
    lblLinhas.setText("Quantidade de linhas");

    lblMm1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
    lblMm1.setForeground(new java.awt.Color(14, 58, 91));
    lblMm1.setText("mm");

    lblMm2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
    lblMm2.setForeground(new java.awt.Color(14, 58, 91));
    lblMm2.setText("mm");

    lblValorDesenho.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    lblValorDesenho.setForeground(new java.awt.Color(14, 58, 91));
    lblValorDesenho.setText("Valor do Desenho: ");

    lblRepetibilidade.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    lblRepetibilidade.setForeground(new java.awt.Color(14, 58, 91));
    lblRepetibilidade.setText("Repetibilidade");

    cgrRepetibilidade.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    cgrRepetibilidade.setModel(new javax.swing.SpinnerNumberModel(1, 1, 255, 1));
    cgrRepetibilidade.setEditor(new javax.swing.JSpinner.NumberEditor(cgrRepetibilidade, ""));
    cgrRepetibilidade.addChangeListener(new javax.swing.event.ChangeListener() {
      public void stateChanged(javax.swing.event.ChangeEvent evt) {
        cgrRepetibilidadeStateChanged(evt);
      }
    });

    lblValorTotal.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    lblValorTotal.setForeground(new java.awt.Color(14, 58, 91));
    lblValorTotal.setText("Valor do Total: ");

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel2Layout.createSequentialGroup()
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel2Layout.createSequentialGroup()
            .addGap(65, 65, 65)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
              .addComponent(lblAltura)
              .addComponent(lblBastidor)
              .addComponent(lblTamanho)
              .addComponent(lblPontos)
              .addComponent(lblLargura)
              .addComponent(lblRepetibilidade))
            .addGap(28, 28, 28)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(txtBastidor, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(txtTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(txtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblMm1))
              .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(txtLargura, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblMm2))
              .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(txtPontos, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblValorDesenho))
              .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(cgrRepetibilidade, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblValorTotal))))
          .addGroup(jPanel2Layout.createSequentialGroup()
            .addGap(26, 26, 26)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
              .addComponent(lblTabela)
              .addComponent(lblLinhas))
            .addGap(28, 28, 28)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                .addComponent(cgrLinhas, javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(btnLimpar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        .addContainerGap(65, Short.MAX_VALUE))
    );
    jPanel2Layout.setVerticalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel2Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(lblBastidor)
          .addComponent(txtBastidor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(txtTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(lblTamanho))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(txtLargura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(lblLargura)
          .addComponent(lblMm2))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(txtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(lblAltura)
          .addComponent(lblMm1))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(txtPontos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(lblPontos)
          .addComponent(lblValorDesenho))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(cgrRepetibilidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(lblRepetibilidade)
          .addComponent(lblValorTotal))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(lblTabela)
          .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(btnLimpar)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(cgrLinhas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(lblLinhas))
        .addContainerGap(40, Short.MAX_VALUE))
    );

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
    getContentPane().add(jPanel2, gridBagConstraints);

    btnSair.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    btnSair.setForeground(new java.awt.Color(14, 58, 91));
    btnSair.setText("Sair");
    btnSair.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnSairActionPerformed(evt);
      }
    });
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
    gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 0);
    getContentPane().add(btnSair, gridBagConstraints);

    btnCriar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    btnCriar.setForeground(new java.awt.Color(14, 58, 91));
    btnCriar.setText("Criar");
    btnCriar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnCriarActionPerformed(evt);
      }
    });
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
    getContentPane().add(btnCriar, gridBagConstraints);

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
    // TODO add your handling code here:
    this.controller.habilitarTelaPrincipal(this.controller.getCtrlPrincipal());
  }//GEN-LAST:event_formWindowClosed

  private void btnCriarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCriarActionPerformed
    // TODO add your handling code here:
    this.controller.btnCriar();
  }//GEN-LAST:event_btnCriarActionPerformed

  private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
    // TODO add your handling code here:
    this.controller.btnSair();
  }//GEN-LAST:event_btnSairActionPerformed

  private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
    // TODO add your handling code here:
    this.controller.btnLimpar();
  }//GEN-LAST:event_btnLimparActionPerformed

  private void btnCriar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCriar1ActionPerformed
    // TODO add your handling code here:
    this.controller.adicionarNovoCliente();
  }//GEN-LAST:event_btnCriar1ActionPerformed

  private void cboClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboClienteActionPerformed
    // TODO add your handling code here:
    this.controller.cboCliente();
  }//GEN-LAST:event_cboClienteActionPerformed

  private void cgrLinhasStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_cgrLinhasStateChanged
    // TODO add your handling code here:
    this.controller.definirSequenciasTabela();
  }//GEN-LAST:event_cgrLinhasStateChanged

  private void txtAlturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAlturaActionPerformed
    // TODO add your handling code here:
    this.controller.definirTamanho();
  }//GEN-LAST:event_txtAlturaActionPerformed

  private void txtLarguraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLarguraActionPerformed
    // TODO add your handling code here:
    this.controller.definirTamanho();
  }//GEN-LAST:event_txtLarguraActionPerformed

  private void txtPontosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPontosActionPerformed
    // TODO add your handling code here:
    this.controller.calcularValorDesenho();
    this.controller.calcularValorTotal();
  }//GEN-LAST:event_txtPontosActionPerformed

  private void cgrRepetibilidadeStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_cgrRepetibilidadeStateChanged
    // TODO add your handling code here:
    this.controller.calcularValorTotal();
  }//GEN-LAST:event_cgrRepetibilidadeStateChanged

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnCriar;
  private javax.swing.JButton btnCriar1;
  private javax.swing.JButton btnLimpar;
  private javax.swing.JButton btnSair;
  private javax.swing.JComboBox<String> cboCliente;
  private javax.swing.JSpinner cgrLinhas;
  private javax.swing.JSpinner cgrRepetibilidade;
  private javax.swing.ButtonGroup gbtnTipo;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JLabel lblAltura;
  private javax.swing.JLabel lblBastidor;
  private javax.swing.JLabel lblData;
  private javax.swing.JLabel lblLargura;
  private javax.swing.JLabel lblLinhas;
  private javax.swing.JLabel lblMm1;
  private javax.swing.JLabel lblMm2;
  private javax.swing.JLabel lblNomeCliente;
  private javax.swing.JLabel lblNomeDesenho;
  private javax.swing.JLabel lblNumeroDesenho;
  private javax.swing.JLabel lblPontos;
  private javax.swing.JLabel lblRepetibilidade;
  private javax.swing.JLabel lblRevisao;
  private javax.swing.JLabel lblTabela;
  private javax.swing.JLabel lblTamanho;
  private javax.swing.JLabel lblValorDesenho;
  private javax.swing.JLabel lblValorTotal;
  private javax.swing.JTable tblCores;
  private javax.swing.JTextField txtAltura;
  private javax.swing.JTextField txtBastidor;
  private javax.swing.JTextField txtData;
  private javax.swing.JTextField txtLargura;
  private javax.swing.JTextField txtNomeDesenho;
  private javax.swing.JTextField txtNumeoDesenho;
  private javax.swing.JTextField txtPontos;
  private javax.swing.JTextField txtRevisao;
  private javax.swing.JTextField txtTamanho;
  // End of variables declaration//GEN-END:variables
}
