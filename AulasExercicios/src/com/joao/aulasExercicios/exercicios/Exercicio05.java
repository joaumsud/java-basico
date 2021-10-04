package com.joao.aulasExercicios.exercicios;

import java.util.Scanner;

//5.	Faça um Programa que calcule a área de um quadrado, 
//em seguida mostre o dobro desta área para o usuário. 
public class Exercicio05 {
	public static void main(String[] args) {
		Scanner quadrado = new Scanner(System.in);
		System.out.println("Digite o valor do lado: ");
		double lado = quadrado.nextDouble();
		double area = lado * lado;
		System.out.println("O valor da área é: " + area);
		double dobro = 2 * area;
		System.out.println("O dobro da área é: " + dobro);

	}
}
