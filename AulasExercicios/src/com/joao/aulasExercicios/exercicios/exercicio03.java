package com.joao.aulasExercicios.exercicios;

import java.util.Scanner;

//3.	Fa�a um Programa que converta metros para cent�metros.
public class exercicio03 {

	public static void main(String[] args) {
		System.out.println("Digite um valor em metros: ");
		Scanner met = new Scanner(System.in);
		double metros = met.nextDouble();

		double centimetros = metros * 100;

		System.out.println("Valor em cm �: " + centimetros + "cm");

	}

}
