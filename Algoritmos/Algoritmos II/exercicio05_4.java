/*
Variáveis Compostas Heterogêneas - Constantes: Exemplo 4

Faça um algoritmo que:

a) Defina um registro para aluno tendo os seguintes campos: Nome / Semestre / Sala / Curso / Notas (total de seis);
b) Ler as informações, descritas acima;
c) Ampliar a definição anterior, acrescentando a definição de um outro campo (Endereço) que será também um registro, 
o qual terá os seguintes campos: Rua, Numero, Bairro, Cidade, Estado, CEP;
d) Ler as informações de um aluno, junto com o endereço descrito acima;
e) Declare um vetor de 100 posições de alunos, os campos serão os mesmos descritos nos itens anteriores;
f) Ler as informações de n alunos;
g) Ordene crescentemente pelo nome, os alunos. Mostre os dados antes e depois da ordenação.
*/

import javax.swing.*;
import java.util.Arrays;

public class exercicio05_4 {

    //c) Ampliar a definição anterior, acrescentando a definição de um outro campo (Endereço) que será também um Registro, o qual terá os seguintes campos: Rua / Numero / Bairro / Cidade / Estado / CEP;
    static class Endereco {
        String rua;
        int numero;
        String bairro;
        String cidade;
        String estado;
        String cep;
    }

    //a) Defina um registro para aluno tendo os seguintes campos: Nome / Semestre / Sala / Curso, Notas (total de seis);
    static class Aluno {
        String nome;
        int semestre;
        String sala;
        String curso;
        Double notas[] = new Double[6];
        Endereco endereco = new Endereco();
    }

    public static void main(String args[]) {

        //e) Declare um Vetor de 100 posições de alunos, os campos serão os mesmos descritos nos itens anteriores;
        Aluno alunos[] = new Aluno[100];

        //f) Ler as informações de n alunos;
        int TAMANHO = Integer.parseInt(JOptionPane.showInputDialog("Informe o número de alunos: "));

        //b) e d) Ler as informações de um aluno, junto com o endereço descrito acima;
        int i, j, aux;
        for (i=0; i<TAMANHO; i++) {
            alunos[i] = new Aluno();
            alunos[i].nome = JOptionPane.showInputDialog("Informe o nome do aluno: ");
            alunos[i].semestre = Integer.parseInt(JOptionPane.showInputDialog("Informe o semestre do aluno: "));
            alunos[i].sala = JOptionPane.showInputDialog("Informe a sala do aluno: ");
            alunos[i].curso = JOptionPane.showInputDialog("Informe o curso do aluno: ");
            for (j=0; j<6; j++) {
                aux = j+1;
                alunos[i].notas[j] = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota " +aux+ " de " +alunos[i].nome+ ": "));
            }
            alunos[i].endereco.rua = JOptionPane.showInputDialog("Endereço de " +alunos[i].nome+ ", informe a rua: ");
            alunos[i].endereco.numero = Integer.parseInt(JOptionPane.showInputDialog("Endereço de " +alunos[i].nome+ ", informe o número: "));
            alunos[i].endereco.bairro = JOptionPane.showInputDialog("Endereço de " +alunos[i].nome+ ", informe o bairro: ");
            alunos[i].endereco.cidade = JOptionPane.showInputDialog("Endereço de " +alunos[i].nome+ ", informe a cidade: ");
            alunos[i].endereco.estado = JOptionPane.showInputDialog("Endereço de " +alunos[i].nome+ ", informe o estado: ");
            alunos[i].endereco.cep = JOptionPane.showInputDialog("Endereço de " +alunos[i].nome+ ", informe o CEP: ");
        }

        //g) Ordene crescentemente pelo nome, os alunos. Mostre os dados antes e depois da ordenação;

        //mostrando os dados antes
        String dados_antes[] = new String[TAMANHO];

        //monta as strings com os dados de todos os alunos
        for (i=0; i<TAMANHO; i++) {
            dados_antes[i] =
            "Nome: " + alunos[i].nome + "\n"
            + "Semestre: " + alunos[i].semestre + "\n"
            + "Sala: " + alunos[i].sala + "\n"
            + "Curso: " + alunos[i].curso + "\n"
            + "Notas: \n"
                + "Nota 1: " + alunos[i].notas[0] + "\n"
                + "Nota 2: " + alunos[i].notas[1] + "\n"
                + "Nota 3: " + alunos[i].notas[2] + "\n"
                + "Nota 4: " + alunos[i].notas[3] + "\n"
                + "Nota 5: " + alunos[i].notas[4] + "\n"
                + "Nota 6: " + alunos[i].notas[5] + "\n"
            + "Endereço: \n"
            + "Rua: " + alunos[i].endereco.rua + "\n"
            + "Número: " + alunos[i].endereco.numero + "\n"
            + "Bairro: " + alunos[i].endereco.bairro + "\n"
            + "Cidade: " + alunos[i].endereco.cidade + "\n"
            + "Estado: " + alunos[i].endereco.estado + "\n"
            + "CEP: " + alunos[i].endereco.cep + "\n"
            + "";
        }

        //mostra o vetor antes
        JOptionPane.showMessageDialog(null, "DADOS ANTES DA ORDENAÇÃO");
        for (i=0; i<TAMANHO; i++) {
            JOptionPane.showMessageDialog(null, dados_antes[i]);
        }

        //mostrando os dados DEPOIS da ordenação
        String dados_depois[] = new String[TAMANHO];

        //ordenando pelo nome
        Arrays.sort(dados_antes);
        dados_depois = dados_antes;

        //mostra o vetor depois
        JOptionPane.showMessageDialog(null, "DADOS DEPOIS DA ORDENAÇÃO");
        for (i=0; i<TAMANHO; i++) {
            JOptionPane.showMessageDialog(null, dados_depois[i]);
        }
    }
}