package NotaFiscal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * Classe Principal que detem a maior parte das funções presentes no sistema
 * 
 * @author Davi, Gabriel H., Brian, Newton, Raissa 16/10/2020
 * Implementação: Davi, Gabriel H. 17/10/2020
 * Teste: Davi, Gabrial H. 19/10/2020
 */

public class App {
	
	/**
	 * Metodo Principal que detem as funcionalidades do sistema
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int i = 0;
		int c[];
		int op = 10;
		int escolha;
		int operacao = 1;
		int vendas = 0;
		String [][]matriz = new String[500][500];
		int contador = 0, contadorProduto =0, contadorOperacao = 0;
		
		ArrayList<String> nomesCliente = new ArrayList<>();
		ArrayList<String> cpfsCliente = new ArrayList<>();
		ArrayList<String> nomesProduto = new ArrayList<>();
		ArrayList<Double> valoresProduto = new ArrayList<>();
		ArrayList<Integer> quantsProduto = new ArrayList<>();
		ArrayList<String> nomesOperacao = new ArrayList<>();
		ArrayList<Integer> quantidadeComprada = new ArrayList<>();
		ArrayList<String> produtosComprados = new ArrayList<>();
		
		nomesCliente.add("Usuario");
		cpfsCliente.add("123456789");
		
		String menu = "Olá, Bem Vindo(a) ao Projeto Nota Fiscal\n" +
						"Escolha a operação que deseja realizar\n" +
						"1 - Cadastrar Cliente\n" +
						"2 - Cadastrar Produto\n" +
						"3 - Listar Clientes\n" + 
						"4 - Listar Produtos\n" +
						"5 - Listar Operações\n" +
						"6 - Gerar Nota Fiscal\n" +
						"7 - Listar Nota Fiscal\n" +
						"0 - Sair\n";
	
		
		
		Cliente c1 = new Cliente("", "");
		Produto p1 = new Produto("", 0, 0);
		NaturezaDaOperacao n1 = new NaturezaDaOperacao("");
		

		
		while (op != 0) {

			System.out.println(menu);
			
			op = in.nextInt();

			switch (op) {

			/**
			 * Case 1: responsavel pelo pelo cadastro dos clientes 
			 */
			
			case 1:
				
				System.out.println("Digite o nome do cliente que deseja cadastrar");
				c1.setNome(in.next());
				nomesCliente.add(c1.getNome());
				System.out.println("\nDigite o cpf do cliente que deseja cadastrar");
				String cpf = in.next();
				for(i = 0; i < nomesCliente.size() ; i++) {
					if(!cpf.equals(cpfsCliente.get(i))) {
						cpfsCliente.add(cpf);
						contador++;
						System.out.println("\nCliente cadastrado. Número atual de clientes "
								+ "cadastrados: " + contador + "\n" );	
					} else {
						System.out.println("CPF já cadastrado em sistema");
					}
				}
				break;
				
				////////////////////////////////////////////////////////////////////////
				
			/**
			 * Case 2: responsavel pelo cadastro do produto	
			 */
				
			case 2:
				
				System.out.println("Digite o nome do produto que deseja cadastrar");
				p1.setnomeProduto(in.next());
				nomesProduto.add(p1.getnomeProduto());

				System.out.println("Digite o valor do produto que deseja cadastrar");
				p1.setvalorProduto(in.nextDouble());
				valoresProduto.add(p1.getvalorProduto());
				

				System.out.println("Digite a quantidade do produto que deseja cadastrar");
				p1.setquantProduto(in.nextInt());
				quantsProduto.add(p1.getquantProduto());

				contadorProduto++;
				System.out.println("\nProduto cadastrado. Número atual de produtos "
						+ "cadastrados: " + contadorProduto + "\n" );

				
				break;
				
				////////////////////////////////////////////////////////////////////////
				
			/* Case 3:
				
				System.out.println("Digite o nome da operação que deseja cadastrar");
				n1.setnomeOperacao(in.next());
				nomesOperacao.add(n1.getnomeOperacao());
				
				contadorOperacao++;
				System.out.println("\nNatureza da Operação cadastrada. Número atual de "
						+ "operações cadastradas: " + contadorOperacao + "\n" );
				
				break;
				
				////////////////////////////////////////////////////////////////////////
			*/	
				
			
			/**
			 * Case 3: responsavel por listar e apresentar/imprimir os clientes cadastrados 
			 */
			
			case 3:
				
				
				int n = nomesCliente.size();

				for(i = 0; i<n; i++) {
					System.out.println("Cliente: " + (i+1));
					System.out.println("Nome: " + nomesCliente.get(i));
					System.out.println("CPF: " + cpfsCliente.get(i) + "\n");
				}
				
				
				break;
				
				////////////////////////////////////////////////////////////////////////
				
				/**
				 * Case 4: responsavel por listar e apresenta/imprime os produtos 
				 */
				
