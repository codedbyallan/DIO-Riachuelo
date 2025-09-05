package Exercicios.E_InterfacesELambda.Exercicio02;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        double valorDoProduto = 100.00;

        List<Tributos> produtos = new ArrayList<>();

        produtos.add(new Vestuario());
        produtos.add(new Saude());
        produtos.add(new Alimentacao());
        produtos.add(new Cultura());

        for (Tributos produto : produtos) {
            produto.calcularImposto(valorDoProduto);
        }
    }
}