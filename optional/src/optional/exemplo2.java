package optional;

import java.util.Optional;
	
public class exemplo2 {

		public static void main(String[] args) {
	 
			String[] frases = new String[5];
	 
			frases[2] = "Generation Brasil";
			
			//optional vazio

			Optional<String> optionalVazio = Optional.empty();

			System.out.println("\n Exibir optionalVazio: " + optionalVazio);

			System.out.println("\n optionalVazio está vazio? " + optionalVazio.isEmpty());
			
			
			//optional com dados
	 
			Optional<String> valor_indice_02 = Optional.of(frases[2]);

			System.out.println("\n Exibir valor_indice_02: " + valor_indice_02);

			System.out.println("\n Obter o conteúdo de valor_indice_02: " + valor_indice_02.get());

			System.out.println("\n valor_indice_02 está presente? " + valor_indice_02.isPresent());
	 
		
	 
	}
	 
}
