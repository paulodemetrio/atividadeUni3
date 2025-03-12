//Uma fábrica de refrigerantes vende seu produto em três formatos: lata de 350 ml, garrafa de 600 ml e garrafa de 2 litros. Se um comerciante compra uma determinada quantidade de cada formato, faça um programa para calcular quantos litros de refrigerante ele comprou.

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Exe07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.print("Quantidade de 350ml: ");
        int qtdeLata = scan.nextInt();
        System.out.print("Quantidade de 600ml: ");
        int qtdeGarrafa = scan.nextInt();
        System.out.print("Quantidade de 2L: ");
        int qtdeGarrafa2L = scan.nextInt();
        double litros = ((0.350 * qtdeLata) + (0.600 * qtdeGarrafa) + (2 * qtdeGarrafa2L));
        System.out.println("O cliente comprou ao total " + df.format(litros) + " litros.");
        scan.close();
    }
}