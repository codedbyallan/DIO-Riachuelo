package Exercicios.F_Collections.Exercicio01;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        System.out.println("=== Calculadora (SOMA / SUBTRACAO) ===\n");
        System.out.println("- Regras:");
        System.out.println("• Digite todos os numeros que deseja somar ou subtrair," +
                " separados por vírgula e ponto para decimais. Exemplo: 1, 2, 3.5, -4...");
        System.out.println("• Digite 'sair' para encerrar o programa.\n");

        while (true) {
            System.out.println("Escolha a operação (SOMA / SUBTRACAO): \n");
            String entradaOperacao = sc.nextLine().trim();

            if (entradaOperacao.equalsIgnoreCase("sair")) {
                System.out.println("Encerrando o programa. Até mais!");
                break;
            }

            Optional<Operacao> operacaoOpt = Operacao.fromString(entradaOperacao);
            if (operacaoOpt.isEmpty()) {
                System.out.println("Operação inválida. Tente novamente.");
                continue;
            }
//            Operacao op = operacaoOpt.get();
//            System.out.println("→ " + op.descricao());
//            System.out.println(operacaoOpt.get().descricao());
            System.out.printf("\n→ %s \n", operacaoOpt.get().descricao());

            var op = operacaoOpt.get();
            while (true) {
                System.out.print("Informe os números separados por vírgula (ou 'voltar' / 'sair'): ");
                String linha = sc.nextLine().trim();
                if (linha.equalsIgnoreCase("sair")) {
                    System.out.println("Encerrando o programa. Até mais!");
                    sc.close();
                    return;
                }
                if (linha.equalsIgnoreCase("voltar")) {
                    System.out.println("Voltando para escolher outra operação...\n");
                    break;
                }
                if (linha.isEmpty()) {
                    System.out.println("Entrada vazia. Tente novamente.");
                    continue;
                }

                String[] tokens = linha.split(",");
                List<BigDecimal> numeros = new ArrayList<>();
                boolean valido = true;

                for (String token : tokens) {
                    String t = token.trim();
                    if (t.isEmpty()) {
                        System.out.println("Número vazio entre vírgulas. Tente novamente.");
                        valido = false;
                        break;
                    }
                    if (!t.matches("[+-]?\\d+(\\.\\d+)?")) {
                        System.out.printf("Número inválido: %s. Tente novamente.\n", t);
                        valido = false;
                        break;
                    }
                    numeros.add(new BigDecimal(t));
                }
                if (!valido || numeros.isEmpty()) {
                    System.out.println("Nenhum número válido encontrado. Tente novamente.");
                    continue;
                }
                BigDecimal resultado = (op == Operacao.SOMA)
                        ? Calculadora.somar(numeros)
                        : Calculadora.subtrair(numeros);
                System.out.println("Resultado: " + resultado.stripTrailingZeros().toPlainString() + "\n");
                break;
            }

        }
    }
}
