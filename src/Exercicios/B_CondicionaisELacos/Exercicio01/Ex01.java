package Exercicios.B_CondicionaisELacos.Exercicio01;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        System.out.println("### Tabuada ###\n");
        System.out.println("Digite o número da tabuada que você deseja: ");
        var numero = sc.nextInt();
        System.out.println("A tabuada do " + numero + " é: ");
        for (int i = 1; i < 10; i++) {
            System.out.println(numero + " * " + i + " = " + (numero * i));
        }
        sc.close();
    }
}
