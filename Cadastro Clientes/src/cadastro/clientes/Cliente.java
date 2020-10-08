/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastro.clientes;

/**
 *
 * @author Guilherme Gamarelle
 */
public class Cliente {

    /**
     * @return the id
     */
    public int getId() {
        return id;
    } 

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the CPF
     */
    public String getCPF() {
        return CPF;
    }

    /**
     * @param CPF the CPF to set
     */
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    /**
     * @return the Sexo
     */
    public String getSexo() {
        return Sexo;
    }

    /**
     * @param Sexo the Sexo to set
     */
    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    /**
     * @return the Endereço
     */
    public String getEndereço() {
        return Endereço;
    }

    /**
     * @param Endereço the Endereço to set
     */
    public void setEndereço(String Endereço) {
        this.Endereço = Endereço;
    }

    /**
     * @return the Estado
     */
    public String getEstado() {
        return Estado;
    }

    /**
     * @param Estado the Estado to set
     */
    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    /**
     * @return the Cidade
     */
    public String getCidade() {
        return Cidade;
    }

    /**
     * @param Cidade the Cidade to set
     */
    public void setCidade(String Cidade) {
        this.Cidade = Cidade;
    }
    private int id;
    private String nome;
    private String CPF;
    private String Sexo; 
    private String Endereço;
    private String Estado;
    private String Cidade; 
    
    public Cliente (String nome, String CPF, String Sexo, String Endereço, String Estado, String Cidade) {
        this.nome = nome;
        this.CPF = CPF;
        this.Sexo = Sexo;
        this.Endereço = Endereço;
        this.Estado = Estado;
        this.Cidade = Cidade;

    }
}
