/*
Variáveis Compostas Heterogêneas - Constantes: Exemplo 3

Considere que uma figura geométrica possui área, cor e tipo (1-Triangulo, 2-Circulo e 3-Quadrado).
Faça um algoritmo que armazene N figuras geométricas em um vetor. Após a leitura determine:

a) O total da área das figuras geométricas;
b) O tipo da maior figura geométrica;
c) A quantidade de círculos;
d) O percentual de quadrado em relação ao total.
*/

import javax.swing.*;

public class exercicio05_3 {
    
    static class Figura {
        Double area;
        String cor;
        int tipo;
    }

    public static void main(String args[]) {

        int TAMANHO = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de figuras: "));
        Figura figuras[] = new Figura[TAMANHO];

        int i;
        for (i=0; i<TAMANHO; i++) {
            figuras[i] = new Figura();
            figuras[i].area = Double.parseDouble(JOptionPane.showInputDialog("Informe a área da figura: "));
            figuras[i].cor = JOptionPane.showInputDialog("Informe a cor da figura: ");
            figuras[i].tipo    = Integer.parseInt(JOptionPane.showInputDialog("Informe o tipo da figura: 1) Triangulo, 2) Circulo e 3) Quadrado"));
        }

        //a) O total da área das figuras geométricas;
        Double total_area = 0.0;
        for (i=0; i<TAMANHO; i++) {
            total_area = total_area + figuras[i].area;
        }
        JOptionPane.showMessageDialog(null, "a) O total da área das figuras geométricas: " + total_area);

        //b) O tipo da maior figura geométrica
        Figura maior = new Figura();
        maior = figuras[0];
        for (i=0; i<TAMANHO; i++) {
            if (figuras[i].area > maior.area) {
                maior = figuras[i];
            }
        }
        JOptionPane.showMessageDialog(null, " b) O tipo da maior figura geométrica: " + maior.tipo);

        //c) A quantidade de círculos;
        int quantidade_circulo = 0;
        for (i=0; i<TAMANHO; i++) {
            if (figuras[i].tipo == 2) {
                quantidade_circulo++;
            }
        }
        JOptionPane.showMessageDialog(null, " c) A quantidade de círculos: " + quantidade_circulo);

        //d) O percentual de quadrado em relação ao total.
        int quantidade_quadrado = 0;
        int percentual = 0;
        for (i=0; i<TAMANHO; i++) {
            if (figuras[i].tipo == 3) {
                quantidade_quadrado++;
            }
        }

        percentual = (quantidade_quadrado * 100) / TAMANHO;
        JOptionPane.showMessageDialog(null, " d) O percentual de quadrado em relação ao total: " + percentual + "%");
    }
}