
package application.model.object;

public class Cor {
  /*
    Campos
  */
  private String nome;
  private int sequencia;
  private int numero;

  /*
    Construtores
  */
  public Cor() {
  }
  public Cor(String nome, int sequencia, int numero) {
    this.nome = nome;
    this.sequencia = sequencia;
    this.numero = numero;
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
  public int getSequencia() {
    return sequencia;
  }
  public void setSequencia(int sequencia) {
    this.sequencia = sequencia;
  }
  public int getNumero() {
    return numero;
  }
  public void setNumero(int numero) {
    this.numero = numero;
  }

  /*
    Demais métodos
  */
  
}
