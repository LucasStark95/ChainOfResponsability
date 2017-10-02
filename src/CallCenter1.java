
public class CallCenter1 extends Call{

	
	@Override
	public void requisicao(Chamado chamada) {
		int SAC = Chamado.TiposChamados.SAC.ordinal();
		int SUPORTE = Chamado.TiposChamados.SUPORTE.ordinal();
		int protocolo = chamada.getProtocolo();
		
		if(protocolo == SAC || protocolo == SUPORTE) {
			chamada.setLogMensagem(chamada.getLogMensagem()+" \nAtendente 1 -> Obrigado por usar a Mamata Corporation, seu chamado\n será processado em instantes...");
		}else if (sucessor != null) {
			chamada.setLogMensagem(chamada.getLogMensagem()+" \nAtendente 1 -> Caro cliente solicitamos um pouco de paciência, \nseu chamado está sendo repassado para um atendente capacitado...");
			sucessor.requisicao(chamada);
		}
		
	}
	
	

}
