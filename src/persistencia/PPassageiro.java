/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import entidade.Passageiro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Flavio Portes
 */
public class PPassageiro {
    
        public void incluir(Passageiro parametro) throws SQLException {

        //Cria a instrução sql para a inserção de registros
        String sql = "INSERT INTO"
                + " passageiro (cpf, nome) "
                + " VALUES (?,?)";

        //Cria a conexao a partir dos métodos da fábrica de conexões
        Connection cnn = util.Conexao.getConexao();

        //cria o procedimento para a execução "contra" o BD
        PreparedStatement prd = cnn.prepareStatement(sql);

        //Trocando os valores da ? por valores recebidos no método
        prd.setString(1, parametro.getCPF());
        prd.setString(2, parametro.getNome());
        prd.execute();
        cnn.close();
    }

    public void alterar(Passageiro parametro) throws SQLException {

        //Cria a instrução sql para a inserção de registros
        String sql = "UPDATE passageiro SET"
                + " cpf = ?, "
                + " nome = ?, "
                + " WHERE identificador = ?";

        //Cria a conexao a partir dos métodos da fábrica de conexões
        Connection cnn = util.Conexao.getConexao();

        //cria o procedimento para a execução "contra" o BD
        PreparedStatement prd = cnn.prepareStatement(sql);

        //Trocando os valores da ? por valores recebidos no método
        prd.setString(1, parametro.getCPF());
        prd.setString(2, parametro.getNome());
        prd.setInt(3, parametro.getIdentificador());
        
        prd.execute();
        cnn.close();
    }

    public void excluir(int parametro) throws SQLException {
        //Cria a instrução sql para a inserção de registros
        String sql = "DELETE FROM passageiro "
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

    public Passageiro consultar(int parametro) throws SQLException {
        
        String sql = "SELECT identificador, cpf, nome"
                + " FROM passageiro WHERE identificador = ?;";
        
        Connection cnn = util.Conexao.getConexao();
        PreparedStatement prd = cnn.prepareStatement(sql);

        prd.setInt(1, parametro);
        
        ResultSet rs = prd.executeQuery();
        
        Passageiro retorno = new Passageiro();
        
        if(rs.next()){
            retorno.setIdentificador(rs.getInt("identificador"));
            retorno.setCPF(rs.getString("cpf"));
            retorno.setNome(rs.getString("nome"));
        }
        
        return retorno;
    }
    public List<Passageiro> listar() throws SQLException {

        String sql = "SELECT * FROM passageiro";

        Connection cnn = util.Conexao.getConexao();
        Statement st = cnn.createStatement();

        ResultSet rs = st.executeQuery(sql);
        List<Passageiro> retorno = new ArrayList<Passageiro>();

        while(rs.next()) {
            
                Passageiro tipo = new Passageiro();
            
                
                tipo.setIdentificador(rs.getInt("identificador"));
                tipo.setCPF(rs.getString("cpf"));
                tipo.setNome(rs.getString("nome"));
                retorno.add(tipo);
    }
        return retorno;

    }
}
