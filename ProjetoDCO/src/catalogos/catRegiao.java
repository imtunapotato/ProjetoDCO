package catalogos;

import java.util.ArrayList;
import java.util.List;

import identidades.Regiao;

public class catRegiao {

	private List<Regiao> regioes;
	
	/*
	 * Region catalog constructor
	 */
	public catRegiao() {
		this.regioes = new ArrayList<Regiao>();
	}
	
	/*
	 * Add's a new region to the catalog
	 * If it already exists doens't happen anything
	 */
	public void addRegiao( Regiao regiao ) {
		for( Regiao r : regioes ) {
			if ( r.equals(regiao)) 
				return;
		}
		
		regioes.add(regiao);
	}
	
	/*
	 * Remove an region from the region  catalog
	 * If it already exists doesn't happen anything
	 */
	public void removeRegiao( Regiao regiao ) {
		int pos = 0;
		for ( Regiao r : regioes ) {
			if ( r.equals(regiao) )
				regioes.remove(pos);
			pos++;
		}
	}
	
	/*
	 * Gives the region Catalog
	 */
	public List<Regiao> getRegioes() {
		return regioes;
	}
	
}
