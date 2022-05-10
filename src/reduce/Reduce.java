package reduce;

import java.util.Arrays;
import java.util.List;

public class Reduce {
	
	public static void main(String[] args) {
		
	}
	
	public int somaReduce() {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
		int result = numbers.stream().reduce(0, (subtotal, element) -> subtotal + element);
		//assertThat(result).isEqualTo(21);
		return result;
	}
	
	
	public int somaComNumeroPredefinido(int numeroRecebido) {
		numeroRecebido = 23;
		List<Integer> inteiros = Arrays.asList(1, 1, 1);
		Integer reduced = inteiros.stream().reduce(numeroRecebido, (a, b) -> a + b);
		
		return reduced;
	}
	
	public String concatStrings() {
		List<String> letters = Arrays.asList("a", "b", "c", "d", "e");
		String result = letters
				  .stream()
				  .reduce("", (partialString, element) -> partialString + element);
				  //assertThat(result).isEqualTo("abcde");
		
		return result;
	}
 
}
