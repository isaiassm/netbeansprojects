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
public class Diretor extends Funcionario {
    private double Salario;
    private String ControleDeAtividades;
    private String PlanejamentoEstrategico;
    private String Avaliacao;

    public double getSalario() {
        return Salario;
    }

    public void setSalario(double Salario) {
        this.Salario = Salario;
    }

    public String getControleDeAtividades() {
        return ControleDeAtividades;
    }

    public void setControleDeAtividades(String ControleDeAtividades) {
        this.ControleDeAtividades = ControleDeAtividades;
    }

    public String getPlanejamentoEstrategico() {
        return PlanejamentoEstrategico;
    }

    public void setPlanejamentoEstrategico(String PlanejamentoEstrategico) {
        this.PlanejamentoEstrategico = PlanejamentoEstrategico;
    }

    public String getAvaliacao() {
        return Avaliacao;
    }

    public void setAvaliacao(String Avaliacao) {
        this.Avaliacao = Avaliacao;
    }
    
    
}
 