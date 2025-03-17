/*Descreva um programa que dado uma temperatura em °C informe o seu valor em °F. Fórmula:
°F = (9/5) °C + 32
*/

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Exe11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        double celsius = scan.nextDouble();
        double fahrenheit = 1.8 * celsius + 32;
        System.out.println(df.format(fahrenheit));
        scan.close();
    }
}