package varargs_desafio;

import java.util.Arrays;

public class Calculadora {

	/*
	 * Implemente um método de uma classe para calcular a média de números do tipo
	 * double.
	 * 
	 * Este método deve exigir no mínimo 2 números para o cálculo, sendo ilimitada a
	 * quantidade máxima.
	 * 
	 * Use varargs para conseguir isso, usando as boas práticas que você aprendeu.
	 */

	static double calcularMedia(double numeroA, double numeroB, double... demaisNumeros) {
		double[] todosNumeros = Arrays.copyOf(demaisNumeros, demaisNumeros.length + 2);
		todosNumeros[todosNumeros.length - 2] = numeroA;
		todosNumeros[todosNumeros.length - 1] = numeroB;

		double soma = 0;

		for (double numero : todosNumeros) {
			soma += numero;
		}

		return soma / todosNumeros.length;
	}

}
