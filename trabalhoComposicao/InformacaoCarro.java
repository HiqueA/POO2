package trabalhoComposisao;

public class InformacaoCarro {
	private String motor;
	private String chassi;
	
	public InformacaoCarro(String motor, String chassi) {
		super();
		this.motor = motor;
		this.chassi = chassi;
	}
	
	
	public String getMotor() {
		return motor;
	}
	public void setMotor(String motor) {
		this.motor = motor;
	}
	public String getChassi() {
		return chassi;
	}
	public void setChassi(String chassi) {
		this.chassi = chassi;
	}
	
	public void trocaMotor(String novoMotor){
		motor = novoMotor;
		
	}
}
