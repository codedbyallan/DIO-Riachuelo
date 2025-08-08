package Exercicios.B_CondicionaisELacos.Exercicio04;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {

        var sc = new Scanner(System.in);
        int contadorAluno = 1;
        var chakraMin = 10;
        System.out.println("O Chakra mínimo para realizar a técnica de clones é " + chakraMin + ".");

        while (true) {
            System.out.println("🌀 Aluno " + contadorAluno + ": \nInforme seu nível de Chakra: ");
            var chakra = sc.nextInt();

            if (chakra < chakraMin) {
                System.out.println("⚠️ Chakra muito fraco! Aluno ignorado.");
                continue;
            }
            if (chakra % chakraMin != 0) {
                System.out.println("❌ Falha na execução! Chakra incompatível. Treino encerrado.");
                break;
            }
            System.out.println("✅ Sucesso! Kage Bunshin no Jutsu executado com maestria!");
            contadorAluno++;
        }
        sc.close();
    }
}