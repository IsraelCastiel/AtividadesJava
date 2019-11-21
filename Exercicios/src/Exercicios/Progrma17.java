/*Receba o nome do aluno e as notas do 4 bimestre e apresente a média anual do aluno,
 *  classificando de 0 à 5: D, 5 a 7: C; de 7 a 9: B e 9 à 10: A. 
 */

package Exercicios;

import java.util.Scanner;

public class Progrma17 {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	
	float n1,n2,n3,n4,n5,n6,n7,n8,media;
	String nome;
	
	System.out.println("Informe o nome do aluno:");
	nome=teclado.next();
	
	System.out.println("Informe as nota do primeiro bimenstre:");
	n1=teclado.nextFloat();
	n2=teclado.nextFloat();
		
	System.out.println("Informe as nota do segundo bimenstre:");
	n3=teclado.nextFloat();
	n4=teclado.nextFloat();
	
	System.out.println("Informe as nota do terceito bimenstre:");
	n5=teclado.nextFloat();
	n6=teclado.nextFloat();
		
	System.out.println("Informe as nota do Quarto bimenstre:");
	n7=teclado.nextFloat();
	n8=teclado.nextFloat();

	media = (n1+n2+n3+n4+n5+n6+n7+n8)/8;
	System.out.println("A media anual ate o quarto bimestre é:" + media);
	
	
	if (media <= 5  ){
	   System.out.println("A media foi do "+nome+" foi D");		
		
	}else if(media >= 5 && media <= 7 ) {
		System.out.println("A media do "+ nome + "foi C");	
		
	}else if(media >= 7 && media <= 9) {
		System.out.println("A media do" + nome + "foi B");
		
	}else if (media >= 9 && media <= 10){
	   System.out.println("A media do"+ nome + "foi A");
	}
	}

}
