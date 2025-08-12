package Exercicios.C_EncapsulamentoEClasses.Exercicio02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        Carro meucarro = new Carro();
        int opcao;
        System.out.println("\nO seu carro dos sonhos acaba de chegar da concessionária!\n" +
                "O que você deseja fazer agora?\n\n" + meucarro.getMarcaModelo());
        meucarro.status();

        do {
            System.out.println("\n=== " + meucarro.getMarcaModelo() + " ===\n");
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
                    boolean ok;
                    if (opcao2 == 1) {
                        ok = meucarro.ligar();
                    } else if (opcao2 == 2) {
                        ok = meucarro.desligar();
                    } else {
                        System.out.println("Opção inválida.");
                        break;
                    }
                    if (ok) {
                        meucarro.status();
                    }
                    break;
                case 2:
                    System.out.println("Digite a opção:\n[1] - Acelerar\n[2] - Frear");
                    var opcao3 = sc.nextInt();
                    sc.nextLine();
                    boolean ok2;
                    if (opcao3 == 1) {
                        ok2 = meucarro.acelerar();
                    } else if (opcao3 == 2) {
                        ok2 = meucarro.reduzirVelocidade();
                    } else {
                        System.out.println("Opção inválida.");
                        break;
                    }
                    if (ok2) {
                        meucarro.status();
                    }
                    break;
                case 3:
                    System.out.println("Digite a opção:\n[1] - Subir Marcha\n[2] - Descer Marcha");
                    var opcao4 = sc.nextInt();
                    sc.nextLine();
                    boolean ok3;
                    if (opcao4 == 1) {
                        ok3 = meucarro.subirMarcha();
                    } else if (opcao4 == 2) {
                        ok3 = meucarro.descerMarcha();
                    } else {
                        System.out.println("Opção inválida.");
                        break;
                    }
                    if (ok3) {
                        meucarro.status();
                    }
                    break;
                case 4:
                    System.out.println("Digite a opção:\n[1] - Virar Esquerda\n[2] - Virar Direita");
                    var opcao5 = sc.nextInt();
                    boolean ok4;
                    sc.nextLine();
                    if (opcao5 == 1) {
                        ok4 = meucarro.virarEsquerda();
                    } else if (opcao5 == 2) {
                        ok4 = meucarro.virarDireita();
                    } else {
                        System.out.println("Opção inválida.");
                        break;
                    }
                    if (ok4) {
                        meucarro.status();
                    }
                    break;
                    case 5:
                        System.out.println("Encerrando ...");
                        break;
                default:
                    System.out.println("Opção inválida, tente novamente");
                    break;
            }

        } while (opcao != 5);
        sc.close();
    }
}

