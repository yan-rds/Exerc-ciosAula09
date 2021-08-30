package br.com.zup;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        // Criando o interrogatório
        System.out.println("Responda as seguintes perguntas com Sim ou Não");
        System.out.println("Telefonou para a vítima?");
        String pergunta1 = leitor.next();
        System.out.println("Esteve no local do crime?");
        String pergunta2 = leitor.next();
        System.out.println("Mora perto da vítima?");
        String pergunta3 = leitor.next();
        System.out.println("Devia para a vítima?");
        String pergunta4 = leitor.next();
        System.out.println("Já trabalhou com a vítima?");
        String pergunta5 = leitor.next();

        int contador = 0;
        int contador1;
        int contador2;
        int contador3;
        int contador4;
        int contador5;

        // Criando condicionais
        if (pergunta1.equals("Sim")) {
            contador1 = contador +1;

        }
        else {
            contador1 = contador;
        }

        if (pergunta2.equals("Sim")) {
            contador2 = contador1 +1;
        }
        else {
            contador2 = contador1;
        }

        if (pergunta3.equals("Sim")) {
            contador3 = contador2 + 1;
        }
        else {
            contador3 = contador2;
        }

        if (pergunta4.equals("Sim")) {
            contador4 = contador3 + 1;
        }
        else {
            contador4 = contador3;
        }

        if (pergunta5.equals("Sim")) {
            contador5 = contador4 + 1;
        }
        else {
            contador5 = contador4;
        }
        if (contador5 == 1){
            System.out.println("Você foi considerado inocente.");
        }
        else if (contador5 == 2){
            System.out.println("Você foi considerado suspeito.");
        }
        else if (contador5 == 3 | contador5 == 4){
            System.out.println("Você foi considerado Cúmplice.");
        }
        else if (contador5 == 5) {
            System.out.println("Você foi considerado Culpado.");
        }
    }

}
