package Exercicios.D_HerancaEPolimorfismo.Exercicio02;

public class Atendente extends Usuario {
    private double valorEmCaixa = 0.0;

    public Atendente(String nome, String email, String senha) {
        super(nome, email, senha, false);
    }

    public void receberPagamento(double valor) {
        if (isAutenticado()) {
            if (valor > 0) {
                this.valorEmCaixa += valor;
                System.out.println("Pagamento recebido com sucesso!");
            } else {
                System.out.println("O pagamento deve ser superior a R$ 0,00.");
            }
        } else {
            System.out.println("Para receber um pagamento é necessário estar logado.");
        }
    }

    public double verCaixa() {
        if (!isAutenticado()) {
            System.out.println("Para visualizar o caixa é necessário estar logado.");
            return -1;
        }
        System.out.println("Consultando o caixa... Valor: R$ " + valorEmCaixa);
        return valorEmCaixa;
    }

    // * Cuidado ao chamar o método fecharCaixa(), pois ele zera o caixa para o próximo turno
    public double fecharCaixa() {
        if (!isAutenticado()) {
            System.out.println("Para fechar o caixa é necessário estar logado.");
            return -1;
        }
        double total = valorEmCaixa;
        System.out.println("Fechando caixa... Total: R$ " + total);
        valorEmCaixa = 0.0; // zera após fechar
        return total;
    }

    public double getValorEmCaixa() {
        return valorEmCaixa;
    }
}
