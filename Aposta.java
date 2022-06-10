package ExecLoteria;

import java.util.Arrays;

public class Aposta {
	private static int totalNumeros;
	
	private static int numerosJogador;
	private static int[][] aposta;
	
	public static void NumerosTotais(int totalNumeros) {
		setTotalNumeros(totalNumeros);
		aposta = new int[totalNumeros][2];
		for (int i = 0; i < totalNumeros; i++ ) {
			aposta[i][0] = i + 1; 
			aposta[i][1] = 0; 
		}
	}
	
	public static void NumerosApostados (int [] numerosApostados) {
		for (int i = 0; i < numerosApostados.length; i++) {
			int j  = numerosApostados[i] - 1;
			aposta[j][1]++;
		}
	}
	
	public static void OrganizandoAsApostas() {
		int campo0 = 0;
		int campo1 = 0;
		boolean reiniciar = false;
		for (int i = 0; i < totalNumeros - 1; i++) {
			if (aposta[i][1] > aposta[i + 1][1]) {
				campo0 = aposta[i + 1][0];
				campo1 = aposta[i + 1][1];
				
				aposta[i + 1][0] = aposta[i][0];
				aposta[i + 1][1] = aposta[i][1];
				
				aposta[i][0] = campo0;
				aposta[i][1] = campo1;
				
				reiniciar = true;
			}
			if ( (i>= totalNumeros - 2) && (reiniciar == true) ) {
				i = -1;
				reiniciar = false;
			}
		}
	}
	
	public static void Imprime () {
		for (int i = 0; i < aposta.length; i++) {
			System.out.println(aposta[i][0] + " e " + aposta[i][1]);
		}
	}
	public static int getTotalNumeros() {
		return totalNumeros;
	}

	public static void setTotalNumeros(int totalNumeros) {
		Aposta.totalNumeros = totalNumeros;
	}

}
