/******************************************************************************

O resultado para o número natural representando quantas peças
existem num jogo de dominó´do tipo duplo-N 
é dada pela soma do total de peças, com o numero de linhas duplo-N + 1

*******************************************************************************/

import java.util.Scanner;

public class JogoDeDominos{
	public static void main(String[] args) {
	    int duploN;
	    int resultado = 0;
	    int i;
		
		Scanner input = new Scanner(System.in);
		duploN = input.nextInt();
	
		/* 
		Utilizando um laço de para contagem de peças em cada linha		
		*/

		for( i = 1; i <= duploN+1; i++ ) {
		    resultado = resultado + i;
		}
		
		System.out.println(resultado);		
	}
}