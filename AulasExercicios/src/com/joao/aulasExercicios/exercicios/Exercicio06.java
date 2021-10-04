package com.joao.aulasExercicios.exercicios;

import java.util.Scanner;

//6.	Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. 
//Calcule e mostre o total do seu salário no referido mês. 
public class Exercicio06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Quanto vale sua hora de trabalho? ");
		double valorHora = scan.nextDouble();
		System.out.println("Quantas horas você trabalhou este mês? ");
		int horasTrabalhadas = scan.nextInt();
		
		double salarioMes = valorHora * horasTrabalhadas;
		
		System.out.println("Valor do salário no mês atual é: " + salarioMes);
	}
}
