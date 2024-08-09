package Simulador;

public class Pais {
	//atributos
	private String nome;
	private int qtdSoldados;
	private boolean nuclearW;//
	private EstrategiaStrategy estrategia;

	//metodo construtor(Nome, Qtd soldados e boolean nuclear)

	public Pais(String nome, int qtdSoldados, boolean nuclearW) {

		this.nome = nome;
		this.qtdSoldados = qtdSoldados;
		this.nuclearW = nuclearW;
	}
	
	//geters e setters
	
	
	public String getNome() {
		return nome;
	}

	public int getQtdSoldados() {
		return qtdSoldados;
	}

	public boolean isNuclearW() {
		return nuclearW;
	}

	public EstrategiaStrategy getEstrategia() {
		return estrategia;
	}


	public void setEstrategia(EstrategiaStrategy estrategia) {
		this.estrategia = estrategia;
	}
	
	public void declararGuerra(Pais inimigo) {
		this.estrategia.atacar(inimigo);
		this.estrategia.concluido(inimigo);

	}
	
	
	
	////regra para declarar guerra

}
