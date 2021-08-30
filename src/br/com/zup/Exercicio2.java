package br.com.zup;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        // Variáveis
        double precoGasolinaLitro = 2.50;
        double precoAlcoolLitro = 1.90;
        double desconto = 0;
        double valorTotal = 0;

        // Primeira parte do console
        System.out.println("Este sistema calcula o preço da gasolina");
        System.out.println("Qual tipo de combustível você irá comprar? Use A (maiúsculo) para Álcool e G (maiúsculo) para Gasolina");
        char combustivel = leitor.next().charAt(0);
        System.out.println("Quantos litros você pretende comprar?");
        double litros = leitor.nextDouble();

        // Criando condicionais para definir o desconto
        if (combustivel == 'A' & litros <= 20 & litros > 0) {
            desconto = 0.03;
            valorTotal = litros * (precoAlcoolLitro - (precoAlcoolLitro * desconto));
            System.out.println("voce irá pagar R$" + valorTotal);


        }
        else if (combustivel == 'A' & litros > 20 & litros > 0) {
            desconto = 0.05;
            valorTotal = litros * (precoAlcoolLitro - (precoAlcoolLitro * desconto));
            System.out.println("voce irá pagar R$" + valorTotal);

        }
        else if (combustivel == 'G' & litros <= 20 & litros > 0) {
            desconto = 0.04;
            valorTotal = litros * (precoGasolinaLitro - (precoGasolinaLitro * desconto));
            System.out.println("voce irá pagar R$" + valorTotal);

        }
        else if (combustivel == 'G' & litros > 20 & litros > 0) {
            desconto = 0.06;
            valorTotal = litros * (precoGasolinaLitro - (precoGasolinaLitro * desconto));
            System.out.println("voce irá pagar R$" + valorTotal);

        }
        else {
            System.out.println("Você inseriu velores inválidos. Tente novamente");

        }






    }
}
