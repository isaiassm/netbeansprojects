/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heranca;

import java.util.Scanner;

/**
 *
 * @author isaia
 */
public class Heranca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        Estagiario Est = new Estagiario();
        
        Est.setNome("João Teves");
        Est.setCpf(854584152);
        Est.setSalario(78.5);
        Est.setTerminodoContrato("agosto 55");
        
        System.out.println("O nome do Estagiario é: " + Est.getNome());
        System.out.println("O Cpf do Estagiario é: " + Est.getCpf());
        System.out.println("O Salario do Estagiario é: " + Est.getSalario());
        System.out.println("O termino do contrado termina em: " + Est.getTerminodoContrato());
        
        System.out.println("-----------------------------------------------------------------------");
//        System.out.println("\n");
        
        Clinica cln = new Clinica();
        
        cln.setNome("São francisco");
        cln.setCnpj(97754);
        cln.setNrdePacientes(200);
        
        System.out.println("O nome da clinica é: " + cln.getNome());
        System.out.println("O Cnpj do paciente é: " + cln.getCnpj());
        System.out.println("A Quantidade de pacientes é do total de: " + cln.getNrdePacientes());
    }
    
}
