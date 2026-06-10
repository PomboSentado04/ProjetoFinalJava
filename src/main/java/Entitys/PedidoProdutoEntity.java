package Entitys;

import jakarta.persistence.*;

@Entity
@Table(name = "PEDIDO_PRODUTO")
public class PedidoProdutoEntity {

    @Column(nullable = false, length = 10)
    private int numeroPedido;

    @Column(nullable = false, length = 10)
    private int codigoProduto;

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public int getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(int codigoProduto) {
        this.codigoProduto = codigoProduto;
    }
}
