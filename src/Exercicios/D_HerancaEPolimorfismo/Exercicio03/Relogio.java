package Exercicios.D_HerancaEPolimorfismo.Exercicio03;

public abstract class Relogio {
    private int hora;
    private int minuto;
    private int segundo;

    public Relogio(int hora, int minuto, int segundo) {
        setHora(hora);
        setMinuto(minuto);
        setSegundo(segundo);
    }

    public void setHora(int hora) {
        if (hora >= 0 && hora <= 23) {
            this.hora = hora;
        } else {
            throw new IllegalArgumentException("Hora inválida: " + hora + " (esperado 0..23)");
        }
    }

    public void setMinuto(int minuto) {
        if (minuto >= 0 && minuto <= 59) {
            this.minuto = minuto;
        } else {
            throw new IllegalArgumentException("Minuto inválido: " + minuto + " (esperado 0..59)");
        }
    }

    public void setSegundo(int segundo) {
        if (segundo >= 0 && segundo <= 59) {
            this.segundo = segundo;
        } else {
            throw new IllegalArgumentException("Segundo inválido: " + segundo + " (esperado 0..59)");
        }
    }

    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public String formatar() {
        return String.format("%02d:%02d:%02d", hora, minuto, segundo);
    }

    public void imprimirHora() {
        System.out.println(formatar());
    }

    public abstract void sincronizar(Relogio outro);

}