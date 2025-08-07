package Exercicios.B_CondicionaisELaços.Exercicio03;

import java.util.Locale;
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        var n = sc.nextInt();
        System.out.println("Digite o segundo número, que deve ser maior que o primeiro");
        var nMaior = sc.nextInt();
        if (n > nMaior) {
            System.out.println("O segundo número não é maior que o primeiro. Escolha novamente! ");
        } else {
            System.out.println("Deseja ver os números pares ou ímpares? (Digite P para par ou I para ímpar)");
            var escolha = sc.next().toUpperCase(Locale.ROOT).charAt(0);
            if (escolha == 'P') {
                System.out.println("Os números pares entre " + nMaior + " e " + n + " é: ");
            } else {
                System.out.println("Os números ímpares entre " + nMaior + " e " + n + " é: ");
            }
            for (int i = nMaior; i >= n; i--) {
                if (escolha == 'P' && i % 2 == 0) {
                    System.out.println(i);
                } else if (escolha == 'I' && i % 2 != 0) {
                    System.out.println(i);
                }
            }
        }
        sc.close();
    }
}