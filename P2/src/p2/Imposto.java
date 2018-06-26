/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2;

/**
 *
 * @author isaia
 */
public class Imposto {
    protected double valor_bem;
    protected double aliquora;
    protected String uf;
    protected int qtd_parcelas;
    protected double valor_imposto;
    protected double valor_parcelado;
    protected double valor_a_vista;

    public double getValor_bem() {
        return valor_bem;
    }

    public void setValor_bem(double valor_bem) {
        this.valor_bem = valor_bem;
    }

    public double getAliquora() {
        return aliquora;
    }

    public void setAliquora(double aliquora) {
        this.aliquora = aliquora;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public int getQtd_parcelas() {
        return qtd_parcelas;
    }

    public void setQtd_parcelas(int qtd_parcelas) {
        this.qtd_parcelas = qtd_parcelas;
    }

    public double getValor_imposto() {
        return valor_imposto;
    }

    public void setValor_imposto(double valor_imposto) {
        this.valor_imposto = valor_imposto;
    }

    public double getValor_parcelado() {
        return valor_parcelado;
    }

    public void setValor_parcelado(double valor_parcelado) {
        this.valor_parcelado = valor_parcelado;
    }

    public double getValor_a_vista() {
        return valor_a_vista;
    }

    public void setValor_a_vista(double valor_a_vista) {
        this.valor_a_vista = valor_a_vista;
    }
    
    
}
