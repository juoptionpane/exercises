/*
Variável Indexada Unidimensional (Vetor): Exemplo 1
*/

import javax.swing.JOptionPane;

public class exercicio01_1 {
    public static void main(String[] args) {

        int i;
        String nomes[] = new String[3];
        for (i=0; i<3; i++) {
            nomes[i] = JOptionPane.showInputDialog("Digite um nome: ");
        }
    }
}