package Exercicios.D_HerancaEPolimorfismo.Exercicio03;

public class RelogioBrasileiro extends Relogio {

    public RelogioBrasileiro(int hora, int minuto, int segundo) {
        super(hora, minuto, segundo);
    }

    @Override
    public void sincronizar(Relogio outro) {
        if (outro == null) throw new IllegalArgumentException("Relógio Inválido.");
        setHora(outro.getHora());
        setMinuto(outro.getMinuto());
        setSegundo(outro.getSegundo());
    }
}
