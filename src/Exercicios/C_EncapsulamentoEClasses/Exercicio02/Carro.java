package Exercicios.C_EncapsulamentoEClasses.Exercicio02;

public class Carro {
    private static final int VEL_MAX = 120;
    private static final int VEL_MIN = 0;
    private static final int MARCHA_MIN = 0;
    private static final int MARCHA_MAX = 6;

    private boolean ligado;
    private int marcha;
    private int velocidade;
    public String marcaModelo = "NISSAN 370Z";

    public Carro() {
        this.ligado = false;
        this.marcha = 0;
        this.velocidade = 0;
    }

    public void ligar() {
        if (this.ligado) {
            System.out.println("O carro já está ligado.");
        } else {
            this.ligado = true;
            System.out.println("Carro ligado.");
        }
    }

    public void desligar() {
        if (!this.ligado) {
            System.out.println("O carro já está desligado");
        } else {
            if (marcha == MARCHA_MIN && velocidade == VEL_MIN) {
                this.ligado = false;
                System.out.println("Carro desligado.");
            } else {
                System.out.println("O carro precisa estar em ponto morto e velocidade 0 para ser desligado.");
            }
        }

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

    public boolean subirMarcha() {
        if (!exigirLigado("trocar marcha")) {
            return false;
        }
        if (marcha == MARCHA_MAX) {
            System.out.println("Essa é a última marcha.");
            return false;
        } else {
            marcha++;
            System.out.println("Marcha atual: " + marcha + "ª.");
            return true;
        }
    }

    public boolean descerMarcha() {
        if (!exigirLigado("trocar marcha")) {
            return false;
        }
        if (marcha == MARCHA_MIN) {
            System.out.println("Você está em ponto morto (0).");
            return false;
        } else {
            marcha--;
            System.out.println("Marcha atual: " + marcha + "ª.");
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
        System.out.printf("%nStatus:%nLigado: %s | Marcha: %d | Velocidade: %d km/h%n",
                ligado ? "sim" : "não", marcha, velocidade);
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
        if (velocidade < 1 || velocidade > 40) {
            System.out.println("Só é possível virar entre 1 e 40 km/h (atual: " + velocidade + " km/h).");
            return false;
        }
        return true;
    }


}
