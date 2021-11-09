package DAO;

import model.Cliente;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class ClienteDAO {
    static List<Cliente> clientes = new ArrayList<>();
    String caminho = "ClientesFile.txt";
    int posicaoClienteAtual = 0;
    public void adicionarClientes(Cliente cliente) {
        clientes.add(cliente);
        this.salvarCliente();
    }

    public Cliente receberDados() {
        return clientes.get(posicaoClienteAtual);
    }
    public void clienteAtual(int atual) {
        posicaoClienteAtual = atual;
    }
    public List<Cliente> listar() {
        return clientes;
    }
    public void carregarClientes() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(caminho));
            while (true) {
                String linha = bufferedReader.readLine();
                if (linha == null) {
                    break;
                } else {
                    StringTokenizer stringTokenizer = new StringTokenizer(linha, "|");
                    Cliente cliente = new Cliente();
                    cliente.setIdCliente(stringTokenizer.nextToken());
                    cliente.setNome(stringTokenizer.nextToken());
                    clientes.add(cliente);
                }
            }
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("arquivo nao encontrado ou ainda nao foi criado");
        }
    }
    public void salvarCliente() {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(caminho));
            for (Cliente cliente : clientes) {
                bufferedWriter.write(cliente.toString());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println("nao foi possivel salvar a escola");
        }
    }
}
