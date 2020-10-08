/*
Escreva um algoritmo que mostre todos os números pares entre 13 e 23 usando 'do while'.
*/

import javax.swing.JOptionPane;

public class exercicio_24 {
    public static void main(String[] args) { 
               
        int i = 13;
        do {
            i++;
            if ((i % 2) == 0) {
                JOptionPane.showMessageDialog(null, "É par: " + i);
            }
            while (i < 23);
        }
    }
}