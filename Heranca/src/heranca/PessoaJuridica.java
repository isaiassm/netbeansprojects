/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heranca;

/**
 *
 * @author isaia
 */
public class PessoaJuridica extends Pessoa {
    private String NomeFantasia;
    private int Cnpj;
    private String Email;
    private String Endereco;
    private String Dt_Fundacao;
    private String Faturamento;

    public String getNomeFantasia() {
        return NomeFantasia;
    }

    public void setNomeFantasia(String NomeFantasia) {
        this.NomeFantasia = NomeFantasia;
    }

    public int getCnpj() {
        return Cnpj;
    }

    public void setCnpj(int Cnpj) {
        this.Cnpj = Cnpj;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public String getDt_Fundacao() {
        return Dt_Fundacao;
    }

    public void setDt_Fundacao(String Dt_Fundacao) {
        this.Dt_Fundacao = Dt_Fundacao;
    }

    public String getFaturamento() {
        return Faturamento;
    }

    public void setFaturamento(String Faturamento) {
        this.Faturamento = Faturamento;
    }
    
}
