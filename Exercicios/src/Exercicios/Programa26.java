/*Para calcular um frete de caminhão, o gerente da empresa primeiro obtém o
volume que a carga vai ocupar e através dele estimar o peso e assim calcular o
valor do frete.
Calcule o frete multiplicando o volume da mercadoria por 300kg/m³;
Utilize a fórmula: ALTURA x LARGURA x COMPRIMENTO x (Quantidade de
volumes) x 300 (FATOR).
Ex: 1 m x 1m x 1m x 1 x 300 = 300 kg/ m³
Para cálculo: 1 kg / m³ será cobrado R$ 0,20* 
 */

package Exercicios;

import java.util.Scanner;

public class Programa26 {

	public static void main(String[] args) {
		
		
		float altura,largura,comprimento,quantidadevol,resultado;
		float fator = 0.20F;
		Scanner tec = new Scanner(System.in);
		System.out.println("Informe a altura,largura,comprimento,quantidadevol");
		altura = tec.nextFloat();
		largura = tec.nextFloat();
		comprimento = tec.nextFloat();
		quantidadevol = tec.nextFloat();
		resultado = altura * largura * comprimento * quantidadevol;
		System.out.println(resultado);
		
		
		
		
		
		
		
		
		
		
		
		
	

	}

}
