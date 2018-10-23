/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

/**
 *
 * @author Flavio Portes
 */
public class Passageiro {
    
    private int identificador;
    private String CPF;
    private String nome;
  
    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getCPF() {
        return CPF;
    }
    
    public void setCPF(String CPF)
    {
        this.CPF = CPF;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
