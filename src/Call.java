
public abstract class Call {
	
	protected Call sucessor;
	
	public void setSucessor(Call sucessor) {
		this.sucessor = sucessor;
	}
	
	public abstract void requisicao(Chamado chamada);
	
}
