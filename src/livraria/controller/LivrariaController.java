package livraria.controller;

import java.util.ArrayList;
import livraria.model.Livraria;
import livraria.repositorio.LivrariaRepositorio;

public class LivrariaController implements LivrariaRepositorio
{
	private ArrayList<Livraria> listaProdutos = new ArrayList<Livraria>();
    int id = 0;
    
	@Override
	public void cadastrar(Livraria produto) {
	listaProdutos.add(produto);
	System.out.println("\nO produto com o código " + produto.getId() + ", foi cadastrado com sucesso!");
	}

	@Override
	public void listar() {
		for(var produto : listaProdutos)
		{
			produto.visualizar();			
		}
	}

	@Override
	public void atualizar(Livraria produto)
	{
		var	buscarProduto = buscarNaCollection(id);
		
		 if(buscarProduto != null)
		 {
			 listaProdutos.set(listaProdutos.indexOf(buscarProduto), produto);
	                System.out.println("\nO produto com o código " + id + ", foi deletado com sucesso!");
	     }
		 else
	            System.out.println("\nO código do produto " + id + ", não foi encontrado!");
		}

	@Override
	public void deletar(int id)
	{	
		var	buscarProduto = buscarNaCollection(id);
		
		 if(buscarProduto != null)
		 {
	            if(listaProdutos.remove(buscarProduto) == true)
	                System.out.println("\nO produto com o código " + id + ", foi deletado com sucesso!");
	     }
		 else
	            System.out.println("\nO código do produto " + id + ", não foi encontrado!");
		}
    public int gerarId()
    {
        return (++id);
    }
    public Livraria buscarNaCollection(int id)
    {
        for(var buscarId: listaProdutos)
        {
            if(buscarId.getId() == id)
                return buscarId;
        }
        return null;
    }
}
