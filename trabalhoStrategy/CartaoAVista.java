package trabalhoStrategy;

public class CartaoAVista extends ModoPagamento {

	@Override
	public double calcula(double valor) {
		// TODO Auto-generated method stub
		System.out.println("O valor a ser pago no cart�o a vista �: ");
		return valor * 1.05;
	}

	@Override
	public double undo() {
		// TODO Auto-generated method stub
		return 0;
	}

}
