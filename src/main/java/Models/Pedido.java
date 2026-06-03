package Models;

import java.util.List;

public class Pedido {
    private int numero;
    private int codCliente;
    private int CEP;
    private float montantePedido;
    private List<Integer> listaProdutos;

    public Pedido(int numero, int codCliente, int CEP, List<Integer> listaProdutos, float montantePedido) {
        this.numero = numero;
        this.codCliente = codCliente;
        this.CEP = CEP;
        this.listaProdutos = listaProdutos;
        this.montantePedido = montantePedido;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(int codCliente) {
        this.codCliente = codCliente;
    }

    public int getCEP() {
        return CEP;
    }

    public void setCEP(int CEP) {
        this.CEP = CEP;
    }

    public float getMontantePedido() {
        return montantePedido;
    }

    public void setMontantePedido(float montantePedido) {
        this.montantePedido = montantePedido;
    }

    public List<Integer> getListaProdutos() {
        return listaProdutos;
    }

    public void setListaProdutos(List<Integer> listaProdutos) {
        this.listaProdutos = listaProdutos;
    }

    public void addProduto(int codProduto) {
        this.listaProdutos.add(codProduto);
    }

    public void removeProduto(int codProduto) {
        this.listaProdutos.remove(codProduto);
    }
}
