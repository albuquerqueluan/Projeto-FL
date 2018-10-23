/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;
import entidade.Motorista;
import persistencia.PMotorista;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Luan
 */
public class NMotorista {
        PMotorista persistencia;
    
    public NMotorista() {
        persistencia = new PMotorista();
    }
       
    public void salvar(Motorista parametro) throws SQLException, Exception {
        
         if(parametro.getCNH().isEmpty()){
            throw new Exception("É necessário informar o número da CNH.");
        }
         
        if(parametro.getNome().isEmpty()){
            throw new Exception("É necessário informar o nome.");
        }
        
        if(parametro.getLocal().isEmpty() ){
            throw new Exception("É necessário informar a localização.");
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
    
    public Motorista consultar(int parametro) throws SQLException{
        return persistencia.consultar(parametro);
    }
    
    public List<Motorista> listar() throws SQLException {
        return persistencia.listar();
    }

}
