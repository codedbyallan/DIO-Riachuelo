package Exercicios.D_HerancaEPolimorfismo.Exercicio02;

public class Vendedor extends Usuario {
    private int qtdVendas = 0;

    public Vendedor(String nome, String email, String senha) {
        super(nome, email, senha, false);
    }

    public void realizarVenda() {
        if (isAutenticado()) {
            this.qtdVendas++;
            System.out.println("Venda realizada com sucesso!");
        } else {
            System.out.println("Para realizar uma venda é necessário estar logado.");
        }
    }

    public void consultarVendas() {
        if (isAutenticado()) {
            System.out.println("Quantidade de vendas: " + qtdVendas);
        } else {
            System.out.println("Para consultar as vendas é necessário estar logado.");
        }
    }

    public int getQtdVendas() {
        return qtdVendas;
    }
}
