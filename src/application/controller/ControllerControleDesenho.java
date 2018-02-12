
package application.controller;

import ManipularArquivo.ManipularArquivo;
import application.view.ViewControleDesenhos;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import utilidade.Data;
import utilidade.UtilData;

public class ControllerControleDesenho {
  /*
    Campos
  */
  private ViewControleDesenhos view;
  private ControllerPrincipal ctrlPrincipal;
  private Data dataControle;
  private String[] colunas;
  
  /*
    Construtores
  */
  public ControllerControleDesenho() {
  }
  public ControllerControleDesenho(ViewControleDesenhos view) {
    this.view = view;
  }
  
  /*
    Get's & Set's
  */
  public ViewControleDesenhos getView() {
    return view;
  }
  public void setView(ViewControleDesenhos view) {
    this.view = view;
  }
  public ControllerPrincipal getCtrlPrincipal() {
    return ctrlPrincipal;
  }
  public void setCtrlPrincipal(ControllerPrincipal ctrlPrincipal) {
    this.ctrlPrincipal = ctrlPrincipal;
  }
  public Data getDataControle() {
    return dataControle;
  }
  public void setDataControle(Data dataControle) {
    this.dataControle = dataControle;
  }
  public String[] getColunas() {
    return colunas;
  }
  public void setColunas(String[] colunas) {
    this.colunas = colunas;
  }
  
