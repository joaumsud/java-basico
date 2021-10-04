package com.joao.aulasExercicios.exercicios;

import java.util.Scanner;

// 8.	Faça um Programa que peça a temperatura em graus Celsius, transforme e mostre em graus Fahrenheit. 
public class Exercicio08 {

	public static void main(String[] args) {
		Scanner temperatura = new Scanner(System.in);
		System.out.println("Digite a temperatura em Celsius: ");
		double celsius = temperatura.nextDouble();

		double fahrenheit = ((celsius * 1.8) + 32);

		System.out.println("A temperatura em graus Fahrenheit é: " + fahrenheit);
	}
}