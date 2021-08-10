package Exericioss;

public class Cliente {
	private String nome;
	private String idade;
	private String sobreNome;
	private String produto;
	
	
	public Cliente(String nome, String idade, String sobreNome, String produto) {
			super();
			this.nome = nome;
			this.idade = idade;
			this.idade = sobreNome;
			this.idade = produto;

		
	
}
	public String getNome() {
		return nome;
		}
	
	public void setNome(String nome) {
		this.nome = nome;
		}
	
	
	public String getIdade() {
		return idade;
		}
		public void setIdade(String idade) {
		this.idade = idade;
		}
	
	
		public String getSobreNome() {
			return sobreNome;
			}
		
		public void setSobreNome(String sobreNome) {
			this.sobreNome = sobreNome;
			}

		public String getProduto() {
			return produto;
			}
		
		public void setProduto(String produto) {
			this.produto = produto;
			}
		
		
		public void imprimir()
		{
			System.out.println("\n nome do Cliente: "+ getNome()+ "\n Idade do cliente: "+getIdade()+ "\n Sobrenome:  "+getSobreNome()+ "\n Produto: "+getProduto());
		}
		
		
		
	
}