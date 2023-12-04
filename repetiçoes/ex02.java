package repetiçoes;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		
		int array[]=new int[5];
		int array2x[]=new int[5];
		int arraySoma[]=new int[5];
		
		Scanner input=new Scanner(System.in); 
		for(int x=0;x<4;x++) {
			System.out.println("Digite um número: ");
			array[x]=input.nextInt();	
		}
		
		for(int y=0;y<5;y++) {
			array2x[y]= array[y]*2;	
		}
		
		for(int i=0;i<5;i++) {
			arraySoma[i]=array[i]+array2x[i];
		}
		
		for(int z:arraySoma) {
			System.out.println(z+" ");
			
			
		}
	}

}



//tem que fazer eles se multiplicarem um por um no indice ???