import java.util.ArrayList;
import java.util.List;

import redis.clients.jedis.Jedis;

public class Voo {

	private Integer id;
	private Aviao aviao = new Aviao();
	private int vagasOcupadas = 0;
	private List<Passageiro>  espera = new ArrayList<>();
	private List<Passageiro> aBordo = new ArrayList<>();
	private List<Passageiro> cancelados = new ArrayList<>();
	
	
	
	Jedis jedis = new Jedis("localhost");
	
	
	
	public int reservaVaga(Passageiro p) {
		if(p.getCategoria().equals(Categoria.VIP)){
			if (vagasOcupadas<= aviao.getCapacidade()) {
				addABordo(p);
				vagasOcupadas++;
				jedis.rpush("aBordo", p.toString());
			} else {
				removeUltimoNaoVip();
				jedis.rpop("aBordo");
				addABordo(p);
				jedis.rpush("aBordo", p.toString());
                }
		
		}else{
		
			if (vagasOcupadas<= aviao.getCapacidade()) {
				addABordo(p);
				vagasOcupadas++;
				jedis.rpush("aBordo", p.toString());
				
			} else if (vagasOcupadas>aviao.getCapacidade() && vagasOcupadas<aviao.getCapacidade()*1.1) {
				
				
				addEspera(p);
				jedis.rpush("espera", p.toString());
			}else{
				jedis.rpush("cancelados",p.toString());
				addCancelados(p);
			}
		}
		

		return vagasOcupadas;
	}

	public void addABordo(Passageiro p){
		aBordo.add(p);
			}
	public void addEspera(Passageiro p){
		espera.add(p);
	}
	public void addCancelados(Passageiro p)
	{
		cancelados.add(p);
	}
	
	public void removeUltimoNaoVip(){
		aBordo.remove(aBordo.get(aBordo.size()-1));
		
	}
	
	
	public String imprimePassageiros() {
		String msg="null";
              for (Passageiro passageiro : cancelados) {
			msg = " "+msg +" "+passageiro.toString()+" ";
		}
               
                return msg;
	}

	public long getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Aviao getAviao() {
		return aviao;
	}

	public void setAviao(Aviao aviao) {
		this.aviao = aviao;
	}

	public int getVagasOcupadas() {
		return vagasOcupadas;
	}

	public void setVagasOcupadas(int vagasOcupadas) {
		this.vagasOcupadas = vagasOcupadas;
	}

	public List<Passageiro> getCancelados() {
		return cancelados;
	}

	public void setCancelados(List<Passageiro> cancelados) {
		this.cancelados = cancelados;
	}
	public List<Passageiro> getPassageiros() {
		return espera;
	}
	public void setPassageiros(List<Passageiro> passageiros) {
		this.espera = passageiros;
	}
	public List<Passageiro> getaBordo() {
		return aBordo;
	}
	public void setaBordo(List<Passageiro> aBordo) {
		this.aBordo = aBordo;
	}


}
