/*23)	Uma empresa conceder� um aumento de sal�rio aos seus funcion�rios, vari�vel de acordo com o cargo, conforme a tabela abaixo. Fa�a um programa que leia o sal�rio e o c�digo do cargo de um funcion�rio e calcule o seu novo sal�rio. Se o cargo do funcion�rio n�o estiver na tabela, ele dever�, ent�o, receber 15% de aumento. 
 * Mostre o sal�rio antigo, o novo sal�rio e a diferen�a entre ambos. 
 */
package Exercicios;
import java.util.Scanner;
public class Programa23 {
	public static void main(String[] args) {
		Scanner tec =new Scanner(System.in);
		int cargo;
		float salario;
		float aumento;
		aumento=0;
		System.out.println("Informe o  cargo do funcionario");
		cargo=tec.nextInt();
		System.out.println("Informe o salario");
		salario=tec.nextFloat();
		switch (cargo) {
			case 101:
			aumento = (float) (salario * 1.05);
			System.out.println("o aumento foi de "+aumento+salario);
			break;	
			case 102:
			aumento = (float) (salario * 1.75);
			System.out.println("o aumento foi de "+aumento+salario);
			break;
			case 103:
			aumento = (float) (salario * 1.1);
			System.out.println("o aumento foi de "+aumento+salario);
			break;
			default:
			aumento = (float) (salario * 1.15);
			System.out.println("o aumento foi de "+aumento+salario);
		}

	}

}
