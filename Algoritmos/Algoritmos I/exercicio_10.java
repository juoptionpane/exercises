/*
Faça um programa que solicite ao usuário 2 números inteiros e efetue a adição.
Caso o resultado seja maior que 10, apresentá-lo.
*/

import javax.swing.JOptionPane;

public class exercicio_10 {
    public static void main(String[] args) {

        int a, b, resultado;
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de a: "));
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de b: "));
        resultado = a + b;

        if (resultado > 10) {
            JOptionPane.showMessageDialog(null, "O resultado é: " + resultado);
        }
    }
}