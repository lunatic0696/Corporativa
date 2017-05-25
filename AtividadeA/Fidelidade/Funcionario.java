package Fidelidade;

public class Funcionario {
	
	public String nome;
	
	void realizarTroca(Produto produto,Cliente cliente){
		
		cliente.pontos -= produto.getPrecoEmPontos();
		
	}
	
void realizarVenda(Produto produto,Cliente cliente){
		
		cliente.dinheiro -= produto.getPrecoEmPontos();
		cliente.dinheiro += produto.getPontosPorCompra();
		
	}

}
