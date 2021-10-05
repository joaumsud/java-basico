package com.joao.aulasExercicios.exercicios;

import java.util.Scanner;

/*12 Faça um Programa que pergunte quanto você ganha por hora e 
 * o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês, 
 * sabendo-se que são descontados 11% para o Imposto de Renda, 
 * 8% para o INSS e 5% para o sindicato, faça um programa que nos dê: */
public class Exercicio12 {
	public static void main(String[] args) {
		Scanner pagode = new Scanner(System.in);
		System.out.println("Digite o valor da sua hora de trabalho: ");
		double valorHora = pagode.nextDouble();
		System.out.println("Digite quantas horas você trabalha por mês: ");
		double horasTrabalhadas = pagode.nextDouble();

		double salarioBruto = valorHora * horasTrabalhadas;
		System.out.println("Salário bruto no mês atual: " + salarioBruto);

		double ir = salarioBruto * 0.11;
		double inss = salarioBruto * 0.08;
		double sindicato = salarioBruto * 0.05;

		double impostoTotal = ir + inss + sindicato;

		System.out.println("Valor do imposto de renda: R$ " + ir);
		System.out.println("Valor do INSS: R$ " + inss);
		System.out.println("Valor do imposto sindical: R$ " + sindicato);
		System.out.println("Valor Total dos Impostos: R$ " + impostoTotal);

		System.out.println("Salário líquido é: R$ " + (salarioBruto - impostoTotal));

	}
}
