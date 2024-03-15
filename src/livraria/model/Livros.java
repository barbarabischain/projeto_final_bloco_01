package livraria.model;

public class Livros extends Livraria
{
	private int		genero;
	private String	autor;
	private String	editora;

	public Livros(int id, String nome, float valor, String autor, String editora, int genero)
	{
		super(id, nome, valor);
		this.genero = genero;
		this.autor = autor;
		this.editora = editora;
	}

	public int getGenero() {
		return genero;
	}

	public void setGenero(int genero) {
		this.genero = genero;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	@Override
	public void visualizar()
	{
		String	genero = "";
		
		switch(this.genero) {
        case 1 -> {
            genero = "Acadêmico";
        }
        case 2 -> {
            genero = "Literatura Infantil";
        }
        case 3 -> {
            genero = "Literatura";
        }
        case 4 -> {
            genero = "Bibliografico";
        } 
        default -> {
            System.out.println("Tipo de categoria inválido!");
        }
    }
		
		super.visualizar();
		System.out.println("Autor: " + this.autor);
        System.out.println("Editora: " + this.editora);
        System.out.println("Genero: " + genero);
        
        
	}
}
