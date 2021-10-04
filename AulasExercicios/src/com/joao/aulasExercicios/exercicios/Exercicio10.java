package com.joao.aulasExercicios.exercicios;

import java.io.IOException;
import java.util.Scanner;

//Tendo como dado de entrada a altura (h) de uma pessoa, construa um algoritmo que calcule seu peso ideal, 
//utilizando as seguintes fórmulas: 

public class Exercicio10 {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);

		System.out.println("Informe seu sexo (M/F): ");
		char sexo = (char) System.in.read();
		System.out.println("Digite sua altura: ");
		double altura = scan.nextDouble();
		if (sexo == 'm' || sexo == 'M') {
			double homem = (72.7 * altura) - 58;
			System.out.println("Seu peso ideal é: " + homem + " kg");
		} else if (sexo == 'f' || sexo == 'F') {
			double mulher = (62.1 * altura) - 44.7;
			System.out.println("Seu peso ideal é: " + mulher + " kg");
		} else {
			System.out.println("Opção inválida!");
		}

	}

}
