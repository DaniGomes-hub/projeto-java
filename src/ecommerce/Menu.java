package ecommerce;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import ecommerce.util.Cores;
import ecommerce.model.Produtos;

public class Menu {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		Produtos camiseta = new Produtos ("Camiseta", "cr12", "Iron Maiden", "M", 25.00f);
		camiseta.visualizar();
		
		Produtos caneca = new Produtos ("Caneca", "cg45", "Caneca Star Wars", "200 ml", 30.00f);
		caneca.visualizar();
		
		while (true) {
		
		System.out.println(Cores.ANSI_BLACK_BACKGROUND + Cores.TEXT_CYAN + "***************************************************************************");
		System.out.println("                                                                           ");
		System.out.println("                           ╚ Rock&Geeks ╗                                  ");
		System.out.println("            Seja Bem-Vindo ao seu WearStore favorito!                      ");
		System.out.println("                                                                           ");
		System.out.println("***************************************************************************");
		System.out.println("                                                                           ");
		System.out.println("            Por favor escolha uma opção ›                                  ");
		System.out.println("                                                                           ");
		System.out.println("            1 - ♦ Visualizar Produto                                       ");
		System.out.println("            2 - ♥ Adicionar Produto ao carrinho                            ");
		System.out.println("            3 - ♣ Finalizar Compra                                         ");
		System.out.println("            4 - ♠ Sair                                                     ");
		System.out.println("                                                                           ");
		System.out.println("                                                                           ");
		System.out.println("***************************************************************************");
		System.out.println("                                                                           ");
		System.out.println("           Entre com a opção desejada ›                                    ");
		System.out.println("                                                                           ");
		System.out.println("                                                                           ");
		
		
		int opcao = leia.nextInt();
		
		try {
			opcao = leia.nextInt();
		}catch(InputMismatchException e){
			System.out.println("\nDigite valores inteiros!");
			leia.nextLine();
			opcao=0;
		}
				
		if (opcao == 4) {
			System.out.println("             Moda Alternativa é na Rock&Geeks!                             ");
			sobre();
			leia.close();
			System.exit(0);
		}
		
		switch (opcao) {
				case 1:
					System.out.println("Veja nossos produtos: \n\n");
					
					System.out.println("Digite o tipo do produto: ");
					produtos = leia.next();
					
				keyPress();
				break;
				
				case 2:
					System.out.println("Insira o código da peça desejada: \n\n");
				
				keyPress();
				break;
				
				case 3:
					System.out.println("Legal! Falta pouco pra essa preciosidade ser sua!\n\n");
				
				keyPress();
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
		public static void keyPress() {

			try {

				System.out.println(Cores.TEXT_RED + "\n\nPressione Enter para Continuar...");
				System.in.read();

			} catch (IOException e) {

				System.out.println("Você pressionou uma tecla diferente de enter!");
}
		}
}

		