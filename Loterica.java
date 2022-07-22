package Loteria;

public class Loterica {
	private static int qtd_jogadores;
	private static int[][]cartela_de_numeros;
	private static int [] resultado_sorteio;
	static int jogador_atual = 0;
	/**
	 * Inicializa a o vetor cartela_de_numeros. O intervalo de numeração vai do 1 ao 25.
	 * 
	 */
	private static void InstanciaCartela() {
		cartela_de_numeros = new int[25][2]; 
		for (int i = 0; i < 25; i++){
			cartela_de_numeros[i][0] = i + 1;
			cartela_de_numeros[i][1] = 0;
		}	
	}
	/**
	 * Método que lê o vetor 'jogos' e, para cada o corrência de um determinado número entre 1 e 25, 
	 * incrementa 1 no índice de ocorrência desse número.
	 * 
	 * @param jogos
	 */
	public static void VerificaOcorrencia(int [][] jogos) {
		InstanciaCartela(); // instancia o vetor cartela_de_jogos;
		do {
			for (int i = 0; i < jogos.length; i++) {
				int valor_atual = jogos[i][jogador_atual];
				cartela_de_numeros[valor_atual - 1][1] += 1;
			}
			jogador_atual+= 1;
		}while (jogador_atual < qtd_jogadores);
	}
	/**
	 * Verifica o vetor cartela_de_numeros e seleciona os cinco números menos recorrentes
	 * 
	 * @return
	 */
	public static int [] Sorteio() {
		resultado_sorteio = new int[5];
		int contador = 0;
		int ocorrencia_procurada = 0;
		for (int i = 0; i < 25; i++) {
			if (cartela_de_numeros[i][1] == ocorrencia_procurada) {
				resultado_sorteio[contador] = cartela_de_numeros[i][0];
				contador += 1;
			}
			if (contador == resultado_sorteio.length) {
				return resultado_sorteio;
			}
			if (i == 24 && contador < resultado_sorteio.length) {
				i = -1;
				ocorrencia_procurada+=1;
			}
		}
		return resultado_sorteio;
	}
	
	public static int getQtd_jogadores() {
		return qtd_jogadores;
	}
	public static void setQtd_jogadores(int qtd_jogadores) {
		Loterica.qtd_jogadores = qtd_jogadores;
	}
}
