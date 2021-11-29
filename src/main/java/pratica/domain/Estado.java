package pratica.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Estado {
	private Integer id;
	private String nome;
	
	private List<Cidade> cidades = new ArrayList<>();
	
	public Estado(Integer id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Estado other = (Estado) obj;
		return Objects.equals(id, other.id);
	}
	
}

