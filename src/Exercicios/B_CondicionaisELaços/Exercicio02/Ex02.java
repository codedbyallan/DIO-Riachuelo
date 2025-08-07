package Exercicios.B_CondicionaisELaços.Exercicio02;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        System.out.println("### Cálculo de IMC ###\n");
        System.out.println("Digite o seu peso (kg).");
        var peso = sc.nextDouble();
        System.out.println("Digite a sua altura (metros).");
        var altura = sc.nextDouble();
        var imc = peso / (altura * altura);
        System.out.printf("Seu IMC é %.2f\n", imc);
        if (imc <= 18.5) {
            System.out.println("Abaixo do peso.");
        } else if (imc <= 24.9) {
            System.out.println("Peso ideal.");
        } else if (imc <= 29.9) {
            System.out.println("Levemente acima do peso.");
        } else if (imc <= 34.9) {
            System.out.println("Obesidade Grau I.");
        } else if (imc <= 39.9) {
            System.out.println("Obesidade Grau II (Severa).");
        } else {
            System.out.println("Obesidade III (Mórbida)");

        }
        sc.close();
    }
}
