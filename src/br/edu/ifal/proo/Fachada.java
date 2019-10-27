package br.edu.ifal.proo;

import br.edu.ifal.proo.excecoes.CampoInvalidoException;
import br.edu.ifal.proo.excecoes.FalhaAutenticacaoException;
import br.edu.ifal.proo.excecoes.PerfilInvalidoException;

public class Fachada {
	
	/**
	 * Cria um perfil de usuario com base nas informacoes passadas.
	 * Formato da data: dd/mm/aaaa 
	 * Restricoes que devem ser atendidas, lancando excecao em caso contrario:
	 *    - O usuario nao pode ser nulo vou uma string vazia
	 *    - O usuario nao pode ja existir
	 *    - A senha nao pode ser nula e deve ter pelo menos 5 caracteres
	 *    - O usuario deve ter pelo menos 16 anos na data de cadastro 
	 */
	public void criarPerfil(String usuario, String senha, String primeiroNome, String ultimoNome, String dataNascimento)
			throws PerfilInvalidoException {

	}

	/**
	 * Recupera a informacao pessoal de um usuario
	 * @param usuario a ser buscado
	 * @param campo a ser buscado
	 * @return valor do campo recuperado
	 * Deve ser lancada a excecao CampoInvalidoException nos seguintes casos:
	 *    - se for solicitado um campo inexistente
	 *    - se for solicitado o campo senha
	 * Deve ser lancada a excecao PerfilInvalidoException no seguinte caso:
	 *    - se for informado um usuario inexistente.
	 */
	public String recuperarDadoPessoal(String usuario, String campo) throws CampoInvalidoException, PerfilInvalidoException {
		return null;
	}

	public void alterarCampo(String usuario, String senha, String campo, String valor)
			throws PerfilInvalidoException, CampoInvalidoException, FalhaAutenticacaoException {

	}
	
	public void desabilitarPerfil(String usuario, String senha) throws FalhaAutenticacaoException {
		
	}
	
	public void deletarPerfil(String usuario, String senha) throws FalhaAutenticacaoException {
		
	}
}
