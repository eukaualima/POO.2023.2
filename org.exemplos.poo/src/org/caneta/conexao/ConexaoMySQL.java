package org.caneta.conexao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexaoMySQL 
{
    private static final String USER = "root";
    private static final String PASSWORD = "";
    private static final String LINK_DB = "jdbc:mysql://localhost:3306/papelaria";
    
    public static Connection getConexao() throws Exception
    {
        Class.forName("com.mysql.jdbc.Driver");
        
        return DriverManager.getConnection(LINK_DB, USER, PASSWORD);
    }
}
