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
