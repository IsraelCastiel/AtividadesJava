/*
 * 7)	Faça um programa que solicita ao usuário um número inteiro com três dígitos e exibe 
 * o número invertido * (ex: usuário digitou 136, programa exibirá 631).
 */
 package Exercicios;

import java.util.Scanner;

public class programa7 {

	public static void main(String[] args) {
		int num, n1, n2, n3;
		Scanner teclado =  new Scanner(System.in);
		System.out.println("Digite um valor a ser invertido");
		num=teclado.nextInt();		
		n1 = num/100;
		n2 = (num%100)/10;
		n3 = (num%100)%10;
		num = n1 + n2*10 + n3*100;
		System.out.println("o valor invertido é " + num);
		
		
	}

}
