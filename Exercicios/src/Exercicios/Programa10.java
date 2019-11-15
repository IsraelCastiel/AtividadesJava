package Exercicios;
import java.util.Scanner;
public class Programa10 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		float n1,n2,n3,n4,n5,n6,media;
		System.out.println("Informe as temperaturas da semana");
		n1=teclado.nextFloat();
		n2=teclado.nextFloat();
		n3=teclado.nextFloat();
		n4=teclado.nextFloat();
		n5=teclado.nextFloat();
		media = (n1+n2+n3+n4+n5)/5;
		System.out.println("A media da temperatura da semana foi: "+media+" Graus");	
	}
}
