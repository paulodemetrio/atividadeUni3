//Uma granja possui um controle automatizado de cada frango da sua produção. No pé direito do frango há um anel com um chip de identificação; no pé esquerdo são dois anéis para indicar o tipo de alimento que ele deve consumir. Sabendo que o anel com chip custa R$ 4,00 e o anel de alimento custa R$ 3,50, faça um programa para calcular o gasto total da granja para marcar todos os seus frangos.

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Exe05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0");
        int frango = scan.nextInt();
        double chipId = 4;
        double chipAl = 3.5;
        double gastoTot = (frango * chipId) + (frango * (2 * chipAl));
        System.out.println("O gasto total para marcar " + frango + " é R$" + df.format(gastoTot));
        scan.close();
    }
}
