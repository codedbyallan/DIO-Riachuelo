package Exercicios.C_EncapsulamentoEClasses.Exercicio01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        System.out.println("\n### Cadastrar nova conta bancária ###\n");
        System.out.println("Digite o nome completo do titular da conta:");
        String titular = sc.nextLine();
        System.out.println("Digite o número da conta: ");
        String numero = sc.nextLine();
        System.out.println("Digite a agência da conta: ");
        String agencia = sc.nextLine();
        System.out.println("Digite o valor do depósito inicial: ");
        double depositoInicial = sc.nextDouble();
        sc.nextLine();
        ContaBancaria contausuario = new ContaBancaria(titular, numero, agencia, depositoInicial);
        int opcao;

        do {
            System.out.println("\n=== Banco do Brasil ===\n");
            System.out.println("1. Consultar Saldo");
            System.out.println("2. Consultar dados cheque especial");
            System.out.println("3. Depositar");
            System.out.println("4. Sacar");
            System.out.println("5. Pagar boleto");
            System.out.println("6. Sair\n");
            System.out.println("Digite a opção desejada: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.printf("Seu saldo é de R$ %.2f%n", contausuario.getSaldo());
                    System.out.println("------------------------");
                    break;
                case 2:
                    System.out.println("\n### Cheque Especial ###\n");
                    System.out.println("[1] Consultar limite");
                    System.out.println("[2] Consultar saldo cheque especial disponível");
                    System.out.println("[3] Consultar valor utilizado do cheque especial");
                    System.out.println("[4] Status do cheque especial");
                    System.out.println("[5] Exibir taxa pendente");
                    System.out.println("[6] Exibir todas as informações");
                    System.out.println("------------------------");
                    final int opcao2 = sc.nextInt();
                    sc.nextLine();

                    if (opcao2 == 1) {
                        System.out.printf("O seu limite para cheque especial é de R$ %.2f%n", contausuario.getLimiteChequeEspecial());
                        System.out.println("------------------------");
                    } else if (opcao2 == 2) {
                        System.out.printf("O saldo disponível do cheque especial é de R$ %.2f%n", contausuario.getChequeEspecialDisponivel());
                        System.out.println("------------------------");
                    } else if (opcao2 == 3) {
                        System.out.printf("O valor utilizado do cheque especial até agora é de R$ %.2f%n", contausuario.getChequeEspecialUsado());
                        System.out.println("------------------------");
                    } else if (opcao2 == 4) {
                        if (contausuario.isUsandoChequeEspecial()) {
                            System.out.println("Você está no cheque especial.");
                        } else {
                            System.out.println("O cheque especial não foi utilizado.");
                        }
                        System.out.println("------------------------");
                    } else if (opcao2 == 5) {
                        System.out.printf("A Taxa pendente do cheque especial é de R$ %.2f%n", contausuario.getTaxaPendente());
                        System.out.println("------------------------");
                    } else if (opcao2 == 6) {
                        System.out.println("\n### Cheque Especial ###\n");
                        System.out.printf("Limite: R$ %.2f%n", contausuario.getLimiteChequeEspecial());
                        System.out.printf("Saldo disponível: R$ %.2f%n", contausuario.getChequeEspecialDisponivel());
                        System.out.printf("Saldo utilizado: R$ %.2f%n", contausuario.getChequeEspecialUsado());
                        boolean usando = contausuario.isUsandoChequeEspecial();
                        System.out.println("Status: " + (usando ? "Você está no cheque especial." : "O cheque especial não foi utilizado."));
                        System.out.printf("Taxa pendente: R$ %.2f%n", contausuario.getTaxaPendente());
                        System.out.println("------------------------");
                        System.out.println();

                    } else {
                        System.out.println("Opção inválida, tente novamente.");
                        System.out.println("------------------------");

                    }
                    break;
                case 3:
                    System.out.println("Digite o valor do depósito: ");
                    double valor = sc.nextDouble();
                    sc.nextLine();
                    if (valor <= 0) {
                        System.out.println("Valor inválido para depósito.");
                        System.out.println("------------------------");
                    } else {
                        contausuario.depositar(valor);
                        System.out.printf("Saldo em conta: R$ %.2f%n", contausuario.getSaldo());
                        System.out.printf("Cheque especial utilizado: R$ %.2f%n", contausuario.getChequeEspecialUsado());
                        System.out.printf("Cheque especial disponível: R$ %.2f%n", contausuario.getChequeEspecialDisponivel());
                        System.out.printf("Taxa pendente: R$ %.2f%n", contausuario.getTaxaPendente());
                        System.out.println("------------------------");
                        System.out.println();
                    }
                    break;
                case 4:
                    System.out.println("Digite o valor do saque: ");
                    double valor2 = sc.nextDouble();
                    sc.nextLine();
                    if (valor2 <= 0) {
                        System.out.println("Valor inválido para saque.");
                        System.out.println("------------------------");
                    } else {
                        contausuario.sacar(valor2);
                        System.out.printf("Saldo em conta: R$ %.2f%n", contausuario.getSaldo());
                        System.out.printf("Cheque especial utilizado: R$ %.2f%n", contausuario.getChequeEspecialUsado());
                        System.out.printf("Cheque especial disponível: R$ %.2f%n", contausuario.getChequeEspecialDisponivel());
                        System.out.printf("Taxa pendente: R$ %.2f%n", contausuario.getTaxaPendente());
                        System.out.println("------------------------");
                        System.out.println();
                    }
                    break;
                case 5:
                    System.out.println("Digite o valor do boleto: ");
                    double valor3 = sc.nextDouble();
                    sc.nextLine();
                    if (valor3 <= 0) {
                        System.out.println("Valor inválido para pagamento de boleto.");
                        System.out.println("------------------------");
                    } else {
                        contausuario.pagarBoleto(valor3);
                        System.out.printf("Saldo em conta: R$ %.2f%n", contausuario.getSaldo());
                        System.out.printf("Cheque especial utilizado: R$ %.2f%n", contausuario.getChequeEspecialUsado());
                        System.out.printf("Cheque especial disponível: R$ %.2f%n", contausuario.getChequeEspecialDisponivel());
                        System.out.printf("Taxa pendente: R$ %.2f%n", contausuario.getTaxaPendente());
                        System.out.println("------------------------");
                        System.out.println();
                    }
                    break;
                case 6:
                    System.out.println("Encerrando. . .");
                    break;
                default:
                    System.out.println("Opção inválida, insira uma opção novamente.");
                    break;
            }
        } while (opcao != 6);
        sc.close();
    }
}