/*
Faça um programa declarando uma variável do tipo inteiro (int),
atribua um valor qualquer a esta variável,
mostre o valor desta variável na mensagem: "O valor da variável é: <número escolhido>".
*/

import javax.swing.JOptionPane;

public class exercicio_06 {
    public static void main(String[] args) {

        int numero;
        numero = 10;
        JOptionPane.showMessageDialog(null, "O valor da variável é: " + numero);
    }
}