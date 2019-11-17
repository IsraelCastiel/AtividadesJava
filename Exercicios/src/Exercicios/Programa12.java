/* 12)	Dados três valores distintos, fazer um algoritmo que,
 * após a leitura destes dados coloque-os em ordem crescente. 
 */
package Exercicios;

import java.util.Scanner;

public class Programa12 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n1,n2,n3;
		System.out.println("Informe tres numero.");
		n1=teclado.nextInt();
		n2=teclado.nextInt();
		n3=teclado.nextInt();
		
		if(n1 < n2) {
				if(n2<n3){
				System.out.println(n1+"\n"+n2+"\n"+n3);
				}else if(n1<n3){
				System.out.println(n1+"\n"+n3+"\n"+n2);	
				}else{
				System.out.println(n3+"\n"+n1+"\n"+n2);	
				}			
		}
		
			  else if(n2 < n3){
			  if(n1 < n3) {
				System.out.println(n2+"\n"+n1+"\n"+n3);	
			}else{
				System.out.println(n2+"\n"+n3+"\n"+n1);	
			}					
		    }else{
			System.out.println(n3+"\n"+n2+"\n"+n1);
		}
	}
}

