/**
 * 
 */
package br.edu.ifal.proo.tests;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import br.edu.ifal.proo.Fachada;
import br.edu.ifal.proo.excecoes.CadastroInvalidoException;

/**
 * @author ivocalado
 *
 */
public class Us1 {

	static Fachada fachada;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUp() throws Exception {
		fachada = new Fachada();
		fachada.cleanPersistence();
	}

	@AfterClass
	public static void tearDown() throws Exception {
		System.out.println("tear down...");
	}

	@Rule
	public ExpectedException exceptionRule = ExpectedException.none();

	@Test
	public void test001() {
		exceptionRule.expect(CadastroInvalidoException.class);
		exceptionRule.expectMessage("Login inválido");
		fachada.createProfile(null, "123", "maria", "teste@teste.com", "Feminino", "01/01/2000", "biografia");

	}

	@Test
	public void test002() {
		exceptionRule.expect(CadastroInvalidoException.class);
		exceptionRule.expectMessage("Login inválido");
		fachada.createProfile("", "123", "maria", "teste@teste.com", "Feminino", "01/01/2000", "biografia");
	}
	
	@Test
	public void test003() {
		exceptionRule.expect(CadastroInvalidoException.class);
		exceptionRule.expectMessage("Senha inválida");
		fachada.createProfile("joao", "", "maria", "teste@teste.com", "Feminino", "01/01/2000", "biografia");
	}

	@Test
	public void test004() {
		exceptionRule.expect(CadastroInvalidoException.class);
		exceptionRule.expectMessage("Senha inválida");
		fachada.createProfile("joao", null, "maria", "teste@teste.com", "Feminino", "01/01/2000", "biografia");
	}
	
	@Test
	public void test005() {
		exceptionRule.expect(CadastroInvalidoException.class);
		exceptionRule.expectMessage("Email inválido");
		fachada.createProfile("joao", "1223", "maria", "", "Feminino", "01/01/2000", "biografia");
	}
	
	@Test
	public void test006() {
		exceptionRule.expect(CadastroInvalidoException.class);
		exceptionRule.expectMessage("Email inválido");
		fachada.createProfile("joao", "1223", "maria", null, "Feminino", "01/01/2000", "biografia");
	}
	
	@Test
	public void test007() {
		exceptionRule.expect(CadastroInvalidoException.class);
		exceptionRule.expectMessage("Sexo inválido");
		fachada.createProfile("joao", "1223", "maria", "joao@joao.com", "", "01/01/2000", "biografia");
	}
	
	@Test
	public void test008() {
		exceptionRule.expect(CadastroInvalidoException.class);
		exceptionRule.expectMessage("Sexo inválido");
		fachada.createProfile("joao", "1223", "maria", "joao@joao.com", null, "01/01/2000", "biografia");
	}
	
	@Test
	public void test009() {
		exceptionRule.expect(CadastroInvalidoException.class);
		exceptionRule.expectMessage("Sexo inválido");
		fachada.createProfile("joao", "1223", "maria", "joao@joao.com", "qualquer coisa", "01/01/2000", "biografia");
	}
	
	@Test
	public void test010() {
		fachada.cleanPersistence();
		fachada.createProfile("mariasilva", "qwe2", "Maria Silva", "maria@gmail.com", "Feminino", "01/01/1980", "Eu sou eu");
		
		exceptionRule.expect(CadastroInvalidoException.class);
		exceptionRule.expectMessage("Login existente");
		fachada.createProfile("mariasilva", "qwe2", "Maria Silva", "maria2@gmail.com", "Feminino", "01/01/1980", "Eu sou eu");
	}
	
	@Test
	public void test011() {
		fachada.cleanPersistence();
		fachada.createProfile("mariasilva", "qwe2", "Maria Silva", "maria@gmail.com", "Feminino", "01/01/1980", "Eu sou eu");
		
		exceptionRule.expect(CadastroInvalidoException.class);
		exceptionRule.expectMessage("Email existente");
		fachada.createProfile("mariasilva2", "qwe2", "Maria Silva", "maria@gmail.com", "Feminino", "01/01/1980", "Eu sou eu");
	}
	
	@Test
	public void test012() {
		fachada.cleanPersistence();
		fachada.createProfile("mariasilva", "qwe2", "Maria Silva", "maria@gmail.com", "Feminino", "01/01/2000", "Eu sou eu");
		fachada.createProfile("sicrano", "1235", "Sicrano na Silva", "sicrano@gmail.com", "Masculino", "01/01/1980", "Eu sou outra pessoa");
		
		assertEquals("Maria Silva", fachada.getProfileInformation("mariasilva", "nomeExibicao"));
		assertEquals("maria@gmail.com", fachada.getProfileInformation("mariasilva", "email"));
		assertEquals("Feminino", fachada.getProfileInformation("mariasilva", "sexo"));
		assertEquals("01/01/2000", fachada.getProfileInformation("mariasilva", "dataNascimento"));
		assertEquals("Eu sou eu", fachada.getProfileInformation("mariasilva", "biografia"));
		
		assertEquals("Sicrano na Silva", fachada.getProfileInformation("sicrano", "nomeExibicao"));
		assertEquals("sicrano@gmail.com", fachada.getProfileInformation("sicrano", "email"));
		assertEquals("Masculino", fachada.getProfileInformation("sicrano", "sexo"));
		assertEquals("01/01/1980", fachada.getProfileInformation("sicrano", "dataNascimento"));
		assertEquals("Eu sou outra pessoa", fachada.getProfileInformation("sicrano", "biografia"));
	}
	
	
}
