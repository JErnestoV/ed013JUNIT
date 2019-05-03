package com.fatec.scel;

import static org.junit.Assert.*;

import org.junit.Test;

import com.fatec.scel.model.Livro;

public class UC01CadastrarLivro {
	@Test
	public void CT01CadastrarLivroComDadosValidos() {
		try {
			// cenario
			Livro umLivro = new Livro();
			// acao
			umLivro.setIsbn("121212");
			umLivro.setTitulo("Engenharia de Softwar");
			umLivro.setAutor("Pressman");
		} catch (RuntimeException e) {
			// verificacao
			fail("nao deve falhar");
		}
	}
	@Test
	public void CT02CadastrarLivroComDadosinvalidos() {
		try {
			// cenario
			Livro umLivro = new Livro();
			// acao
			umLivro.setIsbn("");
			umLivro.setTitulo("Engenharia de Software");
			umLivro.setAutor("Pressman");
		} catch (RuntimeException e) {
			// verificacao
			assertEquals("ISBN invalido", e.getMessage());
		}
	}
	@Test
	public void CT03CadastrarLivroComDadosInvalidos() {
		try {
			// cenario
			Livro umLivro = new Livro();
			// acao
			umLivro.setIsbn("");
			umLivro.setTitulo("Engenharia de Software");
			umLivro.setAutor("Pressman");
		} catch (RuntimeException e) {
			// verificacao
			assertEquals("ISBN invalido", e.getMessage());
		}
	}
	@Test
	public void CT04CadastrarLivroComDadosInvalidos() {
		try {
			// cenario
			Livro umLivro = new Livro();
			// acao
			umLivro.setIsbn("121212");
			umLivro.setTitulo("");
			umLivro.setAutor("Pressman");
		} catch (RuntimeException e) {
			// verificacao
			assertEquals("Titulo invalido", e.getMessage());
		}
	}
	@Test
	public void CT05verifica_obtem_isbn() {
		Livro umLivro = new Livro();
		try {
			// cenario
			
			// acao
			umLivro.setIsbn("121212");
			umLivro.setTitulo("Engenharia de Softwar");
			umLivro.setAutor("Pressman");
		} catch (RuntimeException e) {
			fail ("nao deve falhar");
			
		}
		assertEquals("121212",umLivro.getIsbn());
	}
	@Test
	public void CT06titulo() {
		Livro umLivro = new Livro();
		try {
			// cenario
			
			// acao
			umLivro.setIsbn("121212");
			umLivro.setTitulo("Engenharia de Software");
			umLivro.setAutor("Pressman");
		} catch (RuntimeException e) {
			// verificacao
					
			assertEquals("Engenharia de Software",umLivro.getTitulo());
			
		}
		
	}

	@Test
	public void CT07autor() {
		Livro umLivro = new Livro();
		try {
			// cenario
			
			// acao
			umLivro.setIsbn("121212");
			umLivro.setTitulo("Engenharia de Softwar");
			umLivro.setAutor("Pressman");
		} catch (RuntimeException e) {
			// verificacao
			fail ("nao deve falhar");
		}
		assertEquals("Pressman",umLivro.getAutor());
	}
}




