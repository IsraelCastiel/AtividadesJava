/* 6)	Fa�a um programa que calcula os gastos com combust�vel em uma viagem. 
 * O programa deve solicitar ao usu�rio a dist�ncia a ser percorrida em Km, o consumo do carro em Km/litro e o pre�o do litro do combust�vel. 
 * Como resposta o programa dever� informar qual o valor em R$ a ser gasto com combust�vel na viagem.
 */

package Exercicios;

import java.util.Scanner;

public class Programa6 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		float dist;
		float consumo;
		float preco;
		System.out.println("Informe a distancia percorrida em km");
		dist = teclado.nextFloat();		
		System.out.println("Informe o pre�o da gasolina");
		preco=teclado.nextFloat();		
		System.out.println("Informe quanto o carro esta fazendo a cada km/l");
		consumo=teclado.nextFloat();		
		System.out.println("O valor a ser gasto � " + consumo*preco+ " R$");
	}

}
