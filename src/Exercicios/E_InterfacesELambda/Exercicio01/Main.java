package Exercicios.E_InterfacesELambda.Exercicio01;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String mensagem = "Mensagem padrão de marketing de vendas";
        List<CentralDeMensagens> canais = new ArrayList<>();
        canais.add(new Email());
        canais.add(new RedesSociais());
        canais.add(new Sms());
        canais.add(new Whatsapp());

        for (CentralDeMensagens canal : canais) {
            canal.enviarMensagem(mensagem);
        }
    }
}
