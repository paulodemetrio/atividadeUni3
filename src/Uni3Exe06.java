//Um restaurante cobra R$ 25,00 por cada quilo de refeição. Escreva um programa que leia o peso do prato montado pelo cliente (em quilos) e imprima o valor a pagar. O peso do prato é de 750 gramas.

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Exe06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        double pesoKg = scan.nextDouble();
        double preco = 25.00;
        double valor = ((pesoKg) - 0.75) * preco;
        System.out.println("O valor a pagar é de R$ " + df.format(valor));
        scan.close();
    }
}
