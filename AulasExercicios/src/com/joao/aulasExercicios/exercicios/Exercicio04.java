package com.joao.aulasExercicios.exercicios;

import java.util.Scanner;

public class Exercicio04 {
	// 4. Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o valor do Raio: ");
		double raio = scan.nextDouble();
		System.out.println("A área do circulo é: " + ((raio * raio) * 3.1415));
	}

}
