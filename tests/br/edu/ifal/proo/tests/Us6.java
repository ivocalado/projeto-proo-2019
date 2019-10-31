/**
 * 
 */
package br.edu.ifal.proo.tests;

import static org.junit.Assert.assertEquals;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import br.edu.ifal.proo.Fachada;
import br.edu.ifal.proo.excecoes.FalhaAutenticacaoException;
import br.edu.ifal.proo.excecoes.FalhaAutorizacaoException;

/**
 * User Story-- Editar postagem 
 * Permite a edição de um post existente. os seguintes campos podem ser alterados:
 * - Título do post
 * - Conteúdo
 * @author ivocalado
 *
 */
public class Us6 {

	static Fachada fachada;

	@Rule
	public ExpectedException exceptionRule = ExpectedException.none();

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		fachada = new Fachada();
		fachada.clearPersistence();
	}
	
	/**
	 * Testa o login invalido do usuário
	 * @throws Exception
	 */
	@Test
	public void test001() throws Exception {
		exceptionRule.expect(FalhaAutenticacaoException.class);
		exceptionRule.expectMessage("Login/senha incorretos");
		fachada.changePostInformation("", "", "", "", "", "");
	}

	/**
	 * Testa o login invalido do usuário
	 * @throws Exception
	 */
	@Test
	public void test002() throws Exception {
		exceptionRule.expect(FalhaAutenticacaoException.class);
		exceptionRule.expectMessage("Login/senha incorretos");
		fachada.changePostInformation(null, "", "", "", "", "");
	}
	
	/**
	 * Testa o login invalido do usuário
	 * @throws Exception
	 */
	@Test
	public void test003() throws Exception {
		exceptionRule.expect(FalhaAutenticacaoException.class);
		exceptionRule.expectMessage("Login/senha incorretos");
		fachada.changePostInformation(null, null, "", "", "", "");
	}
	
	/**
	 * Testa o blog é inválido
	 * @throws Exception
	 */
	@Test
	public void test004() throws Exception {
		fachada.clearPersistence();
		fachada.createProfile("mariasilva", "123", "Maria Silva", "maria@gmail.com", "Feminino", "01/01/2000",
				"Eu sou eu");
		
		exceptionRule.expect(FalhaAutorizacaoException.class);
		exceptionRule.expectMessage("Acesso não autorizado");
		fachada.changePostInformation("mariasilva", "123", "", "", "", "");
	}

	/**
	 * Testa o post é inválido
	 * @throws Exception
	 */
	@Test
	public void test005() throws Exception {
		fachada.clearPersistence();

		fachada.createProfile("sicrano", "1235", "Sicrano na Silva", "sicrano@gmail.com", "Masculino", "01/01/1980",
				"Eu sou outra pessoa");

		String id2 = fachada.createBlog("sicrano", "1235", "Meu primeiro blog",
				"Whatever is said in Latin sounds profound");
		
		
		exceptionRule.expect(FalhaAutorizacaoException.class);
		exceptionRule.expectMessage("Acesso não autorizado");
		fachada.changePostInformation("sicrano", "1235", id2, "", "", "");
	}
	
	/**
	 * Testa o post é inválido
	 * @throws Exception
	 */
	@Test
	public void test006() throws Exception {
		fachada.clearPersistence();

		fachada.createProfile("sicrano", "1235", "Sicrano na Silva", "sicrano@gmail.com", "Masculino", "01/01/1980",
				"Eu sou outra pessoa");

		String id2 = fachada.createBlog("sicrano", "1235", "Meu primeiro blog",
				"Whatever is said in Latin sounds profound");
		
		
		exceptionRule.expect(FalhaAutorizacaoException.class);
		exceptionRule.expectMessage("Acesso não autorizado");
		fachada.changePostInformation("sicrano", "1235", id2, "", "", "");
	}	
	
	/**
	 * Testa a recuperação dos atributos de um post
	 * @throws Exception
	 */
	@Test
	public void test007() throws Exception {
		fachada.clearPersistence();

		fachada.createProfile("sicrano", "1235", "Sicrano na Silva", "sicrano@gmail.com", "Masculino", "01/01/1980",
				"Eu sou outra pessoa");

		String id2 = fachada.createBlog("sicrano", "1235", "Meu primeiro blog",
				"Whatever is said in Latin sounds profound");
		
		String postId = fachada.createPost("sicrano", "1235",  id2,  "Titulo do post",  "Conteúdo do post");
		
		fachada.changePostInformation("sicrano", "1235", id2, postId, "titulo", "Novo titulo");
		fachada.changePostInformation("sicrano", "1235", id2, postId, "conteudo", "Novo conteudo");
		
		assertEquals("Novo Titulo", fachada.getPostInformation(postId, "titulo"));
		assertEquals("Novo conteudo", fachada.getPostInformation(postId, "conteudo"));
	}
}
