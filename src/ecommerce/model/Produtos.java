package ecommerce.model;

public class Produtos {
	private String tipo;
	private String codigo;
	private String nome;
	private String tamanho;
	private float valor;
	public Produtos(String tipo, String codigo, String nome, String tamanho, float valor) {
		super();
		this.tipo = tipo;
		this.codigo = codigo;
		this.nome = nome;
		this.tamanho = tamanho;
		this.valor = valor;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTamanho() {
		return tamanho;
	}
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public void visualizar() {
		
		System.out.println("\n\n*********************************************************************");
		System.out.println("Dados dos itens:");
		System.out.println("*********************************************************************");
		System.out.println("Nome da peça: " + this.nome);
		System.out.println("Código: " + this.codigo);
		System.out.println("Tipo: " + this.tipo);
		System.out.println("Tamanho: " + this.tamanho);
		System.out.println("Valor: " + this.valor);
}
}

