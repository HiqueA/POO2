package trabalhoStrategy;

public class Boleto extends ModoPagamento {

	@Override
	public double calcula(double valor) {
		// TODO Auto-generated method stub
		System.out.println("O valor a ser pago no boleto a vista é: ");
		return valor*0.90;
	}

	@Override
	public double undo() {
		// TODO Auto-generated method stub
		return 0;
	}

}
