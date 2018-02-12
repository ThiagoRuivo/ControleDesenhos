
package application.model.object;

public class Bordado {
  /*
    Campos
  */
  private String bastidor;
  private double largura;
  private double altura;
  private Cor[] cores;

  /*
    Construtores
  */
  public Bordado() {
  }
  public Bordado(String bastidor, double largura, double altura, Cor[] cores) {
    this.bastidor = bastidor;
    this.largura = largura;
    this.altura = altura;
    this.cores = cores;
  }
  
  /*
    Get's & Set's
  */
  public String getBastidor() {
    return bastidor;
  }
  public void setBastidor(String bastidor) {
    this.bastidor = bastidor;
  }
  public double getLargura() {
    return largura;
  }
  public void setLargura(double largura) {
    this.largura = largura;
  }
  public double getAltura() {
    return altura;
  }
  public void setAltura(double altura) {
    this.altura = altura;
  }
  public Cor[] getCores() {
    return cores;
  }
  public void setCores(Cor[] cores) {
    this.cores = cores;
  }
  
  /*
    Demais métodos
  */
  
}
