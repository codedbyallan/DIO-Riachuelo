package Exercicios.D_HerancaEPolimorfismo.Exercicio01;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Ingresso> ingressos = new ArrayList<>();
        ingressos.add(new Ingresso(50, "Matrix", TipoAudio.LEGENDADO));
        ingressos.add(new MeiaEntrada(50, "Matrix", TipoAudio.LEGENDADO));
        ingressos.add(new IngressoFamilia(50, "Matrix", TipoAudio.DUBLADO, 3));
        ingressos.add(new IngressoFamilia(50, "Matrix", TipoAudio.DUBLADO, 4));

        for (Ingresso ingresso : ingressos) {
            System.out.println(ingresso.getNomeFilme() + " - " + ingresso.getTipoAudio() + " - "
                    + ingresso.getValorReal());
        }
    }
}
