package identidades;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Familia {
 
	private List<Migrante> listaFamilia;
	private int numeroMigrantes;
	private Migrante cabeca;
	
	public Familia(int numeroMigrantes, Migrante cabeca ) {
		this.numeroMigrantes = numeroMigrantes;
		this.cabeca = cabeca;
		this.listaFamilia = new ArrayList<Migrante>();
	}
	
	public void addMembros ( String nome) {
		listaFamilia.add(new Migrante(nome));
	}
	
	public String toString() {
		StringBuilder s = new StringBuilder("");
		if ( numeroMigrantes != 0 ) {
			s.append("N�mero de membros : " + numeroMigrantes + "\n" );
			s.append("Lista de membros: \n");
			for ( Migrante membros : listaFamilia) {
				s.append(membros.toString());
			}
		}
		return s.toString();
	}
	
	@Override
	public boolean equals( Object o ) {
		if ( this == o )
			return true;
		
		if ( o == null || !(o instanceof Familia))
			return false;
		
		Familia familia = (Familia) o;
		
		return Objects.equals(cabeca , familia.cabeca );
	}
}















