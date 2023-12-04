package repetiçoes;

import java.util.Scanner;

//quem preenche o array vazio é um for (10 vezes)
//"for rich", pra imprimir o conteudo de um array usar um for 

public class ex01 {

	public static void main(String[] args) {
		
		double medias[]=new double[10];
		double notas[]= {1,2,3,4,5,6,7,8,9,10};
		Scanner entrada=new Scanner(System.in);
		for(int x=0;x<10;x++) {
			System.out.print("Digite uma media: ");
			medias[x]=entrada.nextDouble();
		}
		
		for(int e=0;e<10;e++) {
			System.out.println(medias[3]);
		}
		
		for(double z:medias) {
			System.out.println(z+" ");
		}
		System.out.println(notas[3]);
		
		
		
		
		//preencher um array tamanho cinco depois outro do mesmo tamanho mas um é chamado de 2x pq tudo do outro array vai ser duplicado no 2x
		//ex: se no 1 é 20 no outro sera 40 se um é 30 outro é 60
		//Outro array pra soma
		//outro pra soma (0,) 2x [4]
		
	}

}
