
/*
 *1)	Dada o raio do círculo calcular sua área e o perímetro. 
 */
package Exercicios;

import java.util.Scanner;

public class Programa1 {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	float pi = 3.14f;
	float area;
	float raio;
	float perimetro;
	System.out.println("Informe o raio do circulo");
	raio=teclado.nextFloat();
	raio=(float) Math.pow(raio,2);
	perimetro = 2*pi*raio;
	System.out.println("A area do circulo é " + raio*pi + " e seu perimetro é " + perimetro);
		
	}

}
