
package application.model;

//import java.util.List;

import java.util.List;


public abstract class DataAcess {
  /*
    Campos
  */
  private String tabela;
  private OpenClose openClose;

  /*
    Construtores
  */
  public DataAcess() {
    String arquivo = "src/main/dataBaseProperties.properties";
    MssqlCreateConnection mcc = new MssqlCreateConnection(arquivo);
    OpenClose op = new OpenClose(mcc.configurarConexao());
    this.openClose = op;
  }
  
  /*
    Get's & Set's
  */
  public String getTabela() {
    return tabela;
  }
  public void setTabela(String tabela) {
    this.tabela = tabela;
  }
  public OpenClose getOpenClose() {
    return openClose;
  }
  public void setOpenClose(OpenClose openClose) {
    this.openClose = openClose;
  }

  /*
    Demais métodos
  */
  public abstract List<String[]> selectAll ();
  public abstract int insertInto ();
  public abstract int updateAt ();
  public abstract boolean deleteAt ();
  
}
