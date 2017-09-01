package trabalhoStrategy;

public class Parcelado12Vezes extends ModoPagamento{

	@Override
	public double calcula(double valor) {
		// TODO Auto-generated method stub
		System.out.println("Serao 12 parcelas de:  ");
		return (valor/12)*1.15;
		
	}

	@Override
	public double undo() {
		// TODO Auto-generated method stub
		return 0;
	}

}
