
package dao;
import factory.ConnectionFactory; 
import gui.Empresa; 
import java.sql.*; 
import java.sql.PreparedStatement;



public class EmpresaDao {
    private Connection connection;
    String razaosocial;
    String cnpj;
    String cidade;
    String estado;
    String cep;
    String rua;
    String numero;
    String telefone;
    String email;
    public EmpresaDao(){
        this.connection = new ConnectionFactory().getConnection();
    }     public void adiciona(Empresa empresa){
        String sql = "INSERT INTO empresa(razaosocial,cnpj,cidade,estado,cep,rua,numero,telefone,email) VALUES(?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
        stmt.setString(1, empresa.getRazaosocial());
        stmt.setString(2, empresa.getCnpj());
        stmt.setString(3, empresa.getCidade());
        stmt.setString(4, empresa.getEstado());
        stmt.setString(5, empresa.getCep());
        stmt.setString(6, empresa.getRua());
        stmt.setString(7, empresa.getNumero());
        stmt.setString(8, empresa.getTelefone());
        stmt.setString(9, empresa.getEmail());
        stmt.execute();
        stmt.close();
        } catch (SQLException u) { throw new RuntimeException(u);
        }
    }

}
