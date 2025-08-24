package Exercicios.D_HerancaEPolimorfismo.Exercicio01;

public class MeiaEntrada extends Ingresso {
    public MeiaEntrada(double valor, String nomeFilme, TipoAudio tipoAudio) {
        super(valor, nomeFilme, tipoAudio);
    }

    @Override
    public double getValorReal() {
        return getValorBase() / 2;
    }

}
