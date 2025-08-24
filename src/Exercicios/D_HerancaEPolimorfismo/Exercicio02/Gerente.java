package Exercicios.D_HerancaEPolimorfismo.Exercicio02;

public class Gerente extends Usuario {
    public Gerente(String nome, String email, String senha) {
        super(nome, email, senha, true);
    }

    public void gerarRelatorioFinanceiro() {
        if (isAutenticado()) {
            System.out.println("Gerando relatório financeiro...");
        } else {
            System.out.println("Para gerar o relatório financeiro é necessario estar logado.");
        }
    }

    public void consultarVendas() {
        if (isAutenticado()) {
            System.out.println("Consultando vendas...");
        } else {
            System.out.println("Para consultar as vendas é necessario estar logado.");
        }
    }
}