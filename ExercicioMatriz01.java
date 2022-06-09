package br.com.generation.matrizevetor;

import java.util.Scanner;

public class ExercicioMatriz01 {
	/*
	Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
	em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
	diagonal, ou seja, diagonal principal.
		*/
	public static void main(String[] args) {
		
	  Scanner leia = new Scanner(System.in);
	  double valores[][] = new double[3][3];
	  double soma= 0.0 , diagonal=0.0;
	  System.out.println("Digite os valores da matriz : \n");
	  
	  for(int l=0; l<valores.length; l++) {
		  for(int c=0;c< valores.length;c++) {
			  valores[l][c]=leia.nextDouble();
			  soma= soma + valores[l][c];
			  diagonal = valores[0][0] + valores [1][1] + valores [2][2];
			  
		  }
		  System.out.println();
	  }
	  
	   System.out.println("----- MATRIZ -----");
	   
	   for(int l=0; l<valores.length; l++) {
			  for(int c=0;c< valores.length;c++) {
				 System.out.printf(valores[l][c] + " | ");				  
			  }
			 System.out.println();
			  	  }
	   
	System.out.println();
	System.out.println("O resultado da soma da matriz é : " + soma + "\n");
	System.out.println("O resultado da soma da diagonal da matriz é: " + diagonal);
	
	}

}
