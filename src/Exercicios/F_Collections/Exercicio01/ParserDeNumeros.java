package Exercicios.F_Collections.Exercicio01;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ParserDeNumeros {
    public static List<BigDecimal> parse(String linha) throws IllegalArgumentException {
        if (linha == null || linha.trim().isEmpty()) {
            throw new IllegalArgumentException("A linha não pode ser nula ou vazia");
        }
        String[] tokens = linha.split(",");
        List<BigDecimal> numeros = new ArrayList<>();
        for (String token : tokens) {
            String t = token.trim();
            if (t.isEmpty()){
                throw new IllegalArgumentException("Número vazio entre vírgulas");
            }
            if (!t.matches("[+-]?\\d+(\\.\\d+)?")) {
                throw new IllegalArgumentException("Número inválido: " + t);
            }
            numeros.add(new BigDecimal(t));
            }
        if(numeros.isEmpty()){
            throw new IllegalArgumentException("Nenhum número válido encontrado");
        }
        return numeros;
    }
    }
