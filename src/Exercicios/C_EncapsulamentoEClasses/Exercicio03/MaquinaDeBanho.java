package Exercicios.C_EncapsulamentoEClasses.Exercicio03;

/*
Passos:
1. Atributos classe; ✔️
2. Construtores;
3. Métodos;
4. Main
 */

public class MaquinaDeBanho {
    private static final int CONSUMO_BANHO_AGUA = 10;
    private static final int CONSUMO_BANHO_SHAMPOO = 2;
    private static final int CAP_MAX_AGUA = 30;
    private static final int CAP_MAX_SHAMPOO = 10;
    private static final int LIMPEZA_MAQUINA_AGUA = 3;
    private static final int LIMPEZA_MAQUINA_SHAMPOO = 1;
    private static final int ABASTECIMENTO = 2;


    private String nomePetAtual = "";
    private int banhosRealizados;
    private int reservatorioAgua;
    private int reservatorioShampoo;
    private boolean temPet;
    private boolean precisaLimpeza;
    private boolean banhoConcluido;

    public MaquinaDeBanho() {
        this.banhosRealizados = 0;
        this.reservatorioAgua = CAP_MAX_AGUA;
        this.reservatorioShampoo = CAP_MAX_SHAMPOO;
        this.temPet = false;
        this.precisaLimpeza = false;
        this.banhoConcluido = false;
    }

    public String getNomePetAtual() {
        return nomePetAtual;
    }

    // 1) Colocar pet na máquina:
    public boolean colocarPet(String nome) {
        if (temPet) {
            System.out.println("A máquina já está ocupada com outro pet.");
            return false;
        }
        if (precisaLimpeza) {
            System.out.println("A máquina está suja. É necessário limpá-la antes de colocar outro pet.");
            return false;
        }
        temPet = true;
        banhoConcluido = false;
        nomePetAtual = (nome == null ? "" : nome.trim());
        System.out.println("Pet " + (nomePetAtual.isEmpty() ? "(sem nome)" : nomePetAtual) + " foi colocado na máquina.");
        return true;

    }

    // 2) Dar banho no pet:
    public boolean darBanho() {
        if (!temPet) {
            System.out.println("Não há pet na máquina para dar banho.");
            return false;
        }
        if (reservatorioAgua < CONSUMO_BANHO_AGUA) {
            System.out.println("Água insuficiente para o banho. Nível atual: " + reservatorioAgua + " litros.");
            return false;
        }
        if (reservatorioShampoo < CONSUMO_BANHO_SHAMPOO) {
            System.out.println("Shampoo insuficiente para o banho. Nível atual: " + reservatorioShampoo + " litros.");

            return false;
        }
        reservatorioAgua -= CONSUMO_BANHO_AGUA;
        reservatorioShampoo -= CONSUMO_BANHO_SHAMPOO;
        banhoConcluido = true;
        banhosRealizados++;
        System.out.println("Banho concluído para o pet " + (nomePetAtual.isEmpty() ? "(sem nome)" : nomePetAtual) + ".");
        return true;
    }

    // 3) Retirar pet da máquina
    public boolean retirarPet() {
        if (!temPet) {
            System.out.println("Não há pet na máquina para retirar.");
            return false;
        }
        if (!banhoConcluido) {
            precisaLimpeza = true;
            temPet = false;
            banhoConcluido = false;
            System.out.println("Pet " + (nomePetAtual.isEmpty() ? "(sem nome)" : nomePetAtual)
                    + " foi retirado sem banho. A máquina agora precisa de limpeza.");
            nomePetAtual = "";
            return true;
        }
        precisaLimpeza = false;
        temPet = false;
        banhoConcluido = false;
        System.out.println("Pet " + (nomePetAtual.isEmpty() ? "(sem nome)" : nomePetAtual)
                + " foi retirado após o banho. A máquina está livre.");
        nomePetAtual = "";
        return true;
    }

