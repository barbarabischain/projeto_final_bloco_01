package livraria.repositorio;

import livraria.model.Livraria;

public interface LivrariaRepositorio
{
	public void cadastrar(Livraria produto);
	public void listar();
	public void atualizar(Livraria produto);
	public void deletar(int id);
}
