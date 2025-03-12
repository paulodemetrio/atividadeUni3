/*Uma loja de calçados está concedendo 12% de desconto nos produtos. Escreva um programa para calcular e exibir o valor de desconto a ser dado num par de sapatos e quanto deve custar o produto com o desconto. O preço do par de sapatos deve ser informado pelo usuário. Como resultado, o programa deverá exibir as seguintes mensagens:

O valor do desconto é de R$ xxx
O preço do par de sapatos com desconto é R$ xxx */
import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Exe02 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.print("Informe o preço do par de sapatos: ");
        double custo = scan.nextDouble();
        double valorDesconto = custo * 0.12;
        double precoComDesconto = custo - valorDesconto;

        System.out.println("O valor do desconto é de R$ " + df.format(valorDesconto));
        System.out.println("O preço do par de sapatos com desconto é R$ " + df.format(precoComDesconto));

        scan.close();
    }
}