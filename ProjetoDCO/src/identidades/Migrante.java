package identidades;

import java.util.Objects;

public class Migrante {

	private String name;
	private int numero;
	
	public Migrante ( String name ) {
		this.name = name;
	}
	
	public Migrante( String name, int numero) {
		this.name = name;
		this.numero = numero;
	}
	
	public String toString() {
		if ( numero == 0 ) {
			return ( name + "\n");
		} else {
			return ("Nome: " + name + "\n" + "N�mero: " + numero + "\n");
		}
	}
	
	@Override
	public boolean equals( Object o ) {
		if ( this == o )
			return true;
		
		if ( o == null || !(o instanceof Migrante) )
			return false;
		
		Migrante migrante = (Migrante) o;
		
		return Objects.equals( name , migrante.name ) &&
				Objects.equals( numero , migrante.numero );
	}
}

















