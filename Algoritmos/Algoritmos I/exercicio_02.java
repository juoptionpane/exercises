/*
Faça um programa que mostre as seguintes informações:

- Nome:
- Idade:
- Data de nascimento:

Cada uma das informação deve estar em linhas diferentes.
Utilize '\n' para o efeito desejado.
*/

import javax.swing.JOptionPane;

public class exercicio_02 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Nome: \nIdade: \nData de nascimento: ");
    }
}