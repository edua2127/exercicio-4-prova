package DAO;

import java.io.*;

public class IdCliente {
    String idCliente;
    String caminho = "IDCLIENTE.txt";
    public String determinarIDCliente() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(caminho));
            String linha = bufferedReader.readLine();
            if (linha != null) {
                int aux = Integer.parseInt(linha);
                aux++;
                idCliente = Integer.toString(aux);
            } else {
                idCliente = "0";
            }
            this.salvarID();
            bufferedReader.close();
        } catch (IOException e) {
            idCliente = "0";
            this.salvarID();
        }
        return idCliente;
    }
    public void salvarID() {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(caminho));
            bufferedWriter.write(idCliente);
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println("error ao salvar o arquivo");
        }
    }
}
