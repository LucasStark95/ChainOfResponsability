
public class Teste {
	public static void main(String[] Args) {
		Chamado c1 = new Chamado(0);
		
		Call atendente1 = new CallCenter1();
		Call atendente2 = new CallCenter2();
		Call atendente3 = new CallCenter3();
		
		atendente1.setSucessor(atendente2);
		atendente2.setSucessor(atendente3);
		
		atendente1.requisicao(c1);
	}

}
