/*18)	Escrever algoritmo par ler os valores inteiros para as variáveis J e K,
 *  trocar os valores de modo que J passe a ter o valor de K e K passe a ter o valor original de J. 
 *  Exibir os valores originais de J e K e os valores após a troca.
 * 
 */

package Exercicios;

import java.util.Scanner;

public class Programa18 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int j,k,auxi;
		
		System.out.println("Informe os valores J e K respectivamente:");
		j=teclado.nextInt();
		k=teclado.nextInt();
		System.out.println("Os valores antes da troca é para J:" + j + " e pra K "  + k);
		auxi=j;
		j=k;
		k=auxi;
		System.out.println("Os valores apos a troca e  J:" + j + " e pra K "  + k);
		}

}
