package primeiroProjeto;

import java.util.Scanner;

public class FuncoesGenericas {
	
	public static void esperar() {
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("\nDigite 0 para continuar:");
		sc.next();
	}
	
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

	public static void clear() {
		for( int i=0; i<5; i++ ) {
			System.out.println("\n");
		}
	}
}
