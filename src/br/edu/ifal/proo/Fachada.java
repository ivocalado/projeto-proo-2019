package br.edu.ifal.proo;

import br.edu.ifal.proo.excecoes.AtributoInvalidoException;
import br.edu.ifal.proo.excecoes.CadastroInvalidoException;
import br.edu.ifal.proo.excecoes.FalhaAutenticacaoException;
import br.edu.ifal.proo.excecoes.FalhaAutorizacaoException;
import br.edu.ifal.proo.excecoes.PerfilNaoEncontradoException;

public class Fachada {

	/**
	 * Limpa os dados existentes no banco de dados
	 */
	public void cleanPersistence() {
		// TODO
	}

	/**
	 * Cria um perfil de usuario.
	 * 
	 * @param login
	 * @param senha
	 * @param nomeExibicao
	 * @param email
	 * @param sexo
	 * @param dataNascimento
	 * @param biografia
	 * 
	 *    Validacoes: 
	 *    		- login nao pode ser nulo ou vazio 
	 * 			- login deve ser unico 
	 * 			- a senha não pode ser nula ou vazia 
	 * 			- email não pode ser nulo ou vazio 
	 * 			- sexo deve assumir um dos seguintes valores 'Feminino', 'Masculino' ou 'Não
	 *                       informado' 
     * 			- data de nascimento deve ser um valor
	 *          válido e no momento do cadastro do usuário deve ter
	 *          mais de 16 anos
	 * 
	 * 
	 */
	public void createProfile(String login, String senha, String nomeExibicao, String email, String sexo,
			String dataNascimento, String biografia) throws CadastroInvalidoException {
		// TODO
	}

	/**
	 * Retorna os dados pessoais do usuario dado o campo passado
	 * 
	 * @param login
	 * @param atributo
	 * @return
	 */
	public String getProfileInformation(String login, String atributo) throws AtributoInvalidoException, PerfilNaoEncontradoException {

		return "";
	}

	/**
	 * Altera o perfil do usuário
	 * @param login do do usuário
	 * @param senha senha do usuário
	 * @param atributo a ser modificado
	 * @param valor novo valor do atributo
	 * @throws CadastroInvalidoException lançada se o novo valor for inválido
	 * @throws AtributoInvalidoException lançada se o atributo referenciado for inexistente
	 * @throws FalhaAutenticacaoException lançada se o par login/senha não conseguir autenticar o usuário
	 */
	public void changeProfileInformation(String login, String senha, String atributo, String valor) throws CadastroInvalidoException, AtributoInvalidoException, FalhaAutenticacaoException {

	}

	/**
	 * Cria um novo blog
	 *  
	 * @param login do do usuário
	 * @param senha senha do usuário
	 * @param titulo do novo blog
	 * @param descricao do novo blog
	 * @return id do novo blog gerado
	 * @throws FalhaAutenticacaoException lançada se o par login/senha não conseguir autenticar o usuário
	 * @throws CadastroInvalidoException lançada se os valores de cadastro do blog estiverem inválidos
	 */
	public String createBlog(String login, String senha, String titulo, String descricao) throws FalhaAutenticacaoException, CadastroInvalidoException {
		return "";
		
	}

	/**
	 * Retorna os dados de um blog por atributo
	 * @param idBlog id do blog a ser recuperado
	 * @param atributo atributo buscado
	 * @return propriedade buscada
	 * @throws AtributoInvalidoException lançada se o atributo referenciado for inexistente
	 */
	public String getBlogInformation(String idBlog, String atributo) throws AtributoInvalidoException {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Modifica os dados do blog
	 * @param login do do usuário
	 * @param senha senha do usuário
	 * @param blogId
	 * @param atributo
	 * @param valor
	 * @throws FalhaAutenticacaoException lançada se o par login/senha não conseguir autenticar o usuário
	 * @throws AtributoInvalidoException lançada se o atributo referenciado for inexistente
	 * @throws CadastroInvalidoException lançada se os valores de cadastro do blog estiverem inválidos
	 * @throws FalhaAutorizacaoException lançada se o blog não pertencer ao usuário informado
	 */
	public void changeBlogInformation(String login, String senha, String blogId, String atributo, String valor) throws FalhaAutenticacaoException, AtributoInvalidoException, CadastroInvalidoException, FalhaAutorizacaoException {
		// TODO Auto-generated method stub		
	}

	
}
