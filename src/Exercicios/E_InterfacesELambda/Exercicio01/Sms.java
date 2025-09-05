package Exercicios.E_InterfacesELambda.Exercicio01;

public class Sms implements CentralDeMensagens {
    public void enviarMensagem(String mensagem) {
        System.out.println("Enviando SMS com a mensagem: " + mensagem);
    }

}

