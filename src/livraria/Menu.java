package livraria;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import livraria.controller.LivrariaController;
import livraria.model.Livraria;
import livraria.model.Livros;


public class Menu
{
	public static void main(String[] args) 
	{	
		LivrariaController livros = new LivrariaController();
		int 	opcao, id, genero;
		String	nome, autor, editora;
		float	valor;
		
		Scanner leia = new Scanner(System.in);
		Livraria item = new Livros(1023, "Ensaio sobre a Cegueira", 50.0f, "Jose Saramago", "Martins Fontes", 2);
		item.visualizar();
		while (true) {

			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                 Livraria do Bairro                  ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Adicionar produto                    ");
			System.out.println("            2 - Buscar Produto			             ");
			System.out.println("            3 - Atualizar                            ");
			System.out.println("            4 - Excluir                              ");
			System.out.println("            5 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");

			try
			{
                opcao = leia.nextInt();
            }catch(InputMismatchException e){
                System.out.println("\nDigite valores inteiros!");
                leia.nextInt();
                opcao = 0;
            }

			if (opcao == 5)
			{
				System.out.println("\nAgradecemos a preferência!");
                 leia.close();
				System.exit(0);
			}

			switch (opcao)
			{
				case 1:
					System.out.println("Cadastrar novo Livro\n\n");
					System.out.print("\nDigite o nome do produto: ");
                    leia.skip("\\R?");
                    nome = leia.nextLine();
                    System.out.print("\nDigite o preço do produto (R$): ");
                    valor = leia.nextFloat();                    
                    System.out.print("\nDigite o nome do autor: ");
                    leia.skip("\\R?");
                    autor = leia.nextLine();
                    System.out.print("\nDigite a editora do produto: ");
                    editora = leia.nextLine();
                    do
                    {
                    	System.out.println("\nDigite o número da gênero: ");
                    	genero = leia.nextInt();
                    }while(genero < 1 && genero > 4);
                    
                    livros.cadastrar(new Livros(livros.gerarId(), nome, valor, autor, editora, genero));
					keyPress();
					break;
				case 2:
					System.out.println("Listar todas os Produtos\n\n");
					livros.listar();
					keyPress();
					break;
				case 3:
					System.out.println("Atualizar dados da Conta\n\n");
					System.out.println("Digite o código do item: ");
					id = leia.nextInt();
					var buscarProdutos = livros.buscarNaCollection(id);
					if (buscarProdutos != null) 
					{
						System.out.print("\nDigite o nome do produto: ");
	                    leia.skip("\\R?");
	                    nome = leia.nextLine();
	                    System.out.print("\nDigite o preço do produto (R$): ");
	                    valor = leia.nextFloat();                    
	                    System.out.print("\nDigite o nome do autor: ");
	                    leia.skip("\\R?");
	                    autor = leia.nextLine();
	                    System.out.print("\nDigite a editora do produto: ");
	                    editora = leia.nextLine();
	                    do
	                    {
	                    	System.out.println("\nDigite o número da gênero: ");
	                    	genero = leia.nextInt();
	                    }while(genero < 1 && genero > 4);
	                    
	                    livros.cadastrar(new Livros(livros.gerarId(), nome, valor, autor, editora, genero));
					}
					
					keyPress();
					break;
				case 4:
					System.out.println("Deletar Item\n\n");
					System.out.println("Digite o código do item: ");
					id = leia.nextInt();
					livros.deletar(id);
					keyPress();
					break;
				default:
					System.out.println("\nOpção Inválida!\n");
					keyPress();
					break;
			}
		}
	}
	public static void keyPress()
	{
        try
        {
            System.out.println("\n\nPressione Enter para Continuar...");
            System.in.read();
        } catch (IOException e) {
            System.out.println("Você pressionou uma tecla diferente de enter!");
        }
    }
}
