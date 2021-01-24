package validacao;

import br.com.caelum.stella.validation.CPFValidator;
import br.com.caelum.stella.validation.InvalidStateException;

public class ValidacaoCPF {
	public static void main(String[] args) {
		String cpf = "03204568113";
		
		CPFValidator validador = new CPFValidator();
		
		try {
			validador.assertValid(cpf);
			System.out.println("CPF válido");
			
		} catch (InvalidStateException e) {
			System.out.println("CPF inválido " + e);
		}
	}
}
