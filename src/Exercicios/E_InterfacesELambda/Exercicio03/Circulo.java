package Exercicios.E_InterfacesELambda.Exercicio03;

public class Circulo implements FiguraGeometrica {
    private final double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }
}