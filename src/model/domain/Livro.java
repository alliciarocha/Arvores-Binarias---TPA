package model.domain;

/**
 *
 * @author alliciarocha
 * 
 * Essa é a classe Livro que representa um livro na biblioteca
 * contém informações sobre o título, autor e disponibilidade do livro.
 */

public class Livro {
	
	private String titulo;
	private String autor;
	private boolean disponivel;
	
	public Livro(String titulo, String autor) {
		this.titulo = titulo;
		this.autor = autor;
		this.disponivel = true;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public boolean isDisponivel() {
		return disponivel;
	}
	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}

	@Override
	public String toString() {
	    return "Livro{" +
	           "título='" + titulo + '\'' +
	           ", autor='" + autor + '\'' +
	           ", disponível=" + disponivel +
	           '}';
	}
}
