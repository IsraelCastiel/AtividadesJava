/*
 * 5)	Ler um n�mero e verificar se ele � par ou �mpar. 
 * Quando for par armazenar esse valor em P e quando for �mpar armazen�-lo em I.
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
		System.out.println("O numero � par " + p );		
	}else {
		i = n1;
		System.out.println("O numero � impar " + i);
	}
	
	}

}
