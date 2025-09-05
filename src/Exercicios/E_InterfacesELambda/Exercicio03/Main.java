package Exercicios.E_InterfacesELambda.Exercicio03;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<FiguraGeometrica> figuras  = new ArrayList<>();
        figuras.add(new Circulo(10));
        figuras.add(new Quadrado(5));
        figuras.add(new Retangulo(2,4));

        for (FiguraGeometrica figura : figuras) {
            System.out.printf("A área do %s é de %.2f cm²%n",figura.getClass().getSimpleName(),figura.calcularArea());
        }
    }
}
