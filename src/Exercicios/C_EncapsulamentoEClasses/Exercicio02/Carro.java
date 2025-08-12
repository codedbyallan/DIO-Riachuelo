package Exercicios.C_EncapsulamentoEClasses.Exercicio02;

public class Carro {
    private static final int VEL_MAX = 120;
    private static final int VEL_MIN = 0;
    private static final int MARCHA_MIN = 0;
    private static final int MARCHA_MAX = 6;
    private static final int VIRAR_MIN = 1;
    private static final int VIRAR_MAX = 40;

    private boolean ligado;
    private int marcha;
    private int velocidade;
    private final String marcaModelo = "NISSAN 370Z";

    public Carro() {
        this.ligado = false;
        this.marcha = 0;
        this.velocidade = 0;
    }

    public String getMarcaModelo() {
        return marcaModelo;
    }


    public boolean ligar() {
        if (this.ligado) {
            System.out.println("O carro já está ligado.");
            return false;
        }
        this.ligado = true;
        System.out.println("Carro ligado.");
        return true;
    }

    public boolean desligar() {
        if (!this.ligado) {
            System.out.println("O carro já está desligado.");
            return false;
        }
        if (marcha != MARCHA_MIN || velocidade != VEL_MIN) {
            System.out.println("O carro precisa estar em ponto morto e velocidade 0 para ser desligado.");
            return false;
        }
        this.ligado = false;
        System.out.println("Carro desligado.");
        return true;
    }


    public boolean acelerar() {
        if (!exigirLigado("acelerar")) {
            return false;
        }
        if (marcha == MARCHA_MIN) {
            System.out.println("Em ponto morto não é possível acelerar.");
            return false;
        }
        int novaVelocidade = velocidade + 1;
        if (novaVelocidade > VEL_MAX) {
            System.out.println("Velocidade máxima atingida (" + VEL_MAX + " km/h).");
            return false;
        }
        if (!faixaValida(marcha, novaVelocidade)) {
            System.out.println("Troque de marcha para acelerar mais.");
            return false;
        }
        velocidade = novaVelocidade;
        System.out.println("Velocidade atual: " + velocidade + " km/h.");
        return true;
    }

    public boolean reduzirVelocidade() {
        if (!exigirLigado("reduzir velocidade")) {
            return false;
        }
        int novaVelocidade = velocidade - 1;
        if (novaVelocidade < VEL_MIN) {
            System.out.println("O carro já está parado.");
            return false;
        }
        velocidade = novaVelocidade;
        System.out.println("Velocidade atual: " + velocidade + " km/h.");
        return true;
    }

    private String marchaPorExtenso(int marcha) {
        switch (marcha) {
            case 0:
                return "ponto morto";
            case 1:
                return "primeira";
            case 2:
                return "segunda";
            case 3:
                return "terceira";
            case 4:
                return "quarta";
            case 5:
                return "quinta";
            case 6:
                return "sexta";
            default:
                return "desconhecida"; // segurança
        }
    }

    public boolean subirMarcha() {
        if (!exigirLigado("trocar marcha")) {
            return false;
        }
        if (marcha == MARCHA_MAX) {
            System.out.println("Essa é a última marcha.");
            return false;
        } else {
            marcha++;
            System.out.println("Marcha atual: " + marchaPorExtenso(marcha) + ".");
            return true;
        }
    }

    public boolean descerMarcha() {
        if (!exigirLigado("trocar marcha")) {
            return false;
        }
        if (marcha == MARCHA_MIN) {
            System.out.println("Você já está em " + marchaPorExtenso(MARCHA_MIN) + " (0).");
            return false;
        } else {
            marcha--;
            System.out.println("Marcha atual: " + marchaPorExtenso(marcha) + ".");
            return true;
        }
    }

    public boolean virarEsquerda() {
        if (!exigirLigado("virar esquerda")) {
            return false;
        }
        if (!podeVirar()) {
            return false;
        }
        System.out.println("Virando para a esquerda.");
        return true;
    }

    public boolean virarDireita() {
        if (!exigirLigado("virar direita")) {
            return false;
        }
        if (!podeVirar()) {
            return false;
        }
        System.out.println("Virando para a direita.");
        return true;
    }

    public void status() {
        System.out.printf("%nStatus:%nLigado: %s | Marcha: %s | Velocidade: %d km/h%n",
                ligado ? "sim" : "não", marchaPorExtenso(marcha), velocidade);
    }

    private boolean faixaValida(int marcha, int velocidade) {
        if (marcha == 1) {
            return velocidade >= VEL_MIN && velocidade <= 20;
        }
        if (marcha == 2) {
            return velocidade >= 21 && velocidade <= 40;
        }
        if (marcha == 3) {
            return velocidade >= 41 && velocidade <= 60;
        }
        if (marcha == 4) {
            return velocidade >= 61 && velocidade <= 80;
        }
        if (marcha == 5) {
            return velocidade >= 81 && velocidade <= 100;
        }
        if (marcha == 6) {
            return velocidade >= 101 && velocidade <= VEL_MAX;
        }
        return false;
    }

    private boolean exigirLigado(String acao) {
        if (!this.ligado) {
            System.out.println("Não é possível " + acao + " com o carro desligado.");
            return false;
        }
        return true;
    }

    private boolean podeVirar() {
        if (velocidade < VIRAR_MIN || velocidade > VIRAR_MAX) {
            System.out.println("Só é possível virar entre " + VIRAR_MIN + " e " + VIRAR_MAX +
                    " km/h (atual: " + velocidade + " km/h).");
            return false;
        }
        return true;
    }


}
