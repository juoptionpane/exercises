/*
Matriz: Exemplo 2

Definir uma variável indexada bidimensional sendo do tipo real, sendo que a matriz deverá ter 3 linhas e 4 colunas.
Esta matriz deverá corresponder a 12 posições de memória.

Leitura:
Memória                 Tela
------------------------------------------------
i   j   
------------------------------------------------
0   0   Digite o valor na linha 0 e coluna 0: 13
0   1   Digite o valor na linha 0 e coluna 1: 15
0   2   Digite o valor na linha 0 e coluna 2: 12
0   3   Digite o valor na linha 0 e coluna 3: 11
------------------------------------------------
1   0   Digite o valor na linha 1 e coluna 0: 27
1   1   Digite o valor na linha 1 e coluna 1: 20
1   2   Digite o valor na linha 1 e coluna 2: 29
1   3   Digite o valor na linha 1 e coluna 3: 21
------------------------------------------------
2   0   Digite o valor na linha 2 e coluna 0: 34
2   1   Digite o valor na linha 2 e coluna 1: 27
2   2   Digite o valor na linha 2 e coluna 2: 32
2   3   Digite o valor na linha 2 e coluna 3: 33


A memória ficará assim após a execução do programa de leitura:
-----------------------------------------
        |   0   |   1   |   2   |   3   |
-----------------------------------------
    0   |   13  |   15  |   12  |   11  |   linha 1
-----------------------------------------
A = 1   |   27  |   30  |   29  |   21  |   linha 2
-----------------------------------------
    2   |   34  |   27  |   32  |   33  |   linha 3
-----------------------------------------
          col 1   col2     col3    col4
*/

import javax.swing.*;

public class exercicio04_2 {
    public static void main(String args[]) {

        double A[][] = new double[3][4];
        int i, j;

        for (i=0; i<3; i++) {
            for (j=0; j<4; j++) {
                A[i][j] = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da linha "+i+" e coluna "+j+": "));
            }
        }

        for (i=0; i<3; i++) {
            for (j=0; j<4; j++) {
                JOptionPane.showMessageDialog(null, "O valor contido na linha " +i+" e coluna " +j+ " é " + A[i][j]);
            }
        }
    }
}