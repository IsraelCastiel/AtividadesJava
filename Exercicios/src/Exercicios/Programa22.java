/*22)	Crie um programa que receba o valor
 *  da cota��o em D�lar e Euro, tamb�m valor 
 *  em reais a ser convertido, apresente os valores da
 *   convers�o nas respectivas moedas. 
 */
package Exercicios;

import java.util.Scanner;

public class Programa22 {
	public static void main(String[] args) {
	float dolar = (float) 4.13;
	float euro = (float) 4.57;
	float valor,resultadodolar,resultadoeuro,reais;	
	Scanner tec=new Scanner(System.in);
	System.out.println("Informe o valor em reais que sera convertido");
	valor= tec.nextFloat();
	resultadodolar = valor / dolar;
	resultadoeuro = valor / euro;

	System.out.println(" o valor em dolar �:" + resultadodolar + "e o resultado em euro e:" + resultadoeuro   );
	
	
	
	
	
	
		
		
		
		

	}

}
