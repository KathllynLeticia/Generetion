package ArmyVetoreseMatrizes;

import java.util.Scanner;

public class ArryVetor {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero[] = new int[10];
		int x, somaNum=0;
		float mediaNum;
		
		for (x=0;x<10;x++)
		{
			System.out.println("Entre com um número: ");
			numero[x] = leia.nextInt();
			somaNum += numero[x];
			
		}
		mediaNum = somaNum / 10;
		System.out.println("\nElementos de índice ímpar: ");
		for(x=0;x<10;x++) {
			if(x % 2 == 1) {
				System.out.println("\n"+numero[x]);	
			}
		}
		
		System.out.println("\nElementos do vetor que são números pares");
		for(x=0;x<10;x++) {
			if(numero[x] % 2 ==0);
			
		}
		

	
	
		System.out.println("\nSoma de todos os elementos do meu array: " +somaNum);
		System.out.println("\nMédia dos elementos do array: " +mediaNum);
}

}

