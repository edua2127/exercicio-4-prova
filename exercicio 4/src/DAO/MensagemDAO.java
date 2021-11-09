package DAO;

import model.Mensagem;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class MensagemDAO {
    static List<Mensagem> mensagens = new ArrayList<>();
    String caminho = "MensagensFile.txt";
    public void adicionar(Mensagem mensagem) {
        mensagens.add(mensagem);
        this.salvarMensagens();
    }
    public List<Mensagem> listar(String idCliente) {
        List<Mensagem> minhasMensagens  = new ArrayList<>();
        for (int i = 0; i< mensagens.size(); i++) {
            if (mensagens.get(i).getIdCliente().equals(idCliente)) {
                minhasMensagens.add(mensagens.get(i));
            }
        }
        return minhasMensagens;
    }
    public void carregarMensagens() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(caminho));
            while (true) {
                String linha = bufferedReader.readLine();
                if (linha == null) {
                    break;
                } else {
                    StringTokenizer stringTokenizer = new StringTokenizer(linha, "|");
                    Mensagem mensagem = new Mensagem();
                    mensagem.setIdCliente(stringTokenizer.nextToken());
                    mensagem.setConteudo(stringTokenizer.nextToken());
                    mensagem.setIdMensagem(stringTokenizer.nextToken());
                    mensagens.add(mensagem);
                }
            }
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("arquivo nao encontrado ou ainda nao foi criado");
        }
    }
    public void salvarMensagens() {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(caminho));
            for (Mensagem mensagem : mensagens) {
                bufferedWriter.write(mensagem.toString());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println("nao foi possivel salvar a escola");
        }
    }
}
