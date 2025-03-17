//Descreva um programa que a partir da distância percorrida e o do tempo gasto por um motorista durante uma viagem de final de semana, calcule a velocidade média e a quantidade de combustível gasto na viagem, sabendo que o automóvel faz 12 km por litro.

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Exe14 {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         DecimalFormat df = new DecimalFormat("0.00");

         System.out.print("Distância: ");
         double distancia = scanner.nextDouble();
         System.out.print("Tempo: ");
         double tempo = scanner.nextDouble();
         double velocidadeMedia = distancia / tempo;
         double combustivelGasto = distancia / 12.0;

         System.out.println("A velocidade média foi de " + df.format(velocidadeMedia) + " km/h  e a quantidade de combustível usado foi de " + df.format(combustivelGasto) + " litros");
         scanner.close();
     }
}