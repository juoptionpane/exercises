/*
Bubble Sort: Exemplo 2
*/

import javax.swing.*;

public class exercicio03_2 {
    public static void main(String args[]) {

        int troca, fim, i, aux;
        int tamanho = Integer.parseInt(JOptionPane.showInputDialog("Informe o tamanho do vetor: "));
        int vetorOrdenar[] = new int[tamanho];

        for (i=0; i<tamanho; i++) {
            vetorOrdenar[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor: "));
        }

        troca = 1;
        fim = tamanho - 1;
        while (troca == 1) {

            troca = 0;
            for (i=0; i<fim; i++) {
                
                if (vetorOrdenar[i] > vetorOrdenar[i+1]) {
                    aux = vetorOrdenar[i];
                    vetorOrdenar[i] = vetorOrdenar[i+1];
                    vetorOrdenar[i+1]=aux;
                    troca = 1;
                }
            }
            fim = fim - 1;
        }
        for (i=0; i<tamanho; i++) {
            JOptionPane.showMessageDialog(null, "Posição: " +i+ " é "+ vetorOrdenar[i] );
        }
    }
}