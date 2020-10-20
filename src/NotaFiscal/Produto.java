package NotaFiscal;

/**
 * Classe que representa o produto
 * 
 * @author Brian 17/10/2020
 * Implementação: Brian 17/10/2020
 * Teste: Brian 19/10/2020
 */

public class Produto {

	private String nomeProduto;
	private double valorProduto;
	private int quantProduto;
	
	/**
	 * Mettodo que armazena os dados contidos na classe P roduto 
	 * 
	 * @param nomeProduto
	 * @param valorProduto
	 * @param quantProduto
	 */
	
	public Produto(String nomeProduto, double valorProduto, int quantProduto) {
		this.setnomeProduto(nomeProduto);
		this.setvalorProduto(valorProduto);
		this.setquantProduto(quantProduto);
		
	}
	
	/**
	 * Metodo que entrga os dados contidos na varavel nomeProduto
	 * 
	 * @return
	 */

	public String getnomeProduto() {
	    return nomeProduto;
	}
	
	/**
	 * Metodo que entrga os dados contidos na varavel valorProduto
	 * 
	 * @return
	 */

	public double getvalorProduto() {
	    return valorProduto;
	}
	
	/**
	 * Metodo que entrga os dados contidos na varavel quantProduto
	 * 
	 * @return
	 */
	
	public int getquantProduto() {
	    return quantProduto;
	}	
	
	/**
	 * Metodo que armazena os dados na variavel nomeProduto
	 * 
	 * @param nomeProduto
	 */

	public void setnomeProduto(String nomeProduto) {
	    this.nomeProduto = nomeProduto; 
	}
	
	/**
	 * Metodo que armazena os dados na variavel valorProduto
	 * 
	 * @param valorProduto
	 */

	public void setvalorProduto(double valorProduto) {
	    this.valorProduto = valorProduto; 
	}
	
	/**
	 * Metodo que armazena os dados na variavel quantProduto
	 * 
	 * @param quantProduto
	 */
	
	public void setquantProduto(int quantProduto) {
	    this.quantProduto = quantProduto; 
	}
		
	
}
