package ecommerce;

import java.util.Scanner;
import ecommerce.util.Cores;

public class Menu {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		while (true) {
		
		System.out.println(Cores.ANSI_BLACK_BACKGROUND + Cores.TEXT_CYAN + "***************************************************************************");
		System.out.println("                                                                           ");
		System.out.println("                           Rock&Geeks                                      ");
		System.out.println("            Seja Bem - Vindo ao WearStore favorita!                        ");
		System.out.println("                                                                           ");
		System.out.println("***************************************************************************");
		System.out.println("                                                                           ");
		System.out.println("            Por favor insira uma opção:                                    ");
		System.out.println("            1 - Visualizar Produto                                         ");
		System.out.println("            2 - Adicionar Produto ao carrinho                              ");
		System.out.println("            3 - Finalizar Compra                                           ");
		System.out.println("            4 - Sair                                                       ");
		System.out.println("                                                                           ");
		System.out.println("                                                                           ");
		System.out.println("***************************************************************************");
		System.out.println("Entre com a opção desejada:                                                ");
		System.out.println("                                                                           ");
		System.out.println("                                                                           ");
		
		int opcao = leia.nextInt();
		
		if (opcao == 4) {
			System.out.println("\nModa Alternativa é na Rock&Geeks!                                          ");
			sobre();
			leia.close();
			System.exit(0);
		}
		
		switch (opcao) {
				case 1:
					System.out.println("Veja nossos produtos: \n\n");

				break;
				
				case 2:
						System.out.println("Insira o código da peça desejada: \n\n");

				break;
				case 3:
						System.out.println("Legal! Falta pouco pra essa preciosidade ser sua!\n\n");

				break;
		
		}
	}
}		
		public static void sobre () {
				System.out.println(Cores.TEXT_CYAN + "***************************************************************************");
				System.out.println("             ♦ Projeto Desenvolvido por: Daniella Gomes ♥                  ");
				System.out.println("             ♣ Generation Brasil - generation@generation.org ♠             ");
				System.out.println("             → github.com/DaniGomes-hub/ProjetoConta ←                     ");
				System.out.println("***************************************************************************");		
		}
}