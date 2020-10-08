/*
A prefeitura de Florianópolis abriu uma linha de crédito para os funcionários estatutários.
O valor máximo da prestação não poderá ultrapassar 30% do salário bruto.

Faça um algoritmo que permita entrar com o salário bruto e o valor da prestação,
e informar se o empréstimo pode ou não ser concedido.
*/

import javax.swing.JOptionPane;

public class exercicio_13 {
    public static void main(String[] args) {

        double sb, vp;
        sb = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário bruto: "));
        vp = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da prestação: "));

        if (vp <= (0.3 * sb)) {
            JOptionPane.showMessageDialog(null, "Empréstimo concedido!");
        } else {
            JOptionPane.showMessageDialog(null, "Empréstimo negado!");
        }
    }
}