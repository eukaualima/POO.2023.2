package dao;

import conexao.ConexaoMySQL;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import modelo.Caneta;
import java.sql.Connection;
import java.sql.ResultSet;

public class CanetaDAOJDBC implements CanetaDAO
{
    Connection conexao = null;
    PreparedStatement sql = null;
    ResultSet rset = null;
    
    @Override
    public int inserir(Caneta caneta) {
        StringBuilder sqlBuilder = new StringBuilder();
        sqlBuilder
                .append("INSERT INTO canetas (modelo, ponta, cor, carga, tampada) ")
                .append("VALUES (?, ?, ?, ?, ?)");
     
        String insert = sqlBuilder.toString();
        int linha = 0;
        try {
            conexao = ConexaoMySQL.getConexao();

            sql = (PreparedStatement) conexao.prepareStatement(insert);
            sql.setString(1, caneta.getModelo());
            sql.setFloat(2, caneta.getPonta());
            sql.setString(3, caneta.getCor());
            sql.setInt(4, caneta.getCarga());
            sql.setBoolean(5, caneta.isTampada());
            linha = sql.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            fecharConexao();
        }
        
        return linha;
    }

    @Override
    public int editar(Caneta caneta) {
        StringBuilder sqlBuilder = new StringBuilder();
        sqlBuilder
                .append("UPDATE canetas SET ")
                .append("modelo = ?,")
                .append("ponta = ?,")
                .append("cor = ?, ")
                .append("carga = ?,")
                .append("tampada = ? ")
                .append("WHERE codigo = ?");
        
        String update = sqlBuilder.toString();
        int linha = 0;
        try {
            conexao = ConexaoMySQL.getConexao();

            sql = (PreparedStatement) conexao.prepareStatement(update);
            sql.setString(1, caneta.getModelo());
            sql.setFloat(2, caneta.getPonta());
            sql.setString(3, caneta.getCor());
            sql.setInt(4, caneta.getCarga());
            sql.setBoolean(5, caneta.isTampada());
            sql.setInt(6, caneta.getCodigo());
            linha = sql.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            fecharConexao();
        }

        return linha;
    }

    @Override
    public int apagar(int id) 
    {
        StringBuilder sqlBuilder = new StringBuilder();
        sqlBuilder
                .append("DELETE FROM canetas ")
                .append("WHERE codigo = ?");
        
        String delete = sqlBuilder.toString();
        int linha = 0;
        
        try 
        {
            conexao = ConexaoMySQL.getConexao();

            sql = (PreparedStatement) conexao.prepareStatement(delete);
            sql.setInt(1, id);
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
    public List<Caneta> listar() 
    {
        String select = "SELECT * FROM canetas";

        List<Caneta> canetas = new ArrayList<Caneta>();

        try 
        {
            conexao = ConexaoMySQL.getConexao();

            sql = (PreparedStatement) conexao.prepareStatement(select);

            rset = sql.executeQuery();

            while (rset.next()) 
            {
                Caneta caneta = new Caneta();

                caneta.setCodigo(rset.getInt("codigo"));
                caneta.setModelo(rset.getString("modelo"));
                caneta.setCor(rset.getString("cor"));
                caneta.setPonta(rset.getFloat("ponta"));
                caneta.setCarga(rset.getInt("carga"));
                caneta.setTampada(rset.getBoolean("tampada"));

                canetas.add(caneta);
            }
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        } 
        finally 
        {
            fecharConexao();
        }

        return canetas;
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

    @Override
    public Caneta listar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
