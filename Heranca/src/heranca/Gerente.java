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
public class Gerente extends Funcionario {
    private String Contrato;
    private int Senha;
    private String AreaDeatuacao; 
    private int NrdeFuncGerenciados;

    public String getContrato() {
        return Contrato;
    }

    public void setContrato(String Contrato) {
        this.Contrato = Contrato;
    }

    public int getSenha() {
        return Senha;
    }

    public void setSenha(int Senha) {
        this.Senha = Senha;
    }

    public String getAreaDeatuacao() {
        return AreaDeatuacao;
    }

    public void setAreaDeatuacao(String AreaDeatuacao) {
        this.AreaDeatuacao = AreaDeatuacao;
    }

    public int getNrdeFuncGerenciados() {
        return NrdeFuncGerenciados;
    }

    public void setNrdeFuncGerenciados(int NrdeFuncGerenciados) {
        this.NrdeFuncGerenciados = NrdeFuncGerenciados;
    }
   
}


