package view;

import controller.LogController;
import controller.MensagemController;
import model.Mensagem;

import java.util.List;
import java.util.Scanner;

public class MensagemView {
    Scanner scanner = new Scanner(System.in);
    MensagemController mensagemController = new MensagemController();
    LogController logController = new LogController();
    public void cadastrarMensagem(String idCliente) {
        Mensagem mensagem = new Mensagem();
        System.out.print("digite o conteudo: ");
        mensagem.setConteudo(scanner.nextLine());
        mensagem.setIdMensagem(mensagemController.determinarIDMensagem());
        mensagem.setIdCliente(idCliente);
        mensagemController.adicionarMensagem(mensagem);
        logController.registro("uma mensagem foi cadastrada, com o conteudo de: " + mensagem.getConteudo() + " e de id: " + mensagem.getIdMensagem());
    }
    public void listarMensagem(String idCliente) {
        List<Mensagem> minhasMensagens = mensagemController.listarMensagens(idCliente);
        for (Mensagem mensagem : minhasMensagens) {
            System.out.println("conteudo: " + mensagem.getConteudo() + " id Mensagem: " + mensagem.getIdMensagem());
        }
    }
}
