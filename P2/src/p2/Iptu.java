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
public class Iptu extends Imposto {
    private int tipo_imovel;

    public Iptu(double valor_bem, String uf, int tipo_imovel) {
        this.valor_bem = valor_bem;
        this.uf = uf;
        this.tipo_imovel = tipo_imovel;
    }
    
    

    public int getTipo_imovel() {
        return tipo_imovel;
    }

    public void setTipo_imovel(int tipo_imovel) {
        this.tipo_imovel = tipo_imovel;
    }
    
      public void calcularimposto(){
    //Residencial = 1
          if (tipo_imovel == 1) {
              if (this.valor_bem < 150000) {
              this.valor_imposto = valor_bem * 0.7;
              }
              else if (this.valor_bem > 150001 || this.valor_bem < 300000) {
              this.valor_imposto = valor_bem * 0.9;
              this.valor_imposto -= 300;
              }
              else if (this.valor_bem > 300000 || this.valor_bem < 600000) {
              this.valor_imposto = valor_bem * 1.1;  
              this.valor_imposto -= 900;
              }
              else if (this.valor_bem > 600001 || this.valor_bem < 1200000) {
              this.valor_imposto = valor_bem * 1.3;
              this.valor_imposto -= 2100;
              }
              else if (this.valor_bem < 1200000) {
              this.valor_imposto = valor_bem * 1.5;    
              this.valor_imposto -= 4500;
              }
          }
    //Comercial = 2       
          if (tipo_imovel == 2) {
              if (this.valor_bem < 150000) {
              this.valor_imposto = valor_bem * 1.1;
              }
              else if (this.valor_bem > 150001 || this.valor_bem < 300000) {
              this.valor_imposto = valor_bem * 1.3;
              this.valor_imposto -= 300;
              }
              else if (this.valor_bem > 300000 || this.valor_bem < 600000) {
              this.valor_imposto = valor_bem * 1.5;  
              this.valor_imposto -= 900;
              }
              else if (this.valor_bem > 600001 || this.valor_bem < 1200000) {
              this.valor_imposto = valor_bem * 1.7;
              this.valor_imposto -= 2100;
              }
              else if (this.valor_bem < 1200000) {
              this.valor_imposto = valor_bem * 1.9;    
              this.valor_imposto -= 4500;
              }
          } 
    //Industrial      
            if (tipo_imovel == 3) {
              if (this.valor_bem < 150000) {
              this.valor_imposto = valor_bem * 1.3;
              }
              else if (this.valor_bem > 150001 || this.valor_bem < 300000) {
              this.valor_imposto = valor_bem * 1.5;
              this.valor_imposto -= 300;
              }
              else if (this.valor_bem > 300000 || this.valor_bem < 600000) {
              this.valor_imposto = valor_bem * 1.7;  
              this.valor_imposto -= 900;
              }
              else if (this.valor_bem > 600001 || this.valor_bem < 1200000) {
              this.valor_imposto = valor_bem * 1.9;
              this.valor_imposto -= 2100;
              }
              else if (this.valor_bem < 1200000) {
              this.valor_imposto = valor_bem * 2.1;    
              this.valor_imposto -= 4500;
              }
          } 
        this.valor_a_vista = valor_imposto * 0.3;
        this.valor_parcelado = valor_imposto / 6;
        
    }
    
}
