package trabalhoComposisao;



public class CarroNovo{
	private InformacaoCarro ic;
	public CarroNovo (InformacaoCarro ic) {
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
		System.out.println("mudou motor para : "+ic.getMotor());
	}
	
	
}
