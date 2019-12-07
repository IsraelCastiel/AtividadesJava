/*23)	Uma empresa concederá um aumento de salário aos seus funcionários, variável de acordo com o cargo, conforme a tabela abaixo. Faça um programa que leia o salário e o código do cargo de um funcionário e calcule o seu novo salário. Se o cargo do funcionário não estiver na tabela, ele deverá, então, receber 15% de aumento. 
 * Mostre o salário antigo, o novo salário e a diferença entre ambos. 
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
