package Simulador;

public class AtacarSozinho implements EstrategiaStrategy {

	@Override
	public void atacar(Pais inimigo) {
		plantarEvidenciasFalsas();
		soltarBombas();
		derrubarGoverno();
		
		
		System.out.println("\n Plantar evidências falsas \n Soltar bombas \n Derrubar governo");

	}
	

	private void derrubarGoverno() {
		// TODO Auto-generated method stub
	}

	private void soltarBombas() {
		// TODO Auto-generated method stub
		
	}

	private void plantarEvidenciasFalsas() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void concluido(Pais inimigo) {
		esrabelecerGoverno();
		System.out.println("\n Estabelecer governo");
	}

	private void esrabelecerGoverno() {
		// TODO Auto-generated method stub
		
	}

}
