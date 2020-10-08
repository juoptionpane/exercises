/*
Faça um programa que solicite ao usuário o seu peso (massa) em kg (int) e a sua altura em metros (Double).
Com estes dados calcule o IMC seguindo a seguinte fórmula: 

IMC = massa / (altura * altura)

Mostre o resultado em uma mensagem.
*/

import javax.swing.JOptionPane;

public class exercicio_09 {
    public static void main(String[] args) {

        double peso, altura, imc;
        peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu peso: "));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a sua altura: "));
        imc = (peso) / (altura*altura);
        JOptionPane.showMessageDialog(null, "O seu IMC é: " + imc);
    }
}