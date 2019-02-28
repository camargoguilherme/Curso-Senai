package br.com.estacionamento.mvc.model.persitent_object;

import br.com.estacionamento.mvc.model.enumerated.EnumTipoTelefone;

public class Telefone extends PersistentObject{
	protected int id;
	protected String numero;
	protected EnumTipoTelefone tipoTelefone;
	protected Mensalista mensalista;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public Mensalista getMensalista() {
		return mensalista;
	}
	public void setMensalista(Mensalista mensalista) {
		this.mensalista = mensalista;
	}
	public EnumTipoTelefone getTipoTelefone() {
		return tipoTelefone;
	}
	public void setTipoTelefone(EnumTipoTelefone tipoTelefone) {
		this.tipoTelefone = tipoTelefone;
	}
	
}
