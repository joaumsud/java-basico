package com.joao.aulasExercicios.exercicios;

import java.util.Scanner;

//5.	Fa�a um Programa que calcule a �rea de um quadrado, 
//em seguida mostre o dobro desta �rea para o usu�rio. 
public class Exercicio05 {
	public static void main(String[] args) {
		Scanner quadrado = new Scanner(System.in);
		System.out.println("Digite o valor do lado: ");
		double lado = quadrado.nextDouble();
		double area = lado * lado;
		System.out.println("O valor da �rea �: " + area);
		double dobro = 2 * area;
		System.out.println("O dobro da �rea �: " + dobro);

	}
}
