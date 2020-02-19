package exercícioJava;

public class Aluno {
	
	private String nome;
	private Double n1,n2;

	public String getNome() {
			return nome;		
	}

	public void setNome(String nome) {
		if(nome.trim().equals("") || nome.trim().indexOf(" " )== -1) {
			throw new IllegalArgumentException("Precisa conter o nome e o sobrenome");
		}
		else {
		this.nome = nome;
		}
	}

	public Double getN1() {
		return n1;
	}

	public void setN1(Double n1) {
		if(n1 < 0 || n1 > 10) {
			throw new IllegalArgumentException("Nota n1 inválida");
		}
		else {
			this.n1 = n1;
		}
	}

	public Double getN2() {
			return n2;
	}

	public void setN2(Double n2) {
		if(n2 < 0 || n2 > 10) {
			throw new IllegalArgumentException("Nota n2 inválida");
		}
		else {
		this.n2 = n2;
		}
	}
	
	public Double getMedia() {
		return (n1+n2)/2;
	}
	
}
