/*
 * 7)	Fa�a um programa que solicita ao usu�rio um n�mero inteiro com tr�s d�gitos e exibe 
 * o n�mero invertido * (ex: usu�rio digitou 136, programa exibir� 631).
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
		System.out.println("o valor invertido � " + num);
		
		
	}

}
