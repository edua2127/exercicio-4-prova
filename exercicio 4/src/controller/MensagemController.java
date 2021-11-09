package controller;

import DAO.IdMensagem;
import DAO.MensagemDAO;
import model.Mensagem;

import java.util.List;

public class MensagemController {
    IdMensagem idMensagem = new IdMensagem();
    MensagemDAO mensagemDAO = new MensagemDAO();
    public String determinarIDMensagem() {
        return idMensagem.determinarIDMensagem();
    }
    public void adicionarMensagem(Mensagem mensagem) {
        mensagemDAO.adicionar(mensagem);
    }
    public List<Mensagem> listarMensagens(String idCliente) {
        return mensagemDAO.listar(idCliente);
    }
}
