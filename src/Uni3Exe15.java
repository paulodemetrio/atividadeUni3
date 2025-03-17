/*Construa um programa para ler um número inteiro (assuma até 3 dígitos)
e imprima a saída da seguinte forma:

X centena(s)  Y dezena(s) K unidade(s)
Exemplo, se for submetido o número 384, o programa deverá exibir:

3 centena(s)  8 dezena(s) 4 unidade(s)  */


import java.util.Scanner;

public class Uni3Exe15 {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         int numero = scanner.nextInt();

         int centenas = numero / 100;
         int dezenas = (numero % 100) / 10;
         int unidades = numero % 10;

         System.out.println(centenas + " centena(s) " + dezenas + " dezena(s) " + unidades + " unidade(s)");

         scanner.close();
     }
}