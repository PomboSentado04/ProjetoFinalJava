package Entitys;

import jakarta.persistence.*;

@Entity
@Table(name = "ENDERECO")
public class EnderecoEntity {

    @Id
    @Column(nullable = false, length = 8)
    private int CEP;

    @Column(nullable = false, length = 100)
    private String logradouro;

    @Column(nullable = false, length = 5)
    private int numero;

    @Column(nullable = false, length = 100)
    private String complemento;

    @Column(nullable = false, length = 2)
    private int tipoEndereco;

    public int getCEP() {
        return CEP;
    }

    public void setCEP(int CEP) {
        this.CEP = CEP;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public int getTipoEndereco() {
        return tipoEndereco;
    }

    public void setTipoEndereco(int tipoEndereco) {
        this.tipoEndereco = tipoEndereco;
    }
}
