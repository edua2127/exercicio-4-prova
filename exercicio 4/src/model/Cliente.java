package model;

public class Cliente {
    private String idCliente;
    private String nome;

    public Cliente() {
    }

    @Override
    public String toString() {
        return this.getIdCliente() + "|" + this.getNome();
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
