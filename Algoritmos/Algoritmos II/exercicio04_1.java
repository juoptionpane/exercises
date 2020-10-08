/*
Matriz: Exemplo 1

Definir uma variável indexada bidimensional sendo do tipo real, sendo que a matriz deverá ter 3 linhas e 4 colunas.
Esta matriz deverá corresponder a 12 posições de memória.

-----------------------------------------
        |   0   |   1   |   2   |   3   |
-----------------------------------------
    0   |       |       |       |       |   linha 1
-----------------------------------------
A = 1   |       |       |       |       |   linha 2
-----------------------------------------
    2   |       |       |       |       |   linha 3
-----------------------------------------
          col 1   col2     col3    col4
*/

import javax.swing.*;

public class exercicio04_1 {
    public static void main(String args[]) {

        double A[][] = new double[3][4];
        int i, j;
        
        for (i=0; i<3; i++) {
            for (j=0; j<4; j++) {
                A[i][j] = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da linha " +i+ " e coluna "+j+": "));
            }
        }
    }
}