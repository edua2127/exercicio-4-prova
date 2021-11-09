package view;

import controller.ClienteController;
import controller.LogController;
import model.Cliente;
import java.util.List;
import java.util.Scanner;

public class ClienteView {
    Scanner scanner = new Scanner(System.in);
    ClienteController clienteController = new ClienteController();
    MensagemView mensagemView = new MensagemView();
    LogController logController = new LogController();
    public void cadastrarCliente() {
        this.linha();
        Cliente cliente = new Cliente();
        System.out.print("digite o nome do cliente: ");
        cliente.setNome(scanner.nextLine());
        cliente.setIdCliente(clienteController.determinarID());
        clienteController.adicionarCliente(cliente);
        logController.registro("um novo cliente foi cadastrado, de nome: " + cliente.getNome() + " e de id: " + cliente.getIdCliente());
    }
    public void listarClientes() {
        List<Cliente> clientes = clienteController.listar();
        this.linha();
        int i = 0;
        for (Cliente cliente: clientes) {
            System.out.println("nome: " + cliente.getNome() + " id: " + cliente.getIdCliente() + " posicao: " + i);
            i++;
        }
    }
    public void selecionarCliente() {
        this.listarClientes();
        System.out.print("escolha a partir da posicao: ");
        clienteController.determinarClienteAtual(Integer.parseInt(scanner.nextLine()));
        Cliente clienteAtual = clienteController.receberDados();
        this.menu(clienteAtual.getIdCliente());
    }
    public void menu(String idCliente) {
        while (true) {
            System.out.println("[1] listarMensagens");
            System.out.println("[2] cadastrar mensagem");
            System.out.println("[3] sair");
            switch (Integer.parseInt(scanner.nextLine())) {
                case 1 ->mensagemView.listarMensagem(idCliente);
                case 2 ->mensagemView.cadastrarMensagem(idCliente);
                case 3 -> {return;}
            }
        }
    }
    public void linha() {
        System.out.println("------------------------------------------------");
    }
}
