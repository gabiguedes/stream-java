package reduce;

import java.util.Arrays;
import java.util.List;

public class Reduce {
	
	public static void main(String[] args) {
		
	}
	
	public int somaReduce() {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
		int result = numbers.stream().reduce(0, (subtotal, element) -> subtotal + element);
		return result;
	}
	
	
	public int somaComNumeroPredefinido(int numeroRecebido) {
		numeroRecebido = 23;
		List<Integer> inteiros = Arrays.asList(1, 1, 1);
		Integer reduced = inteiros.stream().reduce(numeroRecebido, (a, b) -> a + b);
		
		return reduced;
	}
 
}
