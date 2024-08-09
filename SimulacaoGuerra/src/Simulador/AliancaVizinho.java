package Simulador;

public class AliancaVizinho implements EstrategiaStrategy {

	@Override
	public void atacar(Pais inimigo) {
		vizinhoPeloNorte();
		vizinhoPeloSul();
		
		System.out.println("\n Vizinho ataca pelo sul - Ataque pelo norte \n Vizinho ataca pelo norte - A");

	}

	private void vizinhoPeloSul() {
		// TODO Auto-generated method stub
		
	}

	private void vizinhoPeloNorte() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void concluido(Pais inimigo) {
		dividirEspolios();
		dividirReconstrução();
		
		System.out.println("\n Dividir os espólios \n Dividir a reconstrução");

	}

	private void dividirReconstrução() {
		// TODO Auto-generated method stub
		
	}

	private void dividirEspolios() {
		// TODO Auto-generated method stub
		
	}

}
