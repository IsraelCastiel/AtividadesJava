/*9)	Crie um programa que realize a convers�o de graus C�lcius para
 *  Fahrenheit e para graus Kelvin. A f�rmula para convers�o : 
 */

package Exercicios;

import java.util.Scanner;

public class Programa9 {
	public static void main(String[] args) {
	Scanner teclado=new Scanner(System.in);
	float C,F,K;
	System.out.println("Informe um valor em C�lcius para converter em Farenheit");
	C=teclado.nextFloat();
	F = (float) ((1.8 * C) + 32);
	System.out.println("O valor em Celcius convertido para Farenheit � " + F+" Farenheit\n");
	System.out.println("Informe um valor em C�lcius para converter em Kelvin");
	C=teclado.nextFloat();
	K = (float)(C + 273);
	System.out.println("O valor em Celcius convertido para Kelvin � " + K+" Kelvin  ");
	}
}
