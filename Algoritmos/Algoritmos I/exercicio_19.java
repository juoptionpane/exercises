/*
Solicite ao usuário que escreva uma frase e o número de vezes que a mesma deve ser mostrada. 
Implemente o algoritmo usando 'for'.
*/

import javax.swing.JOptionPane;

public class exercicio_19 {
    public static void main(String[] args) {

        String frase = JOptionPane.showInputDialog("Digite uma frase: ");
        int n = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de vezes para repetir: "));

        for (int i=0; i<n; i++) {
            JOptionPane.showMessageDialog(null, "Frase: " + frase);
        }
    }
}