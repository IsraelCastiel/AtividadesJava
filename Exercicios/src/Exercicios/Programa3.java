/* 3)	Elabore um programa que leia um número.
 *  Se positivo armazene-o em A, se for negativo, em B. No final mostrar o resultado.
*/

package Exercicios;

import java.util.Scanner;

public class Programa3 {

	public static void main(String[] args) {
	float n1,A;
	Scanner	teclado = new Scanner(System.in);
	System.out.println("Informe um numero");
	n1 = teclado.nextFloat();
	if (n1>0) {
		A = n1;
		System.out.println("O Numero digitado é positivo " + n1);
	}else {
		B = n1;
		System.out.println("O Numero digitado é negativo " + n1);
		
	}

	}

}
