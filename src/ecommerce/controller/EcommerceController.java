package ecommerce.controller;

import java.util.ArrayList;

import ecommerce.model.Produtos;
import ecommerce.repository.EcommerceRepository;

public class EcommerceController implements EcommerceRepository {

	private ArrayList<Produtos> listaProdutos = new ArrayList<Produtos>();
	int numero = 0; 
	
	@Override
	public void procurarPorTipo(String tipo) {
		var produtos = buscarNaCollection (tipo);
		
		if (produtos != null )
			produtos.visualizar;
		else
			System.out.println("\nO produto" + tipo + " não foi encontrado!");
	}

	private Object buscarNaCollection(String codigo) {
		for (var produtos : listaProdutos) {
			if (produtos.getCodigo() == codigo) {
				return produtos;
			}
		}
		return null;
	}

	@Override
	public void adicionarCarrinho(Produtos codigo) {
		listaProdutos.add(codigo);
	}

	@Override
	public void finalizarCompra(Float valor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void valorTotal(float valor) {
		// TODO Auto-generated method stub
		
	}
	
	}
