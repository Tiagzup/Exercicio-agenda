package contatos;

public class Contato {
        
	 private String nome;
	 private double telefone;
	 
	public Contato(String nome, double telefone) {
		super();
		this.nome = nome;
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getTelefone() {
		return telefone;
	}

	public void setTelefone(double telefone) {
		this.telefone = telefone;
	}
	  
	@Override
	public String toString() {
		String contato = "";
		
		contato  += "Nome -> " + this.getNome() + "\n";
		contato +=  "Número de telefone -> " + this.getTelefone() + "\n";
		
		return contato;
	} 
}
