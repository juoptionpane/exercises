/*
Faça um programa que solicite ao usuário um nome, armazene em uma variável 
e depois mostre o nome digitado em uma mensagem.
*/

import javax.swing.JOptionPane;

public class exercicio_07 {
    public static void main(String[] args) {

        String nome;
        nome = JOptionPane.showInputDialog("Digite seu nome: ");
        JOptionPane.showMessageDialog(null, nome);
    }
}