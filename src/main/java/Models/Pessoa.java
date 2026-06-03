package Models;

public class Pessoa {
    private int codigo;
    private String nome;
    private int tipoPessoa;

    public Pessoa(int codigo, String nome, int tipoPessoa){
        this.codigo = codigo;
        this.nome = nome;
        this.tipoPessoa = tipoPessoa;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTipoPessoa() {
        return tipoPessoa;
    }

    public void setTipoPessoa(int tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }
}
