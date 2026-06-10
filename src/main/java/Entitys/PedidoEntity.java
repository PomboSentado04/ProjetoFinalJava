package Entitys;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "PEDIDO")
public class PedidoEntity {

    @Id
    @Column(nullable = false, length = 10)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int numero;

    @Column(nullable = false, length = 10)
    private int codCliente;

    @Column(nullable = false, length = 8)
    private int CEP;

    @Column(nullable = false, length = 20)
    private float montantePedido;

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
}
