package turma29;

import java.util.Scanner;

public class ExerRepeticao2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner leia = new Scanner(System.in);
	        int x=1, num, contPar = 0, contImpar = 0;
	        
	        for( x= 1; x <= 10; x++){
	            System.out.println("Digite o " + x + "� n�mero");
	            num = leia.nextInt();
	            
	            if(num % 2 == 0){
	                contPar++;
	            }

	          
	            if(num % 2 == 1){
	                contImpar++;
	            }
	           
	        }
	        
	        System.out.println("Foram digitados " + contPar + " n�meros pares \n");
	        System.out.println("E " + contImpar + " n�meros �mpares");
	        
	    }
	}


