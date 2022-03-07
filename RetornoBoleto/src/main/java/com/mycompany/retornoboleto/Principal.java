/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.retornoboleto;

/**
 *
 * @author 05728612148
 */
public class Principal {

    public static void main(String[] args) {
        final ProcessarBoletos processarBoletos = new ProcessarBoletos(new LeituraRetornoBancoBrasil());
        /**
        *BANCO DO BRASIL
        */
        String nomeArquivo = Principal.class.getResource("banco-brasil-1.csv").getPath();
        System.out.println("Lendo arquivo do Banco do Brasil...." + nomeArquivo + "\n");
        
        processarBoletos.processar(nomeArquivo);
        /**
        *BRADESCO
        */
        String nomeArquivo2 = Principal.class.getResource("bradesco-1.csv").getPath();
        System.out.println("Lendo arquivo do Bradesco...." + nomeArquivo2 + "\n");

        processarBoletos.processar(nomeArquivo2);

    }
    
}