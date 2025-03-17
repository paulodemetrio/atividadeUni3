//Numa loja de materiais de construção, um azulejo estampado custa R$ 12,50. Faça um programa para ler o comprimento e altura de uma parede (em metros), e depois escrever o valor gasto com a compra de azulejos. Considere que um metro quadrado é formado por 9 azulejos.

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Exe13 {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         DecimalFormat df = new DecimalFormat("0.00");

         System.out.print("Altura: ");
         double altura = scanner.nextDouble();
         System.out.print("Comprimento: ");
         double comprimento = scanner.nextDouble();
         double areaParede = comprimento * altura;
         double numeroAzulejos = areaParede * 9;

         double custoTotal = numeroAzulejos * 12.50;

         System.out.println("O valor final é R$ " + df.format(custoTotal));
         scanner.close();
     }
}