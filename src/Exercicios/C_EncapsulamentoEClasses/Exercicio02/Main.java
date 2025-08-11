package Exercicios.C_EncapsulamentoEClasses.Exercicio02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        Carro meucarro = new Carro();
        int opcao;
        System.out.println("\nO seu carro dos sonhos acaba de chegar da concessionária!\n" +
                "O que você deseja fazer agora?\n\n" + meucarro.marcaModelo);
        meucarro.status();

        do {
            System.out.println("\n=== " + meucarro.marcaModelo + " ===\n");
            System.out.println("1. [MOTOR] Ligar / Desligar");
            System.out.println("2. [ACELERAÇÃO] Acelerar / Frear");
            System.out.println("3. [TRANSMISSÃO] Subir / Descer Marcha");
            System.out.println("4. [DIREÇÃO] Virar Esquerda / Direita");
            System.out.println("5. Sair\n");
            System.out.println("Digite a opção desejada: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Digite a opção:\n[1] - Ligar\n[2] - Desligar");
                    var opcao2 = sc.nextInt();
                    sc.nextLine();
                    if (opcao2 == 1) {
                        meucarro.ligar();
                    } else {
                        meucarro.desligar();
                    }
                    meucarro.status();
                    break;
                case 2:
                    System.out.println("Digite a opção:\n[1] - Acelerar\n[2] - Frear");
                    var opcao3 = sc.nextInt();
                    sc.nextLine();
                    if (opcao3 == 1) {
                        meucarro.acelerar();
                    } else {
                        meucarro.reduzirVelocidade();
                    }
                    meucarro.status();
                    break;
                case 3:
                    System.out.println("Digite a opção:\n[1] - Subir Marcha\n[2] - Descer Marcha");
                    var opcao4 = sc.nextInt();
                    sc.nextLine();
                    if (opcao4 == 1) {
                        meucarro.subirMarcha();
                    } else {
                        meucarro.descerMarcha();
                    }
                    meucarro.status();
                    break;
                case 4:
                    System.out.println("Digite a opção:\n[1] - Virar Esquerda\n[2] - Virar Direita");
                    var opcao5 = sc.nextInt();
                    sc.nextLine();
                    if (opcao5 == 1) {
                        meucarro.virarEsquerda();
                    } else {
                        meucarro.virarDireita();
                    }
                    meucarro.status();
                    break;

            }
        } while (opcao != 5);
    }
}

