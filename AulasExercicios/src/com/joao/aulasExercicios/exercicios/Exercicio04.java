package com.joao.aulasExercicios.exercicios;

import java.util.Scanner;

public class Exercicio04 {
	// 4. Fa�a um Programa que pe�a o raio de um c�rculo, calcule e mostre sua �rea.
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o valor do Raio: ");
		double raio = scan.nextDouble();
		System.out.println("A �rea do circulo �: " + ((raio * raio) * 3.1415));
	}

}
