package primeiroProjeto;

import java.util.Scanner;

public class FuncoesGenericas {
	// gera o menu
	public static void menu() {
		System.out.println("----------------------------------");
		System.out.println("1. Cadastro de novo cliente. ");
		System.out.println("2. Busca por cliente. ");
		System.out.println("3. Cadastro de novo produto. ");
		System.out.println("4. Busca por produto. ");
		System.out.println("5. Cadastro de venda. ");
		System.out.println("6. Mostrar produtos em estoque. ");
		System.out.println("7. Sair. ");
		System.out.print("\nEscolha um comando: ");
	}
	// espera o usuario digitar algo 
	public static void esperar() {
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("\nDigite 0 para continuar:");
		sc.next();
	}
	// verifica se ha clientes e produtos cadastrados
	public static boolean verificar(NovoCliente clientes[], NovoProduto produtos[]) {
		boolean erro = false;
		if( clientes == null ) {
			System.out.println("Nenhum cliente encontrado!!!!\n");
			erro = true;
		}
		if( produtos == null ) {
			System.out.println("Nenhum produto encontrado!!!!!\n");
			erro = true;
		}
		FuncoesGenericas.esperar();
		return erro;
	}
	// limpa o terminal
	public static void clear() {
		for( int i=0; i<5; i++ ) {
			System.out.println("\n");
		}
	}

}
