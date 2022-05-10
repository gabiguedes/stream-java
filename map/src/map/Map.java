package map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Map {
	
	public static void main(String[] args) {
		// map data transformation
		List<Pessoa> pessoas = new Pessoa().populaPessoas();

		pessoas.stream().filter(p -> p.getNacionalidade().equals("Brasil")).map(Pessoa::getIdade)
				.forEach(System.out::println);

		// flatmap
		List<List<String>> list = new ArrayList<>();
		list.add(Arrays.asList("bola", "moleton", "SSD"));
		list.add(Arrays.asList("Camisa", "Mouse", "teclado"));

		System.out.println("Antes do FLATMAP " + list);

		List<String> collect = list.stream().flatMap(Collection::stream).collect(Collectors.toList());

		System.out.println("DEPOIS DO FLATMAP " + collect);

	}
	

}