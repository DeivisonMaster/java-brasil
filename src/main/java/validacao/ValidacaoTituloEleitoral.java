package validacao;

import br.com.caelum.stella.validation.InvalidStateException;
import br.com.caelum.stella.validation.TituloEleitoralValidator;

public class ValidacaoTituloEleitoral {
	public static void main(String[] args) {
		String titulo = "701427511856";
		
		TituloEleitoralValidator validador = new TituloEleitoralValidator();
		
		try {
			validador.assertValid(titulo);
			
			System.out.println("Título válido ");
		} catch (InvalidStateException e) {
			System.out.println("Título inválido " + e);
		}
	}
}
