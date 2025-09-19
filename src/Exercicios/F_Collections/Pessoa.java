package Exercicios.F_Collections;

public class Pessoa {
    private Endereco endereco;

    public Pessoa (Endereco endereco){
        this.endereco = endereco;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
