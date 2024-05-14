package ecommerce.repository;

public interface EcommerceRepository {	
	
	//CRUD Produtos
	
	public void procurarPorTipo(String tipo);
	public void adicionarCarrinho (String codigo);
	public void finalizarCompra (Float valor);
	
	//Valor da compra
	public void valorTotal (float valor);
	void listaProdutos();

}
