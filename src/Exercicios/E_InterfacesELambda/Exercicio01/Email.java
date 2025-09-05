package Exercicios.E_InterfacesELambda.Exercicio01;

public class Email implements CentralDeMensagens {
    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("Enviando e-mail com a mensagem: " + mensagem);    }
}
