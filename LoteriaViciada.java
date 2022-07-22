package Loteria;

import java.util.Scanner;

/**
 * "Loteria 'Viciada'"
 *
 *O programa lê uma lista de jogos (cada jogo possui um conjunto de 15 inteiros) e "sorteia" os 5 números menos comuns 
 *dentre os jogos. Por essa lógica, para que um determinado jogador consiga vencer o jogo é necessário uma quantidade 
 *muito grande de jogos diversificados.
 *
 * * @author Renan Moreira
 *
 */
public class LoteriaViciada extends Loterica{
	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		int qtd_jogadores = 5;
		int[][] jogo = new int[15][qtd_jogadores];
		int contador = 0;
		System.out.println("==================================================================================");
		System.out.println("==========================|| LOTERIA VICIADA ||===================================");
		System.out.println("==================================================================================");
		System.out.println("==================================================================================");
		System.out.println("Seja bem vindo! \nA seguir você deve entrar com os números que deseja apostar.");
		Thread.sleep(4000);
		System.out.println("==================================================================================");
		do {
			System.out.println("-------------------------------------------------------------------------------------");
			System.out.println((contador+1) + "° jogo, faça sua aposta!\n		<Escolha 15 números entre 1 e 25>");
			for (int i = 0; i < jogo.length; i++) {
				try {
					jogo[i][contador] = sc.nextInt();
				}catch (Exception e) {
					System.out.println("Valores de entrada incorretos.");// TODO: handle exception
				}
			}
			contador +=1;
		}while (contador < qtd_jogadores);
		setQtd_jogadores(qtd_jogadores);
		VerificaOcorrencia(jogo);
		int [] resultado_sorteio = Sorteio();
		System.out.print("Os números sorteados foram: ");
		for (int i : resultado_sorteio) {
			System.out.print(" - " + i);;
		}	
	}
}
