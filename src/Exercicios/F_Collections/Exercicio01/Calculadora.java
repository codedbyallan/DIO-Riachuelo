package Exercicios.F_Collections.Exercicio01;

import java.math.BigDecimal;
import java.util.List;

public class Calculadora {
    public static BigDecimal somar (List<BigDecimal> numeros){
        if (numeros == null || numeros.isEmpty()){
            throw new IllegalArgumentException("A lista de números não pode ser nula ou vazia");
        }
//        BigDecimal soma = BigDecimal.ZERO;
//        for (BigDecimal numero : numeros){
//            soma = soma.add(numero);
//        }
//        return soma;
        BigDecimal soma = numeros.stream()
                .reduce(BigDecimal.ZERO, BigDecimal::add);
                return soma;
    }

    public static BigDecimal subtrair (List<BigDecimal> numeros){
        if (numeros == null || numeros.isEmpty()){
            throw new IllegalArgumentException("A lista de números não pode ser nula ou vazia");
        }
//        BigDecimal subtracao = numeros.get(0);
//        for (int i = 1; i < numeros.size(); i++){
//            subtracao = subtracao.subtract(numeros.get(i));
//        }
//        return subtracao;
        BigDecimal subtracao = numeros.stream()
                .skip(1)
                .reduce (numeros.get(0), BigDecimal::subtract);
        return subtracao;
    }
}
