package trabalhoStrategy;

public class TesterStrategy {
public static void main(String[] args) {
		
		CalculatorPagamento c = new CalculatorPagamento();
		
		ModoPagamento boleto = new Boleto();
		
		ModoPagamento seisVezes = new Parcelado6Vezes();
		
		
		System.out.println(c.calcula(boleto, 200));
		
		ModoPagamento dozeVezes = new Parcelado12Vezes();
		
		System.out.println(c.calcula(seisVezes, 1000));
		System.out.println(c.calcula(dozeVezes, 1000));
		

	}
}
