package map;

import java.util.List;

public class Map {
	
	public static void main(String[] args) {
		List<Pessoa> pessoas = new Pessoa().populaPessoas();
		
		pessoas.stream()
			   .filter(p -> p.getNacionalidade().equals("Brasil"))
			   .map(Pessoa::getIdade).forEach(System.out::println);;
	}

}