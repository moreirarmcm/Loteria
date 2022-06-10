package ExecLoteria;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Jogo extends Aposta {
	
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos números existem no jogo?: ");
		int numerosTotais = sc.nextInt();
		System.out.println("Quantos números serão escolhidos pelo jogador?: ");
		int numerosEscolhidos = sc.nextInt();
		NumerosTotais(numerosTotais);
		int [] numerosApostados = new int[numerosEscolhidos];
		
		System.out.println("Faça sua aposta! \n\n <Você deve escolher " + numerosEscolhidos + " números, entre 1 e " +numerosTotais + ">");

		for (int i = 0; i < numerosEscolhidos; i++) {
			
			numerosApostados[i] = sc.nextInt();
		}
		//Arrays.stream(numerosApostados).forEach(System.out::println);
		//System.out.println(Arrays.asList(numerosApostados));
		//System.out.println(Arrays.toString(numerosApostados));
		NumerosApostados(numerosApostados);	
		//OrganizandoAsApostas();
		Imprime();
	}
}

//1 2 3 4 5 6 7 8 9 10 11 12 13 14 15

// 1 2 3 4 5 6 7 8 9 10 11 12 25 14 15