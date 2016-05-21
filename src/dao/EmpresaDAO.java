/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import factory.ConnectionFactory;
import modelo.Empresa;
import java.sql.*;
import java.sql.PreparedStatement;
/**
 *
 * @author chris
 */
public class EmpresaDAO {
    private Connection connection;
    String nome;
    String atividade;
    String cnpj;
    String razsocial;
    
    public EmpresaDAO()
    {
        this.connection = new ConnectionFactory().getConnection();
    }
    
    public void adiciona(Empresa nova)
    {
        String sql = "INSERT INTO usuario(nome, atividade, cnpj, razsocial) VALUES(?,?,?,?)";
        try 
        {
           PreparedStatement stmt = connection.prepareStatement(sql);
           stmt.setString(1, nova.getNome());
           stmt.setString(2, nova.getAtividade());
           stmt.setString(3, nova.getCnpj());
           stmt.setString(4, nova.getRazsocial());
           stmt.execute();
           stmt.close();
        }
        catch (SQLException u) 
        {
        throw new RuntimeException(u);
        }
    }
}
