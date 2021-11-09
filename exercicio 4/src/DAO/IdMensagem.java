package DAO;

import java.io.*;

public class IdMensagem {
    String idMensagem;
    String caminho = "IDMENSAGEM.txt";
    public String determinarIDMensagem() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(caminho));
            String linha = bufferedReader.readLine();
            if (linha != null) {
                int aux = Integer.parseInt(linha);
                aux++;
                idMensagem = Integer.toString(aux);
            } else {
                idMensagem = "0";
            }
            this.salvarID();
            bufferedReader.close();
        } catch (IOException e) {
            idMensagem = "0";
            this.salvarID();
        }
        return idMensagem;
    }
    public void salvarID() {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(caminho));
            bufferedWriter.write(idMensagem);
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println("error ao salvar o arquivo");
        }
    }
}
