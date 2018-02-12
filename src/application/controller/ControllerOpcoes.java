
package application.controller;

import ManipularArquivo.ManipularArquivo;
import application.view.ViewOpcoes;
import javax.swing.JOptionPane;

public class ControllerOpcoes {
  /*
    Campos
  */
  private ViewOpcoes view;
  private ControllerPrincipal ctrlPrincipal;

  /*
    Construtores
  */
  public ControllerOpcoes() {
  }
  public ControllerOpcoes(ViewOpcoes view) {
    this.view = view;
  }
  
  /*
    Get's & Set's
  */
  public ViewOpcoes getView() {
    return view;
  }
  public void setView(ViewOpcoes view) {
    this.view = view;
  }
  public ControllerPrincipal getCtrlPrincipal() {
    return ctrlPrincipal;
  }
  public void setCtrlPrincipal(ControllerPrincipal ctrlPrincipal) {
    this.ctrlPrincipal = ctrlPrincipal;
  }
  
  /*
    Demais métodos
  */
  public void criarOpcoes (ControllerPrincipal ctrl) {
    this.ctrlPrincipal = ctrl;
    ViewOpcoes vOpcoes = new ViewOpcoes(this);
    this.view = vOpcoes;
    vOpcoes.setLocationRelativeTo(null);
    vOpcoes.setVisible(true);
    carregar();
  }
  public void habilitarTelaPrincipal (ControllerPrincipal controller) {
    controller.alterarTelaPrincipal(true);
    controller.getView().setVisible(true);
  }
  public void carregar () {
    this.view.getTxtCaminho().setText(this.ctrlPrincipal.getCaminhoPastaRaiz());
    this.view.getLblCaminho().setText("Caminho Atual: " + this.ctrlPrincipal.getCaminhoPastaRaiz());
    String valor = new String();
    valor = String.format("R$ %.4f", this.ctrlPrincipal.getValorPonto());
    this.view.getTxtValor().setText(valor.replace("R$ ", ""));
    this.view.getLblValorAtual().setText(valor);
  }
  public void alterarCaminhoRaiz () {
    this.view.getLblCaminho().setText("Caminho Atual: " + this.view.getTxtCaminho().getText());
  }
  public void salvarCaminhoRais () {
    ManipularArquivo manArq = new ManipularArquivo();
    String escrita = ".//src/files/text/";
    String arquivo = "caminhoRaiz.txt";
    manArq.setCaminhoEscrita(escrita);
    manArq.setNomeArquivoEscrita(arquivo);
    alterarCaminhoRaiz();
    manArq.setConteudoEscrita(this.view.getTxtCaminho().getText());
    manArq.escreverArquivo();
    this.ctrlPrincipal.setCaminhoPastaRaiz(manArq.getConteudoEscrita());
  }
  public void salvarValorPonto () {
    String escrita = ".//src/files/text/";
    String arquivo = "valorPonto.txt";
    ManipularArquivo manArq = new ManipularArquivo();
    manArq.setCaminhoEscrita(escrita);
    manArq.setNomeArquivoEscrita(arquivo);
    if (validarValor(this.view.getTxtValor().getText())) {
      manArq.setConteudoEscrita(this.view.getTxtValor().getText());
      manArq.escreverArquivo();
      this.ctrlPrincipal.carregarValorPonto();
      this.view.getLblValorAtual().setText(String.format("R$ %.4f", this.ctrlPrincipal.getValorPonto()));
    }
  }
  public boolean validarValor (String valor) {
    double preco = 0;
    try {
      preco = Double.parseDouble(valor.replace(",", "."));
      return true;
    } catch (Exception e) {
      String msg = "Não foi possível fazer a conversão do valor informado para um tipo válido de valor numérico";
      JOptionPane.showMessageDialog(null, msg + ". \n " + e);
      return false;
    }
  }
}
