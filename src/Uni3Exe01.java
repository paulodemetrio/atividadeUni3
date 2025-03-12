//Uma imobiliária vende apenas terrenos retangulares. Faça um programa para ler as dimensões de um terreno e depois exibir a área do terreno.

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Exe01 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0");
        double largura = scan.nextDouble();
        double comp = scan.nextDouble();
        double area = largura * comp;
        System.out.println(df.format(area));
        scan.close();
    }
}
