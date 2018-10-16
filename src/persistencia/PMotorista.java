/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import entidade.Motorista;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Luan Albuquerque
 */
public class PMotorista {
    
    public void incluir(Motorista parametro) throws SQLException {

        //Cria a instrução sql para a inserção de registros
        String sql = "INSERT INTO"
                + " motorista (cnh, nome, local) "
                + " VALUES (?,?,?)";

        //Cria a conexao a partir dos métodos da fábrica de conexões
        Connection cnn = util.Conexao.getConexao();

        //cria o procedimento para a execução "contra" o BD
        PreparedStatement prd = cnn.prepareStatement(sql);

        //Trocando os valores da ? por valores recebidos no método
        prd.setString(1, parametro.getCNH());
        prd.setString(2, parametro.getNome());
        prd.setString(3, parametro.getLocal());
        prd.execute();
        cnn.close();
    }

    public void alterar(Motorista parametro) throws SQLException {

        //Cria a instrução sql para a inserção de registros
        String sql = "UPDATE motorista SET"
                + " cnh = ?, "
                + " nome = ?, "
                + " local = ?, "
                + " WHERE identificador = ?";

        //Cria a conexao a partir dos métodos da fábrica de conexões
        Connection cnn = util.Conexao.getConexao();

        //cria o procedimento para a execução "contra" o BD
        PreparedStatement prd = cnn.prepareStatement(sql);

        //Trocando os valores da ? por valores recebidos no método
        prd.setString(1, parametro.getCNH());
        prd.setString(2, parametro.getNome());
        prd.setString(3, parametro.getLocal());
        prd.setInt(4, parametro.getIdentificador());
        
        prd.execute();
        cnn.close();
    }

    public void excluir(int parametro) throws SQLException {
        //Cria a instrução sql para a inserção de registros
        String sql = "DELETE FROM motorista "
                + " WHERE identificador = ?";

        //Cria a conexao a partir dos métodos da fábrica de conexões
        Connection cnn = util.Conexao.getConexao();

        //cria o procedimento para a execução "contra" o BD
        PreparedStatement prd = cnn.prepareStatement(sql);

        //Trocando os valores da ? por valores recebidos no método
        prd.setInt(1, parametro);
        
        prd.execute();
        cnn.close();
    }

    public Motorista consultar(int parametro) throws SQLException {
        
        String sql = "SELECT identificador, cnh, nome, local"
                + " FROM motorista WHERE identificador = ?;";
        
        Connection cnn = util.Conexao.getConexao();
        PreparedStatement prd = cnn.prepareStatement(sql);

        prd.setInt(1, parametro);
        
        ResultSet rs = prd.executeQuery();
        
        Motorista retorno = new Motorista();
        
        if(rs.next()){            
            retorno.setIdentificador(rs.getInt("identificador"));
            retorno.setCNH(rs.getString("cnh"));
            retorno.setNome(rs.getString("nome"));
            retorno.setLocal(rs.getString("local"));
        }
        
        return retorno;
    }
    public List<Motorista> listar() throws SQLException {

        String sql = "SELECT * FROM motorista";

        Connection cnn = util.Conexao.getConexao();
        Statement st = cnn.createStatement();

        ResultSet rs = st.executeQuery(sql);
        List<Motorista> retorno = new ArrayList<Motorista>();

        while(rs.next()) {
            
                Motorista tipo = new Motorista();
            
                
                tipo.setIdentificador(rs.getInt("identificador"));
                tipo.setCNH(rs.getString("cnh"));
                tipo.setNome(rs.getString("nome"));
                tipo.setLocal(rs.getString("local"));
                retorno.add(tipo);
    }
        return retorno;

    }
    
}

