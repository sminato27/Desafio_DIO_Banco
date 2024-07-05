import java.util.List;

public class Banco {

    private String nome;
    private List<Conta> contaList;

    public Banco(List<Conta> contaList) {
        this.contaList = contaList;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}