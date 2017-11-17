import java.util.*;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	List<Passageiro> list = new ArrayList<>();
		
		
		list.add(0, new Passageiro());
		list.add(1, new Passageiro());
		
		
		for (Passageiro passageiro : list) {
			System.out.println(list.indexOf(passageiro));
	}
	}

}
