package turma29;

import java.util.Scanner;

public class ExerCINCOOO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero, soma=0;       
		Scanner leia = new Scanner(System.in);
		do { 
			System.out.printf("\nDigite o número a ser somado (digite 0 para finalizar): "); 
			numero = leia.nextInt();
			soma += numero; 
			}             
		while(numero!=0);    
		System.out.println("\nA soma dos números digitados é igual a" +soma);   
		}  
	}
		
		
		
		
	


