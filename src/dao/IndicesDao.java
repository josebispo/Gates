
package dao;
import LeitorCSV.Indices;
import factory.ConnectionFactory; 
import java.sql.*; 
import java.sql.PreparedStatement;

public class IndicesDao {
    private Connection connection;
    float imobilizado; 
    float intangivel; 
    float ativocirculante;
    float realizavellongoprazo;
    float estoques; 
    float ativototal;
    float passivocirculante;
    float passivonaocirculante;
    float patrimonioliquido;
    float vendaliquida; 
    float lucroliquido;
    float disponivel;

    public IndicesDao(float _imobilizado, 
    float _intangivel,
    float _ativocirculante,
    float _realizavellongoprazo,
    float _estoques,
    float _ativototal,
    float _passivocirculante,
    float _passivonaocirculante,
    float _patrimonioliquido,
    float _vendaliquida,
    float _lucroliquido,
    float _disponivel){
        
     imobilizado=_imobilizado; 
     intangivel=_intangivel; 
     ativocirculante=_ativocirculante;
     realizavellongoprazo=_realizavellongoprazo;
     estoques=_estoques; 
     ativototal=_ativototal;
     passivocirculante=_passivocirculante;
     passivonaocirculante=_passivonaocirculante;
     patrimonioliquido=_patrimonioliquido;
     vendaliquida=_vendaliquida; 
     lucroliquido=_lucroliquido;
     disponivel=_disponivel;
        
        this.connection = new ConnectionFactory().getConnection();
    }     public void adiciona(Indices indice){
        String sql = "INSERT INTO indices("
                + "imobilizado,"
                + "intangivel,"
                + "ativocirculante,"
                + "realizavellongoprazo,"
                + "estoques,"
                + "ativototal,"
                + "passivocirculante,"
                + "passivonaocirculante,"
                + "patrimonioliquido,"
                + "vendaliquida,"
                + "lucroliquido,"
                + "disponivel,) VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";
          
        try {
            
            PreparedStatement stmt = connection.prepareStatement(sql);
        stmt.setFloat(1, imobilizado);
        stmt.setFloat(2, intangivel);
        stmt.setFloat(3, ativocirculante);
        stmt.setFloat(4, realizavellongoprazo);
        stmt.setFloat(5, estoques);
        stmt.setFloat(6, ativototal);
        stmt.setFloat(7, passivocirculante);
        stmt.setFloat(8, passivonaocirculante);
        stmt.setFloat(9, patrimonioliquido);
        stmt.setFloat(10, vendaliquida);
        stmt.setFloat(11, lucroliquido);
        stmt.setFloat(12, disponivel);


        stmt.execute();
                      System.out.println("Passou");

//        EmpresaGUI tela = new EmpresaGUI();
//        tela.setVisible(false);
//        stmt.close();
        } catch (SQLException u) { throw new RuntimeException(u);

        }
    }

}