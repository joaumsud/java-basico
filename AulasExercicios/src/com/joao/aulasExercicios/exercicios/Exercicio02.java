package com.joao.aulasExercicios.exercicios;

import java.util.Scanner;

public class Exercicio02 {
	/*2.	Fa�a um Programa que pe�a um n�mero e ent�o mostre a mensagem O n�mero informado foi [n�mero]. 
	�	Fa�a um Programa que pe�a dois n�meros e imprima a soma. 
	�	Fa�a um Programa que pe�a as 4 notas bimestrais e mostre a m�dia. */

	
	public static void main(String[] args) {
		System.out.println("Digite as 4 notas do aluno");
		
		Scanner scan = new Scanner(System.in);
		
		double nota1 = scan.nextDouble();
		double nota2 = scan.nextDouble();
		double nota3 = scan.nextDouble();
		double nota4 = scan.nextDouble();
		
		double media = (nota1+nota2+nota3+nota4)/4;
		
		System.out.println("A m�dia �: " + media);
		
	}

}
