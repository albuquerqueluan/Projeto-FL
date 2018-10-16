/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import entidade.Passageiro;
import java.sql.SQLException;
import java.util.List;
import persistencia.PPassageiro;

/**
 *
 * @author Flavio Portes
 */
public class NPassageiro {
    
        PPassageiro persistencia;
    
    public NPassageiro() {
        persistencia = new PPassageiro();
    }
       
    public void salvar(Passageiro parametro) throws SQLException, Exception {
        
        if(parametro.getCPF().isEmpty()){
            throw new Exception("É necessário informar o CPF.");
        }
        
        if(parametro.getNome().isEmpty()){
            throw new Exception("É necessário informar o nome.");
        }
                
        // if(parametro.getTelefone().isEmpty() ){
        //    throw new Exception("É necessário informar o telefone.");
        // }
        
        if(parametro.getIdentificador() == 0){
            persistencia.incluir(parametro);
        } else {
            persistencia.alterar(parametro);
        }
    }

    public void excluir(int parametro) throws SQLException {
        persistencia.excluir(parametro);
    }
    
    public Passageiro consultar(int parametro) throws SQLException{
        return persistencia.consultar(parametro);
    }
    
    public List<Passageiro> listar() throws SQLException {
        return persistencia.listar();
    }

}
