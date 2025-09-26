package Exercicios.F_Collections.Exercicio01;

import java.util.Optional;

public enum Operacao {

    SOMA, SUBTRACAO;

    public static Optional<Operacao> fromString(String entrada) {

        String padronizar = entrada.trim().toLowerCase();
        if(padronizar.equals("soma")) {
            return Optional.of(SOMA);
        } else if(padronizar.equals("subtracao")) {
            return Optional.of(SUBTRACAO);
        } else {
            return Optional.empty();
        }
    }

    public String descricao() {
        if (this == SOMA) {
            return "Soma todos os números informados";
        } else if (this == SUBTRACAO) {
            return "Subtrai todos os números informados a partir do primeiro";
        }else{
            throw new IllegalArgumentException("Operação desconhecida");
        }
    }

}