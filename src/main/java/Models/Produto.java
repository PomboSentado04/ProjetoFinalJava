package Models;

public class Produto {
    private int codigo;
    private String descricao;
    private float custo;
    private float precoVenda;
    private int codFornecedor;

    public Produto(int codigo, String descricao, float custo, float precoVenda, int codFornecedor) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.custo = custo;
        this.precoVenda = precoVenda;
        this.codFornecedor = codFornecedor;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getCusto() {
        return custo;
    }

    public void setCusto(float custo) {
        this.custo = custo;
    }

    public float getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(float precoVenda) {
        this.precoVenda = precoVenda;
    }

    public int getCodFornecedor() {
        return codFornecedor;
    }

    public void setCodFornecedor(int codFornecedor) {
        this.codFornecedor = codFornecedor;
    }
}
