
package factory;
    // situa em qual package ou “pacote” está a classe  
    import java.sql.Connection; 
    // conexão SQL para Java
    import java.sql.DriverManager; // driver de conexão SQL para Java 
    import java.sql.SQLException; // classe para tratamento de exceções 

public class ConnectionFactory {

   
    public Connection getConnection() {         
        try {             
            return DriverManager.getConnection("jdbc:oracle:thin:@177.19.217.38:1521:XE","administrador","pi32016ucl");         
            }         
        catch(SQLException excecao) {  
            
            throw new RuntimeException(excecao);         
            }     
    } 
}

