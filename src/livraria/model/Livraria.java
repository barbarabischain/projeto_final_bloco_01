package livraria.model;

public class Livraria
{
	private int	  	id;
    private String	nome;
    private	float	valor;
    
	public Livraria(int id, String nome, float valor)
	{
		this.id = id;
		this.nome = nome;
		this.valor = valor;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void visualizar()
	{
		System.out.println("\n**");
        System.out.println("Dados da Livraria:");
        System.out.println("**");
        System.out.println("\nCódigo: " + this.id);
        System.out.println("Nome do produto: " + this.nome);
        System.out.println("Valor do produto: " + this.valor);
	}
   
}
