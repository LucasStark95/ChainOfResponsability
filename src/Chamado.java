
public class Chamado {
	
	public enum TiposChamados{SAC, SUPORTE,COBRANCA,CANCELAMENTO};
	private int protocolo;
	private String logMensagem = "";
	private String atentendes= "";
	
	public Chamado(int protocolo) {
		this.protocolo = protocolo;
		
	}
	
	public int getProtocolo() {
		return this.protocolo;
	}
	
	public String getLogMensagem() {
		return this.logMensagem;
	}
	
	public void setLogMensagem(String mensagem) {
		this.logMensagem = mensagem+"\n";
	}
	
	public String getAtendentes () {
		return this.atentendes;
	}
	
	public void setAtendentes(String atendente) {
		this.atentendes = atentendes+"-"+atendente;
	}
}
