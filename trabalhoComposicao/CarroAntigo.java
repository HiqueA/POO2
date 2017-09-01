package trabalhoComposisao;

public class CarroAntigo {
	
	
	private InformacaoCarro ic;
	public CarroAntigo (InformacaoCarro ic) {
		this.ic = ic;
		
	}
	
	public String getMotor() {
		return ic.getMotor();
	}
	
	public String getChassi() {
		return ic.getChassi();
	}
	
	public void trocaMotor(String novoMotor){
		ic.trocaMotor(novoMotor);
	}
	
	public boolean aptoAPlacaPreta(double idadeCarro){
		if (idadeCarro > 40){
			System.out.println("eh apto");
			return true;
		}
		return false;
		
	}
}
