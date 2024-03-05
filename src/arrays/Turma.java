package arrays;

import java.util.Arrays;

public class Turma {

	String identificacao;
    String nomeProfessora;
    Aluno[] alunos = new Aluno[0];

    void adicionarAluno(Aluno aluno) { // Faz uma copia e descarta a anterior
        alunos = Arrays.copyOf(alunos, alunos.length + 1); // Vai fazer uma copia e adicionando mais uma posição
        alunos[alunos.length - 1] = aluno; // se ter um array de uma posição, a ultima posição é zero, é sempre length - 1
    }

    void imprimirListaDeAlunos() {
        for (Aluno aluno : alunos) {
            if (aluno != null) {
                System.out.printf("%s (%d anos)%n", aluno.nome, aluno.idade);
            } else {
                System.out.println("vago");
            }
        }
    }

}
