package Exercicios.D_HerancaEPolimorfismo.Exercicio03;

public class RelogioAmericano extends Relogio {
    public RelogioAmericano(int hora, int minutos, int segundos) {
        super(hora, minutos, segundos);
    }

    @Override
    public void sincronizar(Relogio outro) {
        if (outro == null) throw new IllegalArgumentException("Relógio Inválido.");
        setHora(outro.getHora());
        setMinuto(outro.getMinuto());
        setSegundo(outro.getSegundo());
    }

    @Override
    public String formatar() {
        int h = getHora();
        int m = getMinuto();
        int s = getSegundo();

        int hora12;
        String sufixo;

        if (h == 0) {
            hora12 = 12;
            sufixo = "AM";
        } else if (h < 12) {
            hora12 = h;
            sufixo = "AM";
        } else if (h == 12) {
            hora12 = 12;
            sufixo = "PM";
        } else {
            hora12 = h - 12;
            sufixo = "PM";
        }
        return String.format("%02d:%02d:%02d %s", hora12, m, s, sufixo);
    }
}
