package com.joao.aulasExercicios.exercicios;

import java.util.Scanner;

/*12 Fa�a um Programa que pergunte quanto voc� ganha por hora e 
 * o n�mero de horas trabalhadas no m�s. Calcule e mostre o total do seu sal�rio no referido m�s, 
 * sabendo-se que s�o descontados 11% para o Imposto de Renda, 
 * 8% para o INSS e 5% para o sindicato, fa�a um programa que nos d�: */
public class Exercicio12 {
	public static void main(String[] args) {
		Scanner pagode = new Scanner(System.in);
		System.out.println("Digite o valor da sua hora de trabalho: ");
		double valorHora = pagode.nextDouble();
		System.out.println("Digite quantas horas voc� trabalha por m�s: ");
		double horasTrabalhadas = pagode.nextDouble();

		double salarioBruto = valorHora * horasTrabalhadas;
		System.out.println("Sal�rio bruto no m�s atual: " + salarioBruto);

		double ir = salarioBruto * 0.11;
		double inss = salarioBruto * 0.08;
		double sindicato = salarioBruto * 0.05;

		double impostoTotal = ir + inss + sindicato;

		System.out.println("Valor do imposto de renda: R$ " + ir);
		System.out.println("Valor do INSS: R$ " + inss);
		System.out.println("Valor do imposto sindical: R$ " + sindicato);
		System.out.println("Valor Total dos Impostos: R$ " + impostoTotal);

		System.out.println("Sal�rio l�quido �: R$ " + (salarioBruto - impostoTotal));

	}
}
