package Exercicios.D_HerancaEPolimorfismo.Exercicio03;

public class Main {
    public static void main(String[] args) {
        RelogioAmericano relogioAmericano1 = new RelogioAmericano(0,5,9);
        RelogioAmericano relogioAmericano2 = new RelogioAmericano(3,5,9);
        RelogioAmericano relogioAmericano3 = new RelogioAmericano(12,0,0);
        RelogioAmericano relogioAmericano4 = new RelogioAmericano(15,30,0);
        System.out.println(relogioAmericano1.formatar());
        System.out.println(relogioAmericano2.formatar());
        System.out.println(relogioAmericano3.formatar());
        System.out.println(relogioAmericano4.formatar());
        System.out.println("______________");

        RelogioBrasileiro br = new RelogioBrasileiro(23,15,10);
        RelogioAmericano us = new RelogioAmericano(0,0,0);
        us.sincronizar(br);
        System.out.println(us.formatar());
        System.out.println(br.formatar());
        System.out.println("______________");

        RelogioAmericano us1 = new RelogioAmericano(13,0,0);
        RelogioBrasileiro br1 = new RelogioBrasileiro(13,0,0);
        br1.sincronizar(us1);
        System.out.println(us1.formatar());
        System.out.println(br1.formatar());

        System.out.println("----------------");
        System.out.println("TESTES:");
        System.out.println();
        RelogioAmericano us2 = new RelogioAmericano(23,15,10);
        RelogioBrasileiro br2 = new RelogioBrasileiro(0,0,0);
        System.out.println("antes: " + us2.formatar());
        us2.sincronizar(br2);
        System.out.println("DEPOIS: " + us2.formatar());
    }
}
