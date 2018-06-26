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
public class Ipva extends Imposto {
    private int tipo_veiculo;
    private int tipo_combustivel;

    public Ipva(double valor_bem, String uf, int tipo_veiculo, int tipo_combustivel) {
        this.valor_bem = valor_bem;
        this.uf = uf;
        this.tipo_veiculo = tipo_veiculo;
        this.tipo_combustivel = tipo_combustivel;
    }
    
    

    public int getTipo_veiculo() {
        return tipo_veiculo;
    }

    public void setTipo_veiculo(int tipo_veiculo) {
        this.tipo_veiculo = tipo_veiculo;
    }

    public int getTipo_combustivel() {
        return tipo_combustivel;
    }

    public void setTipo_combustivel(int tipo_combustivel) {
        this.tipo_combustivel = tipo_combustivel;
    }
    
    public void calcularimposto(){
    //Moto = 1 
        if (tipo_veiculo == 1) {
           this.valor_imposto = valor_bem * 0.2;
        }
    //Carro de passeio = 2    
        else if(tipo_veiculo == 2){
        this.valor_imposto = valor_bem * 0.3;
        //Diesel = 1
        }
        else if (tipo_combustivel == 1) {
                this.valor_imposto = valor_bem * 0.5;
            }
        else if ("GO".equals(this.uf) || "MG".equals(this.uf)) {
            this.valor_imposto = valor_bem * 0.4;
        }
    //Onibus, caminhoes e tratores = 3
        else if (tipo_veiculo == 3) {
            this.valor_imposto = valor_bem * 2.5;
        }
    //Embarcaçoes e aeronaves    
        else if (tipo_veiculo == 4) {
            this.valor_imposto = valor_bem * 1.50;
        }
        
        this.valor_a_vista = valor_imposto * 0.5;
        this.valor_parcelado = valor_imposto / 4;

    }
}
