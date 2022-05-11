package reduce;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Reduce {

	public static void main(String[] args) {
		List<String> logs = Arrays.asList("88 99 200", "88 99 300", "99 32 100", "12 12 15");
		int limite = 2;

		Map<String, Integer> mapa = new HashMap<String, Integer>();
		
		for (int i = 0; i < logs.size(); i++) {
			String[] numeroSeparado = logs.get(i).split(" ");

			if (!(numeroSeparado[0].equals(numeroSeparado[1]))) {
				for (int k = 0; k <numeroSeparado.length-1; k++) {
					if (mapa.containsKey(numeroSeparado[k])) {
						mapa.put(numeroSeparado[k], mapa.get(numeroSeparado[k]) + 1);
					} else {
						mapa.put(numeroSeparado[k], 1);
					}
				}
			}

		}

		List<String> arr = new ArrayList<>();

		for (String k : mapa.keySet()) {
			int v = mapa.get(k);
			if (v >= limite) {
				arr.add(k);
			}
		}

		for (String kk : arr) {
			System.out.print(kk + " ");
		}

	}

	public int somaReduce() {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
		int result = numbers.stream().reduce(0, (subtotal, element) -> subtotal + element);
		// assertThat(result).isEqualTo(21);
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
		String result = letters.stream().reduce("", (partialString, element) -> partialString + element);
		// assertThat(result).isEqualTo("abcde");

		return result;
	}

}
