import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class JulgamentoPrisioneiroTeste {
	
	private JulgamentoPrisioneiro julgamentoPrisioneiro;

	@Before
	public void init() {
		julgamentoPrisioneiro = new JulgamentoPrisioneiro();
	}
	
	@Test
	public void testeCalculoPenaInocencia() {
		int penaInocenciaCorreto = 0;
		
		int penaCalculada = julgamentoPrisioneiro.calculaPena(Resposta.SEM_DELACAO, Resposta.SEM_DELACAO);
		assertEquals(penaInocenciaCorreto, penaCalculada);
	}
	
	@Test
	public void testeCalculoPenaCondenacaoMutua() {
		int penaCondenacaoMutuaCorreto = 5;
		
		int penaCalculada = julgamentoPrisioneiro.calculaPena(Resposta.DELACAO, Resposta.DELACAO);
		assertEquals(penaCondenacaoMutuaCorreto, penaCalculada);
	}
	
	@Test
	public void testeCalculoPenaCondenacaoIndividual() {
		int penaCondenacaoIndividualCorreto = 10;
		
		int penaCalculada = julgamentoPrisioneiro.calculaPena(Resposta.DELACAO, Resposta.SEM_DELACAO);
		assertEquals(penaCondenacaoIndividualCorreto, penaCalculada);
	}
	
	@Test
	public void testeCalculoPenaCondenacaoCumplices() {
		int penaCondenacaoCumplicesCorreto = 1;
		
		int penaCalculada = julgamentoPrisioneiro.calculaPena(Resposta.SEM_DELACAO, Resposta.DELACAO);
		assertEquals(penaCondenacaoCumplicesCorreto, penaCalculada);
	}
}
