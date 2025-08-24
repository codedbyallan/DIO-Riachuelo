package Exercicios.D_HerancaEPolimorfismo.Exercicio02;

public class Main {
    public static void main(String[] args) {
        Atendente atendente = new Atendente("João", "joao@teste.com", "123456");
        Vendedor vendedor = new Vendedor("Alex", "alex@teste.com", "123456");
        Gerente gerente = new Gerente("Bruno", "bruno@teste.com", "123456");
        System.out.println("\n-------- Atendente --------\n");
        atendente.logout();
        atendente.verCaixa();
        atendente.receberPagamento(1000);
        atendente.login("joao@teste.com","12345");
        atendente.login("joao@teste.com","123456");
        atendente.receberPagamento(3000);
        atendente.verCaixa();
        atendente.fecharCaixa();
        atendente.verCaixa();
        atendente.logout();
        atendente.verCaixa();
        atendente.receberPagamento(5000);

        System.out.println("\n-------- Vendedor --------\n");
        vendedor.logout();
        vendedor.consultarVendas();
        vendedor.realizarVenda();
        vendedor.login("alex@teste.com","12345");
        vendedor.login("alex@teste.com","123456");
        vendedor.consultarVendas();
        vendedor.realizarVenda();
        vendedor.consultarVendas();
        vendedor.logout();
        vendedor.consultarVendas();
        vendedor.realizarVenda();

        System.out.println("\n-------- Gerente --------\n");
        gerente.logout();
        gerente.consultarVendas();
        gerente.gerarRelatorioFinanceiro();
        gerente.login("bruno@teste.com","12345");
        gerente.login("bruno@teste.com","123456");
        gerente.consultarVendas();
        gerente.gerarRelatorioFinanceiro();
        gerente.logout();
        gerente.consultarVendas();
        gerente.gerarRelatorioFinanceiro();


    }
}
