/*20)	Faça um algoritmo que leia 10 nomes e imprima os 10.
 *  
 */
package Exercicios;

import java.util.Scanner;

public class Programa20 {

	public static void main(String[] args) {

	Scanner tec = new Scanner (System.in);
	String n1,n2,n3,n4,n5,n6,n7,n8,n9,n10;
	int opcao=1;
	
	while(opcao==1) {	
   	
	System.out.println("Digite 10 nomes respectivamente:");
	n1=tec.next();
	n2=tec.next();
	n3=tec.next();
	n4=tec.next();
	n5=tec.next();
	n6=tec.next();
	n7=tec.next();
	n8=tec.next();
	n9=tec.next();
	n10=tec.next();
	System.out.println("Os 10 nomes são \n" + n1 + "\n" + n2 + "\n" + "\n" + n3 + "\n" + n4 + 
			"\n" + "\n" + n5 +"\n"+ n6 + "\n" +"\n" + "\n"+ n7 + "\n" + n8 + "\n" + n9 +"\n" + n10);
	System.out.println("Deseja imprimir novamente 1 - sim  ou 2 - nao");
	opcao=tec.nextInt();

	}
		
	}

}
