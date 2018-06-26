/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2;

import java.util.Scanner;

/**
 *
 * @author isaia
 */
public class P2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int imposto, continuar;
        
        do {
  
        do {
        System.out.println("1 - Ipva 2 - Iptu");
        imposto = ler.nextInt();
        } while (imposto <1 || imposto >2);
        //Valor bem fora do laço serve para os Dois tipos de Impostos!
        System.out.println("Valor Bem:");
        int valor_bem = ler.nextInt();
        if (imposto == 1) {
        
            System.out.println("Uf");
            String uf = ler.next();
            
            System.out.println("Tipo veiculo");
            System.out.println("1 - Moto");
            System.out.println("2 - Carro de Passeio");
            System.out.println("3 - Ônibus, Caminhões e tratores");
            System.out.println("4 - Embarcações e aeronaves");
            int tipo_veiculo = ler.nextInt();
            
            System.out.println("Tipo combistivel");
            System.out.println("1 -Diesel");
            int tipo_combustivel = ler.nextInt();
            
            Ipva ipva = new Ipva(valor_bem, uf, tipo_veiculo, tipo_combustivel);
            ipva.calcularimposto();
            System.out.println("Valor Do imposto:  "+ipva.getValor_imposto());
            System.out.println("Valor Parcelado:  "+ipva.getValor_parcelado());
            System.out.println("Valor a Vista:  "+ipva.getValor_a_vista());
        }else{
//         System.out.println("Valor Bem:");
//         int valor_bem = ler.nextInt();
         
            System.out.println("Uf:");
            String uf = ler.next();
            
            System.out.println("Tipo imovel");
            System.out.println("1 - Residencial");
            System.out.println("2 - Comercial");
            System.out.println("3 - Industrial");
            int tipo_imovel = ler.nextInt();
            
            Iptu iptu = new Iptu(valor_bem, uf, tipo_imovel);
            iptu.calcularimposto();
            System.out.println("Valor Do imposto:  "+iptu.getValor_imposto());
            System.out.println("Valor Parcelado:  "+iptu.getValor_parcelado());
            System.out.println("Valor a Vista:  "+iptu.getValor_a_vista());
            
        }
        
        System.out.println("Deseja calcular mais um imposto? 0 - Não 1 - Sim");
        continuar = ler.nextInt();
        
        } while (continuar == 1);
        System.out.println("Programa encerrado!");
    }
    
}
