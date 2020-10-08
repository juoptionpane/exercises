/*
Implemente um software que solicite ao usuário 5 números usando 'for'.
Para cada número informado verifique se o mesmo é positivo, negativo, par, ímpar, múltiplo de 10 e múltiplo de 5.
Ao fim do laço 'for' informe em apenas uma mensagem:

- Soma dos positivos;
- Soma dos negativos;
- Quantidade de números pares;
- Quantidade de números impares;
- Quantidade de números múltiplos de 10;
- Quantidade de números múltiplos de 5;
*/

import javax.swing.JOptionPane;

public class exercicio_25 {
    public static void main(String[] args) {

        int positivo = 0;
        int negativo = 0;
        int par = 0;
        int impar = 0;
        int mult10 = 0;
        int mult5 = 0;

        for (int i=0; i<5; i++) {
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
            
            if ((numero % 2) == 0) {
                par++;
            } else {
                impar++;
            }

            if (numero > 0) {
                positivo = positivo + numero;
            } else {
                negativo = negativo + numero;
            }

            if ((numero % 10) == 0) {
                mult10++;
            }

            if ((numero % 5) == 0) {
                mult5++;
            }
        }
        JOptionPane.showMessageDialog(null,
        "Soma dos positivos: "+ positivo +
        "\nSoma dos negativos: "+ negativo +
        "\nQuantidade de números pares: "+ par +
        "\nQuantidade de números impares: "+ impar +
        "\nQuantidade de números múltiplos de 10: "+ mult10 +
        "\nQuantidade de números múltiplos de 5: "+ mult5);
    }
}