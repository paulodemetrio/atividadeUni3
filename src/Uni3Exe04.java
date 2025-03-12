//Faça um programa para ler três notas de um aluno em uma disciplina e imprimira sua média ponderada (as notas tem pesos respectivos de 5, 3 e 2).

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Exe04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        double n1 = scan.nextDouble();
        double n2 = scan.nextDouble();
        double n3 = scan.nextDouble();
        double media = ((n1 * 5) + (n2 * 3) + (n3 * 2)) / 10;
        System.out.println(df.format(media));
        scan.close();
    }
}
