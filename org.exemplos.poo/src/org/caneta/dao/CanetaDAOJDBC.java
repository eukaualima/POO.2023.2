package org.caneta.dao;

import org.caneta.conexao.ConexaoMySQL;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import org.caneta.aplicacao.Caneta;

public class CanetaDAOJDBC implements CanetaDAO
{
    Connection conexao = null;
    PreparedStatement sql = null;
    ResultSet rset = null;
    
    @Override
    public int inserir(Caneta caneta)
    {
        StringBuilder sqlBuilder = new StringBuilder();
        
        sqlBuilder.append("INSERT INTO canetas (modelo, cor, ponta, carga, tamapada) VALUES (?, ?, ?, ?, ?)");
        
        String sql_code = sqlBuilder.toString();
        int linha = 0;
        
        try 
        {
            conexao = ConexaoMySQL.getConexao();
            
            sql = (PreparedStatement) conexao.prepareStatement(sql_code);
            sql.setString(1, caneta.getModelo());
            sql.setString(2, caneta.getCor());
            sql.setFloat(3, caneta.getPonta());
            sql.setInt(4, caneta.getCarga());
            sql.setBoolean(5, caneta.isTampada());
            
            linha = sql.executeUpdate();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            fecharConexao();
        }
        
        return linha;
    }   
    

    @Override
    public int editar(Caneta caneta) {
        
    }

    @Override
    public List<Caneta> listar() {
        
    }

    @Override
    public Caneta encontrar(int id) {
        
    }
    
    private void fecharConexao() {
        try {
            if (rset != null) {
                rset.close();
            }
            if (sql != null) {
                sql.close();
            }

            if (conexao != null) {
                conexao.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
