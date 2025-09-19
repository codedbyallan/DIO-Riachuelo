package Exercicios.F_Collections;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa(new Endereco("Belo horizonte"));
        Pessoa p2 = new Pessoa(null);
        Pessoa p3 = null;
        Pessoa p4 = (new Pessoa(new Endereco(null)));

        System.out.println(resolveCidade(p1));
        System.out.println(resolveCidade(p2));
        System.out.println(resolveCidade(p3));
        System.out.println(resolveCidade(p4));
    }

    private static String resolveCidade(Pessoa pessoa) {
        return Optional.ofNullable(pessoa)
                .map(Pessoa::getEndereco)
                .map(Endereco::getCidade)
                .orElse("Cidade desconhecida");

    }
}