package Exercicios.D_HerancaEPolimorfismo.Exercicio01;

public class Ingresso {

    private final double valorBase;
    private final String nomeFilme;
    private TipoAudio tipoAudio;

    public Ingresso(double valor, String nomeFilme, TipoAudio tipoAudio) {
        this.valorBase = valor;
        this.nomeFilme = nomeFilme;
        this.tipoAudio = tipoAudio;
    }

    public double getValorBase() {
        return valorBase;
    }

    public String getNomeFilme() {
        return nomeFilme;
    }

    public TipoAudio getTipoAudio() {
        return tipoAudio;
    }

    public double getValorReal(){
        return valorBase;
    }
}