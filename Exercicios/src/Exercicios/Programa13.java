/*13)	Uma empresa deseja contar quantos veículo 
são de determinada marca,  receba a marca e o nome do veículo e 
apresente ao final do programa quantos  são da marca FIAT. 
 */
package Exercicios;

import java.util.Scanner;

public class Programa13 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int c = 0;
		int qtd=0;
		String Marca[] = {"FIAT","FIAT","RENAULT","FIAT","LOGAN"};		
		for (Marca[c].compareTo("FIAT");c<5;c++) {
		if(Marca[c]=="FIAT"){
		qtd = qtd + 1;
		System.out.println("Carro"
				+ " na posição " + c +" " + Marca[c]);	
		}
	}	
}
}

	
