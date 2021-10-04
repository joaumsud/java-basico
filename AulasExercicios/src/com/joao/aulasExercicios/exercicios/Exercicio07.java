package com.joao.aulasExercicios.exercicios;

import java.util.Scanner;

//7.	Faça um Programa que peça a temperatura em graus Fahrenheit, 
//transforme e mostre a temperatura em graus Celsius. 

public class Exercicio07 {

	public static void main(String[] args) {
		Scanner temperatura = new Scanner(System.in);
		System.out.println("Digite a temperatura em Fahrenheit: ");
		double f = temperatura.nextDouble();
		
		double celsius = 5 * ((f-32)/9);
		
		System.out.println("A temperatura em graus Celsius é: " + celsius);

	}

}
