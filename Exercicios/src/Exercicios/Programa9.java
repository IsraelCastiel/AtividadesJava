/*9)	Crie um programa que realize a conversão de graus Célcius para
 *  Fahrenheit e para graus Kelvin. A fórmula para conversão : 
 */

package Exercicios;

import java.util.Scanner;

public class Programa9 {
	public static void main(String[] args) {
	Scanner teclado=new Scanner(System.in);
	float C,F,K;
	System.out.println("Informe um valor em Célcius para converter em Farenheit");
	C=teclado.nextFloat();
	F = (float) ((1.8 * C) + 32);
	System.out.println("O valor em Celcius convertido para Farenheit é " + F+" Farenheit\n");
	System.out.println("Informe um valor em Célcius para converter em Kelvin");
	C=teclado.nextFloat();
	K = (float)(C + 273);
	System.out.println("O valor em Celcius convertido para Kelvin é " + K+" Kelvin  ");
	}
}
