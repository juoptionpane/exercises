/*
Faça um programa que solicite 2 números inteiros,
verificar qual é o número maior e mostrar na tela,
se forem iguais, mostrar uma mensagem indicando esta informação.
*/

import javax.swing.JOptionPane;

public class exercicio_12 {
    public static void main(String[] args) {

        int a, b;
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de a: "));
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de b: "));

        if (a > b) {
            JOptionPane.showMessageDialog(null, "O número é: " + a);

        } else {
            if (a == b) {
                JOptionPane.showMessageDialog(null, "Os números são iguais!");
                
            } else {
                JOptionPane.showMessageDialog(null, "O número maior é: " + b);
            }
        }
    }
}