import java.util.Comparator;

/**
 * classe que define uma compra
 * 
 * @author victorpfb
 *
 */
public class Compra implements Comparable<Compra> {

	private String data;
	private String identifcacaoProduto;
	private double preco;
	private String descricao;

	/**
	 * construtor da classe compra
	 * 
	 * @param data
	 * @param identifcacaoProduto
	 * @param preco
	 */
	public Compra(String data, String identifcacaoProduto, double preco) {

		this.data = data;
		this.identifcacaoProduto = identifcacaoProduto;
		this.preco = preco;

	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return this.descricao;
	}
		
	/**
	 * @return getter q retorna a String que representa a data da compra no formato DD/MM/AAAA
	 */
	public String getData() {
		return this.data;
	}

	/**
	 * 
	 * @return retorna a String que descreve a compra
	 */
	public String getIdentificacaoDoProduto() {
		return this.identifcacaoProduto;
	}

	/**
	 * @return retorna o valor da compra
	 */
	public double getPreco() {
		return this.preco;
	}

	/**
	 * metodo compareTo de compra
	 */
	@Override
	public int compareTo(Compra outraCompra) {
		return this.identifcacaoProduto.compareTo((outraCompra.getIdentificacaoDoProduto()));
	}
	

	/**
	 * metodo que toString de compra que cria sua representacao textual
	 * 
	 */
	@Override
	public String toString() {
		return this.identifcacaoProduto + " - " + this.data.replace("/", "-");
	}

}
