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
public class Estagiario extends Funcionario {
    private double Salario;
    private String Periodo;
    private String TerminodoContrato;
    private String Campos;
    private String Nivel;

    public double getSalario() {
        return Salario;
    }

    public void setSalario(double Salario) {
        this.Salario = Salario;
    }

    public String getPeriodo() {
        return Periodo;
    }

    public void setPeriodo(String Periodo) {
        this.Periodo = Periodo;
    }

    public String getTerminodoContrato() {
        return TerminodoContrato;
    }

    public void setTerminodoContrato(String TerminodoContrato) {
        this.TerminodoContrato = TerminodoContrato;
    }

    public String getCampos() {
        return Campos;
    }

    public void setCampos(String Campos) {
        this.Campos = Campos;
    }

    public String getNivel() {
        return Nivel;
    }

    public void setNivel(String Nivel) {
        this.Nivel = Nivel;
    }

  
    
    
}

   