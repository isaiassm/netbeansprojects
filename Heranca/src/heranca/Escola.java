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
public class Escola extends PessoaJuridica {
    private int Nr_Professores;    
    private int Nr_Alunos;
    private int Nr_Nm_Escola;
    private int Nivel;

    public int getNr_Professores() {
        return Nr_Professores;
    }

    public void setNr_Professores(int Nr_Professores) {
        this.Nr_Professores = Nr_Professores;
    }

    public int getNr_Alunos() {
        return Nr_Alunos;
    }

    public void setNr_Alunos(int Nr_Alunos) {
        this.Nr_Alunos = Nr_Alunos;
    }

    public int getNr_Nm_Escola() {
        return Nr_Nm_Escola;
    }

    public void setNr_Nm_Escola(int Nr_Nm_Escola) {
        this.Nr_Nm_Escola = Nr_Nm_Escola;
    }

    public int getNivel() {
        return Nivel;
    }

    public void setNivel(int Nivel) {
        this.Nivel = Nivel;
    }
    
}
 