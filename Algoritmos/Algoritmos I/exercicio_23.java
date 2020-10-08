/*
Escreva um algoritmo usando 'while' que solicite ao usuário um número inicial e um número final. 
Calcule a soma de todos os números dentro da faixa de valor informada INCLUINDO o número inicial e final.
*/

import javax.swing.JOptionPane;

public class exercicio_23 {
    public static void main(String[] args) {
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inicial: "));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número final: "));
        int soma = 0;
        int i = n1;

        while (i <= n2) {
            soma = soma + i;
            i++;
        }
        JOptionPane.showMessageDialog(null, "Soma: " + soma);
    }
}