package Exercicios.E_InterfacesELambda.Exercicio03;

public class Retangulo implements FiguraGeometrica {
    private final double base, altura;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return  base * altura;
    }

}
