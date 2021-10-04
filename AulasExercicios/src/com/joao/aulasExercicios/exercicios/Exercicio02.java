package com.joao.aulasExercicios.exercicios;

import java.util.Scanner;

public class Exercicio02 {
	/*2.	Faça um Programa que peça um número e então mostre a mensagem O número informado foi [número]. 
	•	Faça um Programa que peça dois números e imprima a soma. 
	•	Faça um Programa que peça as 4 notas bimestrais e mostre a média. */

	
	public static void main(String[] args) {
		System.out.println("Digite as 4 notas do aluno");
		
		Scanner scan = new Scanner(System.in);
		
		double nota1 = scan.nextDouble();
		double nota2 = scan.nextDouble();
		double nota3 = scan.nextDouble();
		double nota4 = scan.nextDouble();
		
		double media = (nota1+nota2+nota3+nota4)/4;
		
		System.out.println("A média é: " + media);
		
	}

}
