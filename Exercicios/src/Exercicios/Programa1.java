
/*
 *1)	Dada o raio do c�rculo calcular sua �rea e o per�metro. 
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
	System.out.println("A area do circulo � " + raio*pi + " e seu perimetro � " + perimetro);
		
	}

}
