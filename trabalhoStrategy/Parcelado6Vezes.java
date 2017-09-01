package trabalhoStrategy;

public class Parcelado6Vezes extends ModoPagamento{

	@Override
	public double calcula(double valor) {
		// TODO Auto-generated method stub
		System.out.println("Serao 06 parcelas de:  ");
		return (valor/6) * 1.10;
	}

	@Override
	public double undo() {
		// TODO Auto-generated method stub
		return 0;
	}

}
