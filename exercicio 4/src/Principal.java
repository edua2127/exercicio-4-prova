import DAO.ClienteDAO;
import DAO.MensagemDAO;
import model.Cliente;
import model.Mensagem;
import view.ClienteView;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ClienteDAO clienteDAO = new ClienteDAO();
        clienteDAO.carregarClientes();
        MensagemDAO mensagemDAO = new MensagemDAO();
        mensagemDAO.carregarMensagens();
        ClienteView clienteView = new ClienteView();
        while (true) {
            System.out.println("[1] cadastrar clientes");
            System.out.println("[2] listar clientes");
            System.out.println("[3] selecionar cliente");
            System.out.print("digite: ");
            switch (Integer.parseInt(scanner.nextLine())) {
                case 1-> clienteView.cadastrarCliente();
                case 2->clienteView.listarClientes();
                case 3->clienteView.selecionarCliente();
            }
        }
    }
}