			case 4:
				
				int p = nomesProduto.size();

				for(i = 0; i<p; i++) {
					System.out.println("Produto: " + (i+1));
					System.out.println("Produto: " + nomesProduto.get(i));
					System.out.println("Valor: " + valoresProduto.get(i));
					System.out.println("Quantidade: " + quantsProduto.get(i) + "\n");
				}
				
				break;
				
				///////////////////////////////////////////////////////////////////////////	
				
				/**
				 * Case 5: responsavel por listar e apresenta/imprime a natureza da operação 
				 */
				
			case 5:
				
				int o = nomesOperacao.size();

				for(i = 0; i<o; i++) {
					System.out.println("Operação: " + (i+1));
					System.out.println("Nome da Operação: " + nomesOperacao.get(i) + "\n");
				}
				System.out.println(contadorOperacao);
				
				break;
				
				///////////////////////////////////////////////////////////////////////////				
				
				/**
				 * Case 6: responsavel pela geração a nota fiscal
				 */
				
			case 6:
				int nomesClientes = nomesCliente.size();
				int codigoCliente;
				int contadorCliente = 0;
				int operacaoCompra = 4;
				int contadorCompra = 0;
				double valorTotal = 0;
				String nomeCliente;
				String cpfCliente;

				for(i = 0; i < nomesClientes; i++) {
					System.out.println("Cliente: " + (i+1));
					System.out.println("Nome: " + nomesCliente.get(i));
					System.out.println("CPF: " + cpfsCliente.get(i) + "\n");
					contadorCliente++;
				}
				
				System.out.println("Digite o codigo do cliente que está realizando a operação");
				codigoCliente = in.nextInt();
				
				if(codigoCliente > contadorCliente || codigoCliente <= 0) {
					System.out.println("Cliente não encontrado \n");
				} else {
					nomeCliente = nomesCliente.get(codigoCliente - 1);
					cpfCliente = cpfsCliente.get(codigoCliente - 1);
					
					System.out.println("Digite 1 para vender e 0 para cancelar");
					escolha = in.nextInt();
					if(escolha == 1) {
						int produtos = nomesProduto.size();
						int codigoProduto = 0;
						int quantidadeProduto = 0;
						
						while(operacao == 1) {
							for(i = 0; i<produtos; i++) {
								System.out.println("Produto: " + (i+1));
								System.out.println("Produto: " + nomesProduto.get(i));
								System.out.println("Valor: " + valoresProduto.get(i));
								System.out.println("Quantidade: " + quantsProduto.get(i) + "\n");
							}
							
							System.out.println("Digite o código do produto que deseja vender");
							codigoProduto = in.nextInt();

								System.out.println("Digite a quantidade que deseja vender");
								quantidadeProduto = in.nextInt();

									Calendar calendar = Calendar.getInstance();
									Date data = calendar.getTime();
									SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
									
									quantsProduto.set(codigoProduto - 1, quantsProduto.get(codigoProduto - 1) - quantidadeProduto);
									valorTotal += valoresProduto.get(codigoProduto - 1) * quantidadeProduto;
									matriz[vendas][0] = "Nome: " + nomeCliente;
									matriz[vendas][1] = "CPF: " + cpfCliente;
									matriz[vendas][2] = "Produto: " + nomesProduto.get(codigoProduto - 1);
									matriz[vendas][3] = "Quantidade: " + Integer.toString(quantidadeProduto);
									matriz[vendas][4] = "R$ " + Double.toString(valorTotal);
									matriz[vendas][5] = "Data: " + sdf.format(data);
									
									while(operacaoCompra != 0 && operacaoCompra != 1) {
										System.out.println("Deseja continuar vendendo? 1 para sim e 0 para não");
										operacaoCompra = in.nextInt();
										
										if(operacaoCompra != 1 && operacaoCompra != 0) {
											System.out.println("Operação não reconhecida");
										} else if(operacaoCompra == 0) {
											operacao = 3;
										} else {
											operacao = 1;
											contadorCompra++;
											vendas++;
										}
									}
								
							}
						operacao = 1;
						operacaoCompra = 4;
					}
					else if(escolha == 0) {
						break;
					}
				}
				
				break;
				
				///////////////////////////////////////////////////////////////////////////			
				
			/**
			* Case 7: responsavel por listar e apresenta/imprime a nota fiscal
			*/
				
			case 7:
				for(i = 0; i < vendas + 1; i++) {
					for(int j = 0; j < 6; j++) {
						System.out.println(matriz[i][j]);	
					}
					System.out.println("\n");
				}
				break;
				
				///////////////////////////////////////////////////////////////////////////
				
			/**
			 * Case 0: encerra a aplicação 
			 */
			
			case 0:
				
				System.exit(0);
			}
			
			///////////////////////////////////////////////////////////////////////////			

		}
		
		
	}
	

}