  /*
    Demais métodos
  */
  public void estadoInicialTela () {
    limparComboBox();
    desabilitarData();
    gerarData();
    desabilitarNumeroDesenho();
    desabilitarTamanho();
    cboCliente();
    txtAltura();
    txtLargura();
    txtPontos();
    carregarClientes();
    iniciarColunas();
    definirColunasView();
    definirSequenciasTabela();
    calcularValorDesenho();
    calcularValorTotal();
  }
  public void iniciarColunas () {
    String[] novaString = new String[3];
    novaString[0] = "Sequencia";
    novaString[1] = "Nome da cor";
    novaString[2] = "Número da cor";
    this.colunas = novaString;
  }
  public void definirColunasView () {
    DefaultTableModel novo = (DefaultTableModel) this.view.getTblCores().getModel();
    novo.setColumnCount(0);
    for (int i = 0; i < this.colunas.length; i++) {
      novo.addColumn(this.colunas[i]);
    }
    this.view.getTblCores().setModel(novo);
  }
  public void definirSequenciasTabela () {
    DefaultTableModel novo = (DefaultTableModel) this.view.getTblCores().getModel();
    int tamanho = novo.getRowCount();
    for (int i = 0; i < tamanho; i++) {
      novo.removeRow(0);
    }
    int linhas = (int) this.view.getCgrLinhas().getValue();
    for (int i = 1; i < linhas + 1; i++) {
      String[] linha = new String[3];
      linha[0] = Integer.toString(i);
      linha[1] = "";
      linha[2] = "";
      novo.addRow(linha);
    }
    this.view.getTblCores().setModel(novo);
  }
  public void criarControDelesenhos (ControllerPrincipal ctrl) {
    this.ctrlPrincipal = ctrl;
    ViewControleDesenhos vControleDesenhos = new ViewControleDesenhos(this);
    this.view = vControleDesenhos;
    vControleDesenhos.setLocationRelativeTo(null);
    vControleDesenhos.setVisible(true);
    estadoInicialTela();
  }
  public void habilitarTelaPrincipal (ControllerPrincipal ctrl) {
    ctrl.getView().setEnabled(true);
    ctrl.getView().setVisible(true);
  }
  public void limparComboBox () {
    this.view.getCboCliente().removeAllItems();
  }
  public void desabilitarData () {
    this.view.getTxtData().setEnabled(false);
  }
  public void desabilitarNumeroDesenho () {
    this.view.getTxtNumeoDesenho().setEditable(false);
  }
  public void desabilitarTamanho () {
    this.view.getTxtTamanho().setEnabled(false);
  }
  public void gerarData () {
    Data novaData = new Data();
    Calendar c = Calendar.getInstance();
    novaData.setDia(c.get(Calendar.DAY_OF_MONTH));
    novaData.setMes(c.get(Calendar.MONTH) + 1);
    novaData.setAno(c.get(Calendar.YEAR));
    this.view.getTxtData().setText(novaData.dataParseString(novaData));
    this.dataControle = novaData;
  }
  public void adicionarNovoCliente () {
    String nome = JOptionPane.showInputDialog("Informe o nome do novo cliente. Será criada uma pasta nova com o nome do cliente informado", "Novo Cliente");
    if (nome != null) {
      String caminho = this.ctrlPrincipal.getCaminhoPastaRaiz() + "\\" + nome + "\\";
      String arquivo = "Lista de desenhos por cliente.txt";
      File novaPasta = new File(caminho);
      novaPasta.mkdir();
      ManipularArquivo manArq = new ManipularArquivo();
      manArq.setCaminhoEscrita(caminho);
      manArq.setNomeArquivoEscrita(arquivo);
      manArq.setConteudoEscrita("Número de desenhos: 0");
      manArq.escreverArquivo();
      caminho = this.ctrlPrincipal.getCaminhoPastaRaiz() + "\\";
      arquivo = "Lista de clientes.txt";
      manArq.setCaminhoEscrita(caminho);
      manArq.setNomeArquivoEscrita(arquivo);
      manArq.setConteudoEscrita(nome);
      try {
        manArq.escreverFinalArquivo();
      } catch (IOException ex) {
        Logger.getLogger(ControllerControleDesenho.class.getName()).log(Level.SEVERE, null, ex);
      }
      this.view.getCboCliente().addItem(nome);
      atualizarClientes();
    }
  }
  public void atualizarClientes () {
    String caminho = this.ctrlPrincipal.getCaminhoPastaRaiz() + "\\";
    String arquivo = "Lista de clientes.txt";
    ManipularArquivo manArq = new ManipularArquivo();
    manArq.setCaminhoLeitura(caminho);
    manArq.setNomeArquivoLeitura(arquivo);
    try {
      manArq.selecionarLinhas(1, 1);
    } catch (IOException ex) {
      Logger.getLogger(ControllerControleDesenho.class.getName()).log(Level.SEVERE, null, ex);
    }
    int numeroClientes = 0;
    String[] leitura = manArq.getConteudoLeitura().split(System.getProperty("line.separator"));
    String primeiraLinha = leitura[0].split(": ")[1];
    numeroClientes = Integer.parseInt(primeiraLinha);
    numeroClientes++;
    leitura[0] = String.format("Número de clientes: %d", numeroClientes);
    try {
      manArq.lerArquivo();
    } catch (IOException ex) {
      Logger.getLogger(ControllerControleDesenho.class.getName()).log(Level.SEVERE, null, ex);
    }
    String conteudoFinal = new String();
    for (int i = 0; i < leitura.length; i++) {
      conteudoFinal += leitura[i] + System.getProperty("line.separator");
    }
    manArq.setConteudoEscrita(conteudoFinal);
    manArq.setCaminhoEscrita(caminho);
    manArq.setNomeArquivoEscrita(arquivo);
    manArq.escreverArquivo();
  }
  public void carregarClientes () {
    String caminhoRaiz = this.ctrlPrincipal.getCaminhoPastaRaiz() + "\\";
    String arquivoClientes = "Lista de Clientes.txt";
    ManipularArquivo manArq = new ManipularArquivo();
    manArq.setCaminhoLeitura(caminhoRaiz);
    manArq.setNomeArquivoLeitura(arquivoClientes);
    try {
      manArq.lerArquivo();
    } catch (IOException ex) {
      Logger.getLogger(ControllerControleDesenho.class.getName()).log(Level.SEVERE, null, ex);
    }
    String[] conteudo = manArq.getConteudoLeitura().split(System.getProperty("line.separator"));
    String nClientes = conteudo[0].split(":")[1];
    nClientes = nClientes.replace(" ", "");
    if ("0".equals(nClientes)) {
      this.view.getCboCliente().removeAllItems();
    } else {
      this.view.getCboCliente().removeAllItems();
      for (int i = 1; i < conteudo.length; i++) {
        this.view.getCboCliente().addItem(conteudo[i]);
      }
    }
  }
  public void gerarNumeroDesenho () {
    int nDesenho = carregarNumeroDesenhos();
    UtilData novaUtilData = new UtilData();
    Data novaData = new Data();
    novaData = novaData.stringToData(novaUtilData.getHoje());
    String numeroDesenho = String.format("%d%02d%02d-%04d", novaData.getAno(), novaData.getMes(), novaData.getDia(), nDesenho + 1);
    this.view.getTxtNumeoDesenho().setText(numeroDesenho);
  }
  public int carregarNumeroDesenhos () {
    String caminhoRaiz = this.ctrlPrincipal.getCaminhoPastaRaiz() + "\\" + this.view.getCboCliente().getSelectedItem() + "\\";
    String arquivoDesenhos = "Lista de desenhos por Cliente.txt";
    ManipularArquivo manArq = new ManipularArquivo();
    manArq.setCaminhoLeitura(caminhoRaiz);
    manArq.setNomeArquivoLeitura(arquivoDesenhos);
    try {
      manArq.lerArquivo();
    } catch (IOException ex) {
      Logger.getLogger(ControllerControleDesenho.class.getName()).log(Level.SEVERE, null, ex);
    }
    String[] conteudo = manArq.getConteudoLeitura().split(System.getProperty("line.separator"));
    String nDesenhos = conteudo[0].split(":")[1];
    nDesenhos = nDesenhos.replace(" ", "");
    return Integer.parseInt(nDesenhos);
  }
  public boolean validarCampos () {
    boolean valido = true;
    boolean[] verificador = new boolean[10];
    
    verificador[0] = !("".equals(this.view.getTxtNomeDesenho().getText()) || (this.view.getTxtNomeDesenho().getText() == null));
    verificador[1] = !("".equals(this.view.getCboCliente().getSelectedItem()) || (this.view.getCboCliente().getSelectedItem() == null));
    verificador[2] = !("".equals(this.view.getTxtRevisao().getText()) || (this.view.getTxtRevisao().getText() == null));
    verificador[3] = !("".equals(this.view.getTxtNumeoDesenho().getText()) || (this.view.getTxtNumeoDesenho().getText() == null));
    verificador[4] = !("".equals(this.view.getTxtBastidor().getText()) || (this.view.getTxtBastidor().getText() == null));
    verificador[5] = !("".equals(this.view.getTxtTamanho().getText()) || (this.view.getTxtTamanho().getText() == null));
    verificador[6] = !("".equals(this.view.getTxtAltura().getText()) || (this.view.getTxtAltura().getText() == null));
    verificador[7] = !("".equals(this.view.getTxtLargura().getText()) || (this.view.getTxtLargura().getText() == null));
    verificador[8] = !("".equals(this.view.getTxtPontos().getText()) || (this.view.getTxtPontos().getText() == null));
    
    DefaultTableModel df = (DefaultTableModel) this.view.getTblCores().getModel();
    verificador[9] = df.getValueAt(0, 1) != "";
    
    for (int i = 0; i < verificador.length; i++) {
      if (verificador[i] == false) {
        valido = false;
      }
    }
    return valido;
  }
  public String montarStringEscrita () {
    String conteudo = new String();
    conteudo = "Número do desenho: " + this.view.getTxtNumeoDesenho().getText() + System.getProperty("line.separator");
    conteudo += "Nome do Cliente: " + this.view.getCboCliente().getSelectedItem() + System.getProperty("line.separator");
    conteudo += "Data de elaboração: " + this.view.getTxtData().getText() + System.getProperty("line.separator");
    conteudo += "Nome do desenho: " + this.view.getTxtNomeDesenho().getText() + System.getProperty("line.separator");
    conteudo += "Revisão: " + this.view.getTxtRevisao().getText() + System.getProperty("line.separator");
    conteudo += "Características do desenho: " + System.getProperty("line.separator");
    conteudo += "Tamanho: " + this.view.getTxtTamanho().getText() + System.getProperty("line.separator");
    conteudo += "  Largura: " + this.view.getTxtLargura().getText() + " mm" + System.getProperty("line.separator");
    conteudo += "  Altuta: " + this.view.getTxtAltura().getText() + " mm" + System.getProperty("line.separator");
    conteudo += "  Repetibilidade: " + this.view.getCgrRepetibilidade().getValue() + System.getProperty("line.separator");
    conteudo += "  Pontos: " + this.view.getTxtPontos().getText() + System.getProperty("line.separator");
    conteudo += "  " + this.view.getLblValorDesenho().getText() + System.getProperty("line.separator");
    conteudo += "  " + this.view.getLblValorTotal().getText() + System.getProperty("line.separator");
    conteudo += "Cores: " + System.getProperty("line.separator");
    DefaultTableModel df = (DefaultTableModel) this.view.getTblCores().getModel();
    String tabela = new String();
    int tamanho = df.getRowCount();
    for (int i = 0; i < tamanho; i++) {
      tabela += "  " + df.getValueAt(i, 0) + " -   ";
      tabela += df.getValueAt(i, 1) + "   - ";
      tabela += df.getValueAt(i, 2);
      tabela += System.getProperty("line.separator");
    }
    conteudo += tabela;
    conteudo += System.getProperty("line.separator");
    conteudo += System.getProperty("line.separator");
    conteudo += "Observações pertinentes ao desenho anotar abaixo: " + System.getProperty("line.separator");
    conteudo += "1. " + System.getProperty("line.separator");
    conteudo += "2. " + System.getProperty("line.separator");
    conteudo += "3. " + System.getProperty("line.separator");
    conteudo += System.getProperty("line.separator");
    conteudo += System.getProperty("line.separator");
    conteudo += "(Em caso negativo deixar em branco as observações abaixo)" + System.getProperty("line.separator");
    conteudo += "Foi concedido desconto ao cliente? : " + System.getProperty("line.separator");
    conteudo += "Foi cobrado aumento ao cliente? : " + System.getProperty("line.separator");
    return conteudo;
  }
  public void btnCriar () {
    if (this.ctrlPrincipal.getCaminhoPastaRaiz().equals("")) {
      JOptionPane.showMessageDialog(null, "Caminho da pasta raiz vazio. Certifique-se de ter informado um caminho válido para e não nulo para o local "
                                        + "\nonde criar a estrutura de pastas. Acesse Opções na tela principal e preencha o caminho da pasta raiz");
    } else {
      if (validarCampos()) {
        ManipularArquivo manArq = new ManipularArquivo();
        String caminho = this.ctrlPrincipal.getCaminhoPastaRaiz() + "\\" + this.view.getCboCliente().getSelectedItem();
        String pastaDesenho = caminho + "\\" + this.view.getTxtNumeoDesenho().getText() + "_" + this.view.getTxtNomeDesenho().getText();
        String pastaOrcamento = pastaDesenho + "\\" + "Orçamento";
        String pastaProducao = pastaDesenho + "\\" + "Procução";
        manArq.setConteudoEscrita(montarStringEscrita());
        File desenho = new File(pastaDesenho);
        File orcamento = new File(pastaOrcamento);
        File producao = new File(pastaProducao);
        desenho.mkdir();
        orcamento.mkdir();
        producao.mkdir();
        manArq.setCaminhoEscrita(pastaDesenho + "\\");
        manArq.setNomeArquivoEscrita("Descrição do Desenho " + this.view.getTxtNumeoDesenho().getText() + ".txt");
        manArq.escreverArquivo();
        atualizarArquivoDesenhos();
        limparCampos();
      } else {
        JOptionPane.showMessageDialog(null, "Existem campos que estão vazios ou dados inválidos, "
                                          + "\nverifique os dados informados no formulário");
      }
    }
  }
  public void atualizarArquivoDesenhos () {
    String caminhoDesenho = this.ctrlPrincipal.getCaminhoPastaRaiz() + "\\";
    String caminhoDesenhoCliente = caminhoDesenho + this.view.getCboCliente().getSelectedItem() + "\\";
    String arquivoDesenho = "Lista de desenhos.txt";
    String arquivoDesenhoCliente = "Lista de desenhos por cliente.txt";
    ManipularArquivo manArq = new ManipularArquivo();
    manArq.setCaminhoLeitura(caminhoDesenho);
    manArq.setNomeArquivoLeitura(arquivoDesenho);
    try {
      manArq.lerArquivo();
    } catch (IOException ex) {
      Logger.getLogger(ControllerControleDesenho.class.getName()).log(Level.SEVERE, null, ex);
    }
    String[] leitura = manArq.getConteudoLeitura().split(System.getProperty("line.separator"));
    String primeiraLinha = leitura[0].split(": ")[1];
    int numeroDesenhos = Integer.parseInt(primeiraLinha);
    numeroDesenhos++;
    leitura[0] = String.format("Número de desenhos: %d", numeroDesenhos);
    String conteudoFinal = new String();
    for (int i = 0; i < leitura.length; i++) {
      conteudoFinal += leitura[i] + System.getProperty("line.separator");
    }
    manArq.setCaminhoEscrita(caminhoDesenho);
    manArq.setNomeArquivoEscrita(arquivoDesenho);
    manArq.setConteudoEscrita(conteudoFinal);
    manArq.escreverArquivo();
    manArq.setConteudoEscrita(this.view.getTxtNumeoDesenho().getText() + " - " + this.view.getTxtNomeDesenho().getText() + " - " + this.view.getCboCliente().getSelectedItem());
    try {
      manArq.escreverFinalArquivo();
    } catch (IOException ex) {
      Logger.getLogger(ControllerControleDesenho.class.getName()).log(Level.SEVERE, null, ex);
    }
    manArq.setCaminhoLeitura(caminhoDesenhoCliente);
    manArq.setNomeArquivoLeitura(arquivoDesenhoCliente);
    try {
      manArq.lerArquivo();
    } catch (IOException ex) {
      Logger.getLogger(ControllerControleDesenho.class.getName()).log(Level.SEVERE, null, ex);
    }
    String[] leituraDesenhos = manArq.getConteudoLeitura().split(System.getProperty("line.separator"));
    String primeiraLinhaDesenho = leituraDesenhos[0].split(": ")[1];
    numeroDesenhos = Integer.parseInt(primeiraLinhaDesenho);
    numeroDesenhos++;
    leituraDesenhos[0] = String.format("Número de desenhos: %d", numeroDesenhos);
    conteudoFinal = "";
    for (int i = 0; i < leituraDesenhos.length; i++) {
      conteudoFinal += leituraDesenhos[i] + System.getProperty("line.separator");
    }
    manArq.setCaminhoEscrita(caminhoDesenhoCliente);
    manArq.setNomeArquivoEscrita(arquivoDesenhoCliente);
    manArq.setConteudoEscrita(conteudoFinal);
    manArq.escreverArquivo();
    manArq.setConteudoEscrita(this.view.getTxtNumeoDesenho().getText() + " - " + this.view.getTxtNomeDesenho().getText());
    try {
      manArq.escreverFinalArquivo();
    } catch (IOException ex) {
      Logger.getLogger(ControllerControleDesenho.class.getName()).log(Level.SEVERE, null, ex);
    }
  }
  public void definirTamanho () {
    int altura;
    int largura;
    if ((this.view.getTxtAltura().getText() != null) && (!"".equals(this.view.getTxtAltura().getText()))) {
      altura = Integer.parseInt(this.view.getTxtAltura().getText());
    } else {
      altura = 0;
    }
    if ((this.view.getTxtLargura().getText() != null) && (!"".equals(this.view.getTxtLargura().getText()))) {
      largura = Integer.parseInt(this.view.getTxtLargura().getText());
    } else {
      largura = 0;
    }
    if (largura <=0) {
      largura = 0;
    }
    if (altura <=0) {
      altura = 0;
    }
    String tamanho = String.format("%d mm x %d mm", largura, altura);
    this.view.getTxtTamanho().setText(tamanho);
  }
  public void limparCampos () {
    this.view.getTxtNomeDesenho().setText("");
    this.view.getTxtData().setText("");
    this.view.getTxtRevisao().setText("");
    this.view.getTxtBastidor().setText("");
    this.view.getTxtAltura().setText("");
    this.view.getTxtLargura().setText("");
    this.view.getTxtPontos().setText("");
    this.view.getCgrRepetibilidade().setValue(1);
    definirSequenciasTabela();
    gerarNumeroDesenho();
    this.view.getTxtNomeDesenho().requestFocus();
  }
  public void calcularValorTotal () {
    try {
      String aux = this.view.getLblValorDesenho().getText().replace("Valor do Desenho: R$ ", "");
      aux = aux.replace(",", ".");
      double valor = Double.parseDouble(aux);
      int repetibilidade = (int) this.view.getCgrRepetibilidade().getValue();
      aux = String.format("Valor Total: R$ %.2f", valor * repetibilidade);
      this.view.getLblValorTotal().setText(aux);
    } catch (Exception e) {
      String msg = "Não foi possível fazer a conversção do valor do desenho em um número válido. \n";
      System.out.println(msg + e);
    }
  }
  public void calcularValorDesenho () {
    if (!"".equals(this.view.getTxtPontos().getText()) || (this.view.getTxtPontos().getText() != null)) {
      int numeroPontos = 0;
      try {
        numeroPontos = Integer.parseInt(this.view.getTxtPontos().getText());
      } catch (Exception e) {
        String msg = "Inválida a conversão do número de pontos informados .\n";
        System.out.println(msg + e);
      }
      String valor = String.format("Valor do Desenho: R$ %.2f", this.ctrlPrincipal.getValorPonto() * numeroPontos);
      this.view.getLblValorDesenho().setText(valor);
    }
  }
  public void txtAltura () {
    this.view.getTxtAltura().getDocument().addDocumentListener(new DocumentListener () {
      @Override
      public void insertUpdate(DocumentEvent e) {
        definirTamanho();
      }
      @Override
      public void removeUpdate(DocumentEvent e) {
        definirTamanho();
      }
      @Override
      public void changedUpdate(DocumentEvent e) {
        definirTamanho();
      }
    });
  }
  public void txtLargura () {
    this.view.getTxtLargura().getDocument().addDocumentListener(new DocumentListener () {
      @Override
      public void insertUpdate(DocumentEvent e) {
        definirTamanho();
      }
      @Override
      public void removeUpdate(DocumentEvent e) {
        definirTamanho();
      }
      @Override
      public void changedUpdate(DocumentEvent e) {
        definirTamanho();
      }
    });
  }
  public void txtPontos () {
    this.view.getTxtPontos().getDocument().addDocumentListener(new DocumentListener () {
      @Override
      public void insertUpdate(DocumentEvent e) {
        calcularValorDesenho();
        calcularValorTotal();
      }
      @Override
      public void removeUpdate(DocumentEvent e) {
        calcularValorDesenho();
        calcularValorTotal();
      }
      @Override
      public void changedUpdate(DocumentEvent e) {
        calcularValorDesenho();
        calcularValorTotal();
      }
    });
  }
  public void cboCliente () {
    ItemListener listener = new ItemListener(){
      @Override
      public void itemStateChanged(ItemEvent e) {
        gerarNumeroDesenho();
      }
    };
    this.view.getCboCliente().addItemListener(listener);
  }
  public void btnSair () {
    this.view.dispose();
  }
  public void btnLimpar () {
    definirSequenciasTabela();
  }
  
}
