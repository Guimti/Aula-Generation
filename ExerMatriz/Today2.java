package Exericioss;

import java.util.Scanner;

public class Today2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int vet[] = new int[6], numpar=0, numimpar=0;
		String par ="", impar="";
	
		Scanner ler =new Scanner (System.in);
		
		for (int x=0; x<6; x++)
		{
			System.out.println("\n Digite número");
			vet[x] = ler.nextInt();
			
			if(vet[x] % 2 == 0)  
			{
				par = par + vet[x];
			}
			
			
		}
		
		System.out.println("\n Numeros pares"+numpar);
		System.out.println("\n Numeros impares"+numimpar);
	}

}
