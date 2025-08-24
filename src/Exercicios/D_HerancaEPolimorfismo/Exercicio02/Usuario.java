package Exercicios.D_HerancaEPolimorfismo.Exercicio02;

public class Usuario {
    private String nome;
    private String email;
    private String senha;
    private final boolean isAdministrador;
    private boolean autenticado = false;

    public Usuario(String nome, String email, String senha, boolean isAdministrador) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.isAdministrador = isAdministrador;

    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public boolean isAdministrador() {
        return isAdministrador;
    }

    public void login(String email, String senha) {
        if (senha.equals(this.senha)) {
            this.autenticado = true;
            System.out.println("Login efetuado com sucesso!");
        } else {
            this.autenticado = false;
            System.out.println("Senha incorreta! Tente novamente.");
        }
    }

    public void logout() {
        autenticado = false;
        System.out.println("Logout efetuado com sucesso!");
    }

    public void alterarDados(String novoNome, String novoEmail) {
        if (autenticado) {
            this.nome = novoNome;
            this.email = novoEmail;
            System.out.println("Dados alterados com sucesso!");
        } else {
            System.out.println("É necessário estar autenticado para alterar os dados!");
        }
    }

    public void alterarSenha(String senhaAtual, String novaSenha) {
        if (autenticado) {
            if (senhaAtual.equals(this.senha)) {
                this.senha = novaSenha;
                System.out.println("Senha alterada com sucesso!");
            } else {
                System.out.println("Senha incorreta! Tente novamente.");
            }
        } else {
            System.out.println("É necessário estar autenticado para alterar a senha!");
        }
    }

    public boolean isAutenticado (){
        return autenticado;
    }
}
