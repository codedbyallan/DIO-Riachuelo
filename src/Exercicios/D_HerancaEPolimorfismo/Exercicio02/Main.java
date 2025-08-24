package Exercicios.D_HerancaEPolimorfismo.Exercicio02;

public class Main {
    public static void main(String[] args) {
        Atendente atendente = new Atendente("João", "joao@teste.com", "123456");
        Vendedor vendedor = new Vendedor("Alex", "alex@teste.com", "123456");
        Gerente gerente = new Gerente("Bruno", "bruno@teste.com", "123456");

        atendente.verCaixa();
        atendente.receberPagamento(1000);
        atendente.login("joao@teste.com","12345");
        atendente.login("joao@teste.com","123456");
        atendente.receberPagamento(3000);
        atendente.verCaixa();
        atendente.fecharCaixa();
        atendente.verCaixa();
    }
}
