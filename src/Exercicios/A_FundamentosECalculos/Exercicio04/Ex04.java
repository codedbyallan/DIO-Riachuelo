package Exercicios.A_FundamentosECalculos.Exercicio04;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("### Calculadora de diferença de idade ### \n");
        System.out.println("Digite o nome da primeira pessoa: ");
        var nome1 = scanner.nextLine();
        System.out.println("Digite a idade da primeira pessoa: ");
        var idade1 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite o nome da segunda pessoa: ");
        var nome2 = scanner.nextLine();
        System.out.println("Digite a idade da segunda pessoa: ");
        var idade2 = scanner.nextInt();
        var diferencaIdade = Math.abs(idade1 - idade2);
        System.out.printf("A diferença de idade entre %s e %s é de aproximadamente %d anos. %n",nome1,nome2,diferencaIdade);
        scanner.close();
    }
}
