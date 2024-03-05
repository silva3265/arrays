package arrays;

import java.util.Arrays;

public class Principal {

	public static void main(String[] args) {
		int[] numerosJogoAtual = { 25, 11, 8, 46, 37, 14, 55 };
		int[] numerosNovoJogo = new int[numerosJogoAtual.length - 1]; // Vai criar um novo array com uma posição a menos

		int indiceExclusao = 2;

		System.arraycopy(numerosJogoAtual, 0, numerosNovoJogo, 0, indiceExclusao); // Vai copiar os dois primeiros numeros, menos o 8

		System.arraycopy(numerosJogoAtual, indiceExclusao + 1, numerosNovoJogo, indiceExclusao,
				numerosNovoJogo.length - indiceExclusao); // Vai copiar os 4 ultimos numeros, menos o 8

		System.out.println(Arrays.toString(numerosJogoAtual));
		System.out.println(Arrays.toString(numerosNovoJogo));
	}

}
