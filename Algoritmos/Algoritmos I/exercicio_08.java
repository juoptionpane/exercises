/*
Faça um programa que solicite ao usuário 2 números inteiros (um de cada vez),
armazene os valores em variáveis e depois mostre a soma dos dois em uma mensagem.
*/

import javax.swing.JOptionPane;

public class exercicio_08 {
    public static void main(String[] args) {

        int num1, num2, soma;
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número: "));
        soma = num1 + num2;
        JOptionPane.showMessageDialog(null, "A soma do resultado é: " + soma);
    }
}