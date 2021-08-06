package Exericioss;

import java.util.Scanner;

public class Today3 {


	    public static void main (String[] args){
	    {
	        int[][] matriz = new int[3][3];
	        int cont=0;

	        Scanner input = new Scanner (System.in);

	        for (int x=0;x<3;x++)
	        {
	            for (int y=0;y<3;y++)
	            {
	                System.out.printf("\n Digite o valor de %m[x][y]: ");
	                matriz[x][y]= input.nextInt();
	                if (matriz[x][y]>10)
	                {
	                    cont++;
	                }
	            }
	        }
	        System.out.println("\n A matriz possui " + cont + " valores maiores que 10.");
	     }
	}

		
		
		
		
	}
	
