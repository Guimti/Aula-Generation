package Exericioss;

public class cliente1 extends Cliente {

	public cliente1 ( String nome,  String idade,  String sobreNome,  String produto) 
	{
	
	super(nome, idade, sobreNome, produto);
	
	}
	
	public void imprimirInfo()
	{
		System.out.println("\n Nome Cliente: "+getNome()+"\n Idade do Cliente: "+getIdade()+
				"\n Sobrenome:  "+getSobreNome()+"\n Produto: "+getProduto());
	}
	
	
	
	
}
