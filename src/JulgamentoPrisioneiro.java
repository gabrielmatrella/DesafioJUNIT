public class JulgamentoPrisioneiro {

	private static int PENA_INOCENCIA = 0;

	private static int PENA_CONDENACAO_MUTUA = 5;

	private static int PENA_CONDENACAO_INDIVIDUAL = 10;

	private static int PENA_CONDENACAO_CUMPLICES = 1;

	public int calculaPena(Resposta respostaPrisioneiroA, Resposta respostaPrisioneiroB) {
		if (respostaPrisioneiroA == Resposta.DELACAO) {
			if (respostaPrisioneiroB == Resposta.DELACAO) {
				return PENA_CONDENACAO_MUTUA;
			} else {
				return PENA_CONDENACAO_INDIVIDUAL;
			}
		} else {
			if (respostaPrisioneiroB == Resposta.DELACAO) {
				return PENA_CONDENACAO_CUMPLICES;
			} else {
				return PENA_INOCENCIA;
			}
		}
	}

}