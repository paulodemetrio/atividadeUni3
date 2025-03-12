//Um motorista deseja abastecer seu tanque de combustível. Escreva um programa para ler o preço do litro da gasolina e o valor do pagamento e exibir quantos litros ele conseguiu colocar no tanque.

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Exe03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.print("Preço do litro de gasolina: ");
        double precoLitro = scan.nextDouble();
        System.out.print("Valor do pagamento: ");
        double valor = scan.nextDouble();
        double litros = valor / precoLitro;
        System.out.println("O motorista conseguiu colocar: " + df.format(litros) + " litros.");
        scan.close();
    }
}
