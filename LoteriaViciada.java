package Loteria;

import java.util.Scanner;

/**
 * "Loteria 'Viciada'"
 *
 * Os jogadores fazem o jogo escolhendo n�meros. Ent�o o programa seleciona uma sequencia dos n�meros menos comuns.
 *  	
 *  
 * @author Renan Moreira
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
		System.out.println("Seja bem vindo! \nA seguir voc� deve entrar com os n�meros que deseja apostar.");
		Thread.sleep(4000);
		System.out.println("==================================================================================");
		do {
			System.out.println("-------------------------------------------------------------------------------------");

			System.out.println((contador+1) + "� jogo, fa�a sua aposta!\n		<Escolha 15 n�meros entre 1 e 25>");
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
		System.out.print("Os n�meros sorteados foram: ");
		for (int i : resultado_sorteio) {
			System.out.print(" - " + i);;
		}	
	}
}
