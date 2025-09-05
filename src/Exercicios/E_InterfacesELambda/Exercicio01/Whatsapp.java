package Exercicios.E_InterfacesELambda.Exercicio01;

public class Whatsapp implements CentralDeMensagens {
    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("Enviando ZAP com a mensagem: " + mensagem);
    }

}

