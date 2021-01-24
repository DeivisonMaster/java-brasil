package validacao;

import br.com.caelum.stella.validation.CNPJValidator;
import br.com.caelum.stella.validation.InvalidStateException;

public class ValidacaoCNPJ {
	public static void main(String[] args) {
		String cnpj = "91565401000144";
		CNPJValidator validador = new CNPJValidator();
		
		try {
			validador.assertValid(cnpj);
			
			System.out.println("CNPJ válido ");
		} catch (InvalidStateException e) {
			System.out.println("CNPJ inválido " + e);
		}
	}
}	
