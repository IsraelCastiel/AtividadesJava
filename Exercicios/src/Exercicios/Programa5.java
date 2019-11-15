/*
 * 5)	Ler um número e verificar se ele é par ou ímpar. 
 * Quando for par armazenar esse valor em P e quando for ímpar armazená-lo em I.
 *  Exibir P e I no final do processamento.
 */

package Exercicios;

import java.util.Scanner;

public class Programa5 {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	int n1,p,i;
	System.out.println("Informe um numero");
	n1=teclado.nextInt();
	if(n1%2==0) {
		p = n1;
		System.out.println("O numero é par " + p );		
	}else {
		i = n1;
		System.out.println("O numero é impar " + i);
	}
	
	}

}
