/*
 * 2)Tendo como dados de entrada a altura e o sexo de uma pessoa, 
 * construa um algoritmo que calcule seu peso ideal, 
 * utilizando as seguintes fórmulas: a) Para homens: (72.7*h) – 58	
b)  Para mulheres: (62.1*h) - 44.7 (h = altura)
 */

package Exercicios;
import java.util.Scanner;
public class Programa2 {
	
	public static void main(String[] args) {
	float altura,res;
	int genero;
	Scanner teclado = new Scanner(System.in);
	System.out.println("Qual a altura dessa pessoa");
	altura = teclado.nextFloat();
	System.out.println("Qual o genero dessa pessoa sendo 1 para masculino e 2 para feminino");
	genero = teclado.nextInt();
	switch (genero) {
	case 1:
		res=(float) ((72.7 * altura)-58);
		System.out.println("O peso ideial para o genero masculino é " + res);
		break;
	case 2:
		res=(float) ((62.1 * altura)-44.7);
		System.out.println("O peso ideial para o genero feminino " + res );
	default:
		System.out.println("Valor invalido");
		break;
	}	
   }
}
