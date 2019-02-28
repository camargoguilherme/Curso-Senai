package pedido;

public class PedidoItem {
	private Pedido pedido;
	private ItemCategoria item;
	
	public Pedido getPedido() {
		return pedido;
	}
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	public ItemCategoria getItem() {
		return item;
	}
	public void setItem(ItemCategoria item) {
		this.item = item;
	}
	
}
