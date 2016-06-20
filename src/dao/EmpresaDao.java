
package dao;
import factory.ConnectionFactory; 
import Telas.Empresa; 
import Telas.EmpresaGUI;
import java.sql.*; 
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;



public class EmpresaDao {
    private Connection connection;
    String nome;
    String cnpj;
    String bovespa;

    public EmpresaDao(){
        this.connection = new ConnectionFactory().getConnection();
    }     public void adiciona(Empresa empresa){
        String sql = "INSERT INTO empresa("
                + "nome_empresa,"
                + "cnpj,"
                + "bovespa) VALUES(?,?,?)";
          
        try {
            
            PreparedStatement stmt = connection.prepareStatement(sql);
        stmt.setString(1, empresa.getNome());
        stmt.setString(2, empresa.getCnpj());
        stmt.setString(3, empresa.getBovespa());


        stmt.execute();
                      System.out.println("Passou");

        EmpresaGUI tela = new EmpresaGUI();
        tela.setVisible(false);
        stmt.close();
        } catch (SQLException u) { throw new RuntimeException(u);

        }
    }

}
