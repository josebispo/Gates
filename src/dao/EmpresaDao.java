
package dao;
import factory.ConnectionFactory; 
import gui.Empresa; 
import gui.EmpresaGUI;
import java.sql.*; 
import java.sql.PreparedStatement;



public class EmpresaDao {
    private Connection connection;
    String nome;
    String cnpj;
    String cidade;
    String estado;
    String cep;
    String rua;
    String numero;
    String telefone;
    String email;
    String atividade;

    public EmpresaDao(){
        this.connection = new ConnectionFactory().getConnection();
    }     public void adiciona(Empresa empresa){
        String sql = "INSERT INTO empresa("
                + "nome_empresa,"
                + "cnpj,"
                + "cidade_empresa,"
                + "uf_empresa,"
                + "rua_empresa,"
                + "numero_empresa,"
                + "cep_empresa,"
                + "telefone_empresa,"
                + "email_empresa,"
                +"atividade_empresa) VALUES(?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
        stmt.setString(1, empresa.getNome());
        stmt.setString(2, empresa.getCnpj());
        stmt.setString(3, empresa.getCidade());
        stmt.setString(4, empresa.getEstado());
        stmt.setString(5, empresa.getRua());
        stmt.setString(6, empresa.getNumero());
        stmt.setString(7, empresa.getCep());
        stmt.setString(8, empresa.getTelefone());
        stmt.setString(9, empresa.getEmail());
        stmt.setString(10,empresa.getAtividade());

        stmt.execute();
        
        EmpresaGUI tela = new EmpresaGUI();
        tela.setVisible(false);
        stmt.close();
        } catch (SQLException u) { throw new RuntimeException(u);
        }
    }

}
