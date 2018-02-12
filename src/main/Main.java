
package main;

//import application.model.DataAcessTeste;
import application.controller.ControllerPrincipal;
import javax.swing.UIManager;
/*
import java.io.IOException;
import application.util.PropertyReader;
import java.util.logging.Level;
import java.util.logging.Logger;
*/

public class Main {
  
  public static void main(String[] args) {
    ControllerPrincipal ctrlPrincipal = new ControllerPrincipal();
    try {
      UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
      ctrlPrincipal.criarTelaPrincipal();
    } catch (Exception e) {
      System.out.println("EX: " + e);
    }
    
    /*
    String caminho = "./src/main/dataBaseProperties.properties";
    PropertyReader novo = new PropertyReader();
    try {
      System.out.println(novo.getProperty(caminho, "server", "databaseName"));
    } catch (IOException ex) {
      Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
    }
    */
    
    /*
      DataAcessTeste teste = new DataAcessTeste();
      System.out.println("Imprimindo: " + teste.selecionar(1));
      */
  }
  
}
