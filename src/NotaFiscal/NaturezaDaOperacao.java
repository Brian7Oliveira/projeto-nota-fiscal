package NotaFiscal;


/**
 * Classe que representa a nota fiscal
 * 
 * @author Newton 17/10/2020
 * Implementação: Newton 17/10/2020
 * Teste: Newton 19/10/2020
 */

public class NaturezaDaOperacao {

	private String nomeOperacao;
	
	/**
	 * Metodos que armazenam os dados contidos na classe NotaFiscal
	 * 
	 * @param nomeOperacao
	 */
	
	public NaturezaDaOperacao(String nomeOperacao) {
		this.setnomeOperacao(nomeOperacao);	
	}
	
	/**
	 * Metodo que entrega os dados contidos na variavel nomeOperacao
	 * 
	 * @return
	 */
	
	public String getnomeOperacao() {
	    return nomeOperacao;
	}
	
	/**
	 * Metodo que arazena os nados na variavel nomeOperacao
	 * 
	 * @param nomeOperacao
	 */
	
	public void setnomeOperacao(String nomeOperacao) {
	    this.nomeOperacao = nomeOperacao; 
	}

	
}
