package Exercicios.E_InterfacesELambda.Exercicio02;

public class Saude implements Tributos {
    private static final double taxa = 0.015;

    @Override
    public void calcularImposto(double valorDoProduto){
        System.out.printf("A cada R$%.2f, o imposto do gênero %s será de R$%.2f%n",
                valorDoProduto, this.getClass().getSimpleName(), valorDoProduto * taxa);
    }
}
