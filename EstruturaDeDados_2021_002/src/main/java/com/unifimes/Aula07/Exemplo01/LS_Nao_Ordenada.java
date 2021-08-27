/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unifimes.Aula07.Exemplo01;

import java.util.Scanner;

/**
 *
 * @author alencarburiti
 */
public class LS_Nao_Ordenada {
    
    public static void main(String [] args){
        menu();
        int inicio = 0;
        int fim = 0;
    }
    
    
    public static void menu(){
        Scanner teclado = new Scanner(System.in);
        int opcao;
        System.out.println("1 - Inserir no início da lista");
        System.out.println("2 - Inserir no fim da lista");
        System.out.println("3 - Consultar toda lista");
        System.out.println("4 - Remover da lista");
        System.out.println("5 - Esvaziar a lista");
        System.out.println("6 - Sair");
        
        opcao = teclado.nextInt();       
    }
    
    public static void consultar(int [] lista){
        for(int i =0; i < lista.length; i++ ){
            
        }
    }
    
}
