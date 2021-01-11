package Livros;

import javax.swing.JOptionPane;

public class TesteLivro {
	
	public static void main(String[] args) {
		
		//criar instancia da classe livro
		Livro livro = new Livro();
		
		// definir valores dos atributos
		livro.setTituloOriginal("Harry Potter");
		livro.setTituloPortugues("Harry Potter");
		livro.setAnoPublicacao(1997);
		livro.setQuantidadeDePaginas(264);
		livro.setEdicao("7a edição");
		livro.setIbsn("85-325-1101-5");
		livro.setAutor(" J. K. Rowling");
		
		//Criar oura instancia da classe livro
		Livro livro1 = new Livro();
		
		//definir valor dos atributos
		livro1.setTituloOriginal("Harry Potter and the Sorcerer's Stone");
		livro1.setTituloPortugues("Harry Potter e a Pedra Filosofal");
		livro1.setAnoPublicacao(1997);
		livro1.setQuantidadeDePaginas(264);
		livro1.setEdicao("1a edição");
		livro1.setIbsn("85-325-1101-5");
		livro1.setAutor(" J. K. Rowling");
		
		JOptionPane.showConfirmDialog(null, livro1.pegarTitulos());
		
	}

}
