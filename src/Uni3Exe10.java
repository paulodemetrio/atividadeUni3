/*Descreva um programa que leia o comprimento dos catetos de um triângulo retângulo e calcule o comprimento da hipotenusa.
Fórmula: hipotenusa^2=cateto1^2+cateto2^2
*/

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Exe10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.print("Cateto oposto: ");
        double cateto1 = scan.nextDouble();
        System.out.print("Cateto adjacente: ");
        double cateto2 = scan.nextDouble();
        double hipotenusa = Math.sqrt(Math.pow(cateto1, 2)+Math.pow(cateto2, 2));
        System.out.println("A hipotenusa é: " + df.format(hipotenusa));
        scan.close();
    }
}