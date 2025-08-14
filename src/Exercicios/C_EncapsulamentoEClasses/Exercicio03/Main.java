package Exercicios.C_EncapsulamentoEClasses.Exercicio03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        MaquinaDeBanho maquina = new MaquinaDeBanho();
        int opcao;
        System.out.println("\n\n");
        System.out.println("""
                Bem-vindo. Esta é a XPET-5000XYZ. A Máquina perfeita para o banho do seu melhor amigo!\

                Esse é o Status atual da máquina:
                """);
        maquina.status();
        System.out.println("--------------------\n\n");
        do {

            System.out.println("🐾 XPET-5000XYZ - Escolha uma opção: 🐾 \n");
            System.out.println("1. Colocar/retirar Pet 🐈");
            System.out.println("2. Dar banho 🐹");
            System.out.println("3. Limpar Máquina 🐶");
            System.out.println("4. Insumos 🐓");
            System.out.println("5. Verificar disponibilidade da máquina 🐞");
            System.out.println("6. Finalizar 🐰\n");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("\nEscolha uma opção: \n1. Colocar Pet\n2. Retirar pet\n");
                    var opcao2 = sc.nextInt();
                    sc.nextLine();
                    boolean ok;
                    if (opcao2 == 1) {
                        System.out.println("\nDigite o nome do seu PET: \n");
                        var nomePet = sc.nextLine();
                        ok = maquina.colocarPet(nomePet);
                        System.out.println();
                    } else if (opcao2 == 2) {
                        ok = maquina.retirarPet();
                    } else {
                        System.out.println("Opção de menu inválida, tente novamente");
                        break;
                    }
                    if (ok) {
                        maquina.status();
                    }
                    System.out.println();
                    break;
                case 2:
                    maquina.darBanho();
                    maquina.status();
                    System.out.println();
                    break;
                case 3:
                    maquina.limparMaquina();
                    maquina.status();
                    System.out.println();
                    break;
                case 4: {
                    int opcao3;
                    do {
                        System.out.println(
                                """

                                        Escolha uma opção: \

                                        1. Verificar níveis de água\

                                        2. Verificar níveis de shampoo\

                                        3. Abastecer água\

                                        4. Abastecer shampoo\

                                        5. Voltar"""
                        );

                        opcao3 = sc.nextInt();
                        sc.nextLine();

                        if (opcao3 == 1) {
                            maquina.mostrarNivelAgua();
                        } else if (opcao3 == 2) {
                            maquina.mostrarNivelShampoo();
                        } else if (opcao3 == 3) {
                            maquina.abastecerAgua();
                        } else if (opcao3 == 4) {
                            maquina.abastecerShampoo();
                        } else if (opcao3 == 5) {
                            System.out.println("Voltando ao menu principal...");
                        } else {
                            System.out.println("Opção de menu inválida, tente novamente.");
                            continue;
                        }

                        if (opcao3 != 5) {
                            maquina.status();
                            System.out.println();
                        }

                    } while (opcao3 != 5);

                    break;
                }
                case 5:
                    maquina.isMaquinaDisponivel();
                    System.out.println();
                    break;
                case 6:
                    System.out.println("Encerrando aplicação. Obrigado por utilizar a XPET-5000XYZ.");
                    break;
                default:
                    System.out.println("Opção de menu inválida, tente novamente.");
                    break;
            }

        }
        while (opcao != 6);

        sc.close();
    }

}
