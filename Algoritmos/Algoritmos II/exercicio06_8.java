/*
Sub-Rotinas: Exemplo 8

Faça uma sub-rotina do tipo função que receba dois números inteiros positivos por parâmetro e retorne 
a soma dos N números existentes entre eles. Faça um algoritmo para utilizar a função e mostrar a soma.
*/

import javax.swing.*;

public class exercicio06_8 {
    public static int SomaIntervalo(int primeiro, int segundo) {

        int resultado = 0;
        int a = primeiro + 1;
        int i;
        for (i=a; i<segundo; i++) {
            resultado = resultado + i;
        }
        return resultado;
    }

    //rotina principal
    public static void main(String args[]) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro número do intervalo: "));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo número do intervalo: "));

        JOptionPane.showMessageDialog(null, "A soma do intervalo é: " + SomaIntervalo(a,b));
    }
}