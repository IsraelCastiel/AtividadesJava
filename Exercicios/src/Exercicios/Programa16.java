/* 16)	Imprima os números primos até 200.
 * 
 */

package Exercicios;

public class Programa16 {

	static int total = 200;
	public static void main(String[] args) {
		
	int v[] = new int [total];
	for (int i = 2; i< total;i++) {		
		v[i] = i;
	}
	
	for(int i = 2;i < total; i++) {
		
		if(v[i] !=0){
			
			for(int j = 2*i; j < total;j+=i) {
				
				v[j] = 0;
				
			}
			
		}
		
	}
	
	for(int i = 2;i < total;i++) {
		
		if (v[i] !=0){
			
			System.out.print(v[i] + " - " + "\n");
			
		}

		
	}

  }

}
