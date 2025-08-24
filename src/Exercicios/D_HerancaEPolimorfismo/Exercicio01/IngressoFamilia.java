package Exercicios.D_HerancaEPolimorfismo.Exercicio01;

public class IngressoFamilia extends Ingresso {
    int qtdPessoas;

    public IngressoFamilia(double valor, String nomeFilme, TipoAudio tipoAudio, int qtdPessoas) {
        super(valor, nomeFilme, tipoAudio);
        this.qtdPessoas = qtdPessoas;
    }

    public int getQtdPessoas() {
        return qtdPessoas;
    }

    @Override
    public double getValorReal() {
        double total = getValorBase() * qtdPessoas;
        if (qtdPessoas > 3) {
            return total *= 0.95;
        }
        return total;
    }
}