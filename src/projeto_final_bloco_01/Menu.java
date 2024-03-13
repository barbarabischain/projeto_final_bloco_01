package projeto_final_bloco_01;

import java.util.Scanner;

public class Menu
{
	public static void main(String[] args) 
	{
		Scanner leia = new Scanner(System.in);

		int opcao;

		while (true) {

			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                 Livraria do Bairro                  ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Criar Conta                          ");
			System.out.println("            2 - Buscar Produto			             ");
			System.out.println("            3 - Atualizar                            ");
			System.out.println("            4 - Excluir                              ");
			System.out.println("            5 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");

			opcao = leia.nextInt();

			if (opcao == 5)
			{
				System.out.println("\nAgradecemos a preferência!");
                 leia.close();
				System.exit(0);
			}

			switch (opcao)
			{
				case 1:
					System.out.println("Criar Conta\n\n");
					break;
				case 2:
					System.out.println("Listar todas os Produtos\n\n");
					break;
				case 3:
					System.out.println("Atualizar dados da Conta\n\n");
					break;
				case 4:
					System.out.println("Deletar Item\n\n");
					break;
				default:
					System.out.println("\nOpção Inválida!\n");
					break;
			}
		}
	}
    
}
