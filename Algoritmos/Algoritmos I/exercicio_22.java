/*
Escreva um algoritmo para calcular e mostrar a média dos números entre 0 e 1000 usando 'while'.
*/

import javax.swing.JOptionPane;

public class exercicio_22 {
    public static void main(String[] args) {

        double media = 0.0;
        double soma = 0.0;
        int i = 0;

        while (i <= 1000) {
            soma = soma + i;
            i++;
        }
        JOptionPane.showMessageDialog(null, "Soma: " + soma);
        
        media = soma / 1000;
        JOptionPane.showMessageDialog(null, "Média: " + media);
    }
}