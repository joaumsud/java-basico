package com.joao.aulasExercicios.exercicios;

import java.util.Scanner;

//6.	Fa�a um Programa que pergunte quanto voc� ganha por hora e o n�mero de horas trabalhadas no m�s. 
//Calcule e mostre o total do seu sal�rio no referido m�s. 
public class Exercicio06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Quanto vale sua hora de trabalho? ");
		double valorHora = scan.nextDouble();
		System.out.println("Quantas horas voc� trabalhou este m�s? ");
		int horasTrabalhadas = scan.nextInt();
		
		double salarioMes = valorHora * horasTrabalhadas;
		
		System.out.println("Valor do sal�rio no m�s atual �: " + salarioMes);
	}
}
