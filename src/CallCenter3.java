
public class CallCenter3 extends Call {

	@Override
	public void requisicao(Chamado chamada) {
		int cancelamento = Chamado.TiposChamados.CANCELAMENTO.ordinal();
		int protocolo = chamada.getProtocolo();
		
		if(protocolo == cancelamento) {
			chamada.setAtendentes("1");
			chamada.setLogMensagem(chamada.getLogMensagem()+" \nAtendente 3 -> Obrigado por usar a Mamata Corporation, seu chamado\n será processado em instantes...");
		}else if (sucessor != null) {
			chamada.setAtendentes("2");
			chamada.setLogMensagem(chamada.getLogMensagem()+" \nAtendente 3 -> Caro cliente solicitamos um pouco de paciência, \nseu chamado está sendo repassado para um atendente capacitado...");
			sucessor.requisicao(chamada);
		}
	}

}
