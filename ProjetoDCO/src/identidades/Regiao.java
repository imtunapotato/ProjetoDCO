package identidades;

import java.util.Objects;

public class Regiao {
	public String nome;

	public Regiao(String desc) {
		this.nome = desc;
	}

	public String getNome() {
		return nome;
	}
	
	@Override
	public boolean equals( Object o ) {
		if ( this == o )
			return true;
		
		if ( !(o instanceof Regiao) || o == null )
			return false;
		
		Regiao regiao = (Regiao) o;
		
		return Objects.equals(nome, regiao.nome );
		
	}
	

}
