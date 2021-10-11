package com.inforcomp.bookstore.domain;

public class Livro {
	
	private Integer id;
	private String nome;
	private String nomeAutor;
	private String texto;
	
	private Categoria categoria;

	public Livro() {
		super();
	}

	public Livro(Integer id, String nome, String nomeAutor, String texto, Categoria categoria) {
		super();
		this.id = id;
		this.nome = nome;
		this.nomeAutor = nomeAutor;
		this.texto = texto;
		this.categoria = categoria;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNomeAutor() {
		return nomeAutor;
	}

	public void setNomeAutor(String nomeAutor) {
		this.nomeAutor = nomeAutor;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}	
}
