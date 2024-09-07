/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aulahoje;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Aulahoje {

    public static void main(String[] args){
        
        // entrada de dados//
        
        Scanner leia = new Scanner (System.in);
        int valor;
        int pdesconto;
        int vdesconto;
        int pjruos;
        int vjuros;
        
        //entrada de dados manual//
        
        System.out.println("****wiinks!!****");
        System.out.println("digite o valor da compra");
        valor = leia.nextInt();//fazer a leitura do valor//
        System.out.println("digite a porcentagem de desconto");
        valor = leia.nextInt();
        pdesconto = leia.nextInt();//fazer a leitura do desconto//
        System.out.println("digite a porcentagem de juros:");
        vjuros = leia.nextInt();//fazer leitura desconto//
        
        //processamento//
        vdesconto = valor * pdesconto; //caçciçp de descpmto//
        vjuros = valor * vjuros; //calculo de juros//
        

        //saida//
        System.out.println ("compra com 10% de decsconto" +vdesconto);
        System.out.println ("compra com 10% de juros" +vjuros);

    }
}
