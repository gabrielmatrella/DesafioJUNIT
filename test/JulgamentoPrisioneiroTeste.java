import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JulgamentoPrisioneiroTeste {
	
	@Test
	public void testeCalculoPenaInocencia() {
		Resposta respostaPrisioneiroA = Resposta.DELACAO;
		Resposta respostaPrisoneiroB = Resposta.SEM_DELACAO;
		
		JulgamentoPrisioneiro julgamentoPrisioneiro = new JulgamentoPrisioneiro();
		int penaCalculada = julgamentoPrisioneiro.calculaPena(respostaPrisioneiroA, respostaPrisoneiroB);
		
		assertEquals(13, penaCalculada);
	}
	
	
}
