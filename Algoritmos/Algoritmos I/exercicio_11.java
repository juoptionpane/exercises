/*
Faça um programa que solicite um número inteiro,
verificar se o mesmo é múltiplo de 2,
mostrar a resposta mesmo que negativa.
*/

import javax.swing.JOptionPane;

public class exercicio_11 {
    public static void main(String[] args) {

        int a;
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de a: "));

        if ((a % 2) == 0) {
            JOptionPane.showMessageDialog(null, "Sim, é múltiplo de 2!");
        } else {
            JOptionPane.showMessageDialog(null, "Não, não é múltiplo de 2!");
        }
    }
}