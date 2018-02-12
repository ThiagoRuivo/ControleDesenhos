
package application.controller;

public interface Controller {
  /*
    Campos
  */

  /*
    Demais métodos
  */
  
  // lógica de inicialização da interface a qual o controller
  // faz referência e a lígica de inicialização do próprio controller
  public void iniciarController ();
  public void estadoInicialTela ();
  
  // métodos para manipuação da dinâmica da interface
  public void agruparRadioButtons ();
  public void alternarCampos ();
  public void alternarRadioButtons ();
  public void alternarBotoes ();
  public void alternarTabela ();
  public void limparCampos ();
  public void iniciarColunasTabela (String[] colunas);
  
  
}
