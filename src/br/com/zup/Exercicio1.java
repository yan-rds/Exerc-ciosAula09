package br.com.zup;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        // Criando primeira parte do console (Scanner de dados)
        System.out.println("Sistema de cálculo de salário");
        System.out.println("Insira abaixo seu salário por hora");
        double salarioHora = leitor.nextDouble();
        System.out.println("Insira agora a quantidade de horas trabalhadas este mês");
        double horasTrabalhadas = leitor.nextDouble();
        System.out.println("Recebemos seus dados. Calculando...");

        // Definindo variáveis de cálculo
        double salarioBruto = salarioHora * horasTrabalhadas;
        double inss = salarioBruto * 0.1;
        double fgts = salarioBruto * 0.11;
        double impostodeRenda = 0;
        int porcentagem = 0;

        // Condicionais para cálculo do Imposto de Renda
        if (salarioBruto > 0 & salarioBruto <= 900) {
            impostodeRenda = 0;

        }
        else if (salarioBruto > 900 & salarioBruto <= 1500) {
            impostodeRenda = salarioBruto * 0.05;
            porcentagem = 5;
        }
        else if (salarioBruto > 1500 & salarioBruto <= 2500) {
            impostodeRenda = salarioBruto * 0.1;
            porcentagem = 10;
        }
        else if (salarioBruto > 2500) {
            impostodeRenda = salarioBruto * 0.2;
            porcentagem = 20;
        }
        else {
            System.out.println("Você inseriu valores inválidos, não foi possível calcular");
        }

        // Cálculos finais
        double salarioLiquido = salarioBruto - inss - impostodeRenda;
        double totalDeDescontos = impostodeRenda + inss;



        // Segunda parte do console (Resposta)
        System.out.print ("Salário bruto: ("+ horasTrabalhadas + "*" + salarioHora + ")");
        System.out.printf ( "\t \t \t \t: R$ %.2f " , salarioBruto);
        System.out.println();
        System.out.print ("(-) IR (" + porcentagem + "%)");
        System.out.printf ("\t \t \t \t \t \t \t: R$ %.2f " , impostodeRenda);
        System.out.println();
        System.out.print ("(-) INSS (10%)");
        System.out.printf ("\t \t \t \t \t \t \t: R$ %.2f " , inss);
        System.out.println();
        System.out.print ("FGTS (11%)");
        System.out.printf ("\t \t \t \t \t \t \t \t: R$ %.2f " , fgts);
        System.out.println();
        System.out.print ("Total de descontos");
        System.out.printf ("\t \t \t \t \t \t: R$ %.2f " , totalDeDescontos);
        System.out.println();
        System.out.print ("Salário Líquido");
        System.out.printf ("\t \t \t \t \t \t \t: R$ %.2f " , salarioLiquido);
        //System.out.printf ("%-15s" , linha1);
        //.out.println(": R$" + salarioBruto);





    }
}
