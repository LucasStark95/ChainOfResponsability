
public class Chamado {
	
	public enum TiposChamados{SAC, SUPORTE,COBRANCA,CANCELAMENTO};
	private int protocolo;
	private String logMensagem = "";
	
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
		this.logMensagem = ""+mensagem+"\n";
	}
}
