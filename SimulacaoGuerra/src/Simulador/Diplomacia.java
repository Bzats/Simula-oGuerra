package Simulador;

public class Diplomacia implements EstrategiaStrategy {

	@Override
	public void atacar(Pais inimigo) {
		recuarTropas();
		proporCooperacaoEconomica();
		System.out.println("\n Recuar tropas, \n Propor cooperação econômica");

		}

	private void proporCooperacaoEconomica() {
		// TODO Auto-generated method stub
		
	}

	private void recuarTropas() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void concluido(Pais inimigo) {
		desarmarInimigo();
		
	}

	private void desarmarInimigo() {
		desarmarInimigo();
		System.out.println("\n Propor desarmamento");

	}

}
