package Exericioss;
import java.util.Scanner;
public class Exer4Today {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float[][] mat1 = new float [2][2];
		
		int l,c,op;
		
		Scanner leia = new Scanner(System.in);
		
		for(l=0;l<2;l++)
		{
			for(c=0;c<2;c++)
			{
				System.out.println("\nEntre com o valor da Matriz1: ");
				mat1[l][c] = leia.nextFloat();
			}
		}
		do
		{
			System.out.println("\n\t\t\tMenu de op��es");
			
		
			System.out.println("\n(4) Imprimir as matrizes.");
			System.out.println("\n(0) Sair do programa.");
			
			System.out.println("\nDigite sua op��o: ");
			op = leia.nextInt();
			
			switch(op)
			{
			
			case 4:
				for(l=0;l<2;l++)
				{
					for(c=0;c<2;c++)
					{
						
						System.out.println("\nMatriz1: "+mat1[l][c]);
						
					}
				}
				break;
				default:
					System.out.println("\n Op��o inv�lida!!!");
				for(int x=1;x<=15;x++)
				{
					System.out.println("\n");
				}
				
			}
		}
		while(op!=0);
	}
}
