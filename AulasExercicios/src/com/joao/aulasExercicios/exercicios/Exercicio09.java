package com.joao.aulasExercicios.exercicios;

import java.util.Scanner;

//9.	Faça um Programa que peça 2 números inteiros e um número real. Calcule e mostre: 
//a.	o produto do dobro do primeiro com metade do segundo. 
//b.	a soma do triplo do primeiro com o terceiro. 
//c.	o terceiro elevado ao cubo. 

public class Exercicio09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o primeiro número: ");
		int primeiroNumero = scan.nextInt();
		System.out.println("Digite o segundo número: ");
		int segundoNumero = scan.nextInt();
		System.out.println("Digite o terceiro número: ");
		double terceiroNumero = scan.nextDouble();
		
		double dobroMetade = (2 * primeiroNumero) + (segundoNumero / 2);
		System.out.println(
				"O resultado do produto do dobro do primeiro número mais a metade do segundo é: " + dobroMetade);

		double somaTriplo = (3 * primeiroNumero) + terceiroNumero;
		System.out.println("A soma do triplo do primeiro com o terceiro é: " + somaTriplo);

		double terceiroCubo = Math.pow(terceiroNumero, 3);

		System.out.println("O terceiro elevado ao cubo é: " + terceiroCubo);

	}

}
