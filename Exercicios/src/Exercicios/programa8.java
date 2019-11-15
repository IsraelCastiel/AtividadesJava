/* 8)	Faça um programa que solicita ao usuário uma quantidade de segundos, 
 * converte em horas, minutos e segundos e exibe na tela.
 */


package Exercicios;

import java.util.Scanner;

public class programa8 {
	
	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	int num, hrs, min, seg, aux;
	System.out.println("Digite uma quantidade de segundos:");
	num = teclado.nextInt();
	hrs = num/3600;                                 //3600 é a quantidade de segundos contidas em uma hora.
	aux = (num%3600);                               //Variavel auxiliar atribuida ao resto da divisão.
	min = aux/60;                                   //60 é a quantidade de segundos contidas em um minuto.
	seg = aux%60;	
	System.out.println(hrs +" horas " + min+" min " + seg+"segundos");
	

	}

}
