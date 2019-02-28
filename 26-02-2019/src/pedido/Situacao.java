package pedido;

public class Situacao {
	private int codSituacao;
	private String descricaoSituacao;
	private Pedido pedido;
	
	public int getCodSituacao() {
		return codSituacao;
	}
	public void setCodSituacao(int codSituacao) {
		this.codSituacao = codSituacao;
	}
	
	public String getDescricaoSituacao() {
		return descricaoSituacao;
	}
	public void setDescricaoSituacao(String descricaoSituacao) {
		this.descricaoSituacao = descricaoSituacao;
	}
	public Pedido getPedido() {
		return pedido;
	}
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	
}
