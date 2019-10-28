package br.edu.ifal.proo;

public class Fachada {

	/**
	 * Limpa os dados existentes no banco de dados
	 */
	public void cleanPersistence() {
		// TODO
	}

	/**
	 * Cria um perfil de usuario. 
	 * @param login
	 * @param senha
	 * @param nomeExibicao
	 * @param email
	 * @param sexo
	 * @param dataNascimento
	 * @param biografia
	 * 
	 * Validacoes:
	 *    - login nao pode ser nulo ou vazio
	 *    - login deve ser unico
	 *    - a senha não pode ser nula ou vazia
	 *    - email não pode ser nulo ou vazio
	 *    - sexo deve assumir um dos seguintes valores 'Feminino', 'Masculino' ou 
	 *        'Não informado'
	 *    - data de nascimento deve ser um valor válido e no momento do cadastro do 
	 *        usuário deve ter mais de 16 anos
	 *    - 
	 *     
	 *    
	 */
	public void createProfile(
			String login, 
			String senha, 
			String nomeExibicao, 
			String email, 
			String sexo,
			String dataNascimento, 
			String biografia) {
			//TODO
	}
	
	/**
	 * Retorna os dados pessoais do usuario dado o campo passado
	 * @param login 
	 * @param atributo
	 * @return
	 */
	public String getProfileInformation(String login, String atributo) {
		return "";
	}
}
