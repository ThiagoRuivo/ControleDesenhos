
package application.model.dataAcess;

import application.model.DataAcess;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DataAcessTeste extends DataAcess{
  /*
    Campos
  */

  /*
    Construtores
  */

  /*
    Get's & Set's
  */

  /*
    Demais métodos
  */
  // Sobrecarga dos métodos da classe abstrada
  @Override
  public List<String[]> selectAll() {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public int insertInto() {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public int updateAt() {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public boolean deleteAt() {
    throw new UnsupportedOperationException("Not supported yet.");
  }
  
  // Demais métodos
  public String selecionar (int pk) {
    String retorno = "";
    try {
      Statement sessao = this.getOpenClose().abrirConexao();
      String sql = String.format("select titulo from dbo.tarefas where id = %d", pk);
      ResultSet resultado = sessao.executeQuery(sql);
      while (resultado.next()) {
        retorno = resultado.getString("titulo");
      }
    } catch (SQLException ex) {
      Logger.getLogger(DataAcessTeste.class.getName()).log(Level.SEVERE, null, ex);
    }
    return retorno;
  }
  
}
