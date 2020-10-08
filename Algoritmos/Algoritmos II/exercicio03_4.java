/*
Bubble Sort: Exemplo 4
*/

import javax.swing.*;

public class exercicio03_4 {
    public static void main(String args[]) {

        int troca, fim, i, aux, a, b;
        String vetorfim = "";
        int tamanho = Integer.parseInt(JOptionPane.showInputDialog("Informe o tamanho do vetor: "));
        int vetorOrdenar[] = new int[tamanho];

        for (i=0; i<tamanho; i++) {
            vetorOrdenar[i] = Integer.parseInt (JOptionPane.showInputDialog("Digite um valor: "));
        }

        troca = 1;
        fim = tamanho - 1;
        b = 1;
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
            vetorfim = "";
            for (a=0; a<tamanho; a++) {
                vetorfim = vetorfim + vetorOrdenar[a] + " : ";
            }
            JOptionPane.showMessageDialog(null, "Varredura: "+b+" Vetor resultante: " + vetorfim);
            b++;
            fim = fim - 1;
        }        
        vetorfim = "";
        for (i=0; i<tamanho; i++) {
            vetorfim = vetorfim + vetorOrdenar[i] + " : ";
        }
        JOptionPane.showMessageDialog(null, "Vetor final: " + vetorfim);
    }
}