package optional;

import java.util.Optional;

public class exemplo1 {
	
	public static void main(String[] args) {
		
		String[] palavras = new String[10];
		
		Optional<String> checaNulo = Optional.ofNullable(palavras[5]);
		
		if(checaNulo.isPresent()) {
				String palavra = palavras[5].toLowerCase();
		        System.out.println(palavra);
		} else {
			System.out.println("O valor é nulo");
		}

	}

}
