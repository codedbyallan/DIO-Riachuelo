package Exercicios.A_FundamentosECalculos.Exercicio02;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Cálculo de área de um quadrado: ");
        System.out.println("Digite o tamanho do lado do quadrado (em cm): ");
        var lado = scanner.nextInt();
        var quadrado = lado * lado;
        System.out.printf("A área do quadrado é %d cm²",quadrado);
        scanner.close();
    }
}
