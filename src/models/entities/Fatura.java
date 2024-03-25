package models.entities;

public class Fatura {
	
	private String nome;
	private String descricao;
	private Double preco;
	private Integer quantidade;
	
	public Fatura() {
		
	}

	public Fatura(String nome, String descricao, Double preco, Integer quantidade) {
		this.nome = nome;
		this.descricao = descricao;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescrição(String descrição) {
		this.descricao = descrição;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	
	public double totalFatura() {
		return preco * quantidade;
	}
	public String toString() {
		return "Nome: "
				+nome
				+" Descrição: "
				+ descricao
				+" Valor: "
				+String.format("%.2f", preco)
				+" Quantidade: "
				+ quantidade
				+String.format(" Valor total: %.2f", totalFatura());
	}

}
