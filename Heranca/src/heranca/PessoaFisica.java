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
public class PessoaFisica extends Pessoa{
    
    private String Email;
    private String Dt_nascimento;
    private String Endereco;
    private String Dependetes;
    private String Imoveis;

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getDt_nascimento() {
        return Dt_nascimento;
    }

    public void setDt_nascimento(String Dt_nascimento) {
        this.Dt_nascimento = Dt_nascimento;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public String getDependetes() {
        return Dependetes;
    }

    public void setDependetes(String Dependetes) {
        this.Dependetes = Dependetes;
    }

    public String getImoveis() {
        return Imoveis;
    }

    public void setImoveis(String Imoveis) {
        this.Imoveis = Imoveis;
    }
    
}
