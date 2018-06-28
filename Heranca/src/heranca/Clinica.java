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
public class Clinica extends PessoaJuridica {
    private String Contrato;
    private String CadastroDeUser;
    private int NrdeMedicos;
    private int NrdeFuncCLT;
    private int NrdePacientes;
    private int Ambulatorios;
    private String Consulta;

    public String getContrato() {
        return Contrato;
    }

    public void setContrato(String Contrato) {
        this.Contrato = Contrato;
    }

    public String getCadastroDeUser() {
        return CadastroDeUser;
    }

    public void setCadastroDeUser(String CadastroDeUser) {
        this.CadastroDeUser = CadastroDeUser;
    }

    public int getNrdeMedicos() {
        return NrdeMedicos;
    }

    public void setNrdeMedicos(int NrdeMedicos) {
        this.NrdeMedicos = NrdeMedicos;
    }

    public int getNrdeFuncCLT() {
        return NrdeFuncCLT;
    }

    public void setNrdeFuncCLT(int NrdeFuncCLT) {
        this.NrdeFuncCLT = NrdeFuncCLT;
    }

    public int getNrdePacientes() {
        return NrdePacientes;
    }

    public void setNrdePacientes(int NrdePacientes) {
        this.NrdePacientes = NrdePacientes;
    }

    public int getAmbulatorios() {
        return Ambulatorios;
    }

    public void setAmbulatorios(int Ambulatorios) {
        this.Ambulatorios = Ambulatorios;
    }

    public String getConsulta() {
        return Consulta;
    }

    public void setConsulta(String Consulta) {
        this.Consulta = Consulta;
    }
    
}

