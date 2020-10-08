/*
Variável Indexada Unidimensional (Vetor): Exemplo 2
*/

import javax.swing.*; 

public class exercicio01_2 {
    public static void main(String args[]) {

        int i;
        int n = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho do vetor: "));
        int X[ ] = new int[n];        
        for (i=0; i<n; i++) {
            X [i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor: "));
        }
    }
}