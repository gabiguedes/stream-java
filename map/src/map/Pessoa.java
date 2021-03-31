package map;

import java.util.Arrays;
import java.util.List;

public class Pessoa {
	
	private String id;
	private String nome;
	private String nacionalidade;
	private int idade;

	public Pessoa() {}

	public Pessoa(String id, String nome, String nacionalidade, int idade) {
		this.id = id;
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.idade = idade;
	}

	public List<Pessoa> populaPessoas() {
		
		List<Pessoa> list = Arrays.asList(new Pessoa("p1", "Matheus Henrique", "Brasil", 18),
										  new Pessoa("p2", "Hernandez Roja", "Mexico", 21), 
										  new Pessoa("p3", "Mario Fernandes", "Canada", 22),
										  new Pessoa("p4", "Neymar Junior", "Brasil", 22));
		return list;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	@Override
	public String toString() {
		return this.nome;
	}
}