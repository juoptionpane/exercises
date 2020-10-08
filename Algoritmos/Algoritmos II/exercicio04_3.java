/*
Matriz: Exemplo 3

----------------------------------------------------------------
                |   Florianópolis   |   Blumenau   |   Lages   |
----------------------------------------------------------------
Florianópolis   |         0         |      200     |    300    |
----------------------------------------------------------------
Blumenau        |        200        |       0      |    500    |
----------------------------------------------------------------
Lages           |        300        |      500     |     0     |
----------------------------------------------------------------
*/

import javax.swing.*;

public class exercicio04_3 {
    public static void main(String args[]) {

        double A[][] = new double[3][3];        //matriz de distâncias
        int i, j;

        //cria as legendas da matriz
        String linhas_A[] = new String [3];
        linhas_A[0] = "Florianópolis";
        linhas_A[1] = "Blumenau";
        linhas_A[2] = "Lages";

        String cols_A[] = new String [3];
        cols_A[0] = "Florianópolis";
        cols_A[1] = "Blumenau";
        cols_A[2] = "Lages";

        //distâncias partindo de Florianópolis
        A[0][0] = 0;    //Florianópolis > Florianópolis
        A[0][1] = 200;  //Florianópolis > Blumenau
        A[0][2] = 300;  //Florianópolis > Lages

        //distâncias partindo de Blumenau
        A[1][0] = 200;  //Blumenau > Florianópolis
        A[1][1] = 0;    //Blumenau > Blumenau
        A[1][2] = 500;  //Blumenau > Lages

        //distâncias partindo de Lages
        A[2][0] = 300;  //Lages > Florianópolis
        A[2][1] = 500;  //Lages > Blumenau
        A[2][2] = 0;    //Lages > Lages

        //mostra a distância entre todas as cidades
        for (i=0; i<3; i++) {
            for (j=0; j<3; j++) {
                JOptionPane.showMessageDialog(null, "A distância entre: " + linhas_A[i] + " e " + cols_A[j] + " é: " + A[i][j]);
            }
        }
    }
}