package pedido;

public class Equipamento {
	private int codEquipamento;
	private Pedido pedidos;

	public int getCodEquipamento() {
		return codEquipamento;
	}

	public void setCodEquipamento(int codEquipamento) {
		this.codEquipamento = codEquipamento;
	}

	public Pedido getPedidos() {
		return pedidos;
	}

	public void setPedidos(Pedido pedidos) {
		this.pedidos = pedidos;
	}
}
