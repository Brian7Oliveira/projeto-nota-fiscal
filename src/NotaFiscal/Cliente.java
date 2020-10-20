package NotaFiscal;

/**
 * Classe que representa o cliente 
 * 
 * @author Raissa 17/10/2020
 * Implementação: Gabriel H. 17/10/2020
 * Teste: Raissa 19/10/2020
 */

public class Cliente {
	
		private String nome;
		private String cpf;
		
		/**
		 * Mettodo que armazena os dados contidos na classe Cliente 
		 * 
		 * @param nome
		 * @param cpf
		 */
		
		public Cliente(String nome, String cpf) {
			this.setNome(nome);
			this.setCpf(cpf);
			
		}
		
		/**
		 * Metodo que entrega os dados contidos na variavel nome
		 * @return
		 */

		public String getNome() {
		    return nome;
		}
		
		/**
		 * Metodo que entrega os dados contidos na variavel cpf 
		 * 
		 * @return
		 */

		public String getCpf() {
		    return cpf;
		}
		
		/**
		 * Metodo que armazena os dados na variavel nome
		 * 
		 * @param nome
		 */

		public void setNome(String nome) {
		    this.nome = nome; 
		}
		
		/**
		 * Metodo que que armazena os dados na variavel cpf
		 * 
		 * @param cpf
		 */


		public void setCpf(String cpf) {
		    this.cpf = cpf; 
		}
		}
