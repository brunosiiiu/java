/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aulahojecerto;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Aulahojecerto {

    public static void main(String[] args) {
     //leitura//
        Scanner leia = new Scanner(System.in);
       
        //entrada de dados//
         int valor;
         int pdesconto;
         int vdesconto;
         int pjuros;
         int vjuros;
       //entrada de dados manual//
       
        System.out.println("****wiinks!!***");
        System.out.println("digite ovalor da compra:");//nome da loja//
        valor = leia.nextInt();//fazer a leitura do valor//
        System.out.println("digite a porcentagem de desconto:");
        pdesconto = leia.nextInt();//fazer a leitura do desconto
        System.out.println("Digite a porcentagem de juros:");
        pjuros =leia.nextInt();// fazer a leitura do desconto
       
        //processamento//
        vdesconto = valor * pdesconto; // calculo de desconto//
        vjuros = valor * pjuros; //calculo de juros//
       
        //saida//
        System.out.println("compra com 10% de desconto" +vdesconto);
        System.out.println("compra com 10% de juros" +vjuros);
    }
}
