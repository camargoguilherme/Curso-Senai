package br.com.estacionamento.mvc.model.persitent_object;

public class MensalistaVeiculo extends PersistentObject{
	protected Mensalista mensalista;
	protected Veiculo veiculo;
	protected boolean proprietario;
	
	public Mensalista getMensalista() {
		return mensalista;
	}
	public void setMensalista(Mensalista mensalista) {
		this.mensalista = mensalista;
	}
	public Veiculo getVeiculo() {
		return veiculo;
	}
	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}
	public boolean isProprietario() {
		return proprietario;
	}
	public void setProprietario(boolean proprietario) {
		this.proprietario = proprietario;
	}
	
}
