
package application.controller;

import ManipularArquivo.ManipularArquivo;
import application.view.ViewPrincipal;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControllerPrincipal {
  /*
    Campos
  */
  private ViewPrincipal view;
  private String caminhoPastaRaiz;
  private double valorPonto;

  /*
    Construtores
  */
  public ControllerPrincipal() {
    carregar();
    carregarValorPonto();
  }
  public ControllerPrincipal(ViewPrincipal view) {
    this.view = view;
    carregar();
    carregarValorPonto();
  }
  
  /*
    Get's & Set's
  */
  public ViewPrincipal getView() {
    return view;
  }
  public void setView(ViewPrincipal view) {
    this.view = view;
  }
  public String getCaminhoPastaRaiz() {
    return caminhoPastaRaiz;
  }
  public void setCaminhoPastaRaiz(String caminhoPastaRaiz) {
    this.caminhoPastaRaiz = caminhoPastaRaiz;
  }
  public double getValorPonto() {
    return valorPonto;
  }
  public void setValorPonto(double valorPonto) {
    this.valorPonto = valorPonto;
  }
  
  /*
    Demais métodos
  */
  public void criarTelaPrincipal () {
    ViewPrincipal vPrincipal = new ViewPrincipal(this);
    this.view = vPrincipal;
    vPrincipal.setLocationRelativeTo(null);
    vPrincipal.setVisible(true);
  }
  public void alterarTelaPrincipal (boolean valor) {
    this.view.setEnabled(valor);
  }
  public void criarControleDesenhos () {
    ControllerControleDesenho ctrlControleDesenhos = new ControllerControleDesenho();
    ctrlControleDesenhos.criarControDelesenhos(this);
  }
  public void criarControleOpcoes () {
    ControllerOpcoes ctrlOpcoes = new ControllerOpcoes();
    ctrlOpcoes.criarOpcoes(this);
  }
  public void carregar () {
    ManipularArquivo manArq = new ManipularArquivo();
    String leitura = ".//src/files/text/";
    String arquivo = "caminhoRaiz.txt";
    manArq.setNomeArquivoLeitura(arquivo);
    manArq.setCaminhoLeitura(leitura);
    try {
      manArq.lerArquivo();
    } catch (IOException ex) {
      Logger.getLogger(ControllerPrincipal.class.getName()).log(Level.SEVERE, null, ex);
    }
    this.caminhoPastaRaiz = manArq.getConteudoLeitura();
    this.caminhoPastaRaiz = this.caminhoPastaRaiz.replace("\n", "");
    this.caminhoPastaRaiz = this.caminhoPastaRaiz.replace("\r", "");
  }
  public void carregarValorPonto () {
    String leitura = ".//src/files/text/";
    String arquivo = "valorPonto.txt";
    ManipularArquivo manArq = new ManipularArquivo();
    manArq.setNomeArquivoLeitura(arquivo);
    manArq.setCaminhoLeitura(leitura);
    try {
      manArq.lerArquivo();
    } catch (IOException ex) {
      Logger.getLogger(ControllerPrincipal.class.getName()).log(Level.SEVERE, null, ex);
    }
    double valor;
    valor = Double.parseDouble(manArq.getConteudoLeitura().replace("\n\r", "").replace(",", "."));
    this.valorPonto = valor;
  }
  public void criarEstruturaInicial () {
    ManipularArquivo manArq = new ManipularArquivo();
    manArq.setCaminhoEscrita(this.caminhoPastaRaiz + "\\");
    String arqDesenos = "Lista de desenhos.txt";
    String arqClientes = "Lista de clientes.txt";
    manArq.setNomeArquivoEscrita(arqDesenos);
    manArq.setConteudoEscrita("Número de desenhos: 0");
    manArq.escreverArquivo();
    manArq.setNomeArquivoEscrita(arqClientes);
    manArq.setConteudoEscrita("Número de clientes: 0");
    manArq.escreverArquivo();
  }
  
}
