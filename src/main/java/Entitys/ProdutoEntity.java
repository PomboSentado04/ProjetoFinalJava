package Entitys;

import jakarta.persistence.*;

@Entity
@Table(name = "PRODUTO")
public class ProdutoEntity {

    @Id
    @Column(nullable = false, length = 10)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigo;

    @Column(nullable = false, length = 100)
    private String descricao;

    @Column(nullable = false, length = 20)
    private float custo;

    @Column(nullable = false, length = 20)
    private float precoVenda;

    @Column(nullable = false, length = 10)
    private int codFornecedor;

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
