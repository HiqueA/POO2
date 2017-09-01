package trabalhoComposisao;



public class TesterComprosicao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InformacaoCarro ic1 = new InformacaoCarro("4cc","bbb9292");
		CarroNovo c1 = new CarroNovo(ic1);
		InformacaoCarro ic2 = new InformacaoCarro("v8","fff2222");
		CarroAntigo c2 = new CarroAntigo(ic2);
		System.out.println(c1.getMotor());
		
		
		c1.trocaMotor("6cc");
	
		
		c2.aptoAPlacaPreta(52);
		
		
		
	}

}
