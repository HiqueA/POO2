package trabalhoStrategy;

import java.util.List;



public class CalculatorPagamento {
private List<ModoPagamento> pagamento;
	
	
	public double calcula(ModoPagamento pagamento, double valor) {
		return pagamento.calcula(valor);
	}

}