    // 4) Limpar a máquina
    public boolean limparMaquina() {
        if (temPet) {
            System.out.println("Retire o pet antes de limpar a máquina.");
            return false;
        }
        if (!precisaLimpeza) {
            System.out.println("A máquina já está limpa.");
            return false;
        }
        if (reservatorioAgua < LIMPEZA_MAQUINA_AGUA) {
            System.out.println("Água insuficiente para limpeza. Atual: " + reservatorioAgua + "L");
            return false;
        }
        if (reservatorioShampoo < LIMPEZA_MAQUINA_SHAMPOO) {
            System.out.println("Shampoo insuficiente para limpeza. Atual: " + reservatorioShampoo + "L");
            return false;
        }
        reservatorioAgua -= LIMPEZA_MAQUINA_AGUA;
        reservatorioShampoo -= LIMPEZA_MAQUINA_SHAMPOO;
        precisaLimpeza = false;
        System.out.println("Limpeza concluída.\nMáquina liberada.\nNíveis → Água: " + reservatorioAgua +
                " L\nShampoo:" + reservatorioShampoo + " L");
        return true;
    }

    // 5) Abastecer com água (2L por acionamento)
    public boolean abastecerAgua() {
        if (reservatorioAgua >= CAP_MAX_AGUA) {
            System.out.println("O reservatório de água já está cheio.");
            return false;
        }
        int falta = CAP_MAX_AGUA - reservatorioAgua;
        int incremento = Math.min(ABASTECIMENTO, falta);
        reservatorioAgua += incremento;
        System.out.println("Água abastecida em " + incremento + "L. Nível atual: "
                + reservatorioAgua + "/" + CAP_MAX_AGUA + "L.");
        return true;
    }

    // 6) Abastecer com shampoo (2L por acionamento)
    public boolean abastecerShampoo() {
        if (reservatorioShampoo >= CAP_MAX_SHAMPOO) {
            System.out.println("O reservatório de shampoo já está cheio.");
            return false;
        }
        int falta = CAP_MAX_SHAMPOO - reservatorioShampoo;
        int incremento = Math.min(ABASTECIMENTO, falta);
        reservatorioShampoo += incremento;
        System.out.println("Shampoo abastecido em " + incremento + "L. Nível atual: "
                + reservatorioShampoo + "/" + CAP_MAX_SHAMPOO + "L.");
        return true;
    }

    // 7) Verificar nível de água
    public void mostrarNivelAgua() {
        System.out.println("O nível de água atual é " + reservatorioAgua + "/" + CAP_MAX_AGUA + "L");
    }

    // 8) Verificar nível de shampoo
    public void mostrarNivelShampoo() {
        System.out.println("O nível de shampoo atual é " + reservatorioShampoo + "/" + CAP_MAX_SHAMPOO + "L");
    }

    public boolean verificarPet() {
        if (temPet) {
            System.out.println("Há um pet na máquina.");
        } else {
            System.out.println("Não há pet na máquina.");
        }
        return temPet;
    }

    public void status() {
        System.out.println("Status da Máquina:\n" +
                "- Pet na máquina: " + (temPet ? "Sim (" + (nomePetAtual.isEmpty() ? "sem nome" : nomePetAtual) + ")" : "Não") + "\n" +
                "- Precisa limpeza: " + (precisaLimpeza ? "Sim" : "Não") + "\n" +
                "- Banho concluído: " + (banhoConcluido ? "Sim" : "Não") + "\n" +
                "- Nível de água: " + reservatorioAgua + "/" + CAP_MAX_AGUA + " L\n" +
                "- Nível de shampoo: " + reservatorioShampoo + "/" + CAP_MAX_SHAMPOO + " L\n" +
                "- Banhos realizados: " + banhosRealizados);
    }

    public boolean isMaquinaDisponivel() {
        if (temPet) {
            System.out.println("Máquina indisponível, há um pet na máquina.");
            return false;
        }
        if (precisaLimpeza) {
            System.out.println("A máquina precisa de limpeza antes de colocar um pet.");
            return false;
        }
        System.out.println("A máquina está disponível para uso.");
        return true;
    }
}
