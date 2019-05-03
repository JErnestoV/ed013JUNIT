package com.fatec.scel;

import static org.junit.Assert.fail;

import org.junit.Test;
import com.fatec.scel.model.Usuario;


public class UC01CadastrarUsuario {
	@Test
	public void CT01CadastrarUsuarioComDadosValidos() {
		
		try {
			// cenario
			Usuario novoUsuario = new Usuario();
			// acao
			novoUsuario.setRa("1");
			novoUsuario.setNome("J");
			
		} catch (RuntimeException e) {
			// verificacao
			fail("nao deve falhar");
		}
	}
}
