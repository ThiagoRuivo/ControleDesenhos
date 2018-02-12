
package application.model.object;

public class Cliente {
  /*
    Campos
  */
  private String nome;
  private String cpf;

  /*
    Construtores
  */
  public Cliente() {
  }
  public Cliente(String nome, String cpf) {
    this.nome = nome;
    this.cpf = cpf;
  }
  
  /*
    Get's & Set's
  */
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }
  public String getCpf() {
    return cpf;
  }
  public void setCpf(String cpf) {
    this.cpf = cpf;
  }
  
  /*
    Demais métodos
  */

  
  
}
