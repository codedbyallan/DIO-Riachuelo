package Exercicios.A_FundamentosECalculos.Exercicio01;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Qual seu nome?");
        var nome = scanner.nextLine();
        System.out.println("Qual sua idade?");
        var idade = scanner.nextInt();
        System.out.printf("Olá %s, você tem %s anos!", nome, idade);
        scanner.close();

    }

}
