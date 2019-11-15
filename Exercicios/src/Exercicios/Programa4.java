/* 4)	Crie um programa que converta ano luz para Km, receba a distância da Terra e apresente em KM.
 */

package Exercicios;

import java.util.Scanner;

public class Programa4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double anoluz = 9460730777119.56;
		double dist;
		System.out.println("Qual a distancia em anos luz deseja calcular");
		dist=teclado.nextDouble();
		System.out.println("A distancia em anos luz é " + anoluz*dist+ " KM");
		
	}

}
