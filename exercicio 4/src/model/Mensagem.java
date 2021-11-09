package model;

public class Mensagem {
    private String idCliente;
    private String conteudo;
    private String idMensagem;

    public Mensagem() {
    }

    @Override
    public String toString() {
        return this.getIdCliente() + "|" + this.getConteudo() + "|" + this.getIdMensagem();
    }

    public String getIdMensagem() {
        return idMensagem;
    }

    public void setIdMensagem(String idMensagem) {
        this.idMensagem = idMensagem;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }
}
