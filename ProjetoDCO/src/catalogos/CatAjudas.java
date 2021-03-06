package catalogos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import identidades.Ajuda;

public class CatAjudas {
	private List<Ajuda> catAjudas;

	public CatAjudas() {
		this.catAjudas = new ArrayList<>();
	}

	public void addAjuda(Ajuda a) {
		catAjudas.add(a);
	}

	public Boolean exists(String id) {
		for (Ajuda a : catAjudas) {
			if (id.equals(a.getId())) {
				return true;
			}
		}
		return false;
	}
	
	public Iterator<Ajuda> iterator(){
		return catAjudas.iterator();
	}

}
