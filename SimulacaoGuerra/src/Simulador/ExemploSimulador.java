package Simulador;

public class ExemploSimulador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pais pais1 = new Pais("Rússia",200000,true);	
		Pais pais2 = new Pais("Ucrânnia",50000,false);	
		
		if(pais1.getQtdSoldados()>pais2.getQtdSoldados()) {
			//setar estratégia
			pais1.setEstrategia(new AtacarSozinho());
			pais1.declararGuerra(pais2);
		}
		else pais1.setEstrategia(new Diplomacia());
		pais1.declararGuerra(pais2);

	}

}
