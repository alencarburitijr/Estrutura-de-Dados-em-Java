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
    public static class Lista{
        public int num;
        public Lista prox;
    }  
    public static void main(String []args){
        Scanner teclado = new Scanner(System.in);
        
        Lista inicio = null;
        Lista fim = null;
        Lista aux;
        int operacao;
        int numero;
        int posicao = 1;
        
        do{
            System.out.println("MENU DE OPÇÕES");
            System.out.println("1 - Inserir no inicio da lista");
            System.out.println("2 - Inserir no fim da lista");
            System.out.println("3 - Listar itens");
            System.out.println("6 - Sair");                        
            
            //Verifico qual a opção o usuário digitou
            operacao = teclado.nextInt();
            
            // # Inicio operaçao de inserir no início da Lista
            if (operacao == 1){
                System.out.println("Digite o número a ser inserido no início da lista");
                Lista novo = new Lista();
                novo.num = teclado.nextInt();
                if (inicio == null){
                    inicio = novo;
                    fim = novo;
                    fim.prox = null;
                }else{
                    novo.prox = inicio;
                    inicio = novo;
                }                
            }                                      
            // # Fim operaçao de inserir no início da Lista
             
            // # Inicio operaçao de inserir no fim da Lista
            if (operacao == 2){
                System.out.println("Digite um número para ser inserido no fim da fila");
                Lista novo = new Lista();
                novo.num = teclado.nextInt();
                
                if (fim == null){
                    inicio = novo;
                    fim = novo;
                    fim.prox = null;
                }else{
                    fim.prox = novo;
                    fim = novo;
                    fim.prox = null;
                }
            }
            // # Fim operaçao de inserir no fim da Lista
            // # Inicio lista itens 
            if (operacao == 3){
                System.out.println("Listando itens ... aguarde");
                if ( inicio == null){
                    System.out.println("Lista vazia");
                } else {
                    aux = inicio;
                    while(aux!= null){
                        System.out.println("A posicao da lista " + posicao + " tem o número " + aux.num);                        
                        aux = aux.prox;
                        posicao ++;
                    }
                }
            }
            // # Fim lista itens 
        }while(operacao!=6);               
    }
}
