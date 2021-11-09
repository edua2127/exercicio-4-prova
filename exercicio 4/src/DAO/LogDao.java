package DAO;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class LogDao {
    public void registro(String conteudo) {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("log.txt", true));
            bufferedWriter.write(conteudo);
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println("nao foi possivel salvar a escola");
        }
    }
}
