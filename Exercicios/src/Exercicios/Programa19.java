/*19)	Escrever um algoritmo para ler tr�s n�meros inteiros que seriam lados de um tri�ngulo e 
 * imprimir o tipo de tri�ngulo (equil�tero, is�sceles, escaleno, ret�ngulo ou n�o formam um tri�ngulo).  
 */



package Exercicios;

import java.util.Scanner;

public class Programa19 {

	public static void main(String[] args) {
		
	    int lado1, lado2, lado3;
	    int opcao = 1;

	    while (opcao == 1) {
	        Scanner s = new Scanner(System.in);

	        System.out.println("Entre com o lado 1:");
	        lado1 = s.nextInt();
	        System.out.println("------------------------------------------------");
	        System.out.println("Entre com lado 2:");
	        lado2 = s.nextInt();
	        System.out.println("------------------------------------------------");
	        System.out.println("Entre com lado 3:");
	        lado3 = s.nextInt();
	        System.out.println("------------------------------------------------");

	        if ((lado1 < lado2 + lado3) && (lado2 < lado1 + lado3) && (lado3 < lado1 + lado2)) {
	            if (lado1 == lado2 && lado1 == lado3) {
	                System.out.println("Triangulo Equilatero");
	            } else if ((lado1 == lado2) || (lado1 == lado3)) {
	                System.out.println("Triangulo Isosceles");
	            } else
	                System.out.println("Tri�ngulo Escaleno");
	        } else {
	            System.out.println("N�o � um triangulo!");
	        }
	        System.out.println("------------------------------------------------");
	        System.out.println("Deseja continuar? 1 = sim, 2 = n�o");
	        opcao = s.nextInt();
	        System.out.println("------------------------------------------------");
	    }
	    System.out.println("Tchau!");
	}
	

	}


