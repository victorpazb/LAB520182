
public class Facade {

	Controller controle = new Controller();

	public void inicializa(int caixa, double taxa) {
		controle.inicializa(caixa, taxa);
	}

	public int getCaixa() {
		return controle.getCaixa();
	}

	public int cadastrarCenario(String descricao) {
		return controle.cadastrarCenario(descricao);

	}

	public String exibirCenario(int cenario) {
		return controle.exibirCenario(cenario);
	}

	public String exibirCenarios() {
		return controle.exibirCenarios();
	}

	boolean encerrarCenario() {
		boolean ocorreuOuNao = false;
		return ocorreuOuNao;
	}

	public void cadastrarAposta(int cenario, String apostador, int valor, String previsao) {
		controle.cadastrarAposta(cenario, apostador, valor, previsao);
	}
	
	public String exibeApostas(int cenario) {
		return controle.exibirApostasDeCenario(cenario);
	}
	
	public int valorTotalDeApostas(int cenario) {
		return controle.valorTotalDeApostas(cenario);
	}

	public void fecharAposta(int cenario, boolean ocorreu) {
		controle.fecharAposta(cenario, ocorreu);
	}


	public int getCaixaCenario(int cenario) {
		return controle.getCaixaCenario(cenario);

	}

	public int getTotalRateioCenario(int cenario) {
		return controle.getTotalRateioCenario(cenario);
	}

	
	public int totalDeApostas(int cenario) {
		return controle.totalDeApostas(cenario);
	}

}
