package primeiroProjeto;

public class CadastroAutomatico {
	public static NovoCliente[] cadastrarClientesAuto() {
		
		NovoCliente clientes[] = new NovoCliente[10];
		
		clientes[0] = new NovoCliente();
		clientes[0].setNome("Nicolas");
		clientes[0].setEnd("Samambaia");
		clientes[0].setTel("61986180872");
		
		clientes[1] = new NovoCliente();
		clientes[1].setNome("Ana Beatriz");
		clientes[1].setEnd("Taguatinga");
		clientes[1].setTel("61986180872");
		
		clientes[2] = new NovoCliente();
		clientes[2].setNome("Bia");
		clientes[2].setEnd("Samambaia");
		clientes[2].setTel("61986180872");
		
		clientes[3] = new NovoCliente();
		clientes[3].setNome("Carlos Souza");
		clientes[3].setEnd("Taguatinga");
		clientes[3].setTel("61986180872");
		
		clientes[4] = new NovoCliente();
		clientes[4].setNome("Daniel Rocha");
		clientes[4].setEnd("Samambaia");
		clientes[4].setTel("61986180872");
		
		clientes[5] = new NovoCliente();
		clientes[5].setNome("Ester");
		clientes[5].setEnd("Taguatinga");
		clientes[5].setTel("61986180872");
		
		clientes[6] = new NovoCliente();
		clientes[6].setNome("Francisco");
		clientes[6].setEnd("Samambaia");
		clientes[6].setTel("61986180872");
		
		clientes[7] = new NovoCliente();
		clientes[7].setNome("Gabriel Rodrigues");
		clientes[7].setEnd("Taguatinga");
		clientes[7].setTel("61986180872");
		
		clientes[8] = new NovoCliente();
		clientes[8].setNome("Helen");
		clientes[8].setEnd("Samambaia");
		clientes[8].setTel("61986180872");
		
		clientes[9] = new NovoCliente();
		clientes[9].setNome("Italo");
		clientes[9].setEnd("Taguatinga");
		clientes[9].setTel("61986180872");
		
		return clientes;
	}

	public static NovoProduto[] cadastrarProdutosAuto() {
		
		NovoProduto produtos[] = new NovoProduto[10];
		
		produtos[0] = new NovoProduto();
		produtos[0].setNome("Caneta");
		produtos[0].setDescricao("escreve bem");
		produtos[0].setPreco(50);
		produtos[0].setQtdsEmEstoque(100);
		
		produtos[1] = new NovoProduto();
		produtos[1].setNome("lapis");
		produtos[1].setDescricao("escreve um pouco");
		produtos[1].setPreco(50);
		produtos[1].setQtdsEmEstoque(100);
		
		produtos[2] = new NovoProduto();
		produtos[2].setNome("Caderno");
		produtos[2].setDescricao("não escreve mas é usavel");
		produtos[2].setPreco(50);
		produtos[2].setQtdsEmEstoque(100);
		
		produtos[3] = new NovoProduto();
		produtos[3].setNome("Estojo");
		produtos[3].setDescricao("guarda coisas q escrevem e outra coisa");
		produtos[3].setPreco(50);
		produtos[3].setQtdsEmEstoque(100);
		
		produtos[4] = new NovoProduto();
		produtos[4].setNome("Casa");
		produtos[4].setDescricao("Vc pode escrever dentro dela");
		produtos[4].setPreco(50);
		produtos[4].setQtdsEmEstoque(100);
		
		produtos[5] = new NovoProduto();
		produtos[5].setNome("Carro");
		produtos[5].setDescricao("Não escreva dirigindo");
		produtos[5].setPreco(50);
		produtos[5].setQtdsEmEstoque(100);
		
		produtos[6] = new NovoProduto();
		produtos[6].setNome("Marca texto");
		produtos[6].setDescricao("Pra quem não quer escrever");
		produtos[6].setPreco(50);
		produtos[6].setQtdsEmEstoque(100);
		
		produtos[7] = new NovoProduto();
		produtos[7].setNome("Borracha");
		produtos[7].setDescricao("Escreveu errado use isso");
		produtos[7].setPreco(50);
		produtos[7].setQtdsEmEstoque(100);

		produtos[8] = new NovoProduto();
		produtos[8].setNome("Corretivo");
		produtos[8].setDescricao("Caso a borracha não funcione");
		produtos[8].setPreco(50);
		produtos[8].setQtdsEmEstoque(100);
		
		produtos[9] = new NovoProduto();
		produtos[9].setNome("Compasso");
		produtos[9].setDescricao("escreva circulos");
		produtos[9].setPreco(50);
		produtos[9].setQtdsEmEstoque(100);
		
		return produtos;
	}
}
