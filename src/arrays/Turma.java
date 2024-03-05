package arrays;

public class Turma {

	String identificacao;
	String nomeProfessora;
	Aluno[] alunos;
	
	void imprimirListaDeAlunos() {
        for (Aluno aluno : alunos) {
            if (aluno != null) { // se o aluno nao for nulo
                System.out.printf("%s (%d anos)%n", aluno.nome, aluno.idade);
            } else {
                System.out.println("vago");
            }
        }
    }

}
