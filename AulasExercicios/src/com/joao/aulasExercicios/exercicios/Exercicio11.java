package com.joao.aulasExercicios.exercicios;

import java.util.Scanner;

/*Jo�o Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o 
 * rendimento di�rio de seu trabalho. Toda vez que ele traz um peso de peixes maior 
 * que o estabelecido pelo regulamento de pesca do estado de S�o Paulo (50 quilos) 
 * deve pagar uma multa de R$ 4,00 por quilo excedente. Jo�o precisa que voc� fa�a um 
 * programa que leia a vari�vel peso (peso de peixes) e calcule o excesso. Gravar na 
 * vari�vel excesso a quantidade de quilos al�m do limite e na vari�vel multa o valor 
 * da multa que Jo�o dever� pagar. Imprima os dados do programa com as mensagens adequadas.*/

public class Exercicio11 {
	public static void main(String[] args) {
		Scanner peixaria = new Scanner(System.in);
		System.out.println("Digite o peso do peixe: ");
		double peso = peixaria.nextDouble();

		if (peso < 100) {

			double calculo = (peso - 50) * 4.00;
			double excesso = peso - 50;
			System.out.println("O valor a ser pago pelo excesso � de:R$  " + calculo );
			System.out.println("O peso excedido � de:  " + excesso + "kg");
		}

	}
}
