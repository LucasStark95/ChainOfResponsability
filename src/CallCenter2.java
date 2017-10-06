
public class CallCenter2 extends Call {


	@Override
	public void requisicao(Chamado chamada) {
		int cobranca = Chamado.TiposChamados.COBRANCA.ordinal();
		int protocolo = chamada.getProtocolo();
		
		if(protocolo == cobranca) {
			chamada.setAtendentes("1");
			chamada.setLogMensagem(chamada.getLogMensagem()+" \nAtendente 2 -> Obrigado por usar a Mamata Corporation, seu chamado\n ser� processado em instantes...");
		}else if (sucessor != null) {
			chamada.setAtendentes("2");
			chamada.setLogMensagem(chamada.getLogMensagem()+" \nAtendente 2 -> Caro cliente solicitamos um pouco de paci�ncia, \nseu chamado est� sendo repassado para um atendente capacitado...");
			sucessor.requisicao(chamada);
		}
		
	}
	

}
