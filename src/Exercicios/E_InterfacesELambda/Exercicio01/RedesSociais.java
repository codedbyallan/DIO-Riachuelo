package Exercicios.E_InterfacesELambda.Exercicio01;

public class RedesSociais implements CentralDeMensagens {
    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("Enviando direct's com a mensagem: " + mensagem);
    }

}
