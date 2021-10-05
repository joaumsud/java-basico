package com.joao.aulasExercicios.exercicios;

import java.util.Scanner;

/*João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o 
 * rendimento diário de seu trabalho. Toda vez que ele traz um peso de peixes maior 
 * que o estabelecido pelo regulamento de pesca do estado de São Paulo (50 quilos) 
 * deve pagar uma multa de R$ 4,00 por quilo excedente. João precisa que você faça um 
 * programa que leia a variável peso (peso de peixes) e calcule o excesso. Gravar na 
 * variável excesso a quantidade de quilos além do limite e na variável multa o valor 
 * da multa que João deverá pagar. Imprima os dados do programa com as mensagens adequadas.*/

public class Exercicio11 {
	public static void main(String[] args) {
		Scanner peixaria = new Scanner(System.in);
		System.out.println("Digite o peso do peixe: ");
		double peso = peixaria.nextDouble();

		if (peso < 100) {

			double calculo = (peso - 50) * 4.00;
			double excesso = peso - 50;
			System.out.println("O valor a ser pago pelo excesso é de:R$  " + calculo );
			System.out.println("O peso excedido é de:  " + excesso + "kg");
		}

	}
}
