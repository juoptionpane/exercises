/*
Variável Indexada Unidimensional (Vetor): Exemplo 3
*/

import javax.swing.*;

public class exercicio01_3 {
    public static void main(String args[]) {

        int i;
        String nomes[] = new String[20];
        nomes[0] = "Unisul";
        nomes[1] = "Aluno";
        nomes[2] = "Sistema";        
        for (i=0; i<3; i++) {
            JOptionPane.showMessageDialog(null, "O nome na posição " +i+ " é " + nomes[i]);
        }
    }
}