/*
Variáveis Compostas Heterogêneas - Constantes: Exemplo 1

Faça um programa que possua uma constante para o tamanho do vetor que será utilizado e uma classe interna 
chamada 'Pessoa', para manipular os seguintes dados de cada pessoa:

nome (String),
altura (Double),
idade (int),
profissao (String)

Construa um vetor do tipo 'Pessoa' de tamanho 3, solicite todos os dados para o usuário e depois mostre o 
resultado de cada pessoa.
*/

import javax.swing.*;

public class exercicio05_1 {
    
    static final int TAMANHO = 3;
    static class Pessoa {
        String nome;
        double altura;
        int idade;
        String profissao;
    }

    public static void main(String args[]) {
        Pessoa pessoas[] = new Pessoa[TAMANHO];
        String pessoas_mostra[] = new String[TAMANHO];
        int i;
        for (i=0; i<TAMANHO; i++) {
            pessoas[i] = new Pessoa();
            pessoas[i].nome = JOptionPane.showInputDialog(i + " - Informe o Nome: ");
            pessoas[i].altura = Double.parseDouble(JOptionPane.showInputDialog(i + " - Informe a altura de "+ pessoas[i].nome + ": "));
            pessoas[i].idade = Integer.parseInt(JOptionPane.showInputDialog(i + " - Informe a idade de "+ pessoas[i].nome + ": "));
            pessoas[i].profissao = JOptionPane.showInputDialog(i + " - Informe a profissão de "+ pessoas[i].nome + ": ");
        }

        for (i=0; i<TAMANHO; i++) {
            pessoas_mostra[i] = "";
            pessoas_mostra[i] = pessoas_mostra[i] +
            "Pessoa " + i + ": \n"+
            "Nome: " + pessoas[i].nome + "\n" +
            "Altura: " + pessoas[i].altura + "\n" +
            "Idade: " + pessoas[i].idade + "\n" +
            "Profissão: " + pessoas[i].profissao + "\n";
        }

        for (i=0; i<TAMANHO; i++) {
            JOptionPane.showMessageDialog(null, pessoas_mostra[i]);
        }
    }
}