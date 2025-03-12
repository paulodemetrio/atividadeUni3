/*Descreva um programa que calcule o volume de uma lata de óleo. Fórmula: volume = Pi * raio^2 * altura
Quantas casas decimais devo usar para o número Pi?
*/

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Exe09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.print("Raio: ");
        double raio = scan.nextDouble();
        System.out.print("Altura: ");
        double altura = scan.nextDouble();
        double pi = 3.14159;
        double volume = pi * Math.pow(raio, 2) * altura;

        System.out.println("O volume da lata de óleo é: " + df.format(volume));
        scan.close();
    }
}
