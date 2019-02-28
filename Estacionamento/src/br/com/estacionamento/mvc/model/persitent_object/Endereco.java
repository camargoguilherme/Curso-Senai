package br.com.estacionamento.mvc.model.persitent_object;

public class Endereco extends PersistentObject{
	protected int id;
	protected String logradouro;
	protected String numero;
	protected String complemento;
	protected Cidade cidade;
	protected Mensalista mensalista;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public Mensalista getMensalista() {
		return mensalista;
	}
	public void setMensalista(Mensalista mensalista) {
		this.mensalista = mensalista;
	}
	public Cidade getCidade() {
		return cidade;
	}
	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}
	
}
