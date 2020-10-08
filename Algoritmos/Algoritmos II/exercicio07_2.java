/*
Arquivos: Exemplo 2
*/

import java.io.*;
import javax.swing.*;

public class exercicio07_2 {
    static final String NOME_ARQUIVO = "AGENDA.TXT";

    public static void main(String args[]) {

        try {
            BufferedReader agenda = new BufferedReader(new FileReader(new File(NOME_ARQUIVO)));
            String nome = agenda.readLine();

            while (nome != null) {
                JOptionPane.showMessageDialog(null, "Nome: " + nome);
                nome = agenda.readLine();
            }
            agenda.close();

            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Não abriu arquivo para leitura!");

        }
    }
}