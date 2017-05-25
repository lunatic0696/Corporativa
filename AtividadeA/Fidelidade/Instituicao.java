package Fidelidade;

public class Instituicao {
	
	public String nome;
	private Funcionario[] funcionarios;
	
	private static Instituicao instance = null;
	protected Instituicao(){}
	public static Instituicao getInstance(){
		if(instance == null){
			instance = new Instituicao();
		}
		return instance;
	}
	
	public void addFuncionario(){}

}
