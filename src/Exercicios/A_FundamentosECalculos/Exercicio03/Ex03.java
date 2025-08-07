package Exercicios.A_FundamentosECalculos.Exercicio03;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println(" - Cálculo de área de um retângulo - ");
        System.out.println("## Medidas em centímetros ###\n");
        System.out.println("Digite o valor da altura do retângulo: ");
        var altura = scanner.nextInt();
        System.out.println("Digite o valor da base do retângulo: ");
        var quadrado = scanner.nextInt();
        var area = altura*quadrado;
        System.out.printf("A área do retângulo é: %d cm²%n",area);
        scanner.close();
    }
}
