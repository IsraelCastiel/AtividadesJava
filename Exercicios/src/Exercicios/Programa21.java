/*Receba a palavra que o usuário digitar e atribua os seguintes valores 5 para vogais e 10 
 * para consoantes, apresente o resultado do valor da palavra digitada.* 
 * 
 */


package Exercicios;

import java.util.Scanner;

public class Programa21 {

	public static void main(String[] args) {
		
		Scanner tec = new Scanner(System.in);
		int i;
		String palavra;
		
		
		System.out.println("informe uma palavra:");
		palavra=tec.next();
		
		int qtd = palavra.length();
		
		for(i=0;i<qtd;i++) 
			
			System.out.print(palavra.charAt(i) + " ");
			System.out.println("\nPossue " + qtd + " letras.");
		
		

	}

}
