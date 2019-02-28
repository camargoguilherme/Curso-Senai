package pedido;

public class PedidoSituacao {
	private Situacao situacao;
	private Pedido pedidos;
	private Long tempoNaSituacao;
	
	public Situacao getSituacao() {
		return situacao;
	}
	public void setSituacao(Situacao situacao) {
		this.situacao = situacao;
	}
	public Pedido getPedidos() {
		return pedidos;
	}
	public void setPedidos(Pedido pedidos) {
		this.pedidos = pedidos;
	}
	public Long getTempoNaSituacao() {
		return tempoNaSituacao;
	}
	public void setTempoNaSituacao(Long tempoNaSituacao) {
		this.tempoNaSituacao = tempoNaSituacao;
	}
	
}
