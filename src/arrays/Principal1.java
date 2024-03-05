package arrays;

import java.util.ArrayList;

public class Principal1 {
	
	public static void main(String[] args) {
        ArrayList<String> alunos = new ArrayList<>();
        alunos.add("João");
        alunos.add("Maria");

//        for (int i = 0; i < alunos.size(); i++) { // size() - tamanho
//            String aluno = alunos.get(i); // get - obter
//            System.out.println(aluno);
//        }

        for (String aluno : alunos) {
            System.out.println(aluno);
        }
    }

}
