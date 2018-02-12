
package application.model.object;

import utilidade.Data;

public class Desenho {
  /*
    Campos
  */
  private Cliente cliente;
  private Bordado bordado;
  private Data data;
  private String nome;
  private String revisao;
  private String tipo;
  private String descricao;

  /*
    Construtores
  */
  public Desenho() {
  }
  public Desenho(Cliente cliente, Bordado bordado, Data data, String nome, String revisao, String tipo, String descricao) {
    this.cliente = cliente;
    this.bordado = bordado;
    this.data = data;
    this.nome = nome;
    this.revisao = revisao;
    this.tipo = tipo;
    this.descricao = descricao;
  }

  /*
    Get's & Set's
  */
  public Cliente getCliente() {
    return cliente;
  }
  public void setCliente(Cliente cliente) {
    this.cliente = cliente;
  }
  public Bordado getBordado() {
    return bordado;
  }
  public void setBordado(Bordado bordado) {
    this.bordado = bordado;
  }
  public Data getData() {
    return data;
  }
  public void setData(Data data) {
    this.data = data;
  }
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }
  public String getRevisao() {
    return revisao;
  }
  public void setRevisao(String revisao) {
    this.revisao = revisao;
  }
  public String getTipo() {
    return tipo;
  }
  public void setTipo(String tipo) {
    this.tipo = tipo;
  }
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  /*
    Demais métodos
  */
  
}
