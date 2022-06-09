package br.com.generation.matrizevetor;

import java.util.Scanner;

public class ExercicioVetor01 {
	/*
	 Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
	atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente.
	 */

	public static void main(String[] args) {
		Scanner vetor = new Scanner(System.in);
		double pontuacao[] = new double[5];
		double maior = 0.0;
		System.out.println("Digite as 5 pontuações da atividade: ");
		
		for(int i=0; i< pontuacao.length; i++ ) {
			System.out.println((i+1) + " Pontuação: ");
			pontuacao[i]= vetor.nextDouble();
			
			if(pontuacao[i]> maior) {
				maior= pontuacao[i];
				
			}
			
		}
		
		System.out.println("A maior pontuação foi " + maior);
	}

}
