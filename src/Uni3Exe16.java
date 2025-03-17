//Suponha que um caixa disponha apenas de notas de 100, 10 e 1 reais. Considerando que alguém está pagando uma compra, faça um programa que determine e escreva o número mínimo de notas que o caixa deve fornecer como troco. Escreva também o número de cada tipo de nota a ser fornecido como troco. Suponha que o sistema monetário não utilize centavos.

import java.util.Scanner;

public class Uni3Exe16 {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         System.out.print("Valor total da compra: ");
         int valorCompra = scanner.nextInt();
         System.out.print("Valor total dado pelo cliente: ");
         int valorPago = scanner.nextInt();
         int troco = valorPago - valorCompra;
         int notas100 = troco / 100;
         troco %= 100;
         int notas10 = troco / 10;
         troco %= 10;
         int notas1 = troco;
         int totalNotas = notas100 + notas10 + notas1;

         System.out.println("O número mínimo de notas de troco é: " + totalNotas);
         System.out.println("Quantidade de notas de 100 necessárias é: " + notas100);
         System.out.println("Quantidade de notas de 10 necessárias é: " + notas10);
         System.out.println("Quantidade de notas de 1 necessárias é: " + notas1);

         scanner.close();
     }
}