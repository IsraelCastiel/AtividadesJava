/* 6)	Faça um programa que calcula os gastos com combustível em uma viagem. 
 * O programa deve solicitar ao usuário a distância a ser percorrida em Km, o consumo do carro em Km/litro e o preço do litro do combustível. 
 * Como resposta o programa deverá informar qual o valor em R$ a ser gasto com combustível na viagem.
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
		System.out.println("Informe o preço da gasolina");
		preco=teclado.nextFloat();		
		System.out.println("Informe quanto o carro esta fazendo a cada km/l");
		consumo=teclado.nextFloat();		
		System.out.println("O valor a ser gasto é " + consumo*preco+ " R$");
	}

}
