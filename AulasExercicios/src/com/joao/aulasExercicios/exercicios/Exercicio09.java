package com.joao.aulasExercicios.exercicios;

import java.util.Scanner;

//9.	Fa�a um Programa que pe�a 2 n�meros inteiros e um n�mero real. Calcule e mostre: 
//a.	o produto do dobro do primeiro com metade do segundo. 
//b.	a soma do triplo do primeiro com o terceiro. 
//c.	o terceiro elevado ao cubo. 

public class Exercicio09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o primeiro n�mero: ");
		int primeiroNumero = scan.nextInt();
		System.out.println("Digite o segundo n�mero: ");
		int segundoNumero = scan.nextInt();
		System.out.println("Digite o terceiro n�mero: ");
		double terceiroNumero = scan.nextDouble();
		
		double dobroMetade = (2 * primeiroNumero) + (segundoNumero / 2);
		System.out.println(
				"O resultado do produto do dobro do primeiro n�mero mais a metade do segundo �: " + dobroMetade);

		double somaTriplo = (3 * primeiroNumero) + terceiroNumero;
		System.out.println("A soma do triplo do primeiro com o terceiro �: " + somaTriplo);

		double terceiroCubo = Math.pow(terceiroNumero, 3);

		System.out.println("O terceiro elevado ao cubo �: " + terceiroCubo);

	}

}
