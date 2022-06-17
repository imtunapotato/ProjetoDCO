package catalogos;

import java.util.ArrayList;
import java.util.List;

import identidades.Regiao;

public class catRegiao {

	private List<Regiao> regioes;
	
	public catRegiao() {
		this.regioes = new ArrayList<Regiao>();
	}
	
	public void addRegiao( Regiao regiao ) {
		regioes.add(regiao);
	}
	
	public List<Regiao> getRegioes() {
		return regioes;
	}
	
}
