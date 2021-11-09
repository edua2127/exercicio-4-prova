package controller;

import DAO.ClienteDAO;
import DAO.IdCliente;
import model.Cliente;

import java.util.List;

public class ClienteController {
    IdCliente idCliente = new IdCliente();
    ClienteDAO clienteDAO = new ClienteDAO();
    public String determinarID() {
        return idCliente.determinarIDCliente();
    }
    public void adicionarCliente(Cliente cliente) {
        clienteDAO.adicionarClientes(cliente);
    }
    public List<Cliente> listar() {
        return clienteDAO.listar();
    }

    public void determinarClienteAtual(int atual) {
        clienteDAO.clienteAtual(atual);
    }
    public Cliente receberDados() {
        return clienteDAO.receberDados();
    }
}
