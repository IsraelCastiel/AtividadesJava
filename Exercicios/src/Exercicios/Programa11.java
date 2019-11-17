/*11)	Uma empresa possui 50 vendedores que ganham por comissão sobre cada produto vendido.
 * Cada vendedor em um determinado mês vendeu x produtos. A emprese deseja obter um relatório com o Nome, Total de vendas e o valor pago ao vendedor 
 * que vendeu mais e o vendedor que vendeu menos, a comissão da empresa é de 15%.
 */
package Exercicios;

import java.util.Scanner;

public class Programa11 {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in); 	
		String nomevendedor1; 
		String nomevendedor2; 
		float venda1;
		float venda2;
		float vendeumais;
		float resultado;
		float comissao;
		
		System.out.println("Digite o nome do vendedor1");
		nomevendedor1=teclado.next();
		
		System.out.println("Qual o total de vendas do vendedor");
		venda1=teclado.nextFloat();	
		
		System.out.println("Digite o nome do vendedor2");
		nomevendedor2=teclado.next();
		
		System.out.println("Qual o total de vendas do vendedor");
		venda2=teclado.nextFloat();
		
		
		if(venda1>venda2){
			
			System.out.printf("quem vendeu mais foi vendedor1 %.1f",venda1,"\n" );	
			resultado = 15 * venda1;
			comissao = resultado / 100;
			System.out.printf("e sua comissao foi %.1f",comissao);
			
			

		} else {
			System.out.printf("quem vendeu mais foi vendedor2 %.1f",venda2 );
			System.out.printf("quem vendeu mais foi vendedor2 %.1f",venda2,"\n" );	
			resultado = 15 * venda2;
			comissao = resultado / 100;
			System.out.printf("e sua comissao foi %.1f",comissao);		
	}

}
}

