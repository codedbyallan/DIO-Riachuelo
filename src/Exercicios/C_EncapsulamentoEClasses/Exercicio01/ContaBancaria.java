package Exercicios.C_EncapsulamentoEClasses.Exercicio01;

public class ContaBancaria {
    private final String titular;
    private final String conta;
    private final String agencia;
    private double saldo;
    private final double chequeEspecialLimite;
    private double chequeEspecialUsado = 0.0;
    private double taxaPendente = 0.0;

    public ContaBancaria(String titular, String conta, String agencia, double depositoInicial) {
        this.titular = titular;
        this.conta = conta;
        this.agencia = agencia;
        this.saldo = depositoInicial;
        if (depositoInicial <= 500) {
            this.chequeEspecialLimite = 50.0;
        } else {
            this.chequeEspecialLimite = depositoInicial * 0.5;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public double getLimiteChequeEspecial() {
        return chequeEspecialLimite;
    }

    public double getChequeEspecialDisponivel() {
        return chequeEspecialLimite - chequeEspecialUsado;
    }

    public double getChequeEspecialUsado() {
        return chequeEspecialUsado;
    }

    public boolean isUsandoChequeEspecial() {
        return chequeEspecialUsado > 0;
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor invalido");
            return;
        }
        double restante = valor;
        if (taxaPendente > 0) {
            double pago = Math.min(restante, taxaPendente);
            taxaPendente -= pago;
            restante -= pago;
        }
        if (chequeEspecialUsado > 0) {
            double devolvido = Math.min(restante, chequeEspecialUsado);
            chequeEspecialUsado -= devolvido;
            restante -= devolvido;
        }
        if (restante > 0) {
            saldo += restante;
        }
    }

    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor invalido");
            return;
        }
        double disponivel = saldo + (chequeEspecialLimite - chequeEspecialUsado);
        if (valor > disponivel) {
            System.out.println("Saldo insuficiente");
            return;
        }
        if (valor <= saldo) {
            saldo -= valor;
            return;
        }
        double restante = valor - saldo;
        saldo = 0;
        chequeEspecialUsado += restante;
        taxaPendente += restante * 0.20;
    }

    public void pagarBoleto(double valor){
        sacar(valor);
    }
    public double getTaxaPendente() {
        return taxaPendente;
    }

}
